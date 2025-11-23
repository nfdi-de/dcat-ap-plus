

# Slot: had_output_entity 


_The slot to specify the Entity that was generated as an output of an Activity._





URI: [prov:generated](http://www.w3.org/ns/prov#generated)
Alias: had_output_entity

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |






## Properties

* Range: [Entity](../classes/Entity.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:generated |
| native | dcatap_plus:had_output_entity |




## LinkML Source

<details>
```yaml
name: had_output_entity
description: The slot to specify the Entity that was generated as an output of an
  Activity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: prov:generated
alias: had_output_entity
domain_of:
- Activity
range: Entity
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>