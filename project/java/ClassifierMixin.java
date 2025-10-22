package None;

import java.util.List;
import lombok.*;






/**
  A mixin with which an entity of this schema can be classified via an additional rdf:type or dcterms:type assertion.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public abstract class ClassifierMixin  {

  private DefinedTerm type;
  private DefinedTerm rdfType;

}