# dcat_ap_plus

An extension of the [DCAT Application Profile](https://semiceu.github.io/DCAT-AP/releases/3.0.0/), which allows to provide additional metadata for a `dcat:Dataset` in a very generic manner, such as:
* which kind(s) of entity(s) or activity(s) were evaluated,
* which kind of activity generated the `dcat:Dataset`,
* which kind of instruments were used in the dataset generating activity,
* in which surrounding (e.g. a laboratory) and according to which plan the dataset generating activity took place,
* as well as which kind(s) of qualitative and quantitative characteristic(s) were attributed to the evaluated entity or evaluated activity and to the used instruments.

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
- Source code: <https://github.com/nfdi-de/dcat-ap-plus>

## License

MIT License. See the bundled `LICENSE` file for details.
