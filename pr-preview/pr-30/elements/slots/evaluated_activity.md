

# Slot: evaluated_activity 


_The slot to specify the Activity about which the DataGeneratingActivity produced information._





URI: [prov:wasInformedBy](http://www.w3.org/ns/prov#wasInformedBy)
Alias: evaluated_activity


## Inheritance

* [had_input_activity](../slots/had_input_activity.md)
    * **evaluated_activity**






## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |






## Properties

* Range: [EvaluatedActivity](../classes/EvaluatedActivity.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:wasInformedBy |
| native | dcatap_plus:evaluated_activity |




## LinkML Source

<details>
```yaml
name: evaluated_activity
description: The slot to specify the Activity about which the DataGeneratingActivity
  produced information.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
is_a: had_input_activity
slot_uri: prov:wasInformedBy
alias: evaluated_activity
domain_of:
- DataGeneratingActivity
range: EvaluatedActivity
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>