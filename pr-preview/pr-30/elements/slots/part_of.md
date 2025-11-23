

# Slot: part_of 


_A slot to specify a related resource in which the described resource is physically or logically included._





URI: [dcterms:isPartOf](http://purl.org/dc/terms/isPartOf)
Alias: part_of

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [AgenticEntity](../classes/AgenticEntity.md) | An entity that is somehow responsible for an Activity to take place. |  yes  |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | Information that was evaluated within a DataAnalysis. |  no  |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [Device](../classes/Device.md) | A material instrument that is designed to perform a function primarily by means of its mechanical or electrical nature. |  no  |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | An Entity that is being evaluated in a DataGeneratingActivity. |  no  |
| [Entity](../classes/Entity.md) | A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. |  yes  |
| [Software](../classes/Software.md) | An instrument composed of a series of instructions that can be interpreted by or directly executed by a computer. |  no  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:isPartOf |
| native | dcatap_plus:part_of |




## LinkML Source

<details>
```yaml
name: part_of
description: A slot to specify a related resource in which the described resource
  is physically or logically included.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:isPartOf
alias: part_of
domain_of:
- Activity
- AgenticEntity
- Entity
inverse: has_part
range: string

```
</details>