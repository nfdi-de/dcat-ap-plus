

# Class: Checksum 


_See [DCAT-AP specs:Checksum](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Checksum)_





URI: [spdx:Checksum](http://spdx.org/rdf/terms#Checksum)





```mermaid
 classDiagram
    class Checksum
    click Checksum href "../../classes/Checksum/"
      Checksum : algorithm
        
          
    
        
        
        Checksum --> "1" ChecksumAlgorithm : algorithm
        click ChecksumAlgorithm href "../../classes/ChecksumAlgorithm/"
    

        
      Checksum : checksum_value
        
      
```




<!-- no inheritance hierarchy -->


## Slots

| Name | Cardinality and Range | Description | Inheritance |
| ---  | --- | --- | --- |
| [algorithm](../slots/algorithm.md) | 1 <br/> [ChecksumAlgorithm](../classes/ChecksumAlgorithm.md) | The algorithm used to produce the subject Checksum. | direct |
| [checksum_value](../slots/checksum_value.md) | 1 <br/> [HexBinary](../types/HexBinary.md) | A lower case hexadecimal encoded digest value produced using a specific algorithm. | direct |





## Usages

| used by | used in | type | used |
| ---  | --- | --- | --- |
| [Distribution](../classes/Distribution.md) | [checksum](../slots/checksum.md) | range | [Checksum](../classes/Checksum.md) |







## Identifier and Mapping Information






### Schema Source


* from schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml




## Mappings

| Mapping Type | Mapped Value |
| ---  | ---  |
| self | spdx:Checksum |
| native | dcatap_plus:Checksum |






## LinkML Source

<!-- TODO: investigate https://stackoverflow.com/questions/37606292/how-to-create-tabbed-code-blocks-in-mkdocs-or-sphinx -->

### Direct

<details>
```yaml
name: Checksum
description: See [DCAT-AP specs:Checksum](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Checksum)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slots:
- algorithm
- checksum_value
slot_usage:
  algorithm:
    name: algorithm
    description: The algorithm used to produce the subject Checksum.
    slot_uri: spdx:algorithm
    range: ChecksumAlgorithm
    required: true
    multivalued: false
    inlined_as_list: true
  checksum_value:
    name: checksum_value
    description: A lower case hexadecimal encoded digest value produced using a specific
      algorithm.
    slot_uri: spdx:checksumValue
    range: hexBinary
    required: true
    multivalued: false
    inlined_as_list: true
class_uri: spdx:Checksum

```
</details>

### Induced

<details>
```yaml
name: Checksum
description: See [DCAT-AP specs:Checksum](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Checksum)
from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
slot_usage:
  algorithm:
    name: algorithm
    description: The algorithm used to produce the subject Checksum.
    slot_uri: spdx:algorithm
    range: ChecksumAlgorithm
    required: true
    multivalued: false
    inlined_as_list: true
  checksum_value:
    name: checksum_value
    description: A lower case hexadecimal encoded digest value produced using a specific
      algorithm.
    slot_uri: spdx:checksumValue
    range: hexBinary
    required: true
    multivalued: false
    inlined_as_list: true
attributes:
  algorithm:
    name: algorithm
    description: The algorithm used to produce the subject Checksum.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: spdx:algorithm
    alias: algorithm
    owner: Checksum
    domain_of:
    - Checksum
    range: ChecksumAlgorithm
    required: true
    multivalued: false
    inlined_as_list: true
  checksum_value:
    name: checksum_value
    description: A lower case hexadecimal encoded digest value produced using a specific
      algorithm.
    from_schema: https://nfdi-de.github.io/dcat-ap-plus/dcat_ap_plus.yaml
    rank: 1000
    slot_uri: spdx:checksumValue
    alias: checksum_value
    owner: Checksum
    domain_of:
    - Checksum
    range: hexBinary
    required: true
    multivalued: false
    inlined_as_list: true
class_uri: spdx:Checksum

```
</details>