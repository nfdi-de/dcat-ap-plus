

# Class: LicenseDocument 


_See [DCAT-AP specs:LicenseDocument](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#LicenseDocument)_





URI: [dcterms:LicenseDocument](http://purl.org/dc/terms/LicenseDocument)





```mermaid
 classDiagram
    class LicenseDocument
    click LicenseDocument href "../../classes/LicenseDocument/"
      SupportiveEntity <|-- LicenseDocument
        click SupportiveEntity href "../../classes/SupportiveEntity/"
      
      LicenseDocument : description
        
      LicenseDocument : id
        
      LicenseDocument : title
        
      LicenseDocument : type
        
          
    
        
        
        LicenseDocument --> "* _recommended_" Concept : type
        click Concept href "../../classes/Concept/"
    

        
      
```





## Inheritance
* [SupportiveEntity](../classes/SupportiveEntity.md)
    * **LicenseDocument**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [type](../slots/type.md) | * _recommended_ <br/> [Concept](../classes/Concept.md) | A type of licence, e.g. indicating 'public domain' or 'royalties required'. | direct |
| [id](../slots/id.md) | 1 <br/> [Uriorcurie](../types/Uriorcurie.md) | A slot to provide an URI for an entity within this schema. | direct |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Catalogue](../classes/Catalogue.md) | [licence](../slots/licence.md) | range | [LicenseDocument](../classes/LicenseDocument.md) |
| [DataService](../classes/DataService.md) | [licence](../slots/licence.md) | range | [LicenseDocument](../classes/LicenseDocument.md) |
| [Distribution](../classes/Distribution.md) | [licence](../slots/licence.md) | range | [LicenseDocument](../classes/LicenseDocument.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcterms:LicenseDocument |
| native | dcatap_plus:LicenseDocument |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: LicenseDocument
description: See [DCAT-AP specs:LicenseDocument](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#LicenseDocument)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slots:
- type
- id
- title
- description
slot_usage:
  type:
    name: type
    description: A type of licence, e.g. indicating 'public domain' or 'royalties
      required'.
    slot_uri: dcterms:type
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
class_uri: dcterms:LicenseDocument

```
</details>

### Induced

<details>
```yaml
name: LicenseDocument
description: See [DCAT-AP specs:LicenseDocument](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#LicenseDocument)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slot_usage:
  type:
    name: type
    description: A type of licence, e.g. indicating 'public domain' or 'royalties
      required'.
    slot_uri: dcterms:type
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
attributes:
  type:
    name: type
    description: A type of licence, e.g. indicating 'public domain' or 'royalties
      required'.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:type
    alias: type
    owner: LicenseDocument
    domain_of:
    - Agent
    - ClassifierMixin
    - Dataset
    - LicenseDocument
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  id:
    name: id
    description: A slot to provide an URI for an entity within this schema.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    identifier: true
    alias: id
    owner: LicenseDocument
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
    owner: LicenseDocument
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
    owner: LicenseDocument
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
class_uri: dcterms:LicenseDocument

```
</details>