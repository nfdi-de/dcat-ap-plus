package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:LicenseDocument](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#LicenseDocument)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LicenseDocument extends SupportiveEntity {

  private List<Concept> type;
  private String id;

}