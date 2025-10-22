package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Concept](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Concept)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Concept extends SupportiveEntity {

  private List<String> preferredLabel;

}