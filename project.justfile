## Add your own just recipes here. This is imported by the main justfile.

# We want to be able to override recipes from the root justfile.
set allow-duplicate-recipes

# Override merged yaml schema generation to also copy artifacts
_gen-yaml: _copy_artifacts
  uv run gen-yaml {{source_schema_path}} > {{merged_schema_path}}

# Copy files from project into docs from where they are published to gh-pages
_copy_artifacts:
  # sync subfolders in {{dest}}/* to docs folder "docs/schema/*"
  # remove previous contents and copy source tree exactly (no rsync available)
  rm -rf docs/schema
  mkdir -p docs/schema
  cp -a {{dest}}/. docs/schema/

# Run Python tests and report test coverage
[group('special dcat-ap-plus model')]
coverage:
  uv run python -m coverage run -m pytest
  uv run python -m coverage html
