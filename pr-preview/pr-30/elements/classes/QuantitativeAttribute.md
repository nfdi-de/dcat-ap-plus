

# Class: QuantitativeAttribute 


_A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity._





URI: [qudt:Quantity](http://qudt.org/schema/qudt/Quantity)





```mermaid
 classDiagram
    class QuantitativeAttribute
    click QuantitativeAttribute href "../../classes/QuantitativeAttribute/"
      ClassifierMixin <|-- QuantitativeAttribute
        click ClassifierMixin href "../../classes/ClassifierMixin/"
      
      QuantitativeAttribute : description
        
      QuantitativeAttribute : has_quantity_type
        
          
    
        
        
        QuantitativeAttribute --> "1" DefinedTerm : has_quantity_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      QuantitativeAttribute : rdf_type
        
          
    
        
        
        QuantitativeAttribute --> "0..1 _recommended_" DefinedTerm : rdf_type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      QuantitativeAttribute : title
        
      QuantitativeAttribute : type
        
          
    
        
        
        QuantitativeAttribute --> "0..1" DefinedTerm : type
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      QuantitativeAttribute : unit
        
          
    
        
        
        QuantitativeAttribute --> "0..1 _recommended_" DefinedTerm : unit
        click DefinedTerm href "../../classes/DefinedTerm/"
    

        
      QuantitativeAttribute : value
        
      
```





## Inheritance
* **QuantitativeAttribute** [ [ClassifierMixin](../classes/ClassifierMixin.md)]



## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [title](../slots/title.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [description](../slots/description.md) | 0..1 <br/> [String](../types/String.md) | This slot is described in more detail within the class in which it is used. | direct |
| [value](../slots/value.md) | 1 <br/> [Float](../types/Float.md) | The slot to provide the literal value of the QuantitativeAttribute. | direct |
| [has_quantity_type](../slots/has_quantity_type.md) | 1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | The type of quality that is quantifiable according to the QUDT ontology. | direct |
| [unit](../slots/unit.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) |  | direct |
| [type](../slots/type.md) | 0..1 <br/> [DefinedTerm](../classes/DefinedTerm.md) | This slot is described in more detail within the class in which it is used. | [ClassifierMixin](../classes/ClassifierMixin.md) |
| [rdf_type](../slots/rdf_type.md) | 0..1 _recommended_ <br/> [DefinedTerm](../classes/DefinedTerm.md) | The slot to specify the ontology class that is instantiated by an entity. | [ClassifierMixin](../classes/ClassifierMixin.md) |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Activity](../classes/Activity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [AgenticEntity](../classes/AgenticEntity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [AnalysisSourceData](../classes/AnalysisSourceData.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [DataAnalysis](../classes/DataAnalysis.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [DataGeneratingActivity](../classes/DataGeneratingActivity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [Device](../classes/Device.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [Entity](../classes/Entity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [EvaluatedActivity](../classes/EvaluatedActivity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [EvaluatedEntity](../classes/EvaluatedEntity.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |
| [Software](../classes/Software.md) | [has_quantitative_attribute](../slots/has_quantitative_attribute.md) | range | [QuantitativeAttribute](../classes/QuantitativeAttribute.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | qudt:Quantity |
| native | dcatap_plus:QuantitativeAttribute |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: QuantitativeAttribute
description: A quantifiable piece of information that is attributed to an Entity,
  Activity or AgenticEntity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slots:
- title
- description
- value
slot_usage:
  value:
    name: value
    description: The slot to provide the literal value of the QuantitativeAttribute.
    range: float
    required: true
attributes:
  has_quantity_type:
    name: has_quantity_type
    description: The type of quality that is quantifiable according to the QUDT ontology.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: qudt:hasQuantityKind
    domain_of:
    - QuantitativeAttribute
    range: DefinedTerm
    bindings:
    - range: QUDTQuantityKindEnum
      obligation_level: RECOMMENDED
      binds_value_of: id
      description: Binds the type of a quantifiable attribute to a QUDT Quantity Kind
        instance from the QUDT Quantity Kind vocabulary.
    required: true
  unit:
    name: unit
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: qudt:unit
    domain_of:
    - QuantitativeAttribute
    range: DefinedTerm
    bindings:
    - range: QUDTUnitEnum
      obligation_level: RECOMMENDED
      binds_value_of: id
      description: Restricts the allowable defined terms to the QUDT Unit vocabulary.
    recommended: true
class_uri: qudt:Quantity

```
</details>

### Induced

<details>
```yaml
name: QuantitativeAttribute
description: A quantifiable piece of information that is attributed to an Entity,
  Activity or AgenticEntity.
in_subset:
- domain_agnostic_core
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
mixins:
- ClassifierMixin
slot_usage:
  value:
    name: value
    description: The slot to provide the literal value of the QuantitativeAttribute.
    range: float
    required: true
attributes:
  has_quantity_type:
    name: has_quantity_type
    description: The type of quality that is quantifiable according to the QUDT ontology.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: qudt:hasQuantityKind
    alias: has_quantity_type
    owner: QuantitativeAttribute
    domain_of:
    - QuantitativeAttribute
    range: DefinedTerm
    bindings:
    - range: QUDTQuantityKindEnum
      obligation_level: RECOMMENDED
      binds_value_of: id
      description: Binds the type of a quantifiable attribute to a QUDT Quantity Kind
        instance from the QUDT Quantity Kind vocabulary.
    required: true
  unit:
    name: unit
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: qudt:unit
    alias: unit
    owner: QuantitativeAttribute
    domain_of:
    - QuantitativeAttribute
    range: DefinedTerm
    bindings:
    - range: QUDTUnitEnum
      obligation_level: RECOMMENDED
      binds_value_of: id
      description: Restricts the allowable defined terms to the QUDT Unit vocabulary.
    recommended: true
  title:
    name: title
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:title
    alias: title
    owner: QuantitativeAttribute
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
    owner: QuantitativeAttribute
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
  value:
    name: value
    description: The slot to provide the literal value of the QuantitativeAttribute.
    in_subset:
    - domain_agnostic_core
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: prov:value
    alias: value
    owner: QuantitativeAttribute
    domain_of:
    - QualitativeAttribute
    - QuantitativeAttribute
    range: float
    required: true
  type:
    name: type
    description: This slot is described in more detail within the class in which it
      is used.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: dcterms:type
    alias: type
    owner: QuantitativeAttribute
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
    owner: QuantitativeAttribute
    domain_of:
    - ClassifierMixin
    range: DefinedTerm
    recommended: true
    inlined: true
class_uri: qudt:Quantity

```
</details>