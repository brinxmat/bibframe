package ontology;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

/**
 * Responsibility: provides the base ontology.
 */

@SuppressWarnings("constantName")
public final class Bibframe {
    private Bibframe() {}

    private static final String URI = "http://id.loc.gov/ontologies/bibframe/";

    public static String getURI() {
        return URI;
    }

    private static Resource resource(String local) {
        return ResourceFactory.createResource(URI + local);
    }

    private static Property property(String local) {
        return ResourceFactory.createProperty(URI + local);
    }

    public static final Resource Extent = resource("Extent");
    public static final Resource Dissertation = resource("Dissertation");
    public static final Resource VideorecordingNumber = resource("VideorecordingNumber");
    public static final Resource InstanceTitle = resource("InstanceTitle");
    public static final Resource Iswc = resource("Iswc");
    public static final Resource ReductionRatio = resource("ReductionRatio");
    public static final Resource IssueNumber = resource("IssueNumber");
    public static final Resource Manufacture = resource("Manufacture");
    public static final Resource FileSize = resource("FileSize");
    public static final Resource ClassificationUdc = resource("ClassificationUdc");
    public static final Resource Classification = resource("Classification");
    public static final Resource PlayingSpeed = resource("PlayingSpeed");
    public static final Resource Work = resource("Work");
    public static final Resource Lccn = resource("Lccn");
    public static final Resource Layout = resource("Layout");
    public static final Resource Isrc = resource("Isrc");
    public static final Resource Note = resource("Note");
    public static final Resource ShelfMarkLcc = resource("ShelfMarkLcc");
    public static final Resource ClassificationNlm = resource("ClassificationNlm");
    public static final Resource AccessPolicy = resource("AccessPolicy");
    public static final Resource Iso = resource("Iso");
    public static final Resource PlaybackChannels = resource("PlaybackChannels");
    public static final Resource NotatedMovement = resource("NotatedMovement");
    public static final Resource Sublocation = resource("Sublocation");
    public static final Resource Cartography = resource("Cartography");
    public static final Resource Issuance = resource("Issuance");
    public static final Resource ShelfMarkDdc = resource("ShelfMarkDdc");
    public static final Resource CartographicObjectType = resource("CartographicObjectType");
    public static final Resource IntendedAudience = resource("IntendedAudience");
    public static final Resource Item = resource("Item");
    public static final Resource Tactile = resource("Tactile");
    public static final Resource ObjectCount = resource("ObjectCount");
    public static final Resource Enumeration = resource("Enumeration");
    public static final Resource Object = resource("Object");
    public static final Resource AspectRatio = resource("AspectRatio");
    public static final Resource ShelfMarkNlm = resource("ShelfMarkNlm");
    public static final Resource DescriptionAuthentication = resource("DescriptionAuthentication");
    public static final Resource VideoCharacteristic = resource("VideoCharacteristic");
    public static final Resource Manuscript = resource("Manuscript");
    public static final Resource Ansi = resource("Ansi");
    public static final Resource Barcode = resource("Barcode");
    public static final Resource ReportNumber = resource("ReportNumber");
    public static final Resource Production = resource("Production");
    public static final Resource PublisherNumber = resource("PublisherNumber");
    public static final Resource DissertationIdentifier = resource("DissertationIdentifier");
    public static final Resource MusicFormat = resource("MusicFormat");
    public static final Resource NotatedMusic = resource("NotatedMusic");
    public static final Resource Summary = resource("Summary");
    public static final Resource TableOfContents = resource("TableOfContents");
    public static final Resource Review = resource("Review");
    public static final Resource RecordingMethod = resource("RecordingMethod");
    public static final Resource GrooveCharacteristics = resource("GrooveCharacteristics");
    public static final Resource Sici = resource("Sici");
    public static final Resource Doi = resource("Doi");
    public static final Resource RetentionPolicy = resource("RetentionPolicy");
    public static final Resource Isan = resource("Isan");
    public static final Resource Carrier = resource("Carrier");
    public static final Resource Organization = resource("Organization");
    public static final Resource UsageAndAccessPolicy = resource("UsageAndAccessPolicy");
    public static final Resource Capture = resource("Capture");
    public static final Resource ProvisionActivity = resource("ProvisionActivity");
    public static final Resource Print = resource("Print");
    public static final Resource Topic = resource("Topic");
    public static final Resource Resolution = resource("Resolution");
    public static final Resource RecordingMedium = resource("RecordingMedium");
    public static final Resource BaseMaterial = resource("BaseMaterial");
    public static final Resource WorkTitle = resource("WorkTitle");
    public static final Resource ClassificationLcc = resource("ClassificationLcc");
    public static final Resource Coden = resource("Coden");
    public static final Resource FileType = resource("FileType");
    public static final Resource Mount = resource("Mount");
    public static final Resource MixedMaterial = resource("MixedMaterial");
    public static final Resource Audio = resource("Audio");
    public static final Resource RegionalEncoding = resource("RegionalEncoding");
    public static final Resource EncodedBitrate = resource("EncodedBitrate");
    public static final Resource Upc = resource("Upc");
    public static final Resource Identifier = resource("Identifier");
    public static final Resource Event = resource("Event");
    public static final Resource GenerationProcess = resource("GenerationProcess");
    public static final Resource MusicMedium = resource("MusicMedium");
    public static final Resource Isbn = resource("Isbn");
    public static final Resource Ismn = resource("Ismn");
    public static final Resource MovingImage = resource("MovingImage");
    public static final Resource ClassificationDdc = resource("ClassificationDdc");
    public static final Resource Cartographic = resource("Cartographic");
    public static final Resource Ean = resource("Ean");
    public static final Resource ParallelTitle = resource("ParallelTitle");
    public static final Resource Temporal = resource("Temporal");
    public static final Resource Issn = resource("Issn");
    public static final Resource UsePolicy = resource("UsePolicy");
    public static final Resource Notation = resource("Notation");
    public static final Resource Multimedia = resource("Multimedia");
    public static final Resource SupplementaryContent = resource("SupplementaryContent");
    public static final Resource Status = resource("Status");
    public static final Resource StillImage = resource("StillImage");
    public static final Resource VariantTitle = resource("VariantTitle");
    public static final Resource Jurisdiction = resource("Jurisdiction");
    public static final Resource ShelfMark = resource("ShelfMark");
    public static final Resource Media = resource("Media");
    public static final Resource Content = resource("Content");
    public static final Resource Meeting = resource("Meeting");
    public static final Resource CoverArt = resource("CoverArt");
    public static final Resource Script = resource("Script");
    public static final Resource Archival = resource("Archival");
    public static final Resource Polarity = resource("Polarity");
    public static final Resource MusicPublisherNumber = resource("MusicPublisherNumber");
    public static final Resource PostalRegistration = resource("PostalRegistration");
    public static final Resource Source = resource("Source");
    public static final Resource Publication = resource("Publication");
    public static final Resource PresentationFormat = resource("PresentationFormat");
    public static final Resource CartographicDataType = resource("CartographicDataType");
    public static final Resource SoundContent = resource("SoundContent");
    public static final Resource KeyTitle = resource("KeyTitle");
    public static final Resource Text = resource("Text");
    public static final Resource ColorContent = resource("ColorContent");
    public static final Resource MovementNotation = resource("MovementNotation");
    public static final Resource MusicInstrument = resource("MusicInstrument");
    public static final Resource Contribution = resource("Contribution");
    public static final Resource TapeConfig = resource("TapeConfig");
    public static final Resource LcOverseasAcq = resource("LcOverseasAcq");
    public static final Resource EnumerationAndChronology = resource("EnumerationAndChronology");
    public static final Resource Distribution = resource("Distribution");
    public static final Resource MusicEnsemble = resource("MusicEnsemble");
    public static final Resource IssnL = resource("IssnL");
    public static final Resource Dataset = resource("Dataset");
    public static final Resource VideoFormat = resource("VideoFormat");
    public static final Resource GenreForm = resource("GenreForm");
    public static final Resource Place = resource("Place");
    public static final Resource CollectiveTitle = resource("CollectiveTitle");
    public static final Resource Collection = resource("Collection");
    public static final Resource Instance = resource("Instance");
    public static final Resource MusicVoice = resource("MusicVoice");
    public static final Resource Language = resource("Language");
    public static final Resource MusicNotation = resource("MusicNotation");
    public static final Resource Emulsion = resource("Emulsion");
    public static final Resource TactileNotation = resource("TactileNotation");
    public static final Resource DescriptionConventions = resource("DescriptionConventions");
    public static final Resource Generation = resource("Generation");
    public static final Resource Local = resource("Local");
    public static final Resource EncodingFormat = resource("EncodingFormat");
    public static final Resource Agent = resource("Agent");
    public static final Resource Chronology = resource("Chronology");
    public static final Resource Electronic = resource("Electronic");
    public static final Resource SoundCharacteristic = resource("SoundCharacteristic");
    public static final Resource Family = resource("Family");
    public static final Resource CopyrightRegistration = resource("CopyrightRegistration");
    public static final Resource FontSize = resource("FontSize");
    public static final Resource Frequency = resource("Frequency");
    public static final Resource Illustration = resource("Illustration");
    public static final Resource StockNumber = resource("StockNumber");
    public static final Resource Arrangement = resource("Arrangement");
    public static final Resource Person = resource("Person");
    public static final Resource Istc = resource("Istc");
    public static final Resource AbbreviatedTitle = resource("AbbreviatedTitle");
    public static final Resource ProjectionSpeed = resource("ProjectionSpeed");
    public static final Resource MusicPlate = resource("MusicPlate");
    public static final Resource Unit = resource("Unit");
    public static final Resource TrackConfig = resource("TrackConfig");
    public static final Resource Urn = resource("Urn");
    public static final Resource Hdl = resource("Hdl");
    public static final Resource ProductionMethod = resource("ProductionMethod");
    public static final Resource ShelfMarkUdc = resource("ShelfMarkUdc");
    public static final Resource PlaybackCharacteristic = resource("PlaybackCharacteristic");
    public static final Resource Nbn = resource("Nbn");
    public static final Resource Strn = resource("Strn");
    public static final Resource BroadcastStandard = resource("BroadcastStandard");
    public static final Resource AdminMetadata = resource("AdminMetadata");
    public static final Resource MatrixNumber = resource("MatrixNumber");
    public static final Resource CopyrightNumber = resource("CopyrightNumber");
    public static final Resource Fingerprint = resource("Fingerprint");
    public static final Resource Title = resource("Title");
    public static final Resource StudyNumber = resource("StudyNumber");
    public static final Resource AppliedMaterial = resource("AppliedMaterial");
    public static final Resource ProjectionCharacteristic = resource("ProjectionCharacteristic");
    public static final Resource BookFormat = resource("BookFormat");
    public static final Resource DigitalCharacteristic = resource("DigitalCharacteristic");

