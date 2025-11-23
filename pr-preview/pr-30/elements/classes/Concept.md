

# Class: Concept 


_See [DCAT-AP specs:Concept](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Concept)_





URI: [skos:Concept](http://www.w3.org/2004/02/skos/core#Concept)





```mermaid
 classDiagram
    class Concept
    click Concept href "../../classes/Concept/"
      SupportiveEntity <|-- Concept
        click SupportiveEntity href "../../classes/SupportiveEntity/"
      
      Concept : description
        
      Concept : preferred_label
        
      Concept : title
        
      
```





## Inheritance
* [SupportiveEntity](../classes/SupportiveEntity.md)
    * **Concept**



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [preferred_label](../slots/preferred_label.md) | 1..* <br/> [String](../types/String.md) | A preferred label of the concept. | direct |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Agent](../classes/Agent.md) | [type](../slots/type.md) | range | [Concept](../classes/Concept.md) |
| [AnalysisDataset](../classes/AnalysisDataset.md) | [theme](../slots/theme.md) | range | [Concept](../classes/Concept.md) |
| [AnalysisDataset](../classes/AnalysisDataset.md) | [type](../slots/type.md) | range | [Concept](../classes/Concept.md) |
| [CatalogueRecord](../classes/CatalogueRecord.md) | [change_type](../slots/change_type.md) | range | [Concept](../classes/Concept.md) |
| [DataService](../classes/DataService.md) | [theme](../slots/theme.md) | range | [Concept](../classes/Concept.md) |
| [Dataset](../classes/Dataset.md) | [theme](../slots/theme.md) | range | [Concept](../classes/Concept.md) |
| [Dataset](../classes/Dataset.md) | [type](../slots/type.md) | range | [Concept](../classes/Concept.md) |
| [Distribution](../classes/Distribution.md) | [availability](../slots/availability.md) | range | [Concept](../classes/Concept.md) |
| [Distribution](../classes/Distribution.md) | [status](../slots/status.md) | range | [Concept](../classes/Concept.md) |
| [LicenseDocument](../classes/LicenseDocument.md) | [type](../slots/type.md) | range | [Concept](../classes/Concept.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | skos:Concept |
| native | dcatap_plus:Concept |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Concept
description: See [DCAT-AP specs:Concept](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Concept)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slots:
- preferred_label
- title
- description
slot_usage:
  preferred_label:
    name: preferred_label
    description: A preferred label of the concept.
    slot_uri: skos:prefLabel
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
class_uri: skos:Concept

```
</details>

### Induced

<details>
```yaml
name: Concept
description: See [DCAT-AP specs:Concept](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Concept)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
is_a: SupportiveEntity
slot_usage:
  preferred_label:
    name: preferred_label
    description: A preferred label of the concept.
    slot_uri: skos:prefLabel
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
attributes:
  preferred_label:
    name: preferred_label
    description: A preferred label of the concept.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: skos:prefLabel
    alias: preferred_label
    owner: Concept
    domain_of:
    - Concept
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: Concept
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
    owner: Concept
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
class_uri: skos:Concept

```
</details>