## AnalysisDataset-001
### Input
```yaml
description:
- Dataset for 13C nuclear magnetic resonance spectroscopy (13C NMR)
id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1
is_about_entity:
- description: The analysed chemical substance sample CRS-50440.
  has_part:
  - description: compound assigned to doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
    has_qualitative_attribute:
    - rdf_type:
        id: CHEMINF:000059
        title: InChiKey
      title: assigned InChiKey
      value: KVOIVNBYNQXCNY-BOCHJOTCSA-N
    - rdf_type:
        id: CHEMINF:000113
        title: InChi
      title: assigned InChi
      value: InChI=1S/C11H12N2S/c1-12-7-10-8-14-11(13-10)9-5-3-2-4-6-9/h2-6,8,12H,7H2,1H3
    - rdf_type:
        id: CHEMINF:000018
        title: SMILES descriptor
      title: assigned SMILES
      value: CNCc1csc(n1)c1ccccc1
    - rdf_type:
        id: CHEMINF:000042
        title: molecular formula
      title: assigned molecular formula
      value: C11H12N2S
    - description: Chemotion IUPAC name
      rdf_type:
        id: CHEMINF:000107
        title: IUPAC name
      value: N-methyl-1-(2-phenyl-1,3-thiazol-4-yl)methanamine
    - description: PubChem IUPAC name
      rdf_type:
        id: CHEMINF:000107
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
    id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2#EvaluatedCompound
    other_identifier:
    - notation: https://pubchem.ncbi.nlm.nih.gov/compound/26248854
    rdf_type:
      id: CHEBI:23367
      title: molecular entity
  id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
  rdf_type:
    id: CHEBI:59999
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
  - id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Spectrum
    was_generated_by:
    - carried_out_by:
      - description: The NMR spectrometer used.
        id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Spectrometer
        rdf_type:
          id: OBI:0000566
          title: NMR instrument
        title: Bruker 400 MHz
      - description: used solvent
        has_part:
        - id: https://pubchem.ncbi.nlm.nih.gov/compound/71583
          rdf_type:
            id: CHEBI:85365
            title: deuterated chloroform
          title: chloroform-D1 (CDCl3)
        id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_Solvent
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR_AcquisitionNucleus
        part_of:
        - description: The atom of the probed nucleus
          id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleusAtom
          rdf_type:
            id: CHEBI:36928
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
          id: CHEBI:85365
          title: deuterated chloroform
        title: Chloroform-D
      evaluated_entity:
      - id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
        title: CRS-50440
      has_qualitative_attribute:
      - rdf_type:
          id: NMR:1400037
          title: NMR pulse sequence
        title: Puls programme
        value: zgpg30
      has_quantitative_attribute:
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Temperature
        rdf_type:
          id: NMR:1400262
          title: sample temperature information
        title: sample temperature setting
        unit: https://qudt.org/vocab/unit/K
        value: 300.0
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Count
        rdf_type:
          id: NMR:1400087
          title: number of scans
        title: Number of scans
        unit: http://qudt.org/vocab/unit/NUM
        value: 1024
      id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#CDCl3_13C_NMR
      rdf_type:
        id: CHMO:0000595
        title: 13C nuclear magnetic resonance spectroscopy
      title:
      - CDCl3_13C_NMR
  - id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Spectrum
    was_generated_by:
    - carried_out_by:
      - description: used spectrometer
        id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Spectrometer
        rdf_type:
          id: OBI:0000566
          title: NMR instrument
        title: Bruker 400 MHz
      - description: used solvent
        has_part:
        - id: https://pubchem.ncbi.nlm.nih.gov/compound/679
          rdf_type:
            id: CHEBI:28262
            title: dimethyl sulfoxide
          title: DMSO
        id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_Solvent
      - id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleus
        part_of:
        - description: The atom of the probed nucleus
          id: https://doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR_AcquisitionNucleusAtom
          rdf_type:
            id: CHEBI:36928
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
          id: CHEBI:28262
          title: dimethyl sulfoxide
        title: DMSO
      evaluated_entity:
      - id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N.2
        title: CRS-50440
      has_qualitative_attribute:
      - rdf_type:
          id: NMR:1400037
          title: NMR pulse sequence
        title: Puls programme
        value: zgpg30
      has_quantitative_attribute:
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Temperature
        rdf_type:
          id: NMR:1400262
          title: sample temperature information
        title: sample temperature setting
        unit: https://qudt.org/vocab/unit/K
        value: 300.0
      - has_quantity_type: http://qudt.org/vocab/quantitykind/Count
        rdf_type:
          id: NMR:1400087
          title: number of scans
        title: Number of scans
        unit: http://qudt.org/vocab/unit/NUM
        value: 1024
      id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DMSO_13C_NMR
      rdf_type:
        id: CHMO:0000595
        title: 13C nuclear magnetic resonance spectroscopy
      title:
      - DMSO_13C_NMR
  id: doi:10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#NMRSpectralAnalysis
  rdf_type:
    id: NMR:1400042
    title: NMR data processing

```
## Dataset-001
### Input
```yaml
description:
- Dataset for 13C nuclear magnetic resonance spectroscopy (13C NMR)
id: https://dx.doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1
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
  id: https://dx.doi.org/10.14272/UGRXAOUDHZOHPF-UHFFFAOYSA-N/CHMO0000595.1#DataGeneratingActivity

```
## Person-002
### Input
```yaml
age_in_years: 22
id: '002'
name: fuu bor
primary_email: invalid-email-address

```
