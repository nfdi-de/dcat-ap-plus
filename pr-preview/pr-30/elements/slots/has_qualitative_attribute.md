

# Slot: has_qualitative_attribute 


_The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity_





URI: [dcterms:relation](http://purl.org/dc/terms/relation)
Alias: has_qualitative_attribute

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [Entity](../classes/Entity.md) | A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. |  no  |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [Software](../classes/Software.md) | An instrument composed of a series of instructions that can be interpreted by or directly executed by a computer. |  no  |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | Information that was evaluated within a DataAnalysis. |  no  |
| [Device](../classes/Device.md) | A material instrument that is designed to perform a function primarily by means of its mechanical or electrical nature. |  no  |
| [AgenticEntity](../classes/AgenticEntity.md) | An entity that is somehow responsible for an Activity to take place. |  no  |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | An Entity that is being evaluated in a DataGeneratingActivity. |  no  |






## Properties

* Range: [QualitativeAttribute](../classes/QualitativeAttribute.md)

* Multivalued: True

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:relation |
| native | dcatap_plus:has_qualitative_attribute |




## LinkML Source

<details>
```yaml
name: has_qualitative_attribute
description: The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity
  or AgenticEntity
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:relation
alias: has_qualitative_attribute
domain_of:
- Activity
- AgenticEntity
- Entity
range: QualitativeAttribute
recommended: true
multivalued: true
inlined: true
inlined_as_list: true

```
</details>