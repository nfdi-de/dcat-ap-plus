

# Slot: unit 



URI: [qudt:unit](http://qudt.org/schema/qudt/unit)
Alias: unit

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity. |  no  |






## Properties

* Range: [DefinedTerm](../classes/DefinedTerm.md)

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | qudt:unit |
| native | dcatap_plus:unit |




## LinkML Source

<details>
```yaml
name: unit
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: qudt:unit
alias: unit
owner: QuantitativeAttribute
domain_of:
- QuantitativeAttribute
range: DefinedTerm
bindings:
- range: QUDTUnitEnum
  obligation_level: RECOMMENDED
  binds_value_of: id
  description: Restricts the allowable defined terms to the QUDT Unit vocabulary.
recommended: true

```
</details>