

# Class: Device 


_A material instrument that is designed to perform a function primarily by means of its mechanical or electrical nature._





URI: [prov:Agent](http://www.w3.org/ns/prov#Agent)





```mermaid
 classDiagram
    class Device
    click Device href "../../classes/Device/"
      AgenticEntity <|-- Device
        click AgenticEntity href "../../classes/AgenticEntity/"
      
      Device : description
        
      Device : has_part
        
          
    
        
        
        Device --> "*" Device : has_part
        click Device href "../../classes/Device/"
    

        
      Device : has_qualitative_attribute
        
          
    
        
        
        Device --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      Device : has_quantitative_attribute
        
          
    
        
        
        Device --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      Device : id
        
      Device : other_identifier
        
          
    
        
        
        Device --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      Device : part_of
        
          
    
        
        
        Device --> "*" AgenticEntity : part_of
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      Device : rdf_type
        
          
    
        
        
        Device --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      Device : title
        
      Device : type
        
          
    
        
        
        Device --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* [AgenticEntity](../classes/AgenticEntity.md) [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * **Device**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | [AgenticEntity](../classes/AgenticEntity.md) |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | [AgenticEntity](../classes/AgenticEntity.md) |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | [AgenticEntity](../classes/AgenticEntity.md) |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | A slot to provide a secondary identifier for a Device. | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_part](../slots/has_part.md) | * <br/> [Device](../classes/Device.md) | The slot to specify parts of a Device that are themselves Devices. | [AgenticEntity](../classes/AgenticEntity.md) |
| [part_of](../slots/part_of.md) | * <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to provide the AgenticEntity of which theAgenticEntity is a part. | [AgenticEntity](../classes/AgenticEntity.md) |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Device](../classes/Device.md) | [has_part](../slots/has_part.md) | range | [Device](../classes/Device.md) |






## Aliases


* hardware instrument


## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:Agent |
| native | dcatap_plus:Device |
| exact | epos:Equipment, OBI:0000968, http://purl.obolibrary.org/obo/NCIT_C62103, http://semanticscience.org/resource/SIO_000956, http://purl.allotrope.org/ontologies/equipment#AFE_0000354 |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Device
description: A material instrument that is designed to perform a function primarily
  by means of its mechanical or electrical nature.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
aliases:
- hardware instrument
exact_mappings:
- epos:Equipment
- OBI:0000968
- http://purl.obolibrary.org/obo/NCIT_C62103
- http://semanticscience.org/resource/SIO_000956
- http://purl.allotrope.org/ontologies/equipment#AFE_0000354
is_a: AgenticEntity
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of a Device that are themselves Devices.
    range: Device
    multivalued: true
    inlined: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for a Device.
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
name: Device
description: A material instrument that is designed to perform a function primarily
  by means of its mechanical or electrical nature.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
aliases:
- hardware instrument
exact_mappings:
- epos:Equipment
- OBI:0000968
- http://purl.obolibrary.org/obo/NCIT_C62103
- http://semanticscience.org/resource/SIO_000956
- http://purl.allotrope.org/ontologies/equipment#AFE_0000354
is_a: AgenticEntity
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of a Device that are themselves Devices.
    range: Device
    multivalued: true
    inlined: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for a Device.
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
    owner: Device
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
    owner: Device
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
    owner: Device
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
    description: A slot to provide a secondary identifier for a Device.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: Device
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
    owner: Device
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
    owner: Device
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
    description: The slot to specify parts of a Device that are themselves Devices.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: Device
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: Device
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
    owner: Device
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
    owner: Device
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
    owner: Device
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:Agent

```
</details>