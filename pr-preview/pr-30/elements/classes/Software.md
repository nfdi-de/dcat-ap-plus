

# Class: Software 


_An instrument composed of a series of instructions that can be interpreted by or directly executed by a computer._





URI: [prov:SoftwareAgent](http://www.w3.org/ns/prov#SoftwareAgent)





```mermaid
 classDiagram
    class Software
    click Software href "../../classes/Software/"
      AgenticEntity <|-- Software
        click AgenticEntity href "../../classes/AgenticEntity/"
      
      Software : description
        
      Software : has_part
        
          
    
        
        
        Software --> "*" Software : has_part
        click Software href "../../classes/Software/"
    

        
      Software : has_qualitative_attribute
        
          
    
        
        
        Software --> "* _recommended_" QualitativeAttribute : has_qualitative_attribute
        click QualitativeAttribute href "../../classes/QualitativeAttribute/"
    

        
      Software : has_quantitative_attribute
        
          
    
        
        
        Software --> "* _recommended_" QuantitativeAttribute : has_quantitative_attribute
        click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
    

        
      Software : id
        
      Software : other_identifier
        
          
    
        
        
        Software --> "*" Identifier : other_identifier
        click Identifier href "../../classes/Identifier/"
    

        
      Software : part_of
        
          
    
        
        
        Software --> "*" AgenticEntity : part_of
        click AgenticEntity href "../../classes/AgenticEntity/"
    

        
      Software : rdf_type
        
          
    
        
        
        Software --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      Software : title
        
      Software : type
        
          
    
        
        
        Software --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      
```





## Inheritance
* [AgenticEntity](../classes/AgenticEntity.md) [ [ClassifierMixin](../classes/ClassifierMixin.md)]
    * **Software**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | [AgenticEntity](../classes/AgenticEntity.md) |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | [AgenticEntity](../classes/AgenticEntity.md) |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | [AgenticEntity](../classes/AgenticEntity.md) |
| [other_identifier](../slots/other_identifier.md) | * <br/> [Identifier](../classes/Identifier.md) | A slot to provide a secondary identifier for a Software. | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_qualitative_attribute](../slots/has_qualitative_attribute.md) | * _recommended_ <br/> [QualitativeAttribute](../classes/QualitativeAttribute.md) | The slot to relate a qualitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | * _recommended_ <br/> [QuantitativeAttribute](../classes/QuantitativeAttribute.md) | The slot to relate a quantitative attribute to an EvaluatedEntity, EvaluatedActivity or AgenticEntity | [AgenticEntity](../classes/AgenticEntity.md) |
| [has_part](../slots/has_part.md) | * <br/> [Software](../classes/Software.md) | The slot to specify parts of a Software that are themselves Software. | [AgenticEntity](../classes/AgenticEntity.md) |
| [part_of](../slots/part_of.md) | * <br/> [AgenticEntity](../classes/AgenticEntity.md) | The slot to provide the AgenticEntity of which theAgenticEntity is a part. | [AgenticEntity](../classes/AgenticEntity.md) |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Software](../classes/Software.md) | [has_part](../slots/has_part.md) | range | [Software](../classes/Software.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | prov:SoftwareAgent |
| native | dcatap_plus:Software |
| exact | schema:SoftwareApplication |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Software
description: An instrument composed of a series of instructions that can be interpreted
  by or directly executed by a computer.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
exact_mappings:
- schema:SoftwareApplication
is_a: AgenticEntity
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of a Software that are themselves Software.
    range: Software
    multivalued: true
    inlined: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for a Software.
    range: Identifier
    required: false
    multivalued: true
    inlined_as_list: true
class_uri: prov:SoftwareAgent

```
</details>

### Induced

<details>
```yaml
name: Software
description: An instrument composed of a series of instructions that can be interpreted
  by or directly executed by a computer.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
exact_mappings:
- schema:SoftwareApplication
is_a: AgenticEntity
slot_usage:
  has_part:
    name: has_part
    description: The slot to specify parts of a Software that are themselves Software.
    range: Software
    multivalued: true
    inlined: true
    inlined_as_list: true
  other_identifier:
    name: other_identifier
    description: A slot to provide a secondary identifier for a Software.
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
    owner: Software
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
    owner: Software
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
    owner: Software
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
    description: A slot to provide a secondary identifier for a Software.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: adms:identifier
    alias: other_identifier
    owner: Software
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
    owner: Software
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
    owner: Software
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
    description: The slot to specify parts of a Software that are themselves Software.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: Software
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: Software
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
    owner: Software
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
    owner: Software
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
    owner: Software
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: prov:SoftwareAgent

```
</details>