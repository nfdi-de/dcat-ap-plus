package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Activity](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Activity)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Activity  {

  private String id;
  private List<String> title;
  private List<String> description;
  private List<Identifier> otherIdentifier;
  private List<Activity> hasPart;
  private List<Entity> hadInputEntity;
  private List<Entity> hadOutputEntity;
  private List<Activity> hadInputActivity;
  private List<AgenticEntity> carriedOutBy;
  private List<QualitativeAttribute> hasQualitativeAttribute;
  private List<QuantitativeAttribute> hasQuantitativeAttribute;
  private List<Activity> partOf;
  private DefinedTerm type;
  private DefinedTerm rdfType;

}