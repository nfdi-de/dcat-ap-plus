"""Data test."""
import os
import glob
import pytest
from pathlib import Path

from bioregistry.validate.utils import validate_linkml, format_messages
from dcat_ap_plus.datamodel import dcat_ap_plus
from linkml_runtime.loaders import yaml_loader

HERE = Path(__file__).parent.resolve()
ROOT = HERE.parent.resolve()
SCHEMA_DIRECTORY = ROOT.joinpath("src", "dcat_ap_plus", "schema")

DATA_DIR_VALID = Path(__file__).parent / "data" / "valid"
DATA_DIR_INVALID = Path(__file__).parent / "data" / "invalid"

VALID_EXAMPLE_FILES = glob.glob(os.path.join(DATA_DIR_VALID, '*.yaml'))
INVALID_EXAMPLE_FILES = glob.glob(os.path.join(DATA_DIR_INVALID, '*.yaml'))


@pytest.mark.parametrize("filepath", VALID_EXAMPLE_FILES)
def test_valid_data_files(filepath):
    """Test loading of all valid data files."""
    target_class_name = Path(filepath).stem.split("-")[0]
    tgt_class = getattr(
        dcat_ap_plus,
        target_class_name,
    )
    obj = yaml_loader.load(filepath, target_class=tgt_class)
    assert obj


def test_dcat_ap_linkml_prefixes() -> None:
    """Test that prefixes used in the definition are semantic farm-valid."""
    messages = validate_linkml(SCHEMA_DIRECTORY.joinpath("dcat_ap_linkml.yaml"))
    assert len(messages) == 0, format_messages(messages)


def test_dcat_ap_plus_prefixes() -> None:
    """Test that prefixes used in the definition are semantic farm-valid."""
    messages = validate_linkml(SCHEMA_DIRECTORY.joinpath("dcat_ap_plus.yaml.yaml"))
    assert len(messages) == 0, format_messages(messages)
