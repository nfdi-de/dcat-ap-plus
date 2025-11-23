

# Slot: has_part 


_This slot is described in more detail within the class in which it is used._





URI: [dcterms:hasPart](http://purl.org/dc/terms/hasPart)
Alias: has_part

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [Entity](../classes/Entity.md) | A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. |  yes  |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  yes  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [Catalogue](../classes/Catalogue.md) | See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue) |  yes  |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | Information that was evaluated within a DataAnalysis. |  no  |
| [Device](../classes/Device.md) | A material instrument that is designed to perform a function primarily by means of its mechanical or electrical nature. |  yes  |
| [AgenticEntity](../classes/AgenticEntity.md) | An entity that is somehow responsible for an Activity to take place. |  yes  |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | An Entity that is being evaluated in a DataGeneratingActivity. |  no  |
| [Software](../classes/Software.md) | An instrument composed of a series of instructions that can be interpreted by or directly executed by a computer. |  yes  |






## Properties

* Range: [String](../types/String.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:hasPart |
| native | dcatap_plus:has_part |




## LinkML Source

<details>
```yaml
name: has_part
description: This slot is described in more detail within the class in which it is
  used.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: dcterms:hasPart
alias: has_part
domain_of:
- Activity
- AgenticEntity
- Catalogue
- Entity
range: string

```
</details>