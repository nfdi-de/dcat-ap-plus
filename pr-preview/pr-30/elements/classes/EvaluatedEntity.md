

# Class: EvaluatedEntity 


_An Entity that is being evaluated in a DataGeneratingActivity._





URI: [prov:Entity](http://www.w3.org/ns/prov#Entity)





```mermaid
 classDiagram
    class EvaluatedEntity
    click EvaluatedEntity href "../../classes/EvaluatedEntity/"
      Entity <|-- EvaluatedEntity
        click Entity href "../../classes/Entity/"
      

      EvaluatedEntity <|-- AnalysisSourceData
        click AnalysisSourceData href "../../classes/AnalysisSourceData/"
      

      EvaluatedEntity : description
        
      EvaluatedEntity : has_part
        
          
    
        
        
        EvaluatedEntity --> "*" Entity : has_part
        click Entity href "../../classes/Entity/"
    

        
      EvaluatedEntity : has_qualitative_attribute
        
          
    
        
        
        EvaluatedEntity --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      EvaluatedEntity : has_quantitative_attribute
        
          
    
        
        
        EvaluatedEntity --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      EvaluatedEntity : id
        
      EvaluatedEntity : other_identifier
        
          
    
        
        
        EvaluatedEntity --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      EvaluatedEntity : part_of
        
          
    
        
        
        EvaluatedEntity --> "*" Entity : part_of
        click Entity href "../../classes/Entity/"
    

        
      EvaluatedEntity : rdf_type
        
          
    
        
        
        EvaluatedEntity --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      EvaluatedEntity : title
        
      EvaluatedEntity : type
        
          
    
        
        
        EvaluatedEntity --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      EvaluatedEntity : was_generated_by
        
          
    
        
        
        EvaluatedEntity --> "*" Activity : was_generated_by
        click Activity href "../../classes/Activity/"
    

        
      
```





## Inheritance
* [Entity](../classes/Entity.md) [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * **EvaluatedEntity**
        * [AnalysisSourceData](../classes/AnalysisSourceData.md)



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [was_generated_by](../slots/was_generated_by.md) | * <br/> [Activity](../classes/Activity.md) | A slot to provide the Activity which created the EvaluatedEntity. | direct |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | The slot to provide a title for the EvaluatedEntity. | [Entity](../classes/Entity.md) |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | The slot to provide a description for the EvaluatedEntity. | [Entity](../classes/Entity.md) |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | [Entity](../classes/Entity.md) |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | A slot to provide a secondary identifier of the EvaluatedEntity. | [Entity](../classes/Entity.md) |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [Entity](../classes/Entity.md) |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [Entity](../classes/Entity.md) |
| [has_part](../slots/has_part.md) | * <br/> [Entity](../classes/Entity.md) | A slot to provide a part of the Entity. | [Entity](../classes/Entity.md) |
| [part_of](../slots/part_of.md) | * <br/> [Entity](../classes/Entity.md) | The slot to specify an Entity of which the Entity is a part. | [Entity](../classes/Entity.md) |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [AnalysisDataset](../classes/AnalysisDataset.md) | [is_about_entity](../slots/is_about_entity.md) | range | [EvaluatedEntity](../classes/EvaluatedEntity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [evaluated_entity](../slots/evaluated_entity.md) | range | [EvaluatedEntity](../classes/EvaluatedEntity.md) |
| [Dataset](../classes/Dataset.md) | [is_about_entity](../slots/is_about_entity.md) | range | [EvaluatedEntity](../classes/EvaluatedEntity.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Entity |
| native | dcatap_plus:EvaluatedEntity |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: EvaluatedEntity
description: An Entity that is being evaluated in a DataGeneratingActivity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: Entity
slots:
- was_generated_by
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the EvaluatedEntity.
  description:
    name: description
    description: The slot to provide a description for the EvaluatedEntity.
  was_generated_by:
    name: was_generated_by
    description: A slot to provide the Activity which created the EvaluatedEntity.
    range: Activity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier of the EvaluatedEntity.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
class_uri: prov:Entity

```
</details>

### Induced

<details>
```yaml
name: EvaluatedEntity
description: An Entity that is being evaluated in a DataGeneratingActivity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: Entity
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the EvaluatedEntity.
  description:
    name: description
    description: The slot to provide a description for the EvaluatedEntity.
  was_generated_by:
    name: was_generated_by
    description: A slot to provide the Activity which created the EvaluatedEntity.
    range: Activity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier of the EvaluatedEntity.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
attributes:
  was_generated_by:
    name: was_generated_by
    description: A slot to provide the Activity which created the EvaluatedEntity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:wasGeneratedBy
    alias: was_generated_by
    owner: EvaluatedEntity
    domain_of:
    - Dataset
    - EvaluatedEntity
    range: Activity
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: The slot to provide a title for the EvaluatedEntity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: EvaluatedEntity
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
  description:
    name: description
    description: The slot to provide a description for the EvaluatedEntity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: EvaluatedEntity
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
  id:
    name: id
    description: A slot to provide an URI for an entity within this schema.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    identifier: true
    alias: id
    owner: EvaluatedEntity
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
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier of the EvaluatedEntity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: EvaluatedEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Dataset
    - Entity
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
  has_qualitative_attribute:
    name: has_qualitative_attribute
    description: The slot to relate a qualitative attribute to an EvaluatedEntity,
      EvaluatedActivity or AgenticEntity
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:relation
    alias: has_qualitative_attribute
    owner: EvaluatedEntity
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
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:relation
    alias: has_quantitative_attribute
    owner: EvaluatedEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    range: QuantitativeAttribute
    recommended: true
    multivalued: true
    inlined: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A slot to provide a part of the Entity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: EvaluatedEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: Entity
    multivalued: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to specify an Entity of which the Entity is a part.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:isPartOf
    alias: part_of
    owner: EvaluatedEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    inverse: has_part
    range: Entity
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
    owner: EvaluatedEntity
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
    owner: EvaluatedEntity
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Entity

```
</details>