package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:PeriodOfTime](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#PeriodOfTime)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PeriodOfTime extends SupportiveEntity {

  private TimeInstant beginning;
  private TimeInstant end;
  private LocalDate endDate;
  private LocalDate startDate;

}