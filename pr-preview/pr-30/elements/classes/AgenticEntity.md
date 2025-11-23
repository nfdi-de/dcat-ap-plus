

# Class: AgenticEntity 


_An entity that is somehow responsible for an Activity to take place._





URI: [prov:Agent](http://www.w3.org/ns/prov#Agent)





```mermaid
 classDiagram
    class AgenticEntity
    click AgenticEntity href "../../classes/AgenticEntity/"
      ClassifierMixin <|-- AgenticEntity
        click ClassifierMixin href "../../classes/ClassifierMixin/"
      

      AgenticEntity <|-- Device
        click Device href "../../classes/Device/"
      AgenticEntity <|-- Software
        click Software href "../../classes/Software/"
      

      AgenticEntity : description
        
      AgenticEntity : has_part
        
          
    
        
        
        AgenticEntity --> "*" AgenticEntity : has_part
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      AgenticEntity : has_qualitative_attribute
        
          
    
        
        
        AgenticEntity --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      AgenticEntity : has_quantitative_attribute
        
          
    
        
        
        AgenticEntity --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      AgenticEntity : id
        
      AgenticEntity : other_identifier
        
          
    
        
        
        AgenticEntity --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      AgenticEntity : part_of
        
          
    
        
        
        AgenticEntity --> "*" AgenticEntity : part_of
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      AgenticEntity : rdf_type
        
          
    
        
        
        AgenticEntity --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      AgenticEntity : title
        
      AgenticEntity : type
        
          
    
        
        
        AgenticEntity --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* **AgenticEntity** [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * [Device](../classes/Device.md)
    * [Software](../classes/Software.md)



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | direct |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | A slot to provide a secondary identifier for an Instrument. | direct |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | direct |
| [has_part](../slots/has_part.md) | * <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to specify parts of an AgenticEntity that are themselves AgenticEntities. | direct |
| [part_of](../slots/part_of.md) | * <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to provide the AgenticEntity of which theAgenticEntity is a part. | direct |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Activity](../classes/Activity.md) | [carried_out_by](../slots/carried_out_by.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [AgenticEntity](../classes/AgenticEntity.md) | [has_part](../slots/has_part.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [AgenticEntity](../classes/AgenticEntity.md) | [part_of](../slots/part_of.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [carried_out_by](../slots/carried_out_by.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [carried_out_by](../slots/carried_out_by.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [Device](../classes/Device.md) | [part_of](../slots/part_of.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [carried_out_by](../slots/carried_out_by.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |
| [Software](../classes/Software.md) | [part_of](../slots/part_of.md) | range | [AgenticEntity](../classes/AgenticEntity.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Agent |
| native | dcatap_plus:AgenticEntity |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: AgenticEntity
description: An entity that is somehow responsible for an Activity to take place.
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
- has_qualitative_attribute
- has_quantitative_attribute
- has_part
- part_of
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of an AgenticEntity that are themselves
      AgenticEntities.
    range: AgenticEntity
    multivalued: true
    inlined: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide the AgenticEntity of which theAgenticEntity is
      a part.
    notes:
    - not in DCAT-AP
    range: AgenticEntity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for an Instrument.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
class_uri: prov:Agent

```
</details>

### Induced

<details>
```yaml
name: AgenticEntity
description: An entity that is somehow responsible for an Activity to take place.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of an AgenticEntity that are themselves
      AgenticEntities.
    range: AgenticEntity
    multivalued: true
    inlined: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide the AgenticEntity of which theAgenticEntity is
      a part.
    notes:
    - not in DCAT-AP
    range: AgenticEntity
    multivalued: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for an Instrument.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
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
    owner: AgenticEntity
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
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: AgenticEntity
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
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: AgenticEntity
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
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for an Instrument.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: AgenticEntity
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
    owner: AgenticEntity
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
    owner: AgenticEntity
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
    description: The slot to specify parts of an AgenticEntity that are themselves
      AgenticEntities.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: AgenticEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: AgenticEntity
    multivalued: true
    inlined: true
    inlined_as_list: true
  part_of:
    name: part_of
    description: The slot to provide the AgenticEntity of which theAgenticEntity is
      a part.
    notes:
    - not in DCAT-AP
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:isPartOf
    alias: part_of
    owner: AgenticEntity
    domain_of:
    - Activity
    - AgenticEntity
    - Entity
    inverse: has_part
    range: AgenticEntity
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
    owner: AgenticEntity
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
    owner: AgenticEntity
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Agent

```
</details>