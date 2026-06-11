# Automatic Generation of DCAT-AP+

In DCAT-AP+ we do not manually recreate DCAT-AP in LinkML but **auto-generate** it as the base layer from the authoritative SHACL shapes published by SEMIC. This ensures that the LinkML schema stays fully aligned with the official specification and can be updated systematically when DCAT-AP evolves.

## Why auto-generate?

Manual porting of a complex specification invites drift. The DCAT-AP SHACL shapes define ~25 node shapes with ~150 property shapes, each with cardinality constraints, range definitions, and IRI mappings. Reproducing this by hand would be error-prone and hard to maintain across DCAT-AP releases.

By scripting the translation, we get two guarantees:

1. **Semantic identity**: Every `class_uri` and `slot_uri` in the generated LinkML schema is copied verbatim from the SHACL `sh:targetClass` and `sh:path` attributes. The resulting model is structurally equivalent to the official shapes.
2. **Reproducibility**: When SEMIC publishes a new DCAT-AP release, re-running the script against the updated SHACL shapes produces an updated base layer, making the delta to our extension layer explicit.

## The pipeline

![conversion_pipeline_dark.svg](images/conversion_pipeline_dark.svg#only-dark)
![conversion_pipeline_light.svg](images/conversion_pipeline_light.svg#only-light)
The script produces **two** LinkML schemas from the same input:

| Output                                                  | Purpose                                                                                                                                                                          |
|---------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [`dcat_ap_linkml.yaml`](schema/dcat_ap_linkml.yaml)     | A near-1:1 translation of the DCAT-AP SHACL shapes into LinkML. Useful as a standalone reusable artifact for anyone wanting DCAT-AP in LinkML without extensions.                |
| [`dcat_ap_plus.yaml`](schema/dcat_ap_plus.yaml)         | The same base layer **plus** the DCAT-AP+ extension: the provenance core, attribute patterns, and classification pattern described in [Design Patterns](design-patterns.md).     |

## Input: Which SHACL shapes?

The script uses the JSON-LD serialization of the DCAT-AP 3.0.0 SHACL shapes, downloaded from the [SEMIC DCAT-AP repository (`master/releases/3.0.0/shacl`)](https://github.com/SEMICeu/DCAT-AP/tree/master/releases/3.0.0/shacl).

!!! warning "SEMIC publishes multiple shape files that differ"
    The shapes in the `master` branch's `releases/3.0.0` folder differ from those in the [tagged `3.0.0` release](https://github.com/SEMICeu/DCAT-AP/releases/tag/3.0.0) and the `3.0.0` branch. We use the `master` branch version because it is the one linked from the [official specification website](https://semiceu.github.io/DCAT-AP/releases/3.0.0/) and reflects the most recent editorial corrections. See also [DCAT-AP issue #428](https://github.com/SEMICeu/DCAT-AP/issues/428).

!!! note "Switching to TTL SHACL ingest is planned"
    Since our work started, DCAT-AP v3.0.1 has been released, but only in TTL. We plan on updating our convertion script to use the TTLs directly in the near future, but only after the 1.0 release.  

## How the translation works

The [`dcat_ap_shacl_2_linkml.py`](https://github.com/nfdi-de/dcat-ap-plus/blob/main/src/dcat_ap_plus/dcat_ap_shacl_2_linkml.py) script iterates over each SHACL node shape in the [JSON-LD file](https://github.com/nfdi-de/dcat-ap-plus/blob/main/src/dcat_ap_plus/dcat_ap_shacl.jsonld) and maps it to a LinkML construct:

**Node shapes → classes or datatypes.** A node shape whose `sh:targetClass` points to an ontology class (e.g. `dcat:Dataset`) becomes a LinkML class. A node shape targeting an XSD datatype (e.g. `xsd:duration`) becomes a LinkML datatype.

**Property shapes → slots.** Each `sh:property` within a node shape becomes a slot on the derived class. Cardinality (`sh:minCount`, `sh:maxCount`), range (`sh:class`, `sh:datatype`), and the property IRI (`sh:path`) are all preserved.

**Naming convention.** Slot names are converted from the DCAT-AP camelCase convention to LinkML's snake_case (e.g. `accessURL` → `access_URL`, `contactPoint` → `contact_point`).

### Handling of union ranges

The DCAT-AP shapes contain two kinds of unions:

- **Object class unions** (e.g. `dcat:primaryTopic` can range over `Dataset`, `DatasetSeries`, `Catalogue`, or `DataService`): handled via LinkML's [`any_of`](https://linkml.io/linkml/schemas/advanced.html#unions-as-ranges) keyword.
- **Datatype unions** (e.g. the `TemporalLiteral` shape unions `xsd:date`, `xsd:dateTime`, `xsd:gYear`, and `xsd:gYearMonth`): due to a [known LinkML limitation](https://github.com/linkml/linkml/issues/1813), these are conservatively restricted to `xsd:date`. This is a stricter interpretation than the official DCAT-AP shapes and will be relaxed once LinkML supports datatype unions.

!!! note "Shapes that are skipped"
    The script explicitly ignores `rdfs:Literal` (replaced by LinkML's default `string` range, which is interpreted as `rdfs:Literal` in the SHACL representation of our LinkML schema), the `CataloguedResource` union shape (not needed due to the above mentioned object class unions approach), and a duplicate `mediaType` shape that appears to be an editorial error in the source.

## What is auto-generated vs. manually authored

| Layer | How it's created |
|---|---|
| **DCAT-AP base** (classes, slots, datatypes, enums from the official shapes) | Auto-generated by `parse_dcat_ap_shacl_shapes()` |
| **DCAT-AP+ extension** (provenance core, attributes, `ClassifierMixin`, contextual metadata) | Programmatically added by `build_dcatapplus_linkml()` | 

The extension layer is authored *in Python code*, not in raw YAML, so that it builds on top of the same `SchemaBuilder` object that holds the auto-generated DCAT-AP base. This ensures that references between base and extension elements (e.g. making `was_generated_by` mandatory on `Dataset`, or adding slots to `Activity`) are validated at build time.

Elements belonging to the DCAT-AP+ extension are tagged with `in_subset: [domain_agnostic_core]` in the schema, making it easy to distinguish them from the auto-generated DCAT-AP base.

## Re-running the generation

### ⚠️ Critical Rule: Never Edit the YAML Files Directly
The files [`dcat_ap_linkml.yaml`](schema/dcat_ap_linkml.yaml) and [`dcat_ap_plus.yaml`](schema/dcat_ap_plus.yaml) are **build artifacts**, not source code.

**Do not manually edit these YAML files to add classes, slots, change constraints, or edit its metadata.**

**Why?**
1.  **Overwrite Risk:** Any manual change to the YAML structure will be **permanently lost** the next time the generation script is run.
2.  **Versioning Logic:** The `version` field is dynamically injected by the script based on the current Git commit hash. Manual edits will break the link between the schema version and the Git history, causing mismatches with the published PyPI package.

**How to Contribute:**
All schema changes **must** be made by modifying the Python generation script (`dcat_ap_shacl_2_linkml.py`).
*   To change the **DCAT-AP base**: Update the logic in `parse_dcat_ap_shacl_shapes()` (e.g., to handle new SHACL shapes).
*   To change the **DCAT-AP+ extension**: Update the logic in `build_dcatap_plus()` (e.g., adding slots to `extend_dataset()`).

### Correct Workflow for Schema Changes

To ensure your changes are captured correctly and the dynamic versioning updates to the right commit hash, follow this exact sequence:

1.  **Edit the Script:** Make your changes to `src/dcat_ap_plus/dcat_ap_shacl_2_linkml.py`.
2.  **Commit the Script:**
    ```bash
    git add src/dcat_ap_plus/dcat_ap_shacl_2_linkml.py
    git commit -m "feat: update generation logic for [your change]"
    ```
    *(This creates a new commit hash. The versioning system needs this commit to exist before it can calculate the new version.)*
3.  **Run the Generation Script:**
    ```bash
    uv run python src/dcat_ap_plus/dcat_ap_shacl_2_linkml.py
    ```
    *   **Note:** The script automatically runs `uv sync` at the start. This ensures the installed package metadata matches your **new** commit hash, allowing the script to inject the correct version (e.g., `...+g<new_commit_hash>`) into the YAML.
    *   This step generates/overwrites `dcat_ap_linkml.yaml` and `dcat_ap_plus.yaml`.
4.  **Validate and Regenerate Derived Artifacts:**
    Update the Python datamodel, documentation, and other artifacts from the newly versioned YAML:
    ```bash
    just gen-project _test-python _test-examples
    # Or specific commands for docs/tests as needed
    ```
5.  **Commit the Generated Files:**
    ```bash
    git add src/dcat_ap_plus/schema/*.yaml src/dcat_ap_plus/datamodel/ project/ docs/elements/
    git commit -m "chore: regenerate schema and artifacts with new version"
    ```
