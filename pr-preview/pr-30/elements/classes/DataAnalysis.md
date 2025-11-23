

# Class: DataAnalysis 


_An Activity that evaluates the data produced by another Activity._





URI: [prov:Activity](http://www.w3.org/ns/prov#Activity)





```mermaid
 classDiagram
    class DataAnalysis
    click DataAnalysis href "../../classes/DataAnalysis/"
      DataGeneratingActivity <|-- DataAnalysis
        click DataGeneratingActivity href "../../classes/DataGeneratingActivity/"
      
      DataAnalysis : carried_out_by
        
          
    
        
        
        DataAnalysis --> "* _recommended_" AgenticEntity : carried_out_by
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      DataAnalysis : description
        
      DataAnalysis : evaluated_activity
        
          
    
        
        
        DataAnalysis --> "* _recommended_" EvaluatedActivity : evaluated_activity
        click EvaluatedActivity href "../../classes/EvaluatedActivity/"
    

        
      DataAnalysis : evaluated_entity
        
          
    
        
        
        DataAnalysis --> "* _recommended_" AnalysisSourceData : evaluated_entity
        click AnalysisSourceData href "../../classes/AnalysisSourceData/"
    

        
      DataAnalysis : had_input_activity
        
          
    
        
        
        DataAnalysis --> "* _recommended_" Activity : had_input_activity
        click Activity href "../../classes/Activity/"
    

        
      DataAnalysis : had_input_entity
        
          
    
        
        
        DataAnalysis --> "* _recommended_" Entity : had_input_entity
        click Entity href "../../classes/Entity/"
    

        
      DataAnalysis : had_output_entity
        
          
    
        
        
        DataAnalysis --> "* _recommended_" Entity : had_output_entity
        click Entity href "../../classes/Entity/"
    

        
      DataAnalysis : has_part
        
          
    
        
        
        DataAnalysis --> "*" Activity : has_part
        click Activity href "../../classes/Activity/"
    

        
      DataAnalysis : has_qualitative_attribute
        
          
    
        
        
        DataAnalysis --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      DataAnalysis : has_quantitative_attribute
        
          
    
        
        
        DataAnalysis --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      DataAnalysis : id
        
      DataAnalysis : occurred_in
        
          
    
        
        
        DataAnalysis --> "0..1" Surrounding : occurred_in
        click Surrounding href "../../classes/Surrounding/"
    

        
      DataAnalysis : other_identifier
        
          
    
        
        
        DataAnalysis --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      DataAnalysis : part_of
        
          
    
        
        
        DataAnalysis --> "*" Activity : part_of
        click Activity href "../../classes/Activity/"
    

        
      DataAnalysis : rdf_type
        
          
    
        
        
        DataAnalysis --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      DataAnalysis : realized_plan
        
          
    
        
        
        DataAnalysis --> "0..1" Plan : realized_plan
        click Plan href "../../classes/Plan/"
    

        
      DataAnalysis : title
        
      DataAnalysis : type
        
          
    
        
        
        DataAnalysis --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* [Activity](../classes/Activity.md) [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * [DataGeneratingActivity](../classes/DataGeneratingActivity.md)
        * **DataAnalysis**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [evaluated_entity](../slots/evaluated_entity.md) | * _recommended_ <br/> [AnalysisSourceData](../classes/AnalysisSourceData.md) | A slot to provide the data that was analysed by the DataAnalysis. | [DataGeneratingActivity](../classes/DataGeneratingActivity.md) |
| [evaluated_activity](../slots/evaluated_activity.md) | * _recommended_ <br/> [EvaluatedActivity](../classes/EvaluatedActivity.md) | The slot to specify the Activity about which the DataGeneratingActivity produced information. | [DataGeneratingActivity](../classes/DataGeneratingActivity.md) |
| [realized_plan](../slots/realized_plan.md) | 0..1 <br/> [Plan](../classes/Plan.md) | The slot to specify the Plan (i.e. directive information or procedure) that was realized by an Activity. | [DataGeneratingActivity](../classes/DataGeneratingActivity.md) |
| [occurred_in](../slots/occurred_in.md) | 0..1 <br/> [Surrounding](../classes/Surrounding.md) | The slot to specify the Surrounding in which an Activity took place. | [DataGeneratingActivity](../classes/DataGeneratingActivity.md) |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | [Activity](../classes/Activity.md) |
| [title](../slots/title.md) | * <br/> [String](../types/String.md) | The slot to provide a title for the Activity. | [Activity](../classes/Activity.md) |
| [description](../slots/description.md) | * <br/> [String](../types/String.md) | The slot to provide a description for the Activity. | [Activity](../classes/Activity.md) |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | The slot to provide a secondary identifier of the Activity. | [Activity](../classes/Activity.md) |
| [has_part](../slots/has_part.md) | * <br/> [Activity](../classes/Activity.md) | The slot to provide an Activity that is part of the Activity. | [Activity](../classes/Activity.md) |
| [had_input_entity](../slots/had_input_entity.md) | * _recommended_ <br/> [Entity](../classes/Entity.md) | The slot to specify the Entity that was used as an input of an Activity that is to be changed, consumed or transformed. | [Activity](../classes/Activity.md) |
| [had_output_entity](../slots/had_output_entity.md) | * _recommended_ <br/> [Entity](../classes/Entity.md) | The slot to specify the Entity that was generated as an output of an Activity. | [Activity](../classes/Activity.md) |
| [had_input_activity](../slots/had_input_activity.md) | * _recommended_ <br/> [Activity](../classes/Activity.md) | The slot to provide a previous Activity that informed the Activity by being causally via a shared participant. | [Activity](../classes/Activity.md) |
| [carried_out_by](../slots/carried_out_by.md) | * _recommended_ <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to specify the AgenticEntity that played a certain part in carrying out the Activity, either via having a specific role, function or disposition that was realized in the Activity. | [Activity](../classes/Activity.md) |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [Activity](../classes/Activity.md) |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [Activity](../classes/Activity.md) |
| [part_of](../slots/part_of.md) | * <br/> [Activity](../classes/Activity.md) | The slot to provide an Activity of which the Activity is a part. | [Activity](../classes/Activity.md) |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [AnalysisDataset](../classes/AnalysisDataset.md) | [was_generated_by](../slots/was_generated_by.md) | range | [DataAnalysis](../classes/DataAnalysis.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Activity |
| native | dcatap_plus:DataAnalysis |
| exact | OBI:0200000 |
| close | NCIT:C25391 |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: DataAnalysis
description: An Activity that evaluates the data produced by another Activity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
exact_mappings:
- OBI:0200000
close_mappings:
- NCIT:C25391
is_a: DataGeneratingActivity
slot_usage:
  evaluated_entity:
    name: evaluated_entity
    description: A slot to provide the data that was analysed by the DataAnalysis.
    range: AnalysisSourceData
    multivalued: true
    inlined_as_list: true
class_uri: prov:Activity

```
</details>

### Induced

<details>
```yaml
name: DataAnalysis
description: An Activity that evaluates the data produced by another Activity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
exact_mappings:
- OBI:0200000
close_mappings:
- NCIT:C25391
is_a: DataGeneratingActivity
slot_usage:
  evaluated_entity:
    name: evaluated_entity
    description: A slot to provide the data that was analysed by the DataAnalysis.
    range: AnalysisSourceData
    multivalued: true
    inlined_as_list: true
attributes:
  evaluated_entity:
    name: evaluated_entity
    description: A slot to provide the data that was analysed by the DataAnalysis.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    is_a: had_input_entity
    slot_uri: prov:used
    alias: evaluated_entity
    owner: DataAnalysis
    domain_of:
    - DataGeneratingActivity
    range: AnalysisSourceData
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  evaluated_activity:
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
    owner: DataAnalysis
    domain_of:
    - DataGeneratingActivity
    range: EvaluatedActivity
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  realized_plan:
    name: realized_plan
    description: The slot to specify the Plan (i.e. directive information or procedure)
      that was realized by an Activity.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:used
    alias: realized_plan
    owner: DataAnalysis
    domain_of:
    - DataGeneratingActivity
    range: Plan
  occurred_in:
    name: occurred_in
    description: The slot to specify the Surrounding in which an Activity took place.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:atLocation
    alias: occurred_in
    owner: DataAnalysis
    domain_of:
    - DataGeneratingActivity
    range: Surrounding
  id:
    name: id
    description: A slot to provide an URI for an entity within this schema.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    identifier: true
    alias: id
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Dataset
    - DefinedTerm
    - Document
    - Entity
    - LegalResource
    - LicenseDocument
    - Resource
    range: uriorcurie
    required: true
  title:
    name: title
    description: The slot to provide a title for the Activity.
    notes:
    - not in DCAT-AP
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Any
    - Attribution
    - Catalogue
    - CatalogueRecord
    - ChecksumAlgorithm
    - Concept
    - ConceptScheme
    - DataService
    - Dataset
    - DatasetSeries
    - DefinedTerm
    - Distribution
    - Document
    - Entity
    - Frequency
    - Geometry
    - Identifier
    - LegalResource
    - LicenseDocument
    - LinguisticSystem
    - MediaType
    - MediaTypeOrExtent
    - PeriodOfTime
    - Plan
    - Policy
    - ProvenanceStatement
    - QualitativeAttribute
    - QuantitativeAttribute
    - Resource
    - RightsStatement
    - Role
    - Standard
    - SupportiveEntity
    - Surrounding
    - TimeInstant
    range: string
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: The slot to provide a description for the Activity.
    notes:
    - not in DCAT-AP
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Any
    - Attribution
    - Catalogue
    - CatalogueRecord
    - ChecksumAlgorithm
    - Concept
    - ConceptScheme
    - DataService
    - Dataset
    - DatasetSeries
    - Distribution
    - Document
    - Entity
    - Frequency
    - Geometry
    - Identifier
    - LegalResource
    - LicenseDocument
    - LinguisticSystem
    - MediaType
    - MediaTypeOrExtent
    - PeriodOfTime
    - Plan
    - Policy
    - ProvenanceStatement
    - QualitativeAttribute
    - QuantitativeAttribute
    - Resource
    - RightsStatement
    - Role
    - Standard
    - SupportiveEntity
    - Surrounding
    - TimeInstant
    range: string
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: The slot to provide a secondary identifier of the Activity.
    notes:
    - not in DCAT-AP
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Dataset
    - Entity
    range: Identifier
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: The slot to provide an Activity that is part of the Activity.
    notes:
    - not in DCAT-AP
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: Activity
    multivalued: true
    inlined_as_list: true
  had_input_entity:
    name: had_input_entity
    description: The slot to specify the Entity that was used as an input of an Activity
      that is to be changed, consumed or transformed.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:used
    alias: had_input_entity
    owner: DataAnalysis
    domain_of:
    - Activity
    range: Entity
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  had_output_entity:
    name: had_output_entity
    description: The slot to specify the Entity that was generated as an output of
      an Activity.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:generated
    alias: had_output_entity
    owner: DataAnalysis
    domain_of:
    - Activity
    range: Entity
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  had_input_activity:
    name: had_input_activity
    description: The slot to provide a previous Activity that informed the Activity
      by being causally via a shared participant.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:wasInformedBy
    alias: had_input_activity
    owner: DataAnalysis
    domain_of:
    - Activity
    range: Activity
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  carried_out_by:
    name: carried_out_by
    description: The slot to specify the AgenticEntity that played a certain part
      in carrying out the Activity, either via having a specific role, function or
      disposition that was realized in the Activity.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:wasAssociatedWith
    alias: carried_out_by
    owner: DataAnalysis
    domain_of:
    - Activity
    range: AgenticEntity
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  has_qualitative_attribute:
    name: has_qualitative_attribute
    description: The slot to relate a qualitative attribute to an EvaluatedEntity,
      EvaluatedActivity or AgenticEntity
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:relation
    alias: has_qualitative_attribute
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    range: QualitativeAttribute
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  has_quantitative_attribute:
    name: has_quantitative_attribute
    description: The slot to relate a quantitative attribute to an EvaluatedEntity,
      EvaluatedActivity or AgenticEntity
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:relation
    alias: has_quantitative_attribute
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    range: QuantitativeAttribute
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide an Activity of which the Activity is a part.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:isPartOf
    alias: part_of
    owner: DataAnalysis
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    inverse: has_part
    range: Activity
    multivalued: true
    inlined_as_list: true
  type:
    name: type
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:type
    alias: type
    owner: DataAnalysis
    domain_of:
    - Agent
    - ClassifierMixin
    - Dataset
    - LicenseDocument
    range: DefinedTerm
    inlined: true
  rdf_type:
    name: rdf_type
    description: The slot to specify the ontology class that is instantiated by an
      entity.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: rdf:type
    alias: rdf_type
    owner: DataAnalysis
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Activity

```
</details>