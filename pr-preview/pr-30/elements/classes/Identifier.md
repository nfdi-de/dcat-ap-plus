

# Class: Identifier 


_See [DCAT-AP specs:Identifier](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Identifier)_





URI: [adms:Identifier](http://www.w3.org/ns/adms#Identifier)





```mermaid
 classDiagram
    class Identifier
    click Identifier href "../../classes/Identifier/"
      SupportiveEntity <|-- Identifier
        click SupportiveEntity href "../../classes/SupportiveEntity/"
      
      Identifier : description
        
      Identifier : notation
        
      Identifier : title
        
      
```





## Inheritance
* [SupportiveEntity](../classes/SupportiveEntity.md)
    * **Identifier**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [notation](../slots/notation.md) | 1 <br/> [String](../types/String.md) | A string that is an identifier in the context of the identifier scheme referenced by its datatype. | direct |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Activity](../classes/Activity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [AgenticEntity](../classes/AgenticEntity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [AnalysisDataset](../classes/AnalysisDataset.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [Dataset](../classes/Dataset.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [Device](../classes/Device.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [Entity](../classes/Entity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |
| [Software](../classes/Software.md) | [other_identifier](../slots/other_identifier.md) | range | [Identifier](../classes/Identifier.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | adms:Identifier |
| native | dcatap_plus:Identifier |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Identifier
description: See [DCAT-AP specs:Identifier](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Identifier)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slots:
- notation
- title
- description
slot_usage:
  notation:
    name: notation
    description: A string that is an identifier in the context of the identifier scheme
      referenced by its datatype.
    slot_uri: skos:notation
    range: string
    required: true
    multivalued: false
    inlined_as_list: false
class_uri: adms:Identifier

```
</details>

### Induced

<details>
```yaml
name: Identifier
description: See [DCAT-AP specs:Identifier](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Identifier)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slot_usage:
  notation:
    name: notation
    description: A string that is an identifier in the context of the identifier scheme
      referenced by its datatype.
    slot_uri: skos:notation
    range: string
    required: true
    multivalued: false
    inlined_as_list: false
attributes:
  notation:
    name: notation
    description: A string that is an identifier in the context of the identifier scheme
      referenced by its datatype.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: skos:notation
    alias: notation
    owner: Identifier
    domain_of:
    - Identifier
    range: string
    required: true
    multivalued: false
    inlined_as_list: false
  title:
    name: title
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: Identifier
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
    owner: Identifier
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
class_uri: adms:Identifier

```
</details>