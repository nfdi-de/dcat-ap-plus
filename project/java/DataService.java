package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:DataService](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#DataService)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DataService  {

  private RightsStatement accessRights;
  private List<LegalResource> applicableLegislation;
  private List<Standard> conformsTo;
  private List<Kind> contactPoint;
  private List<String> description;
  private List<Document> documentation;
  private List<Resource> endpointURL;
  private List<Resource> endpointDescription;
  private List<MediaTypeOrExtent> format;
  private List<String> keyword;
  private List<Document> landingPage;
  private LicenseDocument licence;
  private Agent publisher;
  private List<Dataset> servesDataset;
  private List<Concept> theme;
  private List<String> title;

}