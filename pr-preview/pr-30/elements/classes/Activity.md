

# Class: Activity 


_See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity)_





URI: [prov:Activity](http://www.w3.org/ns/prov#Activity)





```mermaid
 classDiagram
    class Activity
    click Activity href "../../classes/Activity/"
      ClassifierMixin <|-- Activity
        click ClassifierMixin href "../../classes/ClassifierMixin/"
      

      Activity <|-- DataGeneratingActivity
        click DataGeneratingActivity href "../../classes/DataGeneratingActivity/"
      Activity <|-- EvaluatedActivity
        click EvaluatedActivity href "../../classes/EvaluatedActivity/"
      

      Activity : carried_out_by
        
          
    
        
        
        Activity --> "* _recommended_" AgenticEntity : carried_out_by
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      Activity : description
        
      Activity : had_input_activity
        
          
    
        
        
        Activity --> "* _recommended_" Activity : had_input_activity
        click Activity href "../../classes/Activity/"
    

        
      Activity : had_input_entity
        
          
    
        
        
        Activity --> "* _recommended_" Entity : had_input_entity
        click Entity href "../../classes/Entity/"
    

        
      Activity : had_output_entity
        
          
    
        
        
        Activity --> "* _recommended_" Entity : had_output_entity
        click Entity href "../../classes/Entity/"
    

        
      Activity : has_part
        
          
    
        
        
        Activity --> "*" Activity : has_part
        click Activity href "../../classes/Activity/"
    

        
      Activity : has_qualitative_attribute
        
          
    
        
        
        Activity --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      Activity : has_quantitative_attribute
        
          
    
        
        
        Activity --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      Activity : id
        
      Activity : other_identifier
        
          
    
        
        
        Activity --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      Activity : part_of
        
          
    
        
        
        Activity --> "*" Activity : part_of
        click Activity href "../../classes/Activity/"
    

        
      Activity : rdf_type
        
          
    
        
        
        Activity --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      Activity : title
        
      Activity : type
        
          
    
        
        
        Activity --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* **Activity** [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * [DataGeneratingActivity](../classes/DataGeneratingActivity.md)
    * [EvaluatedActivity](../classes/EvaluatedActivity.md)



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | direct |
| [title](../slots/title.md) | * <br/> [String](../types/String.md) | The slot to provide a title for the Activity. | direct |
| [description](../slots/description.md) | * <br/> [String](../types/String.md) | The slot to provide a description for the Activity. | direct |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | The slot to provide a secondary identifier of the Activity. | direct |
| [has_part](../slots/has_part.md) | * <br/> [Activity](../classes/Activity.md) | The slot to provide an Activity that is part of the Activity. | direct |
| [had_input_entity](../slots/had_input_entity.md) | * _recommended_ <br/> [Entity](../classes/Entity.md) | The slot to specify the Entity that was used as an input of an Activity that is to be changed, consumed or transformed. | direct |
| [had_output_entity](../slots/had_output_entity.md) | * _recommended_ <br/> [Entity](../classes/Entity.md) | The slot to specify the Entity that was generated as an output of an Activity. | direct |
| [had_input_activity](../slots/had_input_activity.md) | * _recommended_ <br/> [Activity](../classes/Activity.md) | The slot to provide a previous Activity that informed the Activity by being causally via a shared participant. | direct |
| [carried_out_by](../slots/carried_out_by.md) | * _recommended_ <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to specify the AgenticEntity that played a certain part in carrying out the Activity, either via having a specific role, function or disposition that was realized in the Activity. | direct |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [part_of](../slots/part_of.md) | * <br/> [Activity](../classes/Activity.md) | The slot to provide an Activity of which the Activity is a part. | direct |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Activity](../classes/Activity.md) | [has_part](../slots/has_part.md) | range | [Activity](../classes/Activity.md) |
| [Activity](../classes/Activity.md) | [had_input_activity](../slots/had_input_activity.md) | range | [Activity](../classes/Activity.md) |
| [Activity](../classes/Activity.md) | [part_of](../slots/part_of.md) | range | [Activity](../classes/Activity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [has_part](../slots/has_part.md) | range | [Activity](../classes/Activity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [had_input_activity](../slots/had_input_activity.md) | range | [Activity](../classes/Activity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [part_of](../slots/part_of.md) | range | [Activity](../classes/Activity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [has_part](../slots/has_part.md) | range | [Activity](../classes/Activity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [had_input_activity](../slots/had_input_activity.md) | range | [Activity](../classes/Activity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [part_of](../slots/part_of.md) | range | [Activity](../classes/Activity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [has_part](../slots/has_part.md) | range | [Activity](../classes/Activity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [had_input_activity](../slots/had_input_activity.md) | range | [Activity](../classes/Activity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [part_of](../slots/part_of.md) | range | [Activity](../classes/Activity.md) |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | [was_generated_by](../slots/was_generated_by.md) | range | [Activity](../classes/Activity.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Activity |
| native | dcatap_plus:Activity |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Activity
description: See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity)
notes:
- The specified properties (slots) of this class are part of our extension of the
  DCAT-AP.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slots:
- id
- title
- description
- other_identifier
- has_part
- had_input_entity
- had_output_entity
- had_input_activity
- carried_out_by
- has_qualitative_attribute
- has_quantitative_attribute
- part_of
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the Activity.
    notes:
    - not in DCAT-AP
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: The slot to provide a description for the Activity.
    notes:
    - not in DCAT-AP
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: The slot to provide an Activity that is part of the Activity.
    notes:
    - not in DCAT-AP
    range: Activity
    multivalued: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide an Activity of which the Activity is a part.
    notes:
    - not in DCAT-AP
    range: Activity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: The slot to provide a secondary identifier of the Activity.
    notes:
    - not in DCAT-AP
    range: Identifier
    multivalued: true
    inlined_as_list: true
  has_qualitative_attribute:
    name: has_qualitative_attribute
    notes:
    - not in DCAT-AP
  has_quantitative_attribute:
    name: has_quantitative_attribute
    notes:
    - not in DCAT-AP
  had_input_entity:
    name: had_input_entity
    notes:
    - not in DCAT-AP
  had_output_entity:
    name: had_output_entity
    notes:
    - not in DCAT-AP
  had_input_activity:
    name: had_input_activity
    notes:
    - not in DCAT-AP
  carried_out_by:
    name: carried_out_by
    notes:
    - not in DCAT-AP
class_uri: prov:Activity

```
</details>

### Induced

<details>
```yaml
name: Activity
description: See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity)
notes:
- The specified properties (slots) of this class are part of our extension of the
  DCAT-AP.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the Activity.
    notes:
    - not in DCAT-AP
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: The slot to provide a description for the Activity.
    notes:
    - not in DCAT-AP
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: The slot to provide an Activity that is part of the Activity.
    notes:
    - not in DCAT-AP
    range: Activity
    multivalued: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide an Activity of which the Activity is a part.
    notes:
    - not in DCAT-AP
    range: Activity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: The slot to provide a secondary identifier of the Activity.
    notes:
    - not in DCAT-AP
    range: Identifier
    multivalued: true
    inlined_as_list: true
  has_qualitative_attribute:
    name: has_qualitative_attribute
    notes:
    - not in DCAT-AP
  has_quantitative_attribute:
    name: has_quantitative_attribute
    notes:
    - not in DCAT-AP
  had_input_entity:
    name: had_input_entity
    notes:
    - not in DCAT-AP
  had_output_entity:
    name: had_output_entity
    notes:
    - not in DCAT-AP
  had_input_activity:
    name: had_input_activity
    notes:
    - not in DCAT-AP
  carried_out_by:
    name: carried_out_by
    notes:
    - not in DCAT-AP
attributes:
  id:
    name: id
    description: A slot to provide an URI for an entity within this schema.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    identifier: true
    alias: id
    owner: Activity
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
  title:
    name: title
    description: The slot to provide a title for the Activity.
    notes:
    - not in DCAT-AP
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: Activity
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
    owner: Activity
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
    owner: Activity
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
    owner: Activity
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
    owner: Activity
    domain_of:
    - Activity
    range: Entity
    recommended: true
    multivalued: true
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
    owner: Activity
    domain_of:
    - Activity
    range: Entity
    recommended: true
    multivalued: true
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
    owner: Activity
    domain_of:
    - Activity
    range: Activity
    recommended: true
    multivalued: true
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
    owner: Activity
    domain_of:
    - Activity
    range: AgenticEntity
    recommended: true
    multivalued: true
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
    owner: Activity
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    range: QualitativeAttribute
    recommended: true
    multivalued: true
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
    owner: Activity
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    range: QuantitativeAttribute
    recommended: true
    multivalued: true
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
    owner: Activity
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
    owner: Activity
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
    owner: Activity
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Activity

```
</details>