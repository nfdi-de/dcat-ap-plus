

# Slot: source_metadata 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:source](http://purl.org/dc/terms/source)
Alias: source_metadata

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
| self | dcterms:source |
| native | dcatap_plus:source_metadata |




## LinkML Source

<details>
```yaml
name: source_metadata
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:source
alias: source_metadata
domain_of:
- CatalogueRecord
range: string

```
</details>