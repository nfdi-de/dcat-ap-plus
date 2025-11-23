# Enum: QUDTQuantityKindEnum 




_Possible kinds of quantifiable attribute types provided as QUDT QualityKind instances._



URI: [dcatap_plus:enum/QUDTQuantityKindEnum](https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml#enum/QUDTQuantityKindEnum)


_This is a dynamic enum_







## TODOs

* Dynamic enums (https://linkml.io/linkml/schemas/enums.html#dynamic-enums) should be used to constrain the range of the type slot instead of using the default DefinedTerm as range. This will be done in profiles of this schema where we define Activity subclasses, e.g. NMRSpectroscopy. seeAlso: https://github.com/linkml/linkml-model/blob/main/tests/input/examples/schema_definition-enum_bindings-1.yaml

## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml






## LinkML Source

<details>
```yaml
name: QUDTQuantityKindEnum
implements:
- owl:NamedIndividual
description: Possible kinds of quantifiable attribute types provided as QUDT QualityKind
  instances.
todos:
- 'Dynamic enums (https://linkml.io/linkml/schemas/enums.html#dynamic-enums) should
  be used to constrain the range of the type slot instead of using the default DefinedTerm
  as range. This will be done in profiles of this schema where we define Activity
  subclasses, e.g. NMRSpectroscopy. seeAlso: https://github.com/linkml/linkml-model/blob/main/tests/input/examples/schema_definition-enum_bindings-1.yaml'
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
reachable_from:
  source_ontology: http://qudt.org/2.1/vocab/quantitykind
  source_nodes:
  - qudt:QuantityKind
  relationship_types:
  - rdf:type
  is_direct: true

```
</details>