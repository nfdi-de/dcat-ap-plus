[![DOI](https://zenodo.org/badge/1080296103.svg)](https://doi.org/10.5281/zenodo.17702369)
[![PyPI - Version](https://img.shields.io/pypi/v/dcat-ap-plus)](https://pypi.org/project/dcat-ap-plus)
[![Build and test](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml/badge.svg)](https://github.com/nfdi-de/dcat-ap-plus/actions/workflows/main.yaml)
[![Copier Badge](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/copier-org/copier/master/img/badge/badge-grayscale-inverted-border-teal.json)](https://github.com/linkml/linkml-project-copier) 

# dcat-ap-plus

This metadata schema is an Extension of the DCAT Application Profile for Providing Links to Use-case Specific Context. It allows to provide additional metadata regarding: which kind(s) of entity(s) or activity(s) were evaluated (the dcat:Dataset is about), which kind of activity generated the dcat:Dataset, which kind of instruments were used in the dataset generating activity, in which surrounding (e.g. a laboratory) and according to which plan the dataset generating activity took place, as well as regarding which kind(s) of qualitative and quantitative characteristic were attributed to the evaluated entity or evaluated activity and to the used instruments.

## Documentation Website

[https://nfdi-de.github.io/dcat-ap-plus](https://nfdi-de.github.io/dcat-ap-plus)

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

## Developer Tools

There are several pre-defined command-recipes available.
They are written for the command runner [just](https://github.com/casey/just/). To list all pre-defined commands, run `just` or `just --list`.

## Credits

This project uses the template [linkml-project-copier](https://github.com/linkml/linkml-project-copier).
