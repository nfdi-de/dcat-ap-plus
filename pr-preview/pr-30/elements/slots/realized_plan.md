

# Slot: realized_plan 


_The slot to specify the Plan (i.e. directive information or procedure) that was realized by an Activity._





URI: [prov:used](http://www.w3.org/ns/prov#used)
Alias: realized_plan

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |






## Properties

* Range: [Plan](../classes/Plan.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:used |
| native | dcatap_plus:realized_plan |




## LinkML Source

<details>
```yaml
name: realized_plan
description: The slot to specify the Plan (i.e. directive information or procedure)
  that was realized by an Activity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:used
alias: realized_plan
domain_of:
- DataGeneratingActivity
range: Plan

```
</details>