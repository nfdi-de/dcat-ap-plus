

# Slot: occurred_in 


_The slot to specify the Surrounding in which an Activity took place._





URI: [prov:atLocation](http://www.w3.org/ns/prov#atLocation)
Alias: occurred_in

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |






## Properties

* Range: [Surrounding](../classes/Surrounding.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:atLocation |
| native | dcatap_plus:occurred_in |




## LinkML Source

<details>
```yaml
name: occurred_in
description: The slot to specify the Surrounding in which an Activity took place.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:atLocation
alias: occurred_in
domain_of:
- DataGeneratingActivity
range: Surrounding

```
</details>