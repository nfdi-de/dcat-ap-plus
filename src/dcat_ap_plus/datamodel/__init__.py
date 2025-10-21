from pathlib import Path
from .dcat_ap_plus import *

THIS_PATH = Path(__file__).parent

SCHEMA_DIRECTORY = THIS_PATH.parent / "schema"
MAIN_SCHEMA_PATH = SCHEMA_DIRECTORY / "dcat_ap_plus.yaml"
