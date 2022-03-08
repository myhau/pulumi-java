// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.AttestationNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.BuildNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ComplianceNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DSSEAttestationNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DeploymentNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DiscoveryNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ImageNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.PackageNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.RelatedUrlResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeNoteResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VulnerabilityNoteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNoteResult {
    /**
     * A note describing an attestation role.
     * 
     */
    private final AttestationNoteResponse attestation;
    /**
     * A note describing build provenance for a verifiable build.
     * 
     */
    private final BuildNoteResponse build;
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
    private final DeploymentNoteResponse deployment;
    /**
     * A note describing the initial analysis of a resource.
     * 
     */
    private final DiscoveryNoteResponse discovery;
    /**
     * A note describing a dsse attestation note.
     * 
     */
    private final DSSEAttestationNoteResponse dsseAttestation;
    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
     */
    private final String expirationTime;
    /**
     * A note describing a base image.
     * 
     */
    private final ImageNoteResponse image;
    /**
     * The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * A detailed description of this note.
     * 
     */
    private final String longDescription;
    /**
     * The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    private final String name;
    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    private final PackageNoteResponse $package;
    /**
     * Other notes related to this note.
     * 
     */
    private final List<String> relatedNoteNames;
    /**
     * URLs associated with this note.
     * 
     */
    private final List<RelatedUrlResponse> relatedUrl;
    /**
     * A one sentence description of this note.
     * 
     */
    private final String shortDescription;
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    private final String updateTime;
    /**
     * A note describing available package upgrades.
     * 
     */
    private final UpgradeNoteResponse upgrade;
    /**
     * A note describing a package vulnerability.
     * 
     */
    private final VulnerabilityNoteResponse vulnerability;

    @OutputCustomType.Constructor({"attestation","build","compliance","createTime","deployment","discovery","dsseAttestation","expirationTime","image","kind","longDescription","name","$package","relatedNoteNames","relatedUrl","shortDescription","updateTime","upgrade","vulnerability"})
    private GetNoteResult(
        AttestationNoteResponse attestation,
        BuildNoteResponse build,
        ComplianceNoteResponse compliance,
        String createTime,
        DeploymentNoteResponse deployment,
        DiscoveryNoteResponse discovery,
        DSSEAttestationNoteResponse dsseAttestation,
        String expirationTime,
        ImageNoteResponse image,
        String kind,
        String longDescription,
        String name,
        PackageNoteResponse $package,
        List<String> relatedNoteNames,
        List<RelatedUrlResponse> relatedUrl,
        String shortDescription,
        String updateTime,
        UpgradeNoteResponse upgrade,
        VulnerabilityNoteResponse vulnerability) {
        this.attestation = attestation;
        this.build = build;
        this.compliance = compliance;
        this.createTime = createTime;
        this.deployment = deployment;
        this.discovery = discovery;
        this.dsseAttestation = dsseAttestation;
        this.expirationTime = expirationTime;
        this.image = image;
        this.kind = kind;
        this.longDescription = longDescription;
        this.name = name;
        this.$package = $package;
        this.relatedNoteNames = relatedNoteNames;
        this.relatedUrl = relatedUrl;
        this.shortDescription = shortDescription;
        this.updateTime = updateTime;
        this.upgrade = upgrade;
        this.vulnerability = vulnerability;
    }

    /**
     * A note describing an attestation role.
     * 
    */
    public AttestationNoteResponse getAttestation() {
        return this.attestation;
    }
    /**
     * A note describing build provenance for a verifiable build.
     * 
    */
    public BuildNoteResponse getBuild() {
        return this.build;
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
    public DeploymentNoteResponse getDeployment() {
        return this.deployment;
    }
    /**
     * A note describing the initial analysis of a resource.
     * 
    */
    public DiscoveryNoteResponse getDiscovery() {
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
     * Time of expiration for this note. Empty if note does not expire.
     * 
    */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * A note describing a base image.
     * 
    */
    public ImageNoteResponse getImage() {
        return this.image;
    }
    /**
     * The type of analysis. This field can be used as a filter in list requests.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A detailed description of this note.
     * 
    */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A note describing a package hosted by various package managers.
     * 
    */
    public PackageNoteResponse get$package() {
        return this.$package;
    }
    /**
     * Other notes related to this note.
     * 
    */
    public List<String> getRelatedNoteNames() {
        return this.relatedNoteNames;
    }
    /**
     * URLs associated with this note.
     * 
    */
    public List<RelatedUrlResponse> getRelatedUrl() {
        return this.relatedUrl;
    }
    /**
     * A one sentence description of this note.
     * 
    */
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A note describing available package upgrades.
     * 
    */
    public UpgradeNoteResponse getUpgrade() {
        return this.upgrade;
    }
    /**
     * A note describing a package vulnerability.
     * 
    */
    public VulnerabilityNoteResponse getVulnerability() {
        return this.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationNoteResponse attestation;
        private BuildNoteResponse build;
        private ComplianceNoteResponse compliance;
        private String createTime;
        private DeploymentNoteResponse deployment;
        private DiscoveryNoteResponse discovery;
        private DSSEAttestationNoteResponse dsseAttestation;
        private String expirationTime;
        private ImageNoteResponse image;
        private String kind;
        private String longDescription;
        private String name;
        private PackageNoteResponse $package;
        private List<String> relatedNoteNames;
        private List<RelatedUrlResponse> relatedUrl;
        private String shortDescription;
        private String updateTime;
        private UpgradeNoteResponse upgrade;
        private VulnerabilityNoteResponse vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.discovery = defaults.discovery;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.expirationTime = defaults.expirationTime;
    	      this.image = defaults.image;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.$package = defaults.$package;
    	      this.relatedNoteNames = defaults.relatedNoteNames;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.shortDescription = defaults.shortDescription;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder setAttestation(AttestationNoteResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setBuild(BuildNoteResponse build) {
            this.build = Objects.requireNonNull(build);
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

        public Builder setDeployment(DeploymentNoteResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public Builder setDiscovery(DiscoveryNoteResponse discovery) {
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

        public Builder setImage(ImageNoteResponse image) {
            this.image = Objects.requireNonNull(image);
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

        public Builder set$package(PackageNoteResponse $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setRelatedNoteNames(List<String> relatedNoteNames) {
            this.relatedNoteNames = Objects.requireNonNull(relatedNoteNames);
            return this;
        }

        public Builder setRelatedUrl(List<RelatedUrlResponse> relatedUrl) {
            this.relatedUrl = Objects.requireNonNull(relatedUrl);
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
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

        public Builder setVulnerability(VulnerabilityNoteResponse vulnerability) {
            this.vulnerability = Objects.requireNonNull(vulnerability);
            return this;
        }
        public GetNoteResult build() {
            return new GetNoteResult(attestation, build, compliance, createTime, deployment, discovery, dsseAttestation, expirationTime, image, kind, longDescription, name, $package, relatedNoteNames, relatedUrl, shortDescription, updateTime, upgrade, vulnerability);
        }
    }
}
