

# Slot: linked_schemas 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:conformsTo](http://purl.org/dc/terms/conformsTo)
Alias: linked_schemas

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Distribution](../classes/Distribution.md) | See [DCAT-AP specs:Distribution](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Distribution) |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:conformsTo |
| native | dcatap_plus:linked_schemas |




## LinkML Source

<details>
```yaml
name: linked_schemas
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:conformsTo
alias: linked_schemas
domain_of:
- Distribution
range: string

```
</details>