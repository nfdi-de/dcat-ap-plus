[![DOI](https://zenodo.org/badge/1080296103.svg)](https://doi.org/10.5281/zenodo.17702369)
[![PyPI - Version](https://img.shields.io/pypi/v/dcat-ap-plus)](https://pypi.org/project/dcat-ap-plus)
[![Build and test](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml/badge.svg)](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml)
[![Copier Badge](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/copier-org/copier/master/img/badge/badge-grayscale-inverted-border-teal.json)](https://github.com/linkml/linkml-project-copier)

# DCAT Application Profile for Providing Links to Use-case Specific Context (DCAT-AP+)

The LinkML schema provided in this repository is an extension of the [DCAT Application Profile](https://semiceu.github.io/DCAT-AP/releases/3.0.0/), which allows to provide additional metadata for a `dcat:Dataset` in a very generic manner, such as:
* which kind(s) of entity(s) or activity(s) were evaluated,
* which kind of activity generated the `dcat:Dataset`,
* which kind of instruments were used in the dataset generating activity,
* in which surrounding (e.g. a laboratory) and according to which plan the dataset generating activity took place,
* as well as which kind(s) of qualitative and quantitative characteristic(s) were attributed to the evaluated entity or evaluated activity and to the used instruments.

This extension is mainly based on the [Starting Point Terms of the Provenance Ontology (PROV-O)](https://www.w3.org/TR/prov-o/#description-starting-point-terms),
in that it makes the `prov:wasGeneratedBy` property of the `Dataset` class mandatory and specifies necessary properties for its expected range, the `prov:Activity` class.

The choice to use LinkML for extending DCAT-AP was based on the need to have different layers that cater to different domain-specific use cases. DCAT-AP+ serves as the basic layer for such extensions and is thus kept very generic. Being the basis of the [ChemDCAT-AP](
nfdi-de.github.io/chem-dcat-ap), one can see how it can be applied to further extend its classes for domain-specific needs.

DCAT-AP+ is developed within close collaboration between [NFDI4Chem](https://nfdi4chem.de) & [NFDI4Cat](https://nfdi4cat.org/) and is intended to be further improved, extended and adapted by the whole NFDI community.

A more elaborate documentation is provided here: [https://nfdi-de.github.io/dcat-ap-plus](https://nfdi-de.github.io/dcat-ap-plus/latest/about/).

## DCAT-AP to LinkML: Automatic Translation and Extension

The JSON-LD serialization of the official DCAT-AP 3.0.0 SHACL shapes ([dcat_ap_shacl.jsonld](src/dcat_ap_shacl.jsonld)) were downloaded from the DCAT-AP GitHub repository [3.0.0 release folder within the master branch](https://github.com/SEMICeu/DCAT-AP/tree/master/releases/3.0.0/shacl). The downloaded SHACL shapes were then processed by the [dcat_ap_shacl_2_linkml.py](src/dcat_ap_shacl_2_linkml.py) script to generate two LinkML schemas from it:

  * [dcat_ap_linkml.yaml](src/dcat_ap_plus/schema/dcat_ap_linkml.yaml) - an almost 1:1 translation of the DCAT-AP SHACL shapes to LinkML.
  * [dcat_ap_plus.yaml](src/dcat_ap_plus/schema/dcat_ap_plus.yaml) - the LinkML representation of DCAT-AP to which we added the additional constraints, classes and properties we need for our DCAT-AP+ extension.

## Repository Structure

* [docs/](docs/) - mkdocs-managed documentation
  * [elements/](docs/elements/) - generated schema documentation
* [examples/](examples/) - Examples of using the schema
* [project/](project/) - project files (these files are auto-generated, do not edit)
* [src/](src/) - source files (edit these)
  * [dcat_ap_plus](src/dcat_ap_plus)
    * [schema/](src/dcat_ap_plus/schema) -- LinkML schema
      (edit this)
    * [datamodel/](src/dcat_ap_plus/datamodel) -- generated
      Python datamodel
* [tests/](tests/) - Python tests
  * [data/](tests/data) - Example data

## Developer Documentation

See also the documentation of the template: https://github.com/linkml/linkml-project-copier?tab=readme-ov-file#prerequisites

* uv

    uv is a tool to manage Python projects and for managing isolated Python-based applications. You will use it in your generated project to manage dependencies and build distribution files. Install uv by following their [instructions](https://docs.astral.sh/uv/getting-started/installation/).

    Note: Environments with private PyPi repository may need extra configuration (example):

      export UV_DEFAULT_INDEX=https://nexus.example.com/repository/pypi-all/simple
* Copier

    Copier is a tool for generating projects based on a template (like this one!). It also allows re-configuring the projects and to keep them updated when the original template changes. To insert dates into the template, copier requires [jinja2_time](https://github.com/hackebrot/jinja2-time) in the copier environment. Install both with uv by running:

      uv tool install --with jinja2-time copier

* just

  The project contains a justfile with pre-defined complex commands. To execute these commands you need [just](https://github.com/casey/just) as command runner. Install it by running:

      uv tool install rust-just

  To generate project artefacts run:
          `just gen-project`: generates all other representations
          `just site`: Builds all artefacts but does not deploy the gh-pages
          `just deploy`: deploys site
          `just test`: runs all tests
          `just testdoc`: locally builds docs and runs test server

### Code Quality with pre-commit

The project provides a [pre-commit](https://pre-commit.com/) configuration with several code quality tools:

- [yamllint](https://github.com/adrienverge/yamllint) — consistent formatting of schema YAML files
- [ruff](https://docs.astral.sh/ruff/) — formatting and linting of Python code
- [codespell](https://github.com/codespell-project/codespell) and [typos](https://github.com/crate-ci/typos) — spell checkers

To use pre-commit, install it and activate it at the root of the repository:

```shell
uv tool install pre-commit --with pre-commit-uv
pre-commit install
```

Once installed, pre-commit will run checks automatically on every commit and reject commits that contain errors; it will also auto-correct several types of errors. The use of [pre-commit-uv](https://pypi.org/project/pre-commit-uv/) is optional but recommended as it accelerates the initial setup.

You can also run all checks manually at any time:

```shell
pre-commit run -a
```

### Regenerate schema files from DCAT-AP SHACL shapes

#### ⚠️ Critical Rule: Never Edit the YAML Files Directly
The files [`dcat_ap_linkml.yaml`](schema/dcat_ap_linkml.yaml) and [`dcat_ap_plus.yaml`](schema/dcat_ap_plus.yaml) are **build artifacts**, not source code.

_**Do not manually edit these YAML files to add classes, slots, change constraints, or edit its metadata.**_

All schema changes **must** be made by modifying the Python generation script (`dcat_ap_shacl_2_linkml.py`).
*   To change the **DCAT-AP base**: Update the logic in `parse_dcat_ap_shacl_shapes()` (e.g., to handle new SHACL shapes).
*   To change the **DCAT-AP+ extension**: Update the logic in `build_dcatap_plus()` (e.g., adding slots to `extend_dataset()`).

#### Correct Workflow for Schema Changes

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

### Test data validation and conversion

Validate and test all: `just test`

Validate a single example dataset using LinkML's validator framework:

* Validate DCAT-AP-PLUS extension conform example
    ````commandline
    uv run linkml validate tests/data/valid/AnalysisDataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -C AnalysisDataset
    ````
* Validate DCAT-AP-PLUS extension conform example
    ````commandline
    uv run linkml validate tests/data/valid/Dataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -C Dataset
    ````

To convert the test datasets of each DCAT-AP profile into a TTL graph run:
  * Convert domain agnostic DCAT-AP extension conform example of an analysis
    ````commandline
    uv run linkml-convert -t ttl tests/data/valid/AnalysisDataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -P "_base=https://search.nfdi4chem.de/dataset/" -C AnalysisDataset
    ````
  * Convert a NMR spectroscopy-specific DCAT-AP extension conform example
    ````commandline
    uv run linkml-convert -t ttl tests/data/valid/Dataset-001.yaml -s ssrc/dcat_ap_plus/schema/dcat_ap_plus.yaml -P "_base=https://search.nfdi4chem.de/dataset/" -C Dataset
    ````

### Build GitHub pages docs locally

    uv run mkdocs serve

    rm -rf docs/elements/*.md && uv run gen-doc -d docs/elements src/dcat_ap_plus/schema/dcat_ap_plus.yaml

## Funding

This work was funded by the German Research Foundation (DFG) through the projects:
* "[NFDI4Cat](https://nfdi4cat.org/) - NFDI for Catalysis-Related Sciences" (DFG project no. [441926934](https://gepris.dfg.de/gepris/projekt/441926934)) and
* "[NFDI4Chem](https://nfdi4chem.de) - NFDI for Chemistry" (DFG project no. [441958208](https://gepris.dfg.de/gepris/projekt/441958208))"

within the National Research Data Infrastructure (NFDI) programme of the Joint Science Conference (GWK).

## Credits

This project uses the template [linkml-project-copier](https://github.com/linkml/linkml-project-copier).
