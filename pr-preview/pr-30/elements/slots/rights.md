

# Slot: rights 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:rights](http://purl.org/dc/terms/rights)
Alias: rights

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Distribution](../classes/Distribution.md) | See [DCAT-AP specs:Distribution](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Distribution) |  yes  |
| [Catalogue](../classes/Catalogue.md) | See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue) |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:rights |
| native | dcatap_plus:rights |




## LinkML Source

<details>
```yaml
name: rights
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:rights
alias: rights
domain_of:
- Catalogue
- Distribution
range: string

```
</details>