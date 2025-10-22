package None;

import java.util.List;
import lombok.*;






/**
  See [DCAT-AP specs:Distribution](https://semiceu.github.io/DCAT-AP/releases/3.0.0/#Distribution)
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Distribution  {

  private List<Resource> accessURL;
  private List<DataService> accessService;
  private List<LegalResource> applicableLegislation;
  private Concept availability;
  private String byteSize;
  private Checksum checksum;
  private MediaType compressionFormat;
  private List<String> description;
  private List<Document> documentation;
  private List<Resource> downloadURL;
  private MediaTypeOrExtent format;
  private Policy hasPolicy;
  private List<LinguisticSystem> language;
  private LicenseDocument licence;
  private List<Standard> linkedSchemas;
  private MediaType mediaType;
  private LocalDate modificationDate;
  private MediaType packagingFormat;
  private LocalDate releaseDate;
  private RightsStatement rights;
  private BigDecimal spatialResolution;
  private Concept status;
  private String temporalResolution;
  private List<String> title;

}