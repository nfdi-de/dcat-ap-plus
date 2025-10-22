package None;

import java.util.List;
import lombok.*;






/**
  The surrounding in which the dataset creating activity took place (e.g. a lab).
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Surrounding  {

  private String title;
  private String description;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}