

# Slot: application_profile 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:conformsTo](http://purl.org/dc/terms/conformsTo)
Alias: application_profile

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [CatalogueRecord](../classes/CatalogueRecord.md) | See [DCAT-AP specs:CatalogueRecord](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#CatalogueRecord) |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:conformsTo |
| native | dcatap_plus:application_profile |




## LinkML Source

<details>
```yaml
name: application_profile
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:conformsTo
alias: application_profile
domain_of:
- CatalogueRecord
range: string

```
</details>