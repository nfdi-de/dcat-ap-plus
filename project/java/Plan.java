package None;

import java.util.List;
import lombok.*;






/**
  A piece of information that specifies how an activity has to be carried out by its agents including what kind of steps have to be taken and what kind of parameters have to be met/set.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Plan  {

  private String title;
  private String description;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}