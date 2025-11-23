

# Slot: rdf_type 


_The slot to specify the ontology class that is instantiated by an entity._





URI: [rdf:type](http://www.w3.org/1999/02/22-rdf-syntax-ns#type)
Alias: rdf_type

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | An activity or proces that is being evaluated in a DataGeneratingActivity. |  no  |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity. |  no  |
| [DataAnalysis](../classes/DataAnalysis.md) | An Activity that evaluates the data produced by another Activity. |  no  |
| [AgenticEntity](../classes/AgenticEntity.md) | An entity that is somehow responsible for an Activity to take place. |  no  |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | Information that was evaluated within a DataAnalysis. |  no  |
| [Surrounding](../classes/Surrounding.md) | The surrounding in which the dataset creating activity took place (e.g. a lab). |  no  |
| [ClassifierMixin](../classes/ClassifierMixin.md) | A mixin with which an entity of this schema can be classified via an additional rdf:type or dcterms:type assertion. |  no  |
| [Activity](../classes/Activity.md) | See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity) |  no  |
| [QualitativeAttribute](../classes/QualitativeAttribute.md) | A piece of information that is attributed to an Entity, Activity or AgenticEntity. |  no  |
| [Device](../classes/Device.md) | A material instrument that is designed to perform a function primarily by means of its mechanical or electrical nature. |  no  |
| [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity. |  no  |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | An Entity that is being evaluated in a DataGeneratingActivity. |  no  |
| [Plan](../classes/Plan.md) | A piece of information that specifies how an activity has to be carried out by its agents including what kind of steps have to be taken and what kind of parameters have to be met/set. |  no  |
| [Entity](../classes/Entity.md) | A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. |  no  |
| [Software](../classes/Software.md) | An instrument composed of a series of instructions that can be interpreted by or directly executed by a computer. |  no  |






## Properties

* Range: [DefinedTerm](../classes/DefinedTerm.md)

* Recommended: True




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | rdf:type |
| native | dcatap_plus:rdf_type |




## LinkML Source

<details>
```yaml
name: rdf_type
description: The slot to specify the ontology class that is instantiated by an entity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: rdf:type
alias: rdf_type
domain_of:
- ClassifierMixin
range: DefinedTerm
recommended: true
inlined: true

```
</details>