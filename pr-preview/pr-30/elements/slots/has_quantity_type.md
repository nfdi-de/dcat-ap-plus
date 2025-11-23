

# Slot: has_quantity_type 


_The type of quality that is quantifiable according to the QUDT ontology._





URI: [qudt:hasQuantityKind](http://qudt.org/schema/qudt/hasQuantityKind)
Alias: has_quantity_type

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity. |  no  |






## Properties

* Range: [DefinedTerm](../classes/DefinedTerm.md)

* Required: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | qudt:hasQuantityKind |
| native | dcatap_plus:has_quantity_type |




## LinkML Source

<details>
```yaml
name: has_quantity_type
description: The type of quality that is quantifiable according to the QUDT ontology.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: qudt:hasQuantityKind
alias: has_quantity_type
owner: QuantitativeAttribute
domain_of:
- QuantitativeAttribute
range: DefinedTerm
bindings:
- range: QUDTQuantityKindEnum
  obligation_level: RECOMMENDED
  binds_value_of: id
  description: Binds the type of a quantifiable attribute to a QUDT Quantity Kind
    instance from the QUDT Quantity Kind vocabulary.
required: true

```
</details>