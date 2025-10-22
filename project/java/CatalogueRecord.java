package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:CatalogueRecord](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#CatalogueRecord)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CatalogueRecord  {

  private List<Standard> applicationProfile;
  private Concept changeType;
  private List<String> description;
  private List<LinguisticSystem> language;
  private LocalDate listingDate;
  private LocalDate modificationDate;
  private Any primaryTopic;
  private CatalogueRecord sourceMetadata;
  private List<String> title;

}