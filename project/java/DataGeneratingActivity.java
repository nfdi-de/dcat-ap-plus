package None;

import java.util.List;
import lombok.*;






/**
  An Activity (process) that has the objective to produce information (in form of a dataset) about another Activity or Entity.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DataGeneratingActivity extends Activity {

  private List<EvaluatedEntity> evaluatedEntity;
  private List<EvaluatedActivity> evaluatedActivity;
  private Plan realizedPlan;
  private Surrounding occurredIn;

}