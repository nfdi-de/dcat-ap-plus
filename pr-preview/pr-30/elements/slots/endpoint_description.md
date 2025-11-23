

# Slot: endpoint_description 


_This slot is described in more detail within the class in which it is used._





URI: [dcat:endpointDescription](http://www.w3.org/ns/dcat#endpointDescription)
Alias: endpoint_description

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataService](../classes/DataService.md) | See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService) |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcat:endpointDescription |
| native | dcatap_plus:endpoint_description |




## LinkML Source

<details>
```yaml
name: endpoint_description
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcat:endpointDescription
alias: endpoint_description
domain_of:
- DataService
range: string

```
</details>