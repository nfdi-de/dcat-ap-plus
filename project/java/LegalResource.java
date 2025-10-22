package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:LegalResource](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#LegalResource)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LegalResource extends SupportiveEntity {

  private String id;

}