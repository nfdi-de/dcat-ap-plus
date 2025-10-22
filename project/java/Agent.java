package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Agent](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Agent)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Agent  {

  private List<String> name;
  private Concept type;

}