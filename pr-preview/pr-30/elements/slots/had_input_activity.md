

# Slot: had_input_activity 


_The slot to provide a previous Activity that informed the Activity by being causally via a shared participant._





URI: [prov:wasInformedBy](http://www.w3.org/ns/prov#wasInformedBy)
Alias: had_input_activity


## Inheritance

* **had_input_activity**
    * [evaluated_activity](../slots/evaluated_activity.md)






## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |






## Properties

* Range: [Activity](../classes/Activity.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:wasInformedBy |
| native | dcatap_plus:had_input_activity |




## LinkML Source

<details>
```yaml
name: had_input_activity
description: The slot to provide a previous Activity that informed the Activity by
  being causally via a shared participant.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:wasInformedBy
alias: had_input_activity
domain_of:
- Activity
range: Activity
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>