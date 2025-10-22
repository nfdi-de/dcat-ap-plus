package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Location](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Location)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Location  {

  private String bbox;
  private String centroid;
  private Geometry geometry;

}