

# Slot: value 


_A slot to provide the literal value of an attribute._





URI: [prov:value](http://www.w3.org/ns/prov#value)
Alias: value

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity. |  yes  |
| [QualitativeAttribute](../classes/QualitativeAttribute.md) | A piece of information that is attributed to an Entity, Activity or AgenticEntity. |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:value |
| native | dcatap_plus:value |




## LinkML Source

<details>
```yaml
name: value
description: A slot to provide the literal value of an attribute.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:value
alias: value
domain_of:
- QualitativeAttribute
- QuantitativeAttribute
range: string

```
</details>