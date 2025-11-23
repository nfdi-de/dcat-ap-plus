

# Slot: evaluated_entity 


_The slot to specify the Entity about which the DataGeneratingActivity produced information._





URI: [prov:used](http://www.w3.org/ns/prov#used)
Alias: evaluated_entity


## Inheritance

* [had_input_entity](../slots/had_input_entity.md)
    * **evaluated_entity**






## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  yes  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |






## Properties

* Range: [EvaluatedEntity](../classes/EvaluatedEntity.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:used |
| native | dcatap_plus:evaluated_entity |




## LinkML Source

<details>
```yaml
name: evaluated_entity
description: The slot to specify the Entity about which the DataGeneratingActivity
  produced information.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
is_a: had_input_entity
slot_uri: prov:used
alias: evaluated_entity
domain_of:
- DataGeneratingActivity
range: EvaluatedEntity
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>