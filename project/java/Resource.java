package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Resource](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Resource)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Resource extends SupportiveEntity {

  private String id;

}