package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Document](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Document)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Document extends SupportiveEntity {

  private String id;

}