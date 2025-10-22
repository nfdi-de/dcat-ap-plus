package None;

import java.util.List;
import lombok.*;






/**
  A quantifiable piece of information that is attributed to an Entity, Activity or AgenticEntity.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class QuantitativeAttribute  {

  private String title;
  private String description;
  private float value;
  private DefinedTerm hasQuantityType;
  private DefinedTerm unit;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}