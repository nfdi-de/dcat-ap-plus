package None;

import java.util.List;
import lombok.*;






/**
  An Entity that is being evaluated in a DataGeneratingActivity.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EvaluatedEntity extends Entity {

  private List<Activity> wasGeneratedBy;

}