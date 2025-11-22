## Add your own just recipes here. This is imported by the main justfile.

# Overriding recipes from the root justfile requires uncommenting the next line
# but will only work after https://github.com/casey/just/issues/2540 is fixed.
#set allow-duplicate-recipes

# An non-existing recipe with the name "_add-artifacts" is called from
# "_gen-docs" in the root justfile.  This provides a way to customize which
# artifacts should be added to the docs/ folder for distribution via gh-pages.

# Add project-specific artifacts to the distribution schema path
_add-artifacts:
  @echo "Adding project-specific artifacts to {{distrib_schema_path}} for deploying to gh-pages"
  for d in "{{distrib_schema_path}}"/*/; do rm -rf "$d"/; done
  for d in "{{dest}}"/*/; do cp -a "$d" "{{distrib_schema_path}}"/; done
  cp {{source_schema_dir}}/*.yaml {{distrib_schema_path}}/
  @mkdir -p {{distrib_schema_path}}/merged-yaml
  uv run gen-yaml {{source_schema_path}} > {{distrib_schema_path}}/merged-yaml/{{schema_name}}.yaml

# Run Python tests and report test coverage
[group('special dcat-ap-plus model')]
coverage:
  uv run python -m coverage run -m pytest
  uv run python -m coverage html
