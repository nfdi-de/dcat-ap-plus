# DCAT-AP Plus Links to Use-case Specific Context (DCAT-AP+)

DCAT-AP+ is a [LinkML](https://linkml.io/)-based extension of the [DCAT Application Profile 3.0](https://semiceu.github.io/DCAT-AP/releases/3.0.0/) that adds a **provenance layer** for describing *how* a dataset was generated and *what* it is about, using the [Starting Point Terms of PROV-O](https://www.w3.org/TR/prov-o/#description-starting-point-terms), the [QUDT ontology](https://www.qudt.org/), and [Dublin Core Terms](http://purl.org/dc/terms/).

DCAT-AP+ is **domain-agnostic**. It provides a generic set of classes and properties that any domain can import and specialize into its own application profile. [ChemDCAT-AP](https://github.com/nfdi-de/chem-dcat-ap) is the first such domain profile, built for chemistry and catalysis research data.

## Quick start: What does DCAT-AP+ add?

In plain DCAT-AP, a `Dataset` can link to a `prov:Activity` via `prov:wasGeneratedBy`, but that DCAT-AP's `Activity` has no specified properties → it is currently a dead end. You are left with `dcterms:description` (free text), `dcat:keyword` (free text), and `dcat:theme` (a very generic controlled vocabulary) to say what a dataset is actually about.

DCAT-AP+ turns that dead end into a structured provenance graph:

```yaml
# A dataset about an NMR measurement of a chemical sample
id: ex:dataset-001
title: "13C NMR spectrum of aspirin"
description: "13C NMR spectral data for acetylsalicylic acid in CDCl3"
was_generated_by:
  - id: ex:measurement-001
    # an instance of the 13C NMR class from the Chemical Methods Ontology
    rdf_type:  
      id: CHMO:0000595  
      title: "carbon-13 nuclear magnetic resonance spectroscopy"
    evaluated_entity:
      - id: ex:sample-001
        # an instance of "material sample" class from the Ontology for Biomedical Investigations
        rdf_type:
          id: OBI:0000747  
          title: "material sample"
        has_quantitative_attribute:
          - value: 298.0
            has_quantity_type:
              id: qudt:Temperature
            unit:
              id: qudt:K
    carried_out_by:
      - id: ex:spectrometer-001
        # an instance of "JEOL ECX NMR spectrometer" class from OBI
        rdf_type:
          id: OBI:0000625
          title: "JEOL ECX NMR spectrometer"
```

This is valid DCAT-AP+ instance data. Every class and property is mapped to an established ontology term and instance data can be validated and converted to RDF using the LinkML tooling. The schema itself ([dcat_ap_plus.yaml](schema/dcat_ap_plus.yaml)) serves as the single source of truth from which SHACL shapes, JSON Schema, Python/Pydantic data classes, and an HTML schema reference documentation are generated, which means all are guaranteed to be coherent.

## Documentation

* [**Design Patterns & Decisions**](design-patterns/) — The reasoning behind DCAT-AP+ and how its patterns work
* [**Extension Rules**](how-to-extend.md) — Rules for how to extend DCAT-AP+ in domain-specific profiles
* [**Automatic Generation**](automatic-generation/) — How the DCAT-AP LinkML schema is built from the official DCAT-AP SHACL shapes
* [**Schema Reference Documentation**](elements/overview/) — Auto-generated reference for all classes and slots
* [**Versioning**](versioning/) — Versioning rationale
* [**Projects using DCAT-AP+**](dcat-ap-plus-users/) — Known adopters and domain profiles

## Source code

The LinkML schema, build scripts, and documentation source are on GitHub: [nfdi-de/dcat-ap-plus](https://github.com/nfdi-de/dcat-ap-plus)
