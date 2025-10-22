package None;

import java.util.List;
import lombok.*;






/**
  A word, name, acronym or phrase that is defined in a controlled vocabulary (CV) and that is used to provide an additional rdf:type or dcterms:type of a class within this schema.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DefinedTerm  {

  private String id;
  private String title;
  private String fromCV;

}