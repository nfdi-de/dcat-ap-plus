package None;

import java.util.List;
import lombok.*;






/**
  The supportive entities are supporting the main entities in the Application Profile. They are included in the Application Profile because they form the range of properties.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SupportiveEntity  {

  private String title;
  private String description;

}