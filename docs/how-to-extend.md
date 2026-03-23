# Rules for extending DCAT-AP+ in domain-specific profiles

DCAT-AP+ is designed to be imported and specialized. [ChemDCAT-AP](https://github.com/nfdi-de/chem-dcat-ap) demonstrates this for chemistry and catalysis. This section documents the contract between DCAT-AP+ and its downstream profiles.

## The two-layer architecture

![extending_stack_dark.svg](images/extending_stack_dark.svg#only-dark)
![extending_stack_light.svg](images/extending_stack_light.svg#only-light)

## What you MUST do

- **Import the full DCAT-AP+ schema** in your LinkML schema's `imports` section.
- **Preserve DCAT-AP mandatory constraints**. If DCAT-AP requires `title` and `description` on `Dataset`, your profile must not make them optional.

## What you MAY do

- **Subclass DCAT-AP+ classes** using `is_a` to create a new node shape with additional slots or stricter slot constraints. When you do so and also choose to map to a semantically narrower ontology term via `class_uri`, you should make sure to remain aligned with DCAT-AP+ for interoperability. See [Foundational principle: LinkML elements as SHACL shapes](design-patterns.md#foundational-principle-linkml-elements-as-shacl-shapes) for guidance. For example, ChemDCAT-AP defines `SubstanceSample` as `is_a: EvaluatedEntity` with `class_uri: SIO:001378`.
- **Create sub-slots** using `is_a` on slots for making stricter constraints. When you do so and also choose to map to a semantically narrower ontology term via `slot_uri`, you should make sure to remain aligned with DCAT-AP+ for interoperability. See [Foundational principle: LinkML elements as SHACL shapes](design-patterns.md#foundational-principle-linkml-elements-as-shacl-shapes) for guidance. For example, ChemDCAT-AP defines `used_catalyst` as `is_a: carried_out_by` with `slot_uri: RXNO:0000425`.
- **Add new slots** to your domain classes.
- **Constrain ranges** further (narrowing is allowed by DCAT-AP extension rules).
- **Provide domain-specific enums** to bind `rdf_type` or `type` to specific controlled vocabularies.

## What you MUST NOT do

- **Don't broaden cardinality** on inherited slots (e.g. don't make a `required` slot optional).
- **Don't change `slot_uri` or `class_uri` on imported DCAT-AP+ elements.** Modifying the base schema's ontology mappings would break the RDF mapping for all profiles.
- **Don't add domain-specific classes directly to DCAT-AP+.** Create your own schema that imports it.
- **Don't duplicate existing DCAT-AP classes or properties.** Add new ones or specialize existing ones.

## Conformance checklist for your domain profile

- [x] Schema imports `dcat-ap-plus`
- [x] All DCAT-AP mandatory properties remain `required: true`
- [x] New classes use `is_a` to extend DCAT-AP+ classes
- [x] New slots use `is_a` to extend DCAT-AP+ slots where a generic counterpart exists
- [x] `class_uri` and `slot_uri` on new elements point to established ontology terms
- [x] Example instance data validates with `linkml-validate`
- [x] CI pipeline runs schema and data validation on every PR
