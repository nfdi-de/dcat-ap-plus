

# Class: DataService 


_See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService)_





URI: [dcat:DataService](http://www.w3.org/ns/dcat#DataService)





```mermaid
 classDiagram
    class DataService
    click DataService href "../../classes/DataService/"
      DataService : access_rights
        
          
    
        
        
        DataService --> "0..1" RightsStatement : access_rights
        click RightsStatement href "../../classes/RightsStatement/"
    

        
      DataService : applicable_legislation
        
          
    
        
        
        DataService --> "*" LegalResource : applicable_legislation
        click LegalResource href "../../classes/LegalResource/"
    

        
      DataService : conforms_to
        
          
    
        
        
        DataService --> "* _recommended_" Standard : conforms_to
        click Standard href "../../classes/Standard/"
    

        
      DataService : contact_point
        
          
    
        
        
        DataService --> "* _recommended_" Kind : contact_point
        click Kind href "../../classes/Kind/"
    

        
      DataService : description
        
      DataService : documentation
        
          
    
        
        
        DataService --> "*" Document : documentation
        click Document href "../../classes/Document/"
    

        
      DataService : endpoint_description
        
          
    
        
        
        DataService --> "* _recommended_" Resource : endpoint_description
        click Resource href "../../classes/Resource/"
    

        
      DataService : endpoint_URL
        
          
    
        
        
        DataService --> "1..*" Resource : endpoint_URL
        click Resource href "../../classes/Resource/"
    

        
      DataService : format
        
          
    
        
        
        DataService --> "*" MediaTypeOrExtent : format
        click MediaTypeOrExtent href "../../classes/MediaTypeOrExtent/"
    

        
      DataService : keyword
        
      DataService : landing_page
        
          
    
        
        
        DataService --> "*" Document : landing_page
        click Document href "../../classes/Document/"
    

        
      DataService : licence
        
          
    
        
        
        DataService --> "0..1" LicenseDocument : licence
        click LicenseDocument href "../../classes/LicenseDocument/"
    

        
      DataService : publisher
        
          
    
        
        
        DataService --> "0..1" Agent : publisher
        click Agent href "../../classes/Agent/"
    

        
      DataService : serves_dataset
        
          
    
        
        
        DataService --> "*" Dataset : serves_dataset
        click Dataset href "../../classes/Dataset/"
    

        
      DataService : theme
        
          
    
        
        
        DataService --> "* _recommended_" Concept : theme
        click Concept href "../../classes/Concept/"
    

        
      DataService : title
        
      
```




<!-- no inheritance hierarchy -->


## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [access_rights](../slots/access_rights.md) | 0..1 <br/> [RightsStatement](../classes/RightsStatement.md) | Information regarding access or restrictions based on privacy, security, or other policies. | direct |
| [applicable_legislation](../slots/applicable_legislation.md) | * <br/> [LegalResource](../classes/LegalResource.md) | The legislation that mandates the creation or management of the Data Service. | direct |
| [conforms_to](../slots/conforms_to.md) | * _recommended_ <br/> [Standard](../classes/Standard.md) | An established (technical) standard to which the Data Service conforms. | direct |
| [contact_point](../slots/contact_point.md) | * _recommended_ <br/> [Kind](../classes/Kind.md) | Contact information that can be used for sending comments about the Data Service. | direct |
| [description](../slots/description.md) | * <br/> [String](../types/String.md) | A free-text account of the Data Service. | direct |
| [documentation](../slots/documentation.md) | * <br/> [Document](../classes/Document.md) | A page or document about this Data Service | direct |
| [endpoint_URL](../slots/endpoint_URL.md) | 1..* <br/> [Resource](../classes/Resource.md) | The root location or primary endpoint of the service (an IRI). | direct |
| [endpoint_description](../slots/endpoint_description.md) | * _recommended_ <br/> [Resource](../classes/Resource.md) | A description of the services available via the end-points, including their operations, parameters etc. | direct |
| [format](../slots/format.md) | * <br/> [MediaTypeOrExtent](../classes/MediaTypeOrExtent.md) | The structure that can be returned by querying the endpointURL. | direct |
| [keyword](../slots/keyword.md) | * _recommended_ <br/> [String](../types/String.md) | A keyword or tag describing the Data Service. | direct |
| [landing_page](../slots/landing_page.md) | * <br/> [Document](../classes/Document.md) | A web page that provides access to the Data Service and/or additional information. | direct |
| [licence](../slots/licence.md) | 0..1 <br/> [LicenseDocument](../classes/LicenseDocument.md) | A licence under which the Data service is made available. | direct |
| [publisher](../slots/publisher.md) | 0..1 <br/> [Agent](../classes/Agent.md) | An entity (organisation) responsible for making the Data Service available. | direct |
| [serves_dataset](../slots/serves_dataset.md) | * <br/> [Dataset](../classes/Dataset.md) | This property refers to a collection of data that this data service can distribute. | direct |
| [theme](../slots/theme.md) | * _recommended_ <br/> [Concept](../classes/Concept.md) | A category of the Data Service. | direct |
| [title](../slots/title.md) | 1..* <br/> [String](../types/String.md) | A name given to the Data Service. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Catalogue](../classes/Catalogue.md) | [service](../slots/service.md) | range | [DataService](../classes/DataService.md) |
| [CatalogueRecord](../classes/CatalogueRecord.md) | [primary_topic](../slots/primary_topic.md) | any_of[range] | [DataService](../classes/DataService.md) |
| [Distribution](../classes/Distribution.md) | [access_service](../slots/access_service.md) | range | [DataService](../classes/DataService.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | dcat:DataService |
| native | dcatap_plus:DataService |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: DataService
description: See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slots:
- access_rights
- applicable_legislation
- conforms_to
- contact_point
- description
- documentation
- endpoint_URL
- endpoint_description
- format
- keyword
- landing_page
- licence
- publisher
- serves_dataset
- theme
- title
slot_usage:
  access_rights:
    name: access_rights
    description: Information regarding access or restrictions based on privacy, security,
      or other policies.
    slot_uri: dcterms:accessRights
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Data
      Service.
    slot_uri: dcatap:applicableLegislation
    range: LegalResource
    required: false
    multivalued: true
    inlined_as_list: true
  conforms_to:
    name: conforms_to
    description: An established (technical) standard to which the Data Service conforms.
    slot_uri: dcterms:conformsTo
    range: Standard
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  contact_point:
    name: contact_point
    description: Contact information that can be used for sending comments about the
      Data Service.
    slot_uri: dcat:contactPoint
    range: Kind
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Data Service.
    slot_uri: dcterms:description
    range: string
    required: false
    multivalued: true
    inlined_as_list: true
  documentation:
    name: documentation
    description: A page or document about this Data Service
    slot_uri: foaf:page
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  endpoint_URL:
    name: endpoint_URL
    description: The root location or primary endpoint of the service (an IRI).
    slot_uri: dcat:endpointURL
    range: Resource
    required: true
    multivalued: true
    inlined_as_list: true
  endpoint_description:
    name: endpoint_description
    description: A description of the services available via the end-points, including
      their operations, parameters etc.
    slot_uri: dcat:endpointDescription
    range: Resource
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  format:
    name: format
    description: The structure that can be returned by querying the endpointURL.
    slot_uri: dcterms:format
    range: MediaTypeOrExtent
    required: false
    multivalued: true
    inlined_as_list: true
  keyword:
    name: keyword
    description: A keyword or tag describing the Data Service.
    slot_uri: dcat:keyword
    range: string
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  landing_page:
    name: landing_page
    description: A web page that provides access to the Data Service and/or additional
      information.
    slot_uri: dcat:landingPage
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Data service is made available.
    slot_uri: dcterms:license
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Data Service
      available.
    slot_uri: dcterms:publisher
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  serves_dataset:
    name: serves_dataset
    description: This property refers to a collection of data that this data service
      can distribute.
    slot_uri: dcat:servesDataset
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  theme:
    name: theme
    description: A category of the Data Service.
    slot_uri: dcat:theme
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Data Service.
    slot_uri: dcterms:title
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
class_uri: dcat:DataService

```
</details>

### Induced

<details>
```yaml
name: DataService
description: See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slot_usage:
  access_rights:
    name: access_rights
    description: Information regarding access or restrictions based on privacy, security,
      or other policies.
    slot_uri: dcterms:accessRights
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Data
      Service.
    slot_uri: dcatap:applicableLegislation
    range: LegalResource
    required: false
    multivalued: true
    inlined_as_list: true
  conforms_to:
    name: conforms_to
    description: An established (technical) standard to which the Data Service conforms.
    slot_uri: dcterms:conformsTo
    range: Standard
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  contact_point:
    name: contact_point
    description: Contact information that can be used for sending comments about the
      Data Service.
    slot_uri: dcat:contactPoint
    range: Kind
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Data Service.
    slot_uri: dcterms:description
    range: string
    required: false
    multivalued: true
    inlined_as_list: true
  documentation:
    name: documentation
    description: A page or document about this Data Service
    slot_uri: foaf:page
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  endpoint_URL:
    name: endpoint_URL
    description: The root location or primary endpoint of the service (an IRI).
    slot_uri: dcat:endpointURL
    range: Resource
    required: true
    multivalued: true
    inlined_as_list: true
  endpoint_description:
    name: endpoint_description
    description: A description of the services available via the end-points, including
      their operations, parameters etc.
    slot_uri: dcat:endpointDescription
    range: Resource
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  format:
    name: format
    description: The structure that can be returned by querying the endpointURL.
    slot_uri: dcterms:format
    range: MediaTypeOrExtent
    required: false
    multivalued: true
    inlined_as_list: true
  keyword:
    name: keyword
    description: A keyword or tag describing the Data Service.
    slot_uri: dcat:keyword
    range: string
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  landing_page:
    name: landing_page
    description: A web page that provides access to the Data Service and/or additional
      information.
    slot_uri: dcat:landingPage
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Data service is made available.
    slot_uri: dcterms:license
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Data Service
      available.
    slot_uri: dcterms:publisher
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  serves_dataset:
    name: serves_dataset
    description: This property refers to a collection of data that this data service
      can distribute.
    slot_uri: dcat:servesDataset
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  theme:
    name: theme
    description: A category of the Data Service.
    slot_uri: dcat:theme
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Data Service.
    slot_uri: dcterms:title
    range: string
    required: true
    multivalued: true
    inlined_as_list: true
attributes:
  access_rights:
    name: access_rights
    description: Information regarding access or restrictions based on privacy, security,
      or other policies.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:accessRights
    alias: access_rights
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    range: RightsStatement
    required: false
    multivalued: false
    inlined_as_list: true
  applicable_legislation:
    name: applicable_legislation
    description: The legislation that mandates the creation or management of the Data
      Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcatap:applicableLegislation
    alias: applicable_legislation
    owner: DataService
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
  conforms_to:
    name: conforms_to
    description: An established (technical) standard to which the Data Service conforms.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:conformsTo
    alias: conforms_to
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    range: Standard
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  contact_point:
    name: contact_point
    description: Contact information that can be used for sending comments about the
      Data Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:contactPoint
    alias: contact_point
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    - DatasetSeries
    range: Kind
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  description:
    name: description
    description: A free-text account of the Data Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:description
    alias: description
    owner: DataService
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
    required: false
    multivalued: true
    inlined_as_list: true
  documentation:
    name: documentation
    description: A page or document about this Data Service
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: foaf:page
    alias: documentation
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    - Distribution
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  endpoint_URL:
    name: endpoint_URL
    description: The root location or primary endpoint of the service (an IRI).
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:endpointURL
    alias: endpoint_URL
    owner: DataService
    domain_of:
    - DataService
    range: Resource
    required: true
    multivalued: true
    inlined_as_list: true
  endpoint_description:
    name: endpoint_description
    description: A description of the services available via the end-points, including
      their operations, parameters etc.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:endpointDescription
    alias: endpoint_description
    owner: DataService
    domain_of:
    - DataService
    range: Resource
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  format:
    name: format
    description: The structure that can be returned by querying the endpointURL.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:format
    alias: format
    owner: DataService
    domain_of:
    - DataService
    - Distribution
    range: MediaTypeOrExtent
    required: false
    multivalued: true
    inlined_as_list: true
  keyword:
    name: keyword
    description: A keyword or tag describing the Data Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:keyword
    alias: keyword
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    range: string
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  landing_page:
    name: landing_page
    description: A web page that provides access to the Data Service and/or additional
      information.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:landingPage
    alias: landing_page
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    range: Document
    required: false
    multivalued: true
    inlined_as_list: true
  licence:
    name: licence
    description: A licence under which the Data service is made available.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:license
    alias: licence
    owner: DataService
    domain_of:
    - Catalogue
    - DataService
    - Distribution
    range: LicenseDocument
    required: false
    multivalued: false
    inlined_as_list: true
  publisher:
    name: publisher
    description: An entity (organisation) responsible for making the Data Service
      available.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:publisher
    alias: publisher
    owner: DataService
    domain_of:
    - Catalogue
    - DataService
    - Dataset
    - DatasetSeries
    range: Agent
    required: false
    multivalued: false
    inlined_as_list: true
  serves_dataset:
    name: serves_dataset
    description: This property refers to a collection of data that this data service
      can distribute.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:servesDataset
    alias: serves_dataset
    owner: DataService
    domain_of:
    - DataService
    range: Dataset
    required: false
    multivalued: true
    inlined_as_list: true
  theme:
    name: theme
    description: A category of the Data Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcat:theme
    alias: theme
    owner: DataService
    domain_of:
    - DataService
    - Dataset
    range: Concept
    required: false
    recommended: true
    multivalued: true
    inlined_as_list: true
  title:
    name: title
    description: A name given to the Data Service.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: DataService
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
class_uri: dcat:DataService

```
</details>