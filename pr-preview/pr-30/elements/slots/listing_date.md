

# Slot: listing_date 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:issued](http://purl.org/dc/terms/issued)
Alias: listing_date

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
| self | dcterms:issued |
| native | dcatap_plus:listing_date |




## LinkML Source

<details>
```yaml
name: listing_date
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:issued
alias: listing_date
domain_of:
- CatalogueRecord
range: string

```
</details>