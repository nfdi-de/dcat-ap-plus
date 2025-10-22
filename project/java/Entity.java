package None;

import java.util.List;
import lombok.*;






/**
  A physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Entity  {

  private String title;
  private String description;
  private String id;
  private List<Identifier> otherIdentifier;
  private List<QualitativeAttribute> hasQualitativeAttribute;
  private List<QuantitativeAttribute> hasQuantitativeAttribute;
  private List<Entity> hasPart;
  private List<Entity> partOf;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}