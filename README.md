[![DOI](https://zenodo.org/badge/1080296103.svg)](https://doi.org/10.5281/zenodo.17702369)
[![PyPI - Version](https://img.shields.io/pypi/v/dcat-ap-plus)](https://pypi.org/project/dcat-ap-plus)
[![Build and test](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml/badge.svg)](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml)
[![Copier Badge](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/copier-org/copier/master/img/badge/badge-grayscale-inverted-border-teal.json)](https://github.com/linkml/linkml-project-copier)

# DCAT Application Profile for Providing Links to Use-case Specific Context (DCAT-AP+)

The LinkML schema provided in this repository is an extension of the [DCAT Application Profile](https://semiceu.github.io/DCAT-AP/releases/3.0.0/), which allows to provide additional metadata for a `dcat:Dataset` in a very generic manner, such as:
* which kind(s) of entity(s) or activity(s) were evaluated,
* which kind of activity generated the `dcat:Dataset`,
* which kind of instruments were used in the dataset generating activity,
* in which surrounding (e.g. a laboratory) and according to which plan the dataset generating activity took place,
* as well as which kind(s) of qualitative and quantitative characteristic(s) were attributed to the evaluated entity or evaluated activity and to the used instruments.

This extension is mainly based on the [Starting Point Terms of the Provenance Ontology (PROV-O)](https://www.w3.org/TR/prov-o/#description-starting-point-terms),
in that it makes the `prov:wasGeneratedBy` property of the `Dataset` class mandatory and specifies necessary properties for its expected range, the `prov:Activity` class.

The choice to use LinkML for extending DCAT-AP was based on the need to have different layers that cater to different domain-specific use cases. DCAT-AP+ serves as the basic layer for such extensions and is thus kept very generic. Being the basis of the [ChemDCAT-AP](
nfdi-de.github.io/chem-dcat-ap), one can see how it can be applied to further extend its classes for domain-specific needs.

DCAT-AP+ is developed within close collaboration between [NFDI4Chem](https://nfdi4chem.de) & [NFDI4Cat](https://nfdi4cat.org/) and is intended to be further improved, extended and adapted by the whole NFDI community.

A more elaborate documentation is provided here: [https://nfdi-de.github.io/dcat-ap-plus](https://nfdi-de.github.io/dcat-ap-plus/latest/about/).

## DCAT-AP to LinkML: Automatic Translation and Extension

The JSON-LD serialization of the official DCAT-AP 3.0.0 SHACL shapes ([dcat_ap_shacl.jsonld](src/dcat_ap_shacl.jsonld)) were downloaded from the DCAT-AP GitHub repository [3.0.0 release folder within the master branch](https://github.com/SEMICeu/DCAT-AP/tree/master/releases/3.0.0/shacl). The downloaded SHACL shapes were then processed by the [dcat_ap_shacl_2_linkml.py](src/dcat_ap_shacl_2_linkml.py) script to generate two LinkML schemas from it:

  * [dcat_ap_linkml.yaml](src/dcat_ap_plus/schema/dcat_ap_linkml.yaml) - an almost 1:1 translation of the DCAT-AP SHACL shapes to LinkML.
  * [dcat_ap_plus.yaml](src/dcat_ap_plus/schema/dcat_ap_plus.yaml) - the LinkML representation of DCAT-AP to which we added the additional constraints, classes and properties we need for our DCAT-AP+ extension.

## Repository Structure

* [docs/](docs/) - mkdocs-managed documentation
  * [elements/](docs/elements/) - generated schema documentation
* [examples/](examples/) - Examples of using the schema
* [project/](project/) - project files (these files are auto-generated, do not edit)
* [src/](src/) - source files (edit these)
  * [dcat_ap_plus](src/dcat_ap_plus)
    * [schema/](src/dcat_ap_plus/schema) -- LinkML schema
      (edit this)
    * [datamodel/](src/dcat_ap_plus/datamodel) -- generated
      Python datamodel
* [tests/](tests/) - Python tests
  * [data/](tests/data) - Example data

## Developer Documentation

See also the documentation of the template: https://github.com/linkml/linkml-project-copier?tab=readme-ov-file#prerequisites

* uv

    uv is a tool to manage Python projects and for managing isolated Python-based applications. You will use it in your generated project to manage dependencies and build distribution files. Install uv by following their [instructions](https://docs.astral.sh/uv/getting-started/installation/).

    Note: Environments with private PyPi repository may need extra configuration (example):

      export UV_DEFAULT_INDEX=https://nexus.example.com/repository/pypi-all/simple
*

    Copier

    Copier is a tool for generating projects based on a template (like this one!). It also allows re-configuring the projects and to keep them updated when the original template changes. To insert dates into the template, copier requires [jinja2_time](https://github.com/hackebrot/jinja2-time) in the copier environment. Install both with uv by running:

      uv tool install --with jinja2-time copier

* just

  The project contains a justfile with pre-defined complex commands. To execute these commands you need [just](https://github.com/casey/just) as command runner. Install it by running:

      uv tool install rust-just

  To generate project artefacts run:
          `just gen-project`: generates all other representations
          `just deploy`: deploys site
          `just testdoc`: locally builds docs and runs test server

### Regenerate schema files from DCAT-AP SHACL shapes

To regenerate the DCAT-AP LinkML representation as well as the PLUS extension run:

    uv run python src/dcat_ap_shacl_2_linkml.py

### Test data validation and conversion

Validate and test all: `just test`

Validate a single example dataset using LinkML's validator framework:

* Validate DCAT-AP-PLUS extension conform example
    ````commandline
    uv run linkml validate tests/data/valid/AnalysisDataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -C AnalysisDataset
    ````
* Validate DCAT-AP-PLUS extension conform example
    ````commandline
    uv run linkml validate tests/data/valid/Dataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -C Dataset
    ````

To convert the test datasets of each DCAT-AP profile into a TTL graph run:
  * Convert domain agnostic DCAT-AP extension conform example of an analysis
    ````commandline
    uv run linkml-convert -t ttl tests/data/valid/AnalysisDataset-001.yaml -s src/dcat_ap_plus/schema/dcat_ap_plus.yaml -P "_base=https://search.nfdi4chem.de/dataset/" -C AnalysisDataset
    ````
  * Convert a NMR spectroscopy-specific DCAT-AP extension conform example
    ````commandline
    uv run linkml-convert -t ttl tests/data/valid/Dataset-001.yaml -s ssrc/dcat_ap_plus/schema/dcat_ap_plus.yaml -P "_base=https://search.nfdi4chem.de/dataset/" -C Dataset
    ````

### Build GitHub pages docs locally

    uv run mkdocs serve

    rm -rf docs/elements/*.md && uv run gen-doc -d docs/elements src/dcat_ap_plus/schema/dcat_ap_plus.yaml

## Funding

This work was funded by the German Research Foundation (DFG) through the projects:
* "[NFDI4Cat](https://nfdi4cat.org/) - NFDI for Catalysis-Related Sciences" (DFG project no. [441926934](https://gepris.dfg.de/gepris/projekt/441926934)) and
* "[NFDI4Chem](https://nfdi4chem.de) - NFDI for Chemistry" (DFG project no. [441958208](https://gepris.dfg.de/gepris/projekt/441958208))"

within the National Research Data Infrastructure (NFDI) programme of the Joint Science Conference (GWK).

## Credits

This project uses the template [linkml-project-copier](https://github.com/linkml/linkml-project-copier).
