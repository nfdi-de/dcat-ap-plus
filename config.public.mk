# config.public.mk

# This file is public in git. No sensitive info allowed.

###### schema definition variables, used by justfile

# Note:
# - just works fine with quoted variables of dot-env files like this one
LINKML_SCHEMA_NAME="dcat_ap_plus"
LINKML_SCHEMA_AUTHOR="Philip Strömert <philip.stroemert@tib.eu>"
LINKML_SCHEMA_DESCRIPTION="This metadata schema is an Extension of the DCAT Application Profile
  for Providing Links to Use-case Specific Context. It allows to provide additional
  metadata regarding: which kind(s) of entity(s) or activity(s) were evaluated (the
  dcat:Dataset is about), which kind of activity generated the dcat:Dataset, which
  kind of instruments were used in the dataset generating activity, in which surrounding
  (e.g. a laboratory) and according to which plan the dataset generating activity
  took place, as well as regarding which kind(s) of qualitative and quantitative characteristic
  were attributed to the evaluated entity or evaluated activity and to the used instruments."
LINKML_SCHEMA_SOURCE_DIR="src/dcat_ap_plus/schema"

###### linkml generator variables, used by justfile

## gen-project configuration file
LINKML_GENERATORS_CONFIG_YAML=config.yaml

## pass args if gendoc ignores config.yaml (i.e. --no-mergeimports)
LINKML_GENERATORS_DOC_ARGS=

## pass args to workaround genowl rdfs config bug (linkml#1453)
##   (i.e. --no-type-objects --no-metaclasses --metadata-profile rdfs)
LINKML_GENERATORS_OWL_ARGS=

## pass args to trigger experimental java/typescript generation
LINKML_GENERATORS_JAVA_ARGS=
LINKML_GENERATORS_TYPESCRIPT_ARGS=

## pass args to pydantic generator which isn't supported by gen-project
## https://github.com/linkml/linkml/issues/2537
LINKML_GENERATORS_PYDANTIC_ARGS=
