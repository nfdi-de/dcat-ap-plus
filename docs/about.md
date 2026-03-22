# About DCAT-AP+

## Origin

DCAT-AP+ grew out of the collaborative development of [ChemDCAT-AP](https://nfdi-de.github.io/chem-dcat-ap/), a metadata schema for chemistry and catalysis research data. When [NFDI4Chem](https://nfdi4chem.de) and [NFDI4Cat](https://nfdi4cat.org/) needed to describe *how* their datasets were generated and *what* they were about to allow more fine-grained and semantic searches within their data repositories, they found that [DCAT-AP 3.0](https://semiceu.github.io/DCAT-AP/releases/3.0.0/) provided the right foundation for dataset cataloging but lacked the provenance expressivity required for scientific metadata.

The solution they came up with, a provenance layer built on [PROV-O Starting Point Terms](https://www.w3.org/TR/prov-o/#description-starting-point-terms) with a generic attribute pattern and flexible classification mechanism, turned out to be domain-agnostic. It was therefore extracted into its own repository as **DCAT-AP+**, a reusable building block that any domain can import and specialize.

## Publication

The design, implementation, and evaluation of DCAT-AP+ and ChemDCAT-AP were presented at the [19th International Conference on Metadata and Semantics Research (MTSR 2025)](https://www.mtsr-conf.org/home), Thessaloniki, Greece, 15–19 December 2025. Until the proceedings are published you can cite the preprint: [doi:10.48550/arXiv.2602.01822](https://doi.org/10.48550/arXiv.2602.01822).

## Funding

This work is funded by the German Research Foundation (DFG) as part of the National Research Data Infrastructure (NFDI):

| Project | DFG Grant | Link |
|---|---|---|
| **NFDI4Cat** — NFDI for Catalysis-Related Sciences | [441926934](https://gepris.dfg.de/gepris/projekt/441926934) | [nfdi4cat.org](https://nfdi4cat.org/) |
| **NFDI4Chem** — NFDI for Chemistry | [441958208](https://gepris.dfg.de/gepris/projekt/441958208) | [nfdi4chem.de](https://nfdi4chem.de) |

## License

DCAT-AP+ is released under [CC-BY 4.0](https://creativecommons.org/licenses/by/4.0/). The repository code is licensed under [MIT](https://github.com/nfdi-de/dcat-ap-plus/blob/main/LICENSE).
