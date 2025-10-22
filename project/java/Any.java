package None;

import java.util.List;
import lombok.*;






/**
  This abstract class is needed to create the union of Dataset, DatasetSeries, Catalogue and DataService for the range of the slot [primary_topic](https://nfdi-de.github.io/chem-dcat-ap/elements/primary_topic/).
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Any  {

  private String title;
  private String description;

}