# dcat_ap_plus

Extension of the DCAT Application Profile (DCAT-AP) that adds links to use-case specific context. It enables describing:

- which entities or activities were evaluated (the dataset is about),
- which activity generated the dataset, including instruments, environment (e.g., lab), and plan,
- which qualitative and quantitative characteristics were attributed to evaluated entities/activities and used instruments.

This package ships the LinkML-generated Python datamodel for the schema.
Two versions of the datamodel are provided: one using Python dataclasses and another using Pydantic.

## Installation

```powershell
pip install dcat_ap_plus
```

Requires Python >= 3.9, < 4.0.

## Quick start

```python
import dcat_ap_plus
print(dcat_ap_plus.__version__)

# Work with the generated datamodel (Python dataclasses)
from dcat_ap_plus.datamodel.dcat_ap_plus import Dataset, DataGeneratingActivity

ds = Dataset(
    id="ex:dataset1",
    title="Example dataset",
    description="A minimal dataset for quickstart.",
    was_generated_by=[DataGeneratingActivity(id="ex:act1")],
)
print(ds)
```

## Documentation

- Project docs and schema reference: <https://nfdi-de.github.io/dcat-ap-plus>
- Source code: <https://github.com/dalito/dcat-ap-plus>

## License

MIT License. See the bundled `LICENSE` file for details.
