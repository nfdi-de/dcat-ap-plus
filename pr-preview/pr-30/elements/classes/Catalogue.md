

# Class: Catalogue 


_See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue)_





URI: [dcat:Catalog](http://www.w3.org/ns/dcat#Catalog)





```mermaid
 classDiagram
    class Catalogue
    click Catalogue href "../../classes/Catalogue/"
      Catalogue : applicable_legislation
        
          
    
        
        
        Catalogue --> "*" LegalResource : applicable_legislation
        click LegalResource href "../../classes/LegalResource/"
    

        
      Catalogue : catalogue
        
          
    
        
        
        Catalogue --> "*" Catalogue : catalogue
        click Catalogue href "../../classes/Catalogue/"
    

        
      Catalogue : creator
        
          
    
        
        
        Catalogue --> "0..1" Agent : creator
        click Agent href "../../classes/Agent/"
    

        
      Catalogue : description
        
      Catalogue : geographical_coverage
        
          
    
        
        
        Catalogue --> "*" Location : geographical_coverage
        click Location href "../../classes/Location/"
    

        
      Catalogue : has_dataset
        
          
    
        
        
        Catalogue --> "*" Dataset : has_dataset
        click Dataset href "../../classes/Dataset/"
    

        
      Catalogue : has_part
        
          
    
        
        
        Catalogue --> "*" Catalogue : has_part
        click Catalogue href "../../classes/Catalogue/"
    

        
      Catalogue : homepage
        
          
    
        
        
        Catalogue --> "0..1 _recommended_" Document : homepage
        click Document href "../../classes/Document/"
    

        
      Catalogue : language
        
          
    
        
        
        Catalogue --> "* _recommended_" LinguisticSystem : language
        click LinguisticSystem href "../../classes/LinguisticSystem/"
    

        
      Catalogue : licence
        
          
    
        
        
        Catalogue --> "0..1" LicenseDocument : licence
        click LicenseDocument href "../../classes/LicenseDocument/"
    

        
      Catalogue : modification_date
        
      Catalogue : publisher
        
          
    
        
        
        Catalogue --> "1" Agent : publisher
        click Agent href "../../classes/Agent/"
    

        
      Catalogue : record
        
          
    
        
        
        Catalogue --> "*" CatalogueRecord : record
        click CatalogueRecord href "../../classes/CatalogueRecord/"
    

        
      Catalogue : release_date
        
      Catalogue : rights
        
          
    
        
        
        Catalogue --> "0..1" RightsStatement : rights
        click RightsStatement href "../../classes/RightsStatement/"
    

        
      Catalogue : service
        
          
    
        
        
        Catalogue --> "*" DataService : service
        click DataService href "../../classes/DataService/"
    

        
      Catalogue : temporal_coverage
        
          
    
        
        
        Catalogue --> "*" PeriodOfTime : temporal_coverage
        click PeriodOfTime href "../../classes/PeriodOfTime/"
    

        
      Catalogue : themes
        
          
    
        
        
        Catalogue --> "* _recommended_" ConceptScheme : themes
        click ConceptScheme href "../../classes/ConceptScheme/"
    

        
      Catalogue : title
        
      
```




<!-- no inheritance hierarchy -->


## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [applicable_legislation](../slots/applicable_legislation.md) | * <br/> [LegalResource](../classes/LegalResource.md) | The legislation that mandates the creation or management of the Catalog. | direct |
| [catalogue](../slots/catalogue.md) | * <br/> [Catalogue](../classes/Catalogue.md) | A catalogue whose contents are of interest in the context of this catalogue. | direct |
| [creator](../slots/creator.md) | 0..1 <br/> [Agent](../classes/Agent.md) | An entity responsible for the creation of the catalogue. | direct |
| [description](../slots/description.md) | 1..* <br/> [String](../types/String.md) | A free-text account of the Catalogue. | direct |
| [geographical_coverage](../slots/geographical_coverage.md) | * <br/> [Location](../classes/Location.md) | A geographical area covered by the Catalogue. | direct |
| [has_dataset](../slots/has_dataset.md) | * <br/> [Dataset](../classes/Dataset.md) | A Dataset that is part of the Catalogue. | direct |
| [has_part](../slots/has_part.md) | * <br/> [Catalogue](../classes/Catalogue.md) | A related Catalogue that is part of the described Catalogue. | direct |
| [homepage](../slots/homepage.md) | 0..1 _recommended_ <br/> [Document](../classes/Document.md) | A web page that acts as the main page for the Catalogue. | direct |
| [language](../slots/language.md) | * _recommended_ <br/> [LinguisticSystem](../classes/LinguisticSystem.md) | A language used in the textual metadata describing titles, descriptions, etc. of the Datasets in the Catalogue. | direct |
| [licence](../slots/licence.md) | 0..1 <br/> [LicenseDocument](../classes/LicenseDocument.md) | A licence under which the Catalogue can be used or reused. | direct |
| [modification_date](../slots/modification_date.md) | 0..1 _recommended_ <br/> [Date](../types/Date.md) | The most recent date on which the Catalogue was modified. | direct |
| [publisher](../slots/publisher.md) | 1 <br/> [Agent](../classes/Agent.md) | An entity (organisation) responsible for making the Catalogue available. | direct |
| [record](../slots/record.md) | * <br/> [CatalogueRecord](../classes/CatalogueRecord.md) | A Catalogue Record that is part of the Catalogue. | direct |
| [release_date](../slots/release_date.md) | 0..1 _recommended_ <br/> [Date](../types/Date.md) | The date of formal issuance (e.g., publication) of the Catalogue. | direct |
| [rights](../slots/rights.md) | 0..1 <br/> [RightsStatement](../classes/RightsStatement.md) | A statement that specifies rights associated with the Catalogue. | direct |
| [service](../slots/service.md) | * <br/> [DataService](../classes/DataService.md) | A site or end-point (Data Service) that is listed in the Catalogue. | direct |
| [temporal_coverage](../slots/temporal_coverage.md) | * <br/> [PeriodOfTime](../classes/PeriodOfTime.md) | A temporal period that the Catalogue covers. | direct |
| [themes](../slots/themes.md) | * _recommended_ <br/> [ConceptScheme](../classes/ConceptScheme.md) | A knowledge organization system used to classify the Resources that are in the Catalogue. | direct |
| [title](../slots/title.md) | 1..* <br/> [String](../types/String.md) | A name given to the Catalogue. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Catalogue](../classes/Catalogue.md) | [catalogue](../slots/catalogue.md) | range | [Catalogue](../classes/Catalogue.md) |
| [Catalogue](../classes/Catalogue.md) | [has_part](../slots/has_part.md) | range | [Catalogue](../classes/Catalogue.md) |
| [CatalogueRecord](../classes/CatalogueRecord.md) | [primary_topic](../slots/primary_topic.md) | any_of[range] | [Catalogue](../classes/Catalogue.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcat:Catalog |
| native | dcatap_plus:Catalogue |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Catalogue
description: See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slots:
- applicable_legislation
- catalogue
- creator
- description
- geographical_coverage
- has_dataset
- has_part
- homepage
- language
- licence
- modification_date
- publisher
- record
- release_date
- rights
- service
- temporal_coverage
- themes
- title
slot_usage:
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Catalog.
    slot_uri: dcatap:applicableLegislation
    range: LegalResource
    required: false
    multivalued: true
    inlined_as_list: true
  catalogue:
    name: catalogue
    description: A catalogue whose contents are of interest in the context of this
      catalogue.
    slot_uri: dcat:catalog
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  creator:
    name: creator
    description: An entity responsible for the creation of the catalogue.
    slot_uri: dcterms:creator
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Catalogue.
    slot_uri: dcterms:description
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
  geographical_coverage:
    name: geographical_coverage
    description: A geographical area covered by the Catalogue.
    slot_uri: dcterms:spatial
    range: Location
    required: false
    multivalued: true
    inlined_as_list: true
  has_dataset:
    name: has_dataset
    description: A Dataset that is part of the Catalogue.
    slot_uri: dcat:dataset
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A related Catalogue that is part of the described Catalogue.
    slot_uri: dcterms:hasPart
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  homepage:
    name: homepage
    description: A web page that acts as the main page for the Catalogue.
    slot_uri: foaf:homepage
    range: Document
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: true
  language:
    name: language
    description: A language used in the textual metadata describing titles, descriptions,
      etc. of the Datasets in the Catalogue.
    slot_uri: dcterms:language
    range: LinguisticSystem
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Catalogue can be used or reused.
    slot_uri: dcterms:license
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  modification_date:
    name: modification_date
    description: The most recent date on which the Catalogue was modified.
    slot_uri: dcterms:modified
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Catalogue available.
    slot_uri: dcterms:publisher
    range: Agent
    required: true
    multivalued: false
    inlined_as_list: true
  record:
    name: record
    description: A Catalogue Record that is part of the Catalogue.
    slot_uri: dcat:record
    range: CatalogueRecord
    required: false
    multivalued: true
    inlined_as_list: true
  release_date:
    name: release_date
    description: The date of formal issuance (e.g., publication) of the Catalogue.
    slot_uri: dcterms:issued
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  rights:
    name: rights
    description: A statement that specifies rights associated with the Catalogue.
    slot_uri: dcterms:rights
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  service:
    name: service
    description: A site or end-point (Data Service) that is listed in the Catalogue.
    slot_uri: dcat:service
    range: DataService
    required: false
    multivalued: true
    inlined_as_list: true
  temporal_coverage:
    name: temporal_coverage
    description: A temporal period that the Catalogue covers.
    slot_uri: dcterms:temporal
    range: PeriodOfTime
    required: false
    multivalued: true
    inlined_as_list: true
  themes:
    name: themes
    description: A knowledge organization system used to classify the Resources that
      are in the Catalogue.
    slot_uri: dcat:themeTaxonomy
    range: ConceptScheme
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Catalogue.
    slot_uri: dcterms:title
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
class_uri: dcat:Catalog

```
</details>

### Induced

<details>
```yaml
name: Catalogue
description: See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slot_usage:
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Catalog.
    slot_uri: dcatap:applicableLegislation
    range: LegalResource
    required: false
    multivalued: true
    inlined_as_list: true
  catalogue:
    name: catalogue
    description: A catalogue whose contents are of interest in the context of this
      catalogue.
    slot_uri: dcat:catalog
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  creator:
    name: creator
    description: An entity responsible for the creation of the catalogue.
    slot_uri: dcterms:creator
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Catalogue.
    slot_uri: dcterms:description
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
  geographical_coverage:
    name: geographical_coverage
    description: A geographical area covered by the Catalogue.
    slot_uri: dcterms:spatial
    range: Location
    required: false
    multivalued: true
    inlined_as_list: true
  has_dataset:
    name: has_dataset
    description: A Dataset that is part of the Catalogue.
    slot_uri: dcat:dataset
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A related Catalogue that is part of the described Catalogue.
    slot_uri: dcterms:hasPart
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  homepage:
    name: homepage
    description: A web page that acts as the main page for the Catalogue.
    slot_uri: foaf:homepage
    range: Document
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: true
  language:
    name: language
    description: A language used in the textual metadata describing titles, descriptions,
      etc. of the Datasets in the Catalogue.
    slot_uri: dcterms:language
    range: LinguisticSystem
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Catalogue can be used or reused.
    slot_uri: dcterms:license
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  modification_date:
    name: modification_date
    description: The most recent date on which the Catalogue was modified.
    slot_uri: dcterms:modified
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Catalogue available.
    slot_uri: dcterms:publisher
    range: Agent
    required: true
    multivalued: false
    inlined_as_list: true
  record:
    name: record
    description: A Catalogue Record that is part of the Catalogue.
    slot_uri: dcat:record
    range: CatalogueRecord
    required: false
    multivalued: true
    inlined_as_list: true
  release_date:
    name: release_date
    description: The date of formal issuance (e.g., publication) of the Catalogue.
    slot_uri: dcterms:issued
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  rights:
    name: rights
    description: A statement that specifies rights associated with the Catalogue.
    slot_uri: dcterms:rights
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  service:
    name: service
    description: A site or end-point (Data Service) that is listed in the Catalogue.
    slot_uri: dcat:service
    range: DataService
    required: false
    multivalued: true
    inlined_as_list: true
  temporal_coverage:
    name: temporal_coverage
    description: A temporal period that the Catalogue covers.
    slot_uri: dcterms:temporal
    range: PeriodOfTime
    required: false
    multivalued: true
    inlined_as_list: true
  themes:
    name: themes
    description: A knowledge organization system used to classify the Resources that
      are in the Catalogue.
    slot_uri: dcat:themeTaxonomy
    range: ConceptScheme
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Catalogue.
    slot_uri: dcterms:title
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
attributes:
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Catalog.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcatap:applicableLegislation
    alias: applicable_legislation
    owner: Catalogue
    domain_of:
    - Catalogue
    - DataService
    - Dataset
    - DatasetSeries
    - Distribution
    range: LegalResource
    required: false
    multivalued: true
    inlined_as_list: true
  catalogue:
    name: catalogue
    description: A catalogue whose contents are of interest in the context of this
      catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:catalog
    alias: catalogue
    owner: Catalogue
    domain_of:
    - Catalogue
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  creator:
    name: creator
    description: An entity responsible for the creation of the catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:creator
    alias: creator
    owner: Catalogue
    domain_of:
    - Catalogue
    - Dataset
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: Catalogue
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
    required: true
    multivalued: true
    inlined_as_list: true
  geographical_coverage:
    name: geographical_coverage
    description: A geographical area covered by the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:spatial
    alias: geographical_coverage
    owner: Catalogue
    domain_of:
    - Catalogue
    - Dataset
    - DatasetSeries
    range: Location
    required: false
    multivalued: true
    inlined_as_list: true
  has_dataset:
    name: has_dataset
    description: A Dataset that is part of the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:dataset
    alias: has_dataset
    owner: Catalogue
    domain_of:
    - Catalogue
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  has_part:
    name: has_part
    description: A related Catalogue that is part of the described Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:hasPart
    alias: has_part
    owner: Catalogue
    domain_of:
    - Activity
    - AgenticEntity
    - Catalogue
    - Entity
    range: Catalogue
    required: false
    multivalued: true
    inlined_as_list: true
  homepage:
    name: homepage
    description: A web page that acts as the main page for the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: foaf:homepage
    alias: homepage
    owner: Catalogue
    domain_of:
    - Catalogue
    range: Document
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: true
  language:
    name: language
    description: A language used in the textual metadata describing titles, descriptions,
      etc. of the Datasets in the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:language
    alias: language
    owner: Catalogue
    domain_of:
    - Catalogue
    - CatalogueRecord
    - Dataset
    - Distribution
    range: LinguisticSystem
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Catalogue can be used or reused.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:license
    alias: licence
    owner: Catalogue
    domain_of:
    - Catalogue
    - DataService
    - Distribution
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  modification_date:
    name: modification_date
    description: The most recent date on which the Catalogue was modified.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:modified
    alias: modification_date
    owner: Catalogue
    domain_of:
    - Catalogue
    - CatalogueRecord
    - Dataset
    - DatasetSeries
    - Distribution
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Catalogue available.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:publisher
    alias: publisher
    owner: Catalogue
    domain_of:
    - Catalogue
    - DataService
    - Dataset
    - DatasetSeries
    range: Agent
    required: true
    multivalued: false
    inlined_as_list: true
  record:
    name: record
    description: A Catalogue Record that is part of the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:record
    alias: record
    owner: Catalogue
    domain_of:
    - Catalogue
    range: CatalogueRecord
    required: false
    multivalued: true
    inlined_as_list: true
  release_date:
    name: release_date
    description: The date of formal issuance (e.g., publication) of the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:issued
    alias: release_date
    owner: Catalogue
    domain_of:
    - Catalogue
    - Dataset
    - DatasetSeries
    - Distribution
    range: date
    required: false
    recommended: true
    multivalued: false
    inlined_as_list: false
  rights:
    name: rights
    description: A statement that specifies rights associated with the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:rights
    alias: rights
    owner: Catalogue
    domain_of:
    - Catalogue
    - Distribution
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  service:
    name: service
    description: A site or end-point (Data Service) that is listed in the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:service
    alias: service
    owner: Catalogue
    domain_of:
    - Catalogue
    range: DataService
    required: false
    multivalued: true
    inlined_as_list: true
  temporal_coverage:
    name: temporal_coverage
    description: A temporal period that the Catalogue covers.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:temporal
    alias: temporal_coverage
    owner: Catalogue
    domain_of:
    - Catalogue
    - Dataset
    - DatasetSeries
    range: PeriodOfTime
    required: false
    multivalued: true
    inlined_as_list: true
  themes:
    name: themes
    description: A knowledge organization system used to classify the Resources that
      are in the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:themeTaxonomy
    alias: themes
    owner: Catalogue
    domain_of:
    - Catalogue
    range: ConceptScheme
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Catalogue.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: Catalogue
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
    required: true
    multivalued: true
    inlined_as_list: true
class_uri: dcat:Catalog

```
</details>