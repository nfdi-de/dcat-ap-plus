package None;

import java.util.List;
import lombok.*;






/**
  A collection of data, published or curated by a single agent, and available for access or download in one or more representations.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Dataset  {

  private RightsStatement accessRights;
  private List<LegalResource> applicableLegislation;
  private List<Standard> conformsTo;
  private List<Kind> contactPoint;
  private List<Agent> creator;
  private List<Distribution> datasetDistribution;
  private List<String> description;
  private List<Document> documentation;
  private Frequency frequency;
  private List<Location> geographicalCoverage;
  private List<Dataset> hasVersion;
  private List<String> identifier;
  private List<DatasetSeries> inSeries;
  private List<Resource> isReferencedBy;
  private List<String> keyword;
  private List<Document> landingPage;
  private List<LinguisticSystem> language;
  private LocalDate modificationDate;
  private List<Identifier> otherIdentifier;
  private List<ProvenanceStatement> provenance;
  private Agent publisher;
  private List<Attribution> qualifiedAttribution;
  private List<Relationship> qualifiedRelation;
  private List<Resource> relatedResource;
  private LocalDate releaseDate;
  private List<Distribution> sample;
  private List<Dataset> source;
  private BigDecimal spatialResolution;
  private List<PeriodOfTime> temporalCoverage;
  private String temporalResolution;
  private List<Concept> theme;
  private List<String> title;
  private List<Concept> type;
  private String version;
  private List<String> versionNotes;
  private List<DataGeneratingActivity> wasGeneratedBy;
  private String id;
  private List<EvaluatedEntity> isAboutEntity;
  private List<EvaluatedActivity> isAboutActivity;

}