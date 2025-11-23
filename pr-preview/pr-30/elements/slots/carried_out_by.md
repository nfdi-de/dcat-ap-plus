

# Slot: carried_out_by 


_The slot to specify the AgenticEntity that played a certain part in carrying out the Activity, either via having a specific role, function or disposition that was realized in the Activity._





URI: [prov:wasAssociatedWith](http://www.w3.org/ns/prov#wasAssociatedWith)
Alias: carried_out_by

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |






## Properties

* Range: [AgenticEntity](../classes/AgenticEntity.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:wasAssociatedWith |
| native | dcatap_plus:carried_out_by |




## LinkML Source

<details>
```yaml
name: carried_out_by
description: The slot to specify the AgenticEntity that played a certain part in carrying
  out the Activity, either via having a specific role, function or disposition that
  was realized in the Activity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:wasAssociatedWith
alias: carried_out_by
domain_of:
- Activity
range: AgenticEntity
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>