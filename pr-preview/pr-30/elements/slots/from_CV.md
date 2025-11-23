

# Slot: from_CV 


_The URL of the controlled vocabulary._





URI: [schema:inDefinedTermSet](http://schema.org/inDefinedTermSet)
Alias: from_CV

<!-- no inheritance hierarchy -->





## Applicable Classes

| Name | Description | Modifies Slot |
| --- | --- | --- |
| [DefinedTerm](../classes/DefinedTerm.md) | A word, name, acronym or phrase that is defined in a controlled vocabulary (CV) and that is used to provide an additional rdf:type or dcterms:type of a class within this schema. |  no  |






## Properties

* Range: [Uriorcurie](../types/Uriorcurie.md)




## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | schema:inDefinedTermSet |
| native | dcatap_plus:from_CV |




## LinkML Source

<details>
```yaml
name: from_CV
description: The URL of the controlled vocabulary.
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
rank: 1000
slot_uri: schema:inDefinedTermSet
alias: from_CV
owner: DefinedTerm
domain_of:
- DefinedTerm
range: uriorcurie

```
</details>