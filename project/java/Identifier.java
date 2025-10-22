package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Identifier](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Identifier)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Identifier extends SupportiveEntity {

  private String notation;

}