# Merged model

This folder contains the DCAT-AP+ model serialized as:
* LinkML YAML,
* JSON schema,
* JSON-LD (including context)
* and SHACL shapes.

It also contains the prefix map in YAML and [dcat_ap_linkml.yaml](dcat_ap_linkml.yaml),
the direct translation of DCAT-AP into LinkML.

These files are auto-generated from the schema in the `src/dcat_ap_plus/schema` folder and version-stamped by
uv-dynamic-versioning.
For releases, these files are copied to gh-pages along with the rest of the documentation,
making schema files with version information available on gh-pages. The w3id.org redirects link to these files.

A fully resolved version of the DCAT-AP+ model with imported models merged in is located in the
subfolder [merged-yaml](merged-yaml).


Note, that the generated files are git-ignored.
