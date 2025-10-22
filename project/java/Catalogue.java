package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Catalogue](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Catalogue)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Catalogue  {

  private List<LegalResource> applicableLegislation;
  private List<Catalogue> catalogue;
  private Agent creator;
  private List<String> description;
  private List<Location> geographicalCoverage;
  private List<Dataset> hasDataset;
  private List<Catalogue> hasPart;
  private Document homepage;
  private List<LinguisticSystem> language;
  private LicenseDocument licence;
  private LocalDate modificationDate;
  private Agent publisher;
  private List<CatalogueRecord> record;
  private LocalDate releaseDate;
  private RightsStatement rights;
  private List<DataService> service;
  private List<PeriodOfTime> temporalCoverage;
  private List<ConceptScheme> themes;
  private List<String> title;

}