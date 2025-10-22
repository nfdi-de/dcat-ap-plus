package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Checksum](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Checksum)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Checksum  {

  private ChecksumAlgorithm algorithm;
  private String checksumValue;

}