    public static final Property generationProcess = property("generationProcess");
    public static final Property hasSubseries = property("hasSubseries");
    public static final Property continuesInPart = property("continuesInPart");
    public static final Property replacementOf = property("replacementOf");
    public static final Property originalVersion = property("originalVersion");
    public static final Property classification = property("classification");
    public static final Property succeededBy = property("succeededBy");
    public static final Property place = property("place");
    public static final Property hasReproduction = property("hasReproduction");
    public static final Property instrument = property("instrument");
    public static final Property dataSource = property("dataSource");
    public static final Property continues = property("continues");
    public static final Property carrier = property("carrier");
    public static final Property soundCharacteristic = property("soundCharacteristic");
    public static final Property heldBy = property("heldBy");
    public static final Property voice = property("voice");
    public static final Property fontSize = property("fontSize");
    public static final Property illustrativeContent = property("illustrativeContent");
    public static final Property dissertation = property("dissertation");
    public static final Property supplementTo = property("supplementTo");
    public static final Property absorbed = property("absorbed");
    public static final Property subLocation = property("subLocation");
    public static final Property findingAid = property("findingAid");
    public static final Property coverArt = property("coverArt");
    public static final Property barcode = property("barcode");
    public static final Property eventContent = property("eventContent");
    public static final Property translationOf = property("translationOf");
    public static final Property hasSeries = property("hasSeries");
    public static final Property references = property("references");
    public static final Property agent = property("agent");
    public static final Property title = property("title");
    public static final Property originPlace = property("originPlace");
    public static final Property reductionRatio = property("reductionRatio");
    public static final Property expressionOf = property("expressionOf");
    public static final Property eventContentOf = property("eventContentOf");
    public static final Property summary = property("summary");
    public static final Property supplement = property("supplement");
    public static final Property provisionActivity = property("provisionActivity");
    public static final Property polarity = property("polarity");
    public static final Property bookFormat = property("bookFormat");
    public static final Property derivativeOf = property("derivativeOf");
    public static final Property mount = property("mount");
    public static final Property musicFormat = property("musicFormat");
    public static final Property aspectRatio = property("aspectRatio");
    public static final Property appliedMaterial = property("appliedMaterial");
    public static final Property enumerationAndChronology = property("enumerationAndChronology");
    public static final Property mergedToForm = property("mergedToForm");
    public static final Property seriesOf = property("seriesOf");
    public static final Property originalVersionOf = property("originalVersionOf");
    public static final Property content = property("content");
    public static final Property referencedBy = property("referencedBy");
    public static final Property partOf = property("partOf");
    public static final Property ensemble = property("ensemble");
    public static final Property continuedInPartBy = property("continuedInPartBy");
    public static final Property precededBy = property("precededBy");
    public static final Property separatedFrom = property("separatedFrom");
    public static final Property hasPart = property("hasPart");
    public static final Property tableOfContents = property("tableOfContents");
    public static final Property notation = property("notation");
    public static final Property splitInto = property("splitInto");
    public static final Property indexOf = property("indexOf");
    public static final Property soundContent = property("soundContent");
    public static final Property absorbedBy = property("absorbedBy");
    public static final Property status = property("status");
    public static final Property digitalCharacteristic = property("digitalCharacteristic");
    public static final Property subject = property("subject");
    public static final Property descriptionLanguage = property("descriptionLanguage");
    public static final Property emulsion = property("emulsion");
    public static final Property shelfMark = property("shelfMark");
    public static final Property hasInstance = property("hasInstance");
    public static final Property genreForm = property("genreForm");
    public static final Property projectionChracteristic = property("projectionChracteristic");
    public static final Property cartographicAttributes = property("cartographicAttributes");
    public static final Property grantingInstitution = property("grantingInstitution");
    public static final Property source = property("source");
    public static final Property colorContent = property("colorContent");
    public static final Property media = property("media");
    public static final Property baseMaterial = property("baseMaterial");
    public static final Property findingAidOf = property("findingAidOf");
    public static final Property intendedAudience = property("intendedAudience");
    public static final Property unit = property("unit");
    public static final Property issuance = property("issuance");
    public static final Property reproductionOf = property("reproductionOf");
    public static final Property supplementaryContent = property("supplementaryContent");
    public static final Property language = property("language");
    public static final Property usageAndAccessPolicy = property("usageAndAccessPolicy");
    public static final Property contribution = property("contribution");
    public static final Property accompaniedBy = property("accompaniedBy");
    public static final Property contributor = property("contributor");
    public static final Property extent = property("extent");
    public static final Property arrangement = property("arrangement");
    public static final Property translation = property("translation");
    public static final Property identifiedBy = property("identifiedBy");
    public static final Property descriptionAuthentication = property("descriptionAuthentication");
    public static final Property itemOf = property("itemOf");
    public static final Property hasDerivative = property("hasDerivative");
    public static final Property hasExpression = property("hasExpression");
    public static final Property productionMethod = property("productionMethod");
    public static final Property note = property("note");
    public static final Property descriptionModifier = property("descriptionModifier");
    public static final Property electronicLocator = property("electronicLocator");
    public static final Property descriptionConventions = property("descriptionConventions");
    public static final Property adminMetadata = property("adminMetadata");
    public static final Property layout = property("layout");
    public static final Property frequency = property("frequency");
    public static final Property capture = property("capture");
    public static final Property continuedBy = property("continuedBy");
    public static final Property musicMedium = property("musicMedium");
    public static final Property replacedBy = property("replacedBy");
    public static final Property mergerOf = property("mergerOf");
    public static final Property copyrightRegistration = property("copyrightRegistration");
    public static final Property index = property("index");
    public static final Property videoCharacteristic = property("videoCharacteristic");
    public static final Property subseriesOf = property("subseriesOf");
    public static final Property instanceOf = property("instanceOf");
    public static final Property assigner = property("assigner");
    public static final Property hasItem = property("hasItem");
    public static final Property generation = property("generation");
    public static final Property accompanies = property("accompanies");
    public static final Property review = property("review");
    public static final Property subseriesStatement = property("subseriesStatement");
    public static final Property scale = property("scale");
    public static final Property part = property("part");
    public static final Property provisionActivityStatement = property("provisionActivityStatement");
    public static final Property geographicCoverage = property("geographicCoverage");
    public static final Property pattern = property("pattern");
    public static final Property classificationPortion = property("classificationPortion");
    public static final Property acquisitionTerms = property("acquisitionTerms");
    public static final Property noteType = property("noteType");
    public static final Property spanEnd = property("spanEnd");
    public static final Property subtitle = property("subtitle");
    public static final Property changeDate = property("changeDate");
    public static final Property derivedFrom = property("derivedFrom");
    public static final Property preferredCitation = property("preferredCitation");
    public static final Property musicThematicNumber = property("musicThematicNumber");
    public static final Property itemPortion = property("itemPortion");
    public static final Property originDate = property("originDate");
    public static final Property qualifier = property("qualifier");
    public static final Property seriesStatement = property("seriesStatement");
    public static final Property historyOfWork = property("historyOfWork");
    public static final Property outerGRing = property("outerGRing");
    public static final Property instrumentalType = property("instrumentalType");
    public static final Property version = property("version");
    public static final Property mainTitle = property("mainTitle");
    public static final Property responsibilityStatement = property("responsibilityStatement");
    public static final Property lastIssue = property("lastIssue");
    public static final Property role = property("role");
    public static final Property custodialHistory = property("custodialHistory");
    public static final Property schedulePart = property("schedulePart");
    public static final Property partNumber = property("partNumber");
    public static final Property edition = property("edition");
    public static final Property generationDate = property("generationDate");
    public static final Property count = property("count");
    public static final Property contentAccessibility = property("contentAccessibility");
    public static final Property exclusionGRing = property("exclusionGRing");
    public static final Property subseriesEnumeration = property("subseriesEnumeration");
    public static final Property physicalLocation = property("physicalLocation");
    public static final Property musicKey = property("musicKey");
    public static final Property firstIssue = property("firstIssue");
    public static final Property musicOpusNumber = property("musicOpusNumber");
    public static final Property hierarchicalLevel = property("hierarchicalLevel");
    public static final Property variantType = property("variantType");
    public static final Property musicSerialNumber = property("musicSerialNumber");
    public static final Property creationDate = property("creationDate");
    public static final Property duration = property("duration");
    public static final Property voiceType = property("voiceType");
    public static final Property legalDate = property("legalDate");
    public static final Property organization = property("organization");
    public static final Property tableSeq = property("tableSeq");
    public static final Property seriesEnumeration = property("seriesEnumeration");
    public static final Property awards = property("awards");
    public static final Property copyrightDate = property("copyrightDate");
    public static final Property temporalCoverage = property("temporalCoverage");
    public static final Property systemRequirements = property("systemRequirements");
    public static final Property partName = property("partName");
    public static final Property editionStatement = property("editionStatement");
    public static final Property ascensionAndDeclination = property("ascensionAndDeclination");
    public static final Property acquisitionSource = property("acquisitionSource");
    public static final Property code = property("code");
    public static final Property table = property("table");
    public static final Property credits = property("credits");
    public static final Property coordinates = property("coordinates");
    public static final Property editionEnumeration = property("editionEnumeration");
    public static final Property ensembleType = property("ensembleType");
    public static final Property equinox = property("equinox");
    public static final Property dimensions = property("dimensions");
    public static final Property degree = property("degree");
    public static final Property immediateAcquisition = property("immediateAcquisition");
    public static final Property projection = property("projection");
    public static final Property date = property("date");
    public static final Property natureOfContent = property("natureOfContent");
    public static final Property issuedWith = property("issuedWith");
    public static final Property otherEdition = property("otherEdition");
    public static final Property otherPhysicalFormat = property("otherPhysicalFormat");
    public static final Property hasEquivalent = property("hasEquivalent");
    public static final Property relatedTo = property("relatedTo");

}
