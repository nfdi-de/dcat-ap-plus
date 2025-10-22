package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Relationship](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Relationship)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Relationship  {

  private List<Role> hadRole;
  private List<Resource> relation;

}