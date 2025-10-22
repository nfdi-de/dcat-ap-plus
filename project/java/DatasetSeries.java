package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:DatasetSeries](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DatasetSeries)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DatasetSeries  {

  private List<LegalResource> applicableLegislation;
  private List<Kind> contactPoint;
  private List<String> description;
  private Frequency frequency;
  private List<Location> geographicalCoverage;
  private LocalDate modificationDate;
  private Agent publisher;
  private LocalDate releaseDate;
  private List<PeriodOfTime> temporalCoverage;
  private List<String> title;

}