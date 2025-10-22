package None;

import java.util.List;
import lombok.*;






/**
  An entity that is somehow responsible for an Activity to take place.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AgenticEntity  {

  private String id;
  private String title;
  private String description;
  private List<Identifier> otherIdentifier;
  private List<QualitativeAttribute> hasQualitativeAttribute;
  private List<QuantitativeAttribute> hasQuantitativeAttribute;
  private List<AgenticEntity> hasPart;
  private List<AgenticEntity> partOf;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}