package None;

import java.util.List;
import lombok.*;






/**
  A piece of information that is attributed to an Entity, Activity or AgenticEntity.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class QualitativeAttribute  {

  private String title;
  private String description;
  private String value;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}