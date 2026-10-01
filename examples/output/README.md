## AnalysisDataset-001
### Input
```yaml
description:
- Dataset for 13C nuclear magnetic resonance spectroscopy (13C NMR)
id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1
is_about_entity:
- description: The analysed chemical substance sample CRS-50440.
  has_part:
  - description: compound assigned to https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
    has_qualitative_attribute:
    - rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000059
        title: InChiKey
      title: assigned InChiKey
      value: KVOIVNBYNQXCNY-BOCHJOTCSA-N
    - rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000113
        title: InChi
      title: assigned InChi
      value: InChI=1S/C11H12N2S/c1-12-7-10-8-14-11(13-10)9-5-3-2-4-6-9/h2-6,8,12H,7H2,1H3
    - rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000018
        title: SMILES descriptor
      title: assigned SMILES
      value: CNCc1csc(n1)c1ccccc1
    - rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000042
        title: molecular formula
      title: assigned molecular formula
      value: C11H12N2S
    - description: Chemotion IUPAC name
      rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000107
        title: IUPAC name
      value: N-methyl-1-(2-phenyl-1,3-thiazol-4-yl)methanamine
    - description: PubChem IUPAC name
      rdf_type:
        id: http://semanticscience.org/resource/CHEMINF_000107
        title: IUPAC name
      value: Methyl[(2-phenyl-1,3-thiazol-4-yl)methyl]amine
    has_quantitative_attribute:
    - description: Molar mass as specified in the Chemotion repository.
      has_quantity_type: http://qudt.org/vocab/quantitykind/MolarMass
      unit: https://qudt.org/vocab/unit/GM-PER-MOL
      value: 204.072119
    - description: Molar mass as specified in PubChem
      has_quantity_type: http://qudt.org/vocab/quantitykind/MolarMass
      unit: https://qudt.org/vocab/unit/GM-PER-MOL
      value: 204.29
    id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2#EvaluatedCompound
    other_identifier:
    - notation: https://pubchem.ncbi.nlm.nih.gov/compound/26248854
    rdf_type:
      id: http://purl.obolibrary.org/obo/CHEBI_23367
      title: molecular entity
  id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
  rdf_type:
    id: http://purl.obolibrary.org/obo/CHEBI_59999
    title: chemical substance
  title: CRS-50440
other_identifier:
- notation: https://www.chemotion-repository.net/pid/50434
theme:
- preferred_label:
  - TECH
title:
- 13C nuclear magnetic resonance spectroscopy (13C NMR)
was_generated_by:
- description:
  - Analysis of NMR spectra.
  evaluated_entity:
  - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Spectrum
    was_generated_by:
    - carried_out_by:
      - description: The NMR spectrometer used.
        id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Spectrometer
        rdf_type:
          id: http://purl.obolibrary.org/obo/OBI_0000566
          title: NMR instrument
        title: Bruker 400 MHz
      - description: used solvent
        has_part:
        - id: https://pubchem.ncbi.nlm.nih.gov/compound/71583
          rdf_type:
            id: http://purl.obolibrary.org/obo/CHEBI_85365
            title: deuterated chloroform
          title: chloroform-D1 (CDCl3)
        id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Solvent
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_AcquisitionNucleus
        part_of:
        - description: The atom of the probed nucleus
          id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleusAtom
          rdf_type:
            id: http://purl.obolibrary.org/obo/CHEBI_36928
            title: carbon-13 atom
          title: 13C
        title: probed nucleus
      - description: The used calibration compound
        has_quantitative_attribute:
        - description: The chemical shift of the peak used for chemical shift calibration.
          has_quantity_type: http://qudt.org/vocab/quantitykind/DimensionlessRatio
          unit: https://qudt.org/vocab/unit/PPM
          value: 77.16
        id: https://pubchem.ncbi.nlm.nih.gov/compound/71583
        rdf_type:
          id: http://purl.obolibrary.org/obo/CHEBI_85365
          title: deuterated chloroform
        title: Chloroform-D
      evaluated_entity:
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
        title: CRS-50440
      has_qualitative_attribute:
      - rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400037
          title: NMR pulse sequence
        title: Puls programme
        value: zgpg30
      has_quantitative_attribute:
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Temperature
        rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400262
          title: sample temperature information
        title: sample temperature setting
        unit: https://qudt.org/vocab/unit/K
        value: 300.0
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Count
        rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400087
          title: number of scans
        title: Number of scans
        unit: http://qudt.org/vocab/unit/NUM
        value: 1024
      id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR
      rdf_type:
        id: http://purl.obolibrary.org/obo/CHMO_0000595
        title: 13C nuclear magnetic resonance spectroscopy
      title:
      - CDCl3_13C_NMR
  - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Spectrum
    was_generated_by:
    - carried_out_by:
      - description: used spectrometer
        id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Spectrometer
        rdf_type:
          id: http://purl.obolibrary.org/obo/OBI_0000566
          title: NMR instrument
        title: Bruker 400 MHz
      - description: used solvent
        has_part:
        - id: https://pubchem.ncbi.nlm.nih.gov/compound/679
          rdf_type:
            id: http://purl.obolibrary.org/obo/CHEBI_28262
            title: dimethyl sulfoxide
          title: DMSO
        id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Solvent
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleus
        part_of:
        - description: The atom of the probed nucleus
          id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleusAtom
          rdf_type:
            id: http://purl.obolibrary.org/obo/CHEBI_36928
            title: carbon-13 atom
          title: 13C
        title: probed nucleus
      - description: The used calibration compound
        has_quantitative_attribute:
        - description: The chemical shift of the peak used for chemical shift calibration.
          has_quantity_type: http://qudt.org/vocab/quantitykind/DimensionlessRatio
          unit: https://qudt.org/vocab/unit/PPM
          value: 39.52
        id: https://pubchem.ncbi.nlm.nih.gov/compound/679
        rdf_type:
          id: http://purl.obolibrary.org/obo/CHEBI_28262
          title: dimethyl sulfoxide
        title: DMSO
      evaluated_entity:
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
        title: CRS-50440
      has_qualitative_attribute:
      - rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400037
          title: NMR pulse sequence
        title: Puls programme
        value: zgpg30
      has_quantitative_attribute:
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Temperature
        rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400262
          title: sample temperature information
        title: sample temperature setting
        unit: https://qudt.org/vocab/unit/K
        value: 300.0
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Count
        rdf_type:
          id: http://nmrML.org/nmrCV#NMR:1400087
          title: number of scans
        title: Number of scans
        unit: http://qudt.org/vocab/unit/NUM
        value: 1024
      id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR
      rdf_type:
        id: http://purl.obolibrary.org/obo/CHMO_0000595
        title: 13C nuclear magnetic resonance spectroscopy
      title:
      - DMSO_13C_NMR
  id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#NMRSpectralAnalysis
  rdf_type:
    id: http://nmrML.org/nmrCV#NMR:1400042
    title: NMR data processing

```
## Catalogue-complete
### Input
```yaml
applicable_legislation:
- description:
  - EU regulation on data protection and privacy.
  identifier: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  other_identifier:
  - notation: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  - notation: https://gdpr-info.eu/
  title:
  - General Data Protection Regulation (GDPR)
- description:
  - 'You are free to: ... '
  identifier: https://creativecommons.org/licenses/by/4.0
  other_identifier:
  - description:
    - The id to be used to explicitly refer to the RDF representation of the CC-BY
      4.0 licence.
    notation: https://creativecommons.org/licenses/by/4.0/rdf
    title:
    - RDF ID
  - description:
    - The canonical idenfier used for the CC-BY 4.0 license
    notation: https://creativecommons.org/licenses/by/4.0/
    title:
    - CC-BY 4.0 id
  title:
  - Attribution 4.0 International
  - CC-BY 4.0
catalogue:
- description:
  - A specialized sub-catalogue.
  id: https://example.org/catalogue/sub-cat-001
  publisher:
    identifier: http://publications.europa.eu/resource/authority/corporate-body/EEA
    name:
    - European Environmental Agency
    type:
      identifier: http://purl.org/adms/publishertype/GovernmentAgency
      preferred_label:
      - Government Agency
  title:
  - Sub-Catalogue for Specific Domain
creator:
  identifier: https://orcid.org/0000-0002-0003-0004
  name:
  - Peter Parker
  other_identifier:
  - description:
    - The ORCID of the dataset creator.
    notation: https://orcid.org/0000-0002-0003-0004
    title:
    - ORCID
  rdf_type:
    id: foaf:Person
  type:
    identifier: http://purl.org/adms/publishertype/PrivateIndividual(s)
    other_identifier:
    - description:
      - The identifier for classifying people according to the DCAT-AP mandated ADMS
        publisher type vocabulary.
      notation: http://purl.org/adms/publishertype/PrivateIndividual(s)
    preferred_label:
    - PrivateIndividual(s)
description:
- This catalogue aggregates datasets related to environmental monitoring across Europe.
- "Dieser Katalog sammelt Datens\xE4tze zur Umwelt\xFCberwachung in ganz Europa."
geographical_coverage:
- bbox: POLYGON((-73.9872 -33.7507, -34.7929 -33.7507, -34.7929 5.2718, -73.9872 5.2718,
    -73.9872 -33.7507))
  centroid: POINT(-54.3900 -14.2394)
  description:
  - Brazil, officially the Federative Republic of Brazil, is the largest country in
    South America and the fifth-largest in the world by area.
  - "Brasil, oficialmente Rep\xFAblica Federativa do Brasil, \xE9 o maior pa\xEDs\
    \ da Am\xE9rica do Sul e o quinto maior do mundo em \xE1rea."
  geometry:
    coordinates: -47.9292, -15.7801
    crs: http://www.opengis.net/def/crs/OGC/1.3/CRS84
    gml: "<gml:Point xmlns:gml=\"http://www.opengis.net/gml/3.2\" srsName=\"http://www.opengis.net/def/crs/OGC/1.3/CRS84\"\
      >\n  <gml:pos>-47.9292 -15.7801</gml:pos>\n</gml:Point>\n"
    latitude: '-15.7801'
    longitude: '-47.9292'
    wkt: POINT(-47.9292 -15.7801)
  identifier: http://publications.europa.eu/resource/authority/country/BRA
  other_identifier:
  - notation: ISO3166-1:BRA
  - description:
    - The identifier from the EU Vocabularies Countries Named Authority List, as mandated
      by the DCA-AP specs.
    notation: http://publications.europa.eu/resource/authority/country/BRA
  - notation: UN:M49:076
  - notation: FIPS:BR
  - notation: GNS:-1058129
  title:
  - Brazil
  - Federative Republic of Brazil
  - Brasil
  - "Rep\xFAblica Federativa do Brasil"
- bbox: POLYGON((5.8663 47.2701, 15.0419 47.2701, 15.0419 55.0581, 5.8663 55.0581,
    5.8663 47.2701))
  centroid: POINT(10.4515 51.1657)
  description:
  - Germany, officially the Federal Republic of Germany, is a country in Central Europe.
    It is the second-most populous country in Europe after Russia and the most populous
    member state of the European Union.
  - "Deutschland, offiziell Bundesrepublik Deutschland, ist ein Land in Mitteleuropa.\
    \ Es ist nach Russland das zweitbev\xF6lkerungsreichste Land Europas und das bev\xF6\
    lkerungsreichste Mitglied der Europ\xE4ischen Union."
  geometry:
    coordinates: 13.4050, 52.5200
    crs: http://www.opengis.net/def/crs/OGC/1.3/CRS84
    gml: "<gml:Point xmlns:gml=\"http://www.opengis.net/gml/3.2\" srsName=\"http://www.opengis.net/def/crs/OGC/1.3/CRS84\"\
      >\n  <gml:pos>13.4050 52.5200</gml:pos>\n</gml:Point>\n"
    latitude: '52.5200'
    longitude: '13.4050'
    wkt: POINT(13.4050 52.5200)
  identifier: http://publications.europa.eu/resource/authority/country/DEU
  other_identifier:
  - notation: ISO3166-1:DEU
  - description:
    - The identifier from the EU Vocabularies Countries Named Authority List, as mandated
      by the DCA-AP specs.
    notation: http://publications.europa.eu/resource/authority/country/DEU
  - notation: UN:M49:276
  - notation: FIPS:GM
  - notation: GNS:-1823572
  title:
  - Germany
  - Federal Republic of Germany
  - Deutschland
  - Bundesrepublik Deutschland
has_dataset:
- description:
  - Key dataset in this catalogue.
  id: https://example.org/dataset/env-monitoring-001
  title:
  - Environmental Monitoring Dataset 2025
  was_generated_by:
  - id: https://example.org/activity/env-monitoring-001
has_part:
- description:
  - Section dedicated to air quality data.
  id: https://example.org/catalogue/cat-001-part-A
  publisher:
    identifier: http://publications.europa.eu/resource/authority/corporate-body/EEA
    name:
    - European Environmental Agency
    type:
      identifier: http://purl.org/adms/publishertype/GovernmentAgency
      preferred_label:
      - Government Agency
  title:
  - 'Part A: Air Quality'
homepage:
  description:
  - Main entry point for the catalogue.
  identifier: https://example.org/catalogue/cat-001/home
  other_identifier:
  - notation: https://example.org/catalogue/cat-001/home
  title:
  - Catalogue Homepage
id: https://example.org/catalogue/cat-001
identifier: https://example.org/catalogue/cat-001
language:
- description:
  - Primary language of metadata.
  identifier: http://publications.europa.eu/resource/authority/language/ENG
  title:
  - English
- description:
  - Secondary language of metadata.
  identifier: http://publications.europa.eu/resource/authority/language/DEU
  title:
  - German
licence:
  description:
  - Creative Commons Attribution 4.0 International
  identifier: http://creativecommons.org/licenses/by/4.0/
  other_identifier:
  - notation: http://creativecommons.org/licenses/by/4.0/
  title:
  - CC BY 4.0
modification_date: '2026-06-19'
other_identifier:
- notation: https://example.org/catalogue/cat-001
- description:
  - Internal URN for the catalogue.
  notation: urn:example:cat:001
  title:
  - URN Identifier
publisher:
  identifier: http://publications.europa.eu/resource/authority/corporate-body/EEA
  name:
  - European Environmental Agency
  type:
    identifier: http://purl.org/adms/publishertype/GovernmentAgency
    preferred_label:
    - Government Agency
record:
- description:
  - This record describes the dataset containing air quality measurements from 2025.
  id: https://example.org/dataset/env-monitoring-001.ttl
  modification_date: '2026-06-19'
  primary_topic:
    description:
    - This dataset contains air quality measurements from 2025.
    id: https://example.org/dataset/env-monitoring-001
    title:
    - Environmental Monitoring Dataset 001
  title:
  - Record for Environmental Monitoring Dataset 001
release_date: '2026-01-01'
rights:
  description:
  - The catalogue is open access.
  identifier: http://publications.europa.eu/resource/authority/access-right/PUBLIC
  other_identifier:
  - description:
    - The RightsStatement ID from the Access Rights Named Authority List as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/access-right/PUBLIC
    title:
    - DCAT-AP mandated RightsStatement ID
  title:
  - The RightsStatement for this catalogue
service:
- description:
  - Service for harvesting metadata.
  endpoint_URL:
  - id: https://example.org/catalogue/cat-001/oai/
    title:
    - OAI Endpoint
  id: https://example.org/
  title:
  - OAI-PMH Service
temporal_coverage:
- beginning:
    datetime: '2019-01-12T21:32:52Z'
  end:
    datetime: '2020-01-12T21:00:00Z'
  end_date: '2020-01-12'
  start_date: '2019-01-12'
themes:
- description:
  - The Dataset Theme Vocabulary of the DCAT-AP standard.
  identifier: http://publications.europa.eu/resource/authority/data-theme
  title:
  - Dataset Theme Vocabulary
title:
- European Environmental Data Catalogue
- "Europ\xE4ischer Umweltdatenkatalog"

```
## CatalogueRecord-complete
### Input
```yaml
application_profile:
- identifier: https://w3id.org/nfdi-de/dcat-ap-plus
  other_identifier:
  - description:
    - This identifier links to the GitHub pages documentation of the DCAT-AP+.
    notation: https://nfdi-de.github.io/dcat-ap-plus/
    title:
    - GitHub pages URL
  - description:
    - This identifier is the official PURL of the DCAT-AP+.
    notation: https://w3id.org/nfdi-de/dcat-ap-plus
    title:
    - official PURL
change_type:
  description:
  - The distribution is complete and stable.
  identifier: http://publications.europa.eu/resource/authority/distribution-status/COMPLETED
  other_identifier:
  - description:
    - The status code ID from the EU Vocabularies Distribution Status as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/distribution-status/COMPLETED
    title:
    - DCAT-AP mandated status code ID
  preferred_label:
  - COMPLETED
description:
- This record describes the dataset containing air quality measurements from 2025.
id: https://example.org/dataset/env-monitoring-001.ttl
identifier: https://example.org/dataset/env-monitoring-001.ttl
language:
- description:
  - Primary language of metadata.
  identifier: http://publications.europa.eu/resource/authority/language/ENG
  title:
  - English
- description:
  - Secondary language of metadata.
  identifier: http://publications.europa.eu/resource/authority/language/DEU
  title:
  - German
listing_date: '2026-06-10'
modification_date: '2026-06-19'
other_identifier:
- notation: https://example.org/dataset/env-monitoring-001.ttl
primary_topic:
  description:
  - This dataset contains air quality measurements from 2025.
  id: https://example.org/dataset/env-monitoring-001
  title:
  - Environmental Monitoring Dataset 001
source_metadata:
  description:
  - Metadata originally created in ISO 19115 format.
  id: https://example.org/dataset/env-monitoring-001_source.txt
  modification_date: '2026-06-01'
  primary_topic:
    description:
    - This dataset contains air quality measurements from 2025.
    id: https://example.org/dataset/env-monitoring-001
    title:
    - Environmental Monitoring Dataset 001
  title:
  - Original ISO 19115 Record
title:
- Record for Environmental Monitoring Dataset 001

```
## Dataset-001
### Input
```yaml
description:
- Dataset for 13C nuclear magnetic resonance spectroscopy (13C NMR)
id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1
other_identifier:
- notation: https://www.chemotion-repository.net/pid/37012
theme:
- preferred_label:
  - TECH
title:
- 13C nuclear magnetic resonance spectroscopy (13C NMR)
was_generated_by:
- description:
  - The analysis of the spectrum generated by a 13C nuclear magnetic resonance spectroscopy
  id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DataGeneratingActivity

```
## Dataset-complete
### Input
```yaml
access_rights:
  description:
  - This dataset is public.
  - "Dieser Datensatz ist \xF6ffentlich."
  identifier: http://publications.europa.eu/resource/authority/access-right/PUBLIC
  other_identifier:
  - description:
    - The RightsStatement ID from the Access Rights Named Authority List as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/access-right/PUBLIC
    title:
    - DCAT-AP mandated RightsStatement ID
  title:
  - The RightsStatement for this dataset
  - "Das RightsStatement f\xFCr dieses Dataset"
applicable_legislation:
- description:
  - EU regulation on data protection and privacy.
  identifier: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  other_identifier:
  - notation: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  - notation: https://gdpr-info.eu/
  title:
  - General Data Protection Regulation (GDPR)
- description:
  - 'You are free to: ... '
  identifier: https://creativecommons.org/licenses/by/4.0
  other_identifier:
  - description:
    - The id to be used to explicitly refer to the RDF representation of the CC-BY
      4.0 licence.
    notation: https://creativecommons.org/licenses/by/4.0/rdf
    title:
    - RDF ID
  - description:
    - The canonical idenfier used for the CC-BY 4.0 license
    notation: https://creativecommons.org/licenses/by/4.0/
    title:
    - CC-BY 4.0 id
  title:
  - Attribution 4.0 International
  - CC-BY 4.0
conforms_to:
- description:
  - 'DCAT-AP+ is a LinkML-based extension of the DCAT Application Profile 3.0 that
    adds a provenance layer for describing how a dataset was generated and what it
    is about, using the Starting Point Terms of PROV-O, the QUDT ontology, and Dublin
    Core Terms. '
  - "DCAT-AP+ ist eine auf LinkML basierende Erweiterung des DCAT-Anwendungsprofils\
    \ 3.0, die eine Provenienzebene hinzuf\xFCgt, um zu beschreiben, wie ein Datensatz\
    \ generiert wurde und worum es darin geht. Dabei kommen die \u201EStarting Point\
    \ Terms\u201C von PROV-O, die QUDT-Ontologie und die Dublin-Core-Begriffe zum\
    \ Einsatz."
  identifier: https://w3id.org/nfdi-de/dcat-ap-plus
  other_identifier:
  - description:
    - This identifier links to the GitHub pages documentation of the DCAT-AP+.
    notation: https://nfdi-de.github.io/dcat-ap-plus/
    title:
    - GitHub pages URL
  - description:
    - This identifier is the official PURL of the DCAT-AP+.
    notation: https://w3id.org/nfdi-de/dcat-ap-plus
    title:
    - official PURL
  title:
  - DCAT-AP+
  - DCAT-AP Plus Links to Use-case Specific Context (DCAT-AP+)
- description:
  - Guiding principles for modern data management.
  title:
  - FAIR Data Principles
  - FAIR-Datenprinzipien
contact_point:
- formatted_name:
  - Example Institution Name
  - Beispiel Institutionsname
  has_email:
  - support@example.com
  has_telephone:
  - +49-1234-56789
- formatted_name:
  - Peter Parker
creator:
- identifier: https://orcid.org/0000-0002-0003-0004
  name:
  - Peter Parker
  other_identifier:
  - description:
    - The ORCID of the dataset creator.
    notation: https://orcid.org/0000-0002-0003-0004
    title:
    - ORCID
  rdf_type:
    id: foaf:Person
  type:
    identifier: http://purl.org/adms/publishertype/PrivateIndividual(s)
    other_identifier:
    - description:
      - The identifier for classifying people according to the DCAT-AP mandated ADMS
        publisher type vocabulary.
      notation: http://purl.org/adms/publishertype/PrivateIndividual(s)
    preferred_label:
    - PrivateIndividual(s)
- identifier: https://ror.org/42marvel1234
  name:
  - Marvel Inc.
  other_identifier:
  - notation: https://ror.org/42marvel1234
  rdf_type:
    id: foaf:Organization
  type:
    identifier: http://purl.org/adms/publishertype/Company
    other_identifier:
    - notation: http://purl.org/adms/publishertype/Company
    preferred_label:
    - Company
dataset_distribution:
- access_URL:
  - description:
    - The access URL of the CSV distribution of the comprehensive-example-001 dataset.
    id: https://example.org/dataset/comprehensive-example-001.csv
    identifier: https://example.org/dataset/comprehensive-example-001.csv
    other_identifier:
    - notation: https://example-mirror.org/dataset/comprehensive-example-001.csv
      title:
      - Fallback Access URL"
    title:
    - comprehensive-example-001.csv access URL
  id: https://example.org/data/dist-001
description:
- This dataset serves as a comprehensive test case containing instances for all possible
  slots defined in the dcat-ap-plus schema for the Dataset class. Named nodes are
  only provided for classes that define the 'id' slot in the schema.
- "Dieser Datensatz dient als umfassender Testfall. Benannte Klassen gibt es nur f\xFC\
  r solche, f\xFCr die der Slot 'id' im Schema definiert ist."
documentation:
- description:
  - This is the landing page that documents this dataset.
  identifier: https://example.org/dataset/comprehensive-example-001.html
  other_identifier:
  - notation: https://example.org/dataset/comprehensive-example-001.html
  title:
  - Comprehensive Example Dataset 001
frequency:
  description:
  - The frequency with which this DatasetSeries is being updated.
  identifier: http://publications.europa.eu/resource/authority/frequency/ANNUAL
  other_identifier:
  - description:
    - This identifier from the http://publications.europa.eu/resource/authority/frequency
      vocabulary should be used according to the DCAT-AP specs to indicate an annual
      update frequency of a dataset.
    notation: http://publications.europa.eu/resource/authority/frequency/ANNUAL
    title:
    - DCAT-AP mandated identifier
  title:
  - Update Frequency
geographical_coverage:
- bbox: POLYGON((-73.9872 -33.7507, -34.7929 -33.7507, -34.7929 5.2718, -73.9872 5.2718,
    -73.9872 -33.7507))
  centroid: POINT(-54.3900 -14.2394)
  description:
  - Brazil, officially the Federative Republic of Brazil, is the largest country in
    South America and the fifth-largest in the world by area.
  - "Brasil, oficialmente Rep\xFAblica Federativa do Brasil, \xE9 o maior pa\xEDs\
    \ da Am\xE9rica do Sul e o quinto maior do mundo em \xE1rea."
  geometry:
    coordinates: -47.9292, -15.7801
    crs: http://www.opengis.net/def/crs/OGC/1.3/CRS84
    gml: "<gml:Point xmlns:gml=\"http://www.opengis.net/gml/3.2\" srsName=\"http://www.opengis.net/def/crs/OGC/1.3/CRS84\"\
      >\n  <gml:pos>-47.9292 -15.7801</gml:pos>\n</gml:Point>\n"
    latitude: '-15.7801'
    longitude: '-47.9292'
    wkt: POINT(-47.9292 -15.7801)
  identifier: http://publications.europa.eu/resource/authority/country/BRA
  other_identifier:
  - notation: ISO3166-1:BRA
  - description:
    - The identifier from the EU Vocabularies Countries Named Authority List, as mandated
      by the DCA-AP specs.
    notation: http://publications.europa.eu/resource/authority/country/BRA
  - notation: UN:M49:076
  - notation: FIPS:BR
  - notation: GNS:-1058129
  title:
  - Brazil
  - Federative Republic of Brazil
  - Brasil
  - "Rep\xFAblica Federativa do Brasil"
- bbox: POLYGON((5.8663 47.2701, 15.0419 47.2701, 15.0419 55.0581, 5.8663 55.0581,
    5.8663 47.2701))
  centroid: POINT(10.4515 51.1657)
  description:
  - Germany, officially the Federal Republic of Germany, is a country in Central Europe.
    It is the second-most populous country in Europe after Russia and the most populous
    member state of the European Union.
  - "Deutschland, offiziell Bundesrepublik Deutschland, ist ein Land in Mitteleuropa.\
    \ Es ist nach Russland das zweitbev\xF6lkerungsreichste Land Europas und das bev\xF6\
    lkerungsreichste Mitglied der Europ\xE4ischen Union."
  geometry:
    coordinates: 13.4050, 52.5200
    crs: http://www.opengis.net/def/crs/OGC/1.3/CRS84
    gml: "<gml:Point xmlns:gml=\"http://www.opengis.net/gml/3.2\" srsName=\"http://www.opengis.net/def/crs/OGC/1.3/CRS84\"\
      >\n  <gml:pos>13.4050 52.5200</gml:pos>\n</gml:Point>\n"
    latitude: '52.5200'
    longitude: '13.4050'
    wkt: POINT(13.4050 52.5200)
  identifier: http://publications.europa.eu/resource/authority/country/DEU
  other_identifier:
  - notation: ISO3166-1:DEU
  - description:
    - The identifier from the EU Vocabularies Countries Named Authority List, as mandated
      by the DCA-AP specs.
    notation: http://publications.europa.eu/resource/authority/country/DEU
  - notation: UN:M49:276
  - notation: FIPS:GM
  - notation: GNS:-1823572
  title:
  - Germany
  - Federal Republic of Germany
  - Deutschland
  - Bundesrepublik Deutschland
has_version:
- description:
  - Initial version of comprehensive-example-001
  id: https://example.org/dataset/comprehensive-example-001_v1
  title:
  - Comprehensive Example Dataset for DCAT-AP-PLUS Validation - Version 1
  was_generated_by:
  - id: https://example.org/activity/data-generation-001
id: https://example.org/dataset/comprehensive-example-001
identifier:
- https://example.org/dataset/comprehensive-example-001
in_series:
- description:
  - The DatasetSeries that contains all comprehensive test files for the DCAT-AP+
    LinkML schema.
  id: https://example.org/dataset/comprehensive-example-series-001
  title:
  - Comprehensive DCAT-AP+ Examples
is_about_activity:
- id: https://example.org/activity/developing_DCAT_AP_PLUS
is_about_entity:
- id: https://w3id.org/nfdi-de/dcat-ap-plus
is_referenced_by:
- description:
  - The DCAT-AP+ doc page that references this example dataset.
  id: https://nfdi-de.github.io/dcat-ap-plus/dev/automatic-generation/
  identifier: https://nfdi-de.github.io/dcat-ap-plus/dev/automatic-generation/
  other_identifier:
  - notation: https://github.com/nfdi-de/dcat-ap-plus/blob/main/docs/automatic-generation.md
  title:
  - Automatic Generation of DCAT-AP+
keyword:
- FAIR data
- DCAT-AP+ Examples
landing_page:
- description:
  - The comprehensive-example-001 landing page.
  identifier: https://example.org/dataset/comprehensive-example-001.html
  other_identifier:
  - notation: https://example.org/dataset/comprehensive-example-001.html
  title:
  - The comprehensive-example-001
language:
- description:
  - The english language.
  identifier: http://publications.europa.eu/resource/authority/language/ENG
  other_identifier:
  - description:
    - The LinguisticSystem ID from the EU Vocabularies Languages Named Authority List
      as mandated by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/language/ENG
    title:
    - DCAT-AP mandated LinguisticSystem ID
  title:
  - English
modification_date: '2026-06-19'
other_identifier:
- description:
  - The identifier from the local service example.com hosting that dataset.
  notation: dataset:98765
  title:
  - Local ID
- description:
  - The canonical identifier of this Dataset.
  notation: https://example.org/dataset/comprehensive-example-001
  title:
  - canonical ID
provenance:
- description:
  - "The comprehensive-example-001 dataset was made up by Philip Str\xF6mert to illustrate\
    \ and test the DCAT-AP+ LinkML schema during the work on #40 in June 2026."
  identifier: https://example.org/dataset/comprehensive-example-001_provenance.txt
  other_identifier:
  - notation: https://example.org/dataset/comprehensive-example-001_provenance.txt
  title:
  - 'Provenance of: comprehensive-example-001'
publisher:
  identifier: http://publications.europa.eu/resource/authority/corporate-body/EEA
  name:
  - European Environmental Agency
  type:
    identifier: http://purl.org/adms/publishertype/GovernmentAgency
    preferred_label:
    - Government Agency
qualified_attribution:
- agent:
  - name:
    - Peter Parker
  - name:
    - "Philip Str\xF6mert"
  description:
  - This attribution lists all people that created this dataset.
  title:
  - The creation attribution
qualified_relation:
- description:
  - The relationship of this dataset to the DCAT-AP+ standard.
  had_role:
  - description:
    - The role of this datastet is to illustrate and test the DCAT-AP+ LinkML schema.
    title:
    - Example Role
  relation:
  - id: https://w3id.org/nfdi-de/dcat-ap-plus
    title:
    - DCAT-AP+
  title:
  - Relationship to DCAT-AP+
release_date: '2026-06-19'
sample:
- access_URL:
  - id: https://example.org/dataset/comprehensive-example-001_sample.csv
  id: https://example.org/data/dist-001_sample
  title:
  - Data sample of comprehensive-example-001
source:
- description:
  - The made up examples Philip has in his mind but not yet produced as DCAT-AP+ test
    cases.
  id: https://example.org/dataset/comprehensive-example-001_source_data
  title:
  - Data examples in Philips head
  was_generated_by:
  - id: https://example.org/activity/working_on#40
spatial_resolution: 10.0
temporal_coverage:
- beginning:
    datetime: '2019-01-12T21:32:52Z'
  end:
    datetime: '2020-01-12T21:00:00Z'
  end_date: '2020-01-12'
  start_date: '2019-01-12'
temporal_resolution: P2Y6M5DT12H35M30S
theme:
- description:
  - The DCAT-AP mandated theme category for science and technology related fields.
  identifier: http://publications.europa.eu/resource/authority/data-theme/TECH
  other_identifier:
  - description:
    - The theme ID from the Dataset Theme Vocabulary as mandated by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/data-theme/TECH
    title:
    - DCAT-AP mandated theme ID
  preferred_label:
  - TECH
  title:
  - Science and technology
title:
- Comprehensive Example Dataset for DCAT-AP-PLUS Validation
- "Vollst\xE4ndiges Beispieldatenset zur DCAT-AP-PLUS Validierung"
type:
- identifier: http://publications.europa.eu/resource/authority/dataset-type/TEST_DATA
  other_identifier:
  - description:
    - The type ID from the Dataset-type authority table as mandated by the DCAT-AP
      specs.
    notation: http://publications.europa.eu/resource/authority/dataset-type/TEST_DATA
    title:
    - DCAT-AP mandated type ID
  preferred_label:
  - TEST_DATA
version: v2
version_notes:
- This is the second version of the comprehensive-example-001 dataset.
was_generated_by:
- id: https://example.org/activity/data-generation-002

```
## DatasetSeries-complete
### Input
```yaml
applicable_legislation:
- description:
  - EU Directive on ambient air quality.
  identifier: https://eur-lex.europa.eu/eli/dir/2008/50/oj
  title:
  - Ambient Air Quality Directive
contact_point:
- formatted_name:
  - Air Quality Data Manager
  has_email:
  - airquality@example.org
  has_telephone:
  - +49-9876-54321
description:
- A series of datasets containing annual air quality measurements from 2020 to present.
- "Eine Reihe von Datens\xE4tzen mit j\xE4hrlichen Luftqualit\xE4tsmessungen von 2020\
  \ bis heute."
frequency:
  description:
  - The frequency with which this DatasetSeries is being updated.
  identifier: http://publications.europa.eu/resource/authority/frequency/ANNUAL
  other_identifier:
  - description:
    - This identifier from the http://publications.europa.eu/resource/authority/frequency
      vocabulary should be used according to the DCAT-AP specs to indicate an annual
      update frequency of a dataset.
    notation: http://publications.europa.eu/resource/authority/frequency/ANNUAL
    title:
    - DCAT-AP mandated identifier
  title:
  - Update Frequency
geographical_coverage:
- description:
  - Coverage limited to Germany.
  identifier: http://publications.europa.eu/resource/authority/country/DEU
  title:
  - Germany
id: https://example.org/dataset/air-quality-series-001
modification_date: '2026-06-15'
publisher:
  identifier: http://publications.europa.eu/resource/authority/corporate-body/UBA_DE
  name:
  - Federal Environment Agency
  type:
    identifier: http://purl.org/adms/publishertype/GovernmentAgency
    preferred_label:
    - Government Agency
release_date: '2020-01-15'
temporal_coverage:
- beginning:
    datetime: '2019-01-12T21:32:52Z'
  end:
    datetime: '2020-01-12T21:00:00Z'
  end_date: '2020-01-12'
  start_date: '2019-01-12'
title:
- Annual Air Quality Measurements Series
- "Jahresreihe der Luftqualit\xE4tsmessungen"

```
## Distribution-complete
### Input
```yaml
access_URL:
- description:
  - Direct access URL for the CSV distribution.
  id: https://example.org/data/dist-001.csv
  identifier: https://example.org/data/dist-001.csv
  other_identifier:
  - notation: https://example.org/data/dist-001.csv
    title:
    - canonical access URL
  title:
  - CSV Access Point
- description:
  - Direct access URL for the CSV distribution on the mirror server.
  id: https://mirror.example.org/data/dist-001.csv
  identifier: https://mirror.example.org/data/dist-001.csv
  other_identifier:
  - notation: https://mirror.example.org/data/dist-001.csv
    title:
    - Mirror access URL
  title:
  - CSV Access Point Mirror
access_service:
- description:
  - The service providing access to this distribution.
  endpoint_URL:
  - id: https://api.example.org/sparql
    title:
    - SPARQL Endpoint
  id: https://example.org/
  title:
  - Example Data Service
applicable_legislation:
- description:
  - EU regulation on data protection and privacy.
  identifier: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  other_identifier:
  - notation: https://eur-lex.europa.eu/eli/reg/2016/679/oj/eng
  - notation: https://gdpr-info.eu/
  title:
  - General Data Protection Regulation (GDPR)
- description:
  - 'You are free to: ... '
  identifier: https://creativecommons.org/licenses/by/4.0
  other_identifier:
  - description:
    - The id to be used to explicitly refer to the RDF representation of the CC-BY
      4.0 licence.
    notation: https://creativecommons.org/licenses/by/4.0/rdf
    title:
    - RDF ID
  - description:
    - The canonical idenfier used for the CC-BY 4.0 license
    notation: https://creativecommons.org/licenses/by/4.0/
    title:
    - CC-BY 4.0 id
  title:
  - Attribution 4.0 International
  - CC-BY 4.0
availability:
  identifier: http://publications.europa.eu/resource/authority/planned-availability/STABLE
  other_identifier:
  - description:
    - The Availability ID from the Distribution availability vocabulary as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/planned-availability/STABLE
    title:
    - DCAT-AP Availability ID
  preferred_label:
  - STABLE
byte_size: 1048576
checksum:
  algorithm:
    description:
    - Secure Hash Algorithm 1
    identifier: http://spdx.org/rdf/terms#checksumAlgorithm_sha1
    other_identifier:
    - description:
      - "The ChecksumAlgorithm ID from the SPDX\xAE language as mandated by the DCAT-AP\
        \ specs."
      notation: http://spdx.org/rdf/terms#checksumAlgorithm_sha1
      title:
      - DCAT-AP mandated ChecksumAlgorithm ID
    title:
    - SHA1
  checksum_value: da39a3ee5e6b4b0d3255bfef95601890afd80709
compression_format:
  description:
  - GNU Zip compression format
  identifier: http://www.iana.org/assignments/media-types/application/gzip
  other_identifier:
  - description:
    - The MediaType ID from the IANA Media Types as mandated by the DCAT-AP specs.
    notation: http://www.iana.org/assignments/media-types/application/gzip
    title:
    - DCAT-AP mandated MediaType ID
  title:
  - Gzip
description:
- This distribution contains the full dataset in CSV format, compressed via Gzip.
- "Diese Distribution enth\xE4lt den vollst\xE4ndigen Datensatz im CSV-Format, komprimiert\
  \ mit Gzip."
documentation:
- description:
  - Technical documentation for the CSV structure.
  identifier: https://example.org/docs/dist-001-readme.txt
  other_identifier:
  - notation: https://example.org/docs/dist-001-readme.txt
  title:
  - Readme for Distribution 001
download_URL:
- id: https://example.org/download/dist-001.csv.gz
  title:
  - Direct Download Link
- id: https://mirror.example.org/download/dist-001.csv.gz
  title:
  - Direct Download Mirror Link
format:
  description:
  - Comma Separated Values
  identifier: http://publications.europa.eu/resource/authority/file-type/CSV
  other_identifier:
  - description:
    - The MediaTypeOrExtent ID from the EU Vocabularies File Type Named Authority
      List as mandated by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/file-type/CSV
    title:
    - DCAT-AP mandated MediaTypeOrExtent ID
  title:
  - CSV
has_policy:
  description:
  - Policy governing the reuse of this distribution.
  identifier: https://example.org/policy/open-data-policy-01
  other_identifier:
  - notation: https://example.org/policy/open-data-policy-01
  title:
  - Open Data Policy v1
id: https://example.org/data/dist-001
language:
- description:
  - The english language.
  identifier: http://publications.europa.eu/resource/authority/language/ENG
  other_identifier:
  - description:
    - The LinguisticSystem ID from the EU Vocabularies Languages Named Authority List
      as mandated by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/language/ENG
    title:
    - DCAT-AP mandated LinguisticSystem ID
  title:
  - English
licence:
  description:
  - Creative Commons Attribution 4.0 International
  identifier: http://creativecommons.org/licenses/by/4.0/
  other_identifier:
  - notation: http://creativecommons.org/licenses/by/4.0/
  title:
  - CC BY 4.0
linked_schemas:
- description:
  - CSV on the Web W3C Recommendation
  identifier: http://www.w3.org/ns/csvw
  other_identifier:
  - notation: https://www.w3.org/ns/csvw
  title:
  - CSVW
media_type:
  description:
  - IANA media type for CSV
  identifier: http://www.iana.org/assignments/media-types/text/csv
  other_identifier:
  - description:
    - The MediaType ID from the IANA Media Types as mandated by the DCAT-AP specs.
    notation: http://www.iana.org/assignments/media-types/text/csv
    title:
    - DCAT-AP mandated MediaType ID
  title:
  - text/csv
modification_date: '2026-06-18'
packaging_format:
  description:
  - GNU Zip compression format
  identifier: http://www.iana.org/assignments/media-types/application/gzip
  other_identifier:
  - description:
    - The MediaType ID from the IANA Media Types as mandated by the DCAT-AP specs.
    notation: http://www.iana.org/assignments/media-types/application/gzip
    title:
    - DCAT-AP mandated MediaType ID
  title:
  - Gzip
release_date: '2026-06-15'
rights:
  description:
  - This dataset is public.
  identifier: http://publications.europa.eu/resource/authority/access-right/PUBLIC
  other_identifier:
  - description:
    - The RightsStatement ID from the Access Rights Named Authority List as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/access-right/PUBLIC
    title:
    - DCAT-AP mandated RightsStatement ID
  title:
  - The RightsStatement for this dataset
spatial_resolution: 0.5
status:
  description:
  - The distribution is complete and stable.
  identifier: http://publications.europa.eu/resource/authority/distribution-status/COMPLETED
  other_identifier:
  - description:
    - The status code ID from the EU Vocabularies Distribution Status as mandated
      by the DCAT-AP specs.
    notation: http://publications.europa.eu/resource/authority/distribution-status/COMPLETED
    title:
    - DCAT-AP mandated status code ID
  preferred_label:
  - COMPLETED
temporal_resolution: P1D
title:
- Comprehensive Example Distribution 001
- Umfassende Beispiel-Distribution 001

```
