

# Class: Entity 


_A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary._





URI: [prov:Entity](http://www.w3.org/ns/prov#Entity)





```mermaid
 classDiagram
    class Entity
    click Entity href "../../classes/Entity/"
      ClassifierMixin <|-- Entity
        click ClassifierMixin href "../../classes/ClassifierMixin/"
      

      Entity <|-- EvaluatedEntity
        click EvaluatedEntity href "../../classes/EvaluatedEntity/"
      

      Entity : description
        
      Entity : has_part
        
          
    
        
        
        Entity --> "*" Entity : has_part
        click Entity href "../../classes/Entity/"
    

        
      Entity : has_qualitative_attribute
        
          
    
        
        
        Entity --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      Entity : has_quantitative_attribute
        
          
    
        
        
        Entity --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      Entity : id
        
      Entity : other_identifier
        
          
    
        
        
        Entity --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      Entity : part_of
        
          
    
        
        
        Entity --> "*" Entity : part_of
        click Entity href "../../classes/Entity/"
    

        
      Entity : rdf_type
        
          
    
        
        
        Entity --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      Entity : title
        
      Entity : type
        
          
    
        
        
        Entity --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* **Entity** [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * [EvaluatedEntity](../classes/EvaluatedEntity.md)



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | The slot to provide a title for the Entity. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | The slot to provide a description for the Entity. | direct |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | direct |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | A slot to provide a secondary identifier of the Entity. | direct |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [has_part](../slots/has_part.md) | * <br/> [Entity](../classes/Entity.md) | A slot to provide a part of the Entity. | direct |
| [part_of](../slots/part_of.md) | * <br/> [Entity](../classes/Entity.md) | The slot to specify an Entity of which the Entity is a part. | direct |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Activity](../classes/Activity.md) | [had_input_entity](../slots/had_input_entity.md) | range | [Entity](../classes/Entity.md) |
| [Activity](../classes/Activity.md) | [had_output_entity](../slots/had_output_entity.md) | range | [Entity](../classes/Entity.md) |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | [has_part](../slots/has_part.md) | range | [Entity](../classes/Entity.md) |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | [part_of](../slots/part_of.md) | range | [Entity](../classes/Entity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [had_input_entity](../slots/had_input_entity.md) | range | [Entity](../classes/Entity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [had_output_entity](../slots/had_output_entity.md) | range | [Entity](../classes/Entity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [had_input_entity](../slots/had_input_entity.md) | range | [Entity](../classes/Entity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [had_output_entity](../slots/had_output_entity.md) | range | [Entity](../classes/Entity.md) |
| [Entity](../classes/Entity.md) | [has_part](../slots/has_part.md) | range | [Entity](../classes/Entity.md) |
| [Entity](../classes/Entity.md) | [part_of](../slots/part_of.md) | range | [Entity](../classes/Entity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [had_input_entity](../slots/had_input_entity.md) | range | [Entity](../classes/Entity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [had_output_entity](../slots/had_output_entity.md) | range | [Entity](../classes/Entity.md) |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | [has_part](../slots/has_part.md) | range | [Entity](../classes/Entity.md) |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | [part_of](../slots/part_of.md) | range | [Entity](../classes/Entity.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Entity |
| native | dcatap_plus:Entity |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Entity
description: A physical, digital, conceptual, or other kind of thing with some fixed
  aspects; entities may be real or imaginary.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slots:
- title
- description
- id
- other_identifier
- has_qualitative_attribute
- has_quantitative_attribute
- has_part
- part_of
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the Entity.
  description:
    name: description
    description: The slot to provide a description for the Entity.
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier of the Entity.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A slot to provide a part of the Entity.
    range: Entity
    multivalued: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to specify an Entity of which the Entity is a part.
    notes:
    - not in DCAT-AP
    range: Entity
    multivalued: true
    inlined_as_list: true
class_uri: prov:Entity

```
</details>

### Induced

<details>
```yaml
name: Entity
description: A physical, digital, conceptual, or other kind of thing with some fixed
  aspects; entities may be real or imaginary.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slot_usage:
  title:
    name: title
    description: The slot to provide a title for the Entity.
  description:
    name: description
    description: The slot to provide a description for the Entity.
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier of the Entity.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A slot to provide a part of the Entity.
    range: Entity
    multivalued: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to specify an Entity of which the Entity is a part.
    notes:
    - not in DCAT-AP
    range: Entity
    multivalued: true
    inlined_as_list: true
attributes:
  title:
    name: title
    description: The slot to provide a title for the Entity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: Entity
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
    description: The slot to provide a description for the Entity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: Entity
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
    owner: Entity
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
    description: A slot to provide a secondary identifier of the Entity.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: Entity
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
    owner: Entity
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
    owner: Entity
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
    owner: Entity
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
    owner: Entity
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
    owner: Entity
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
    owner: Entity
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Entity

```
</details>