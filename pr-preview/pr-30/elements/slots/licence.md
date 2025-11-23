

# Slot: licence 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:license](http://purl.org/dc/terms/license)
Alias: licence

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Distribution](../classes/Distribution.md) | See [DCAT-AP specs:Distribution](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Distribution) |  yes  |
| [DataService](../classes/DataService.md) | See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService) |  yes  |
| [Catalogue](../classes/Catalogue.md) | See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue) |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:license |
| native | dcatap_plus:licence |




## LinkML Source

<details>
```yaml
name: licence
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:license
alias: licence
domain_of:
- Catalogue
- DataService
- Distribution
range: string

```
</details>