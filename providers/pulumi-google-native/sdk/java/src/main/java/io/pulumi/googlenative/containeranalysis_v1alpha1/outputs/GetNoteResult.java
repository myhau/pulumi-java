// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationAuthorityResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BasisResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildTypeResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeployableResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveryResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelatedUrlResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNoteResult {
    /**
     * A note describing an attestation role.
     * 
     */
    private final AttestationAuthorityResponse attestationAuthority;
    /**
     * A note describing a base image.
     * 
     */
    private final BasisResponse baseImage;
    /**
     * Build provenance type for a verifiable build.
     * 
     */
    private final BuildTypeResponse buildType;
    /**
     * A note describing a compliance check.
     * 
     */
    private final ComplianceNoteResponse compliance;
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    private final String createTime;
    /**
     * A note describing something that can be deployed.
     * 
     */
    private final DeployableResponse deployable;
    /**
     * A note describing a provider/analysis type.
     * 
     */
    private final DiscoveryResponse discovery;
    /**
     * A note describing a dsse attestation note.
     * 
     */
    private final DSSEAttestationNoteResponse dsseAttestation;
    /**
     * Time of expiration for this note, null if note does not expire.
     * 
     */
    private final String expirationTime;
    /**
     * This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * A detailed description of this `Note`.
     * 
     */
    private final String longDescription;
    /**
     * The name of the note in the form "projects/{provider_project_id}/notes/{NOTE_ID}"
     * 
     */
    private final String name;
    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    private final PackageResponse $package;
    /**
     * URLs associated with this note
     * 
     */
    private final List<RelatedUrlResponse> relatedUrl;
    /**
     * A note describing a software bill of materials.
     * 
     */
    private final DocumentNoteResponse sbom;
    /**
     * A one sentence description of this `Note`.
     * 
     */
    private final String shortDescription;
    /**
     * A note describing an SPDX File.
     * 
     */
    private final FileNoteResponse spdxFile;
    /**
     * A note describing an SPDX Package.
     * 
     */
    private final PackageInfoNoteResponse spdxPackage;
    /**
     * A note describing a relationship between SPDX elements.
     * 
     */
    private final RelationshipNoteResponse spdxRelationship;
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    private final String updateTime;
    /**
     * A note describing an upgrade.
     * 
     */
    private final UpgradeNoteResponse upgrade;
    /**
     * A package vulnerability type of note.
     * 
     */
    private final VulnerabilityTypeResponse vulnerabilityType;

    @OutputCustomType.Constructor
    private GetNoteResult(
        @OutputCustomType.Parameter("attestationAuthority") AttestationAuthorityResponse attestationAuthority,
        @OutputCustomType.Parameter("baseImage") BasisResponse baseImage,
        @OutputCustomType.Parameter("buildType") BuildTypeResponse buildType,
        @OutputCustomType.Parameter("compliance") ComplianceNoteResponse compliance,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("deployable") DeployableResponse deployable,
        @OutputCustomType.Parameter("discovery") DiscoveryResponse discovery,
        @OutputCustomType.Parameter("dsseAttestation") DSSEAttestationNoteResponse dsseAttestation,
        @OutputCustomType.Parameter("expirationTime") String expirationTime,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("longDescription") String longDescription,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("package") PackageResponse $package,
        @OutputCustomType.Parameter("relatedUrl") List<RelatedUrlResponse> relatedUrl,
        @OutputCustomType.Parameter("sbom") DocumentNoteResponse sbom,
        @OutputCustomType.Parameter("shortDescription") String shortDescription,
        @OutputCustomType.Parameter("spdxFile") FileNoteResponse spdxFile,
        @OutputCustomType.Parameter("spdxPackage") PackageInfoNoteResponse spdxPackage,
        @OutputCustomType.Parameter("spdxRelationship") RelationshipNoteResponse spdxRelationship,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("upgrade") UpgradeNoteResponse upgrade,
        @OutputCustomType.Parameter("vulnerabilityType") VulnerabilityTypeResponse vulnerabilityType) {
        this.attestationAuthority = attestationAuthority;
        this.baseImage = baseImage;
        this.buildType = buildType;
        this.compliance = compliance;
        this.createTime = createTime;
        this.deployable = deployable;
        this.discovery = discovery;
        this.dsseAttestation = dsseAttestation;
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.longDescription = longDescription;
        this.name = name;
        this.$package = $package;
        this.relatedUrl = relatedUrl;
        this.sbom = sbom;
        this.shortDescription = shortDescription;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.updateTime = updateTime;
        this.upgrade = upgrade;
        this.vulnerabilityType = vulnerabilityType;
    }

    /**
     * A note describing an attestation role.
     * 
    */
    public AttestationAuthorityResponse getAttestationAuthority() {
        return this.attestationAuthority;
    }
    /**
     * A note describing a base image.
     * 
    */
    public BasisResponse getBaseImage() {
        return this.baseImage;
    }
    /**
     * Build provenance type for a verifiable build.
     * 
    */
    public BuildTypeResponse getBuildType() {
        return this.buildType;
    }
    /**
     * A note describing a compliance check.
     * 
    */
    public ComplianceNoteResponse getCompliance() {
        return this.compliance;
    }
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A note describing something that can be deployed.
     * 
    */
    public DeployableResponse getDeployable() {
        return this.deployable;
    }
    /**
     * A note describing a provider/analysis type.
     * 
    */
    public DiscoveryResponse getDiscovery() {
        return this.discovery;
    }
    /**
     * A note describing a dsse attestation note.
     * 
    */
    public DSSEAttestationNoteResponse getDsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * Time of expiration for this note, null if note does not expire.
     * 
    */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A detailed description of this `Note`.
     * 
    */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note in the form "projects/{provider_project_id}/notes/{NOTE_ID}"
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A note describing a package hosted by various package managers.
     * 
    */
    public PackageResponse get$package() {
        return this.$package;
    }
    /**
     * URLs associated with this note
     * 
    */
    public List<RelatedUrlResponse> getRelatedUrl() {
        return this.relatedUrl;
    }
    /**
     * A note describing a software bill of materials.
     * 
    */
    public DocumentNoteResponse getSbom() {
        return this.sbom;
    }
    /**
     * A one sentence description of this `Note`.
     * 
    */
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * A note describing an SPDX File.
     * 
    */
    public FileNoteResponse getSpdxFile() {
        return this.spdxFile;
    }
    /**
     * A note describing an SPDX Package.
     * 
    */
    public PackageInfoNoteResponse getSpdxPackage() {
        return this.spdxPackage;
    }
    /**
     * A note describing a relationship between SPDX elements.
     * 
    */
    public RelationshipNoteResponse getSpdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A note describing an upgrade.
     * 
    */
    public UpgradeNoteResponse getUpgrade() {
        return this.upgrade;
    }
    /**
     * A package vulnerability type of note.
     * 
    */
    public VulnerabilityTypeResponse getVulnerabilityType() {
        return this.vulnerabilityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityResponse attestationAuthority;
        private BasisResponse baseImage;
        private BuildTypeResponse buildType;
        private ComplianceNoteResponse compliance;
        private String createTime;
        private DeployableResponse deployable;
        private DiscoveryResponse discovery;
        private DSSEAttestationNoteResponse dsseAttestation;
        private String expirationTime;
        private String kind;
        private String longDescription;
        private String name;
        private PackageResponse $package;
        private List<RelatedUrlResponse> relatedUrl;
        private DocumentNoteResponse sbom;
        private String shortDescription;
        private FileNoteResponse spdxFile;
        private PackageInfoNoteResponse spdxPackage;
        private RelationshipNoteResponse spdxRelationship;
        private String updateTime;
        private UpgradeNoteResponse upgrade;
        private VulnerabilityTypeResponse vulnerabilityType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthority = defaults.attestationAuthority;
    	      this.baseImage = defaults.baseImage;
    	      this.buildType = defaults.buildType;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployable = defaults.deployable;
    	      this.discovery = defaults.discovery;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.$package = defaults.$package;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.sbom = defaults.sbom;
    	      this.shortDescription = defaults.shortDescription;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityType = defaults.vulnerabilityType;
        }

        public Builder setAttestationAuthority(AttestationAuthorityResponse attestationAuthority) {
            this.attestationAuthority = Objects.requireNonNull(attestationAuthority);
            return this;
        }

        public Builder setBaseImage(BasisResponse baseImage) {
            this.baseImage = Objects.requireNonNull(baseImage);
            return this;
        }

        public Builder setBuildType(BuildTypeResponse buildType) {
            this.buildType = Objects.requireNonNull(buildType);
            return this;
        }

        public Builder setCompliance(ComplianceNoteResponse compliance) {
            this.compliance = Objects.requireNonNull(compliance);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeployable(DeployableResponse deployable) {
            this.deployable = Objects.requireNonNull(deployable);
            return this;
        }

        public Builder setDiscovery(DiscoveryResponse discovery) {
            this.discovery = Objects.requireNonNull(discovery);
            return this;
        }

        public Builder setDsseAttestation(DSSEAttestationNoteResponse dsseAttestation) {
            this.dsseAttestation = Objects.requireNonNull(dsseAttestation);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLongDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder set$package(PackageResponse $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setRelatedUrl(List<RelatedUrlResponse> relatedUrl) {
            this.relatedUrl = Objects.requireNonNull(relatedUrl);
            return this;
        }

        public Builder setSbom(DocumentNoteResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }

        public Builder setSpdxFile(FileNoteResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }

        public Builder setSpdxPackage(PackageInfoNoteResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }

        public Builder setSpdxRelationship(RelationshipNoteResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUpgrade(UpgradeNoteResponse upgrade) {
            this.upgrade = Objects.requireNonNull(upgrade);
            return this;
        }

        public Builder setVulnerabilityType(VulnerabilityTypeResponse vulnerabilityType) {
            this.vulnerabilityType = Objects.requireNonNull(vulnerabilityType);
            return this;
        }
        public GetNoteResult build() {
            return new GetNoteResult(attestationAuthority, baseImage, buildType, compliance, createTime, deployable, discovery, dsseAttestation, expirationTime, kind, longDescription, name, $package, relatedUrl, sbom, shortDescription, spdxFile, spdxPackage, spdxRelationship, updateTime, upgrade, vulnerabilityType);
        }
    }
}
