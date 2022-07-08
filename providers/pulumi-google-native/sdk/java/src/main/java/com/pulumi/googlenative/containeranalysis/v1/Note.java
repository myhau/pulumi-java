// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.containeranalysis.v1.NoteArgs;
import com.pulumi.googlenative.containeranalysis.v1.outputs.AttestationNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.BuildNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.ComplianceNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.DSSEAttestationNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.DeploymentNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.DiscoveryNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.ImageNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.PackageNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.RelatedUrlResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.UpgradeNoteResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.VulnerabilityNoteResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new note.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:containeranalysis/v1:Note")
public class Note extends com.pulumi.resources.CustomResource {
    /**
     * A note describing an attestation role.
     * 
     */
    @Export(name="attestation", type=AttestationNoteResponse.class, parameters={})
    private Output<AttestationNoteResponse> attestation;

    /**
     * @return A note describing an attestation role.
     * 
     */
    public Output<AttestationNoteResponse> attestation() {
        return this.attestation;
    }
    /**
     * A note describing build provenance for a verifiable build.
     * 
     */
    @Export(name="build", type=BuildNoteResponse.class, parameters={})
    private Output<BuildNoteResponse> build;

    /**
     * @return A note describing build provenance for a verifiable build.
     * 
     */
    public Output<BuildNoteResponse> build() {
        return this.build;
    }
    /**
     * A note describing a compliance check.
     * 
     */
    @Export(name="compliance", type=ComplianceNoteResponse.class, parameters={})
    private Output<ComplianceNoteResponse> compliance;

    /**
     * @return A note describing a compliance check.
     * 
     */
    public Output<ComplianceNoteResponse> compliance() {
        return this.compliance;
    }
    /**
     * The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A note describing something that can be deployed.
     * 
     */
    @Export(name="deployment", type=DeploymentNoteResponse.class, parameters={})
    private Output<DeploymentNoteResponse> deployment;

    /**
     * @return A note describing something that can be deployed.
     * 
     */
    public Output<DeploymentNoteResponse> deployment() {
        return this.deployment;
    }
    /**
     * A note describing the initial analysis of a resource.
     * 
     */
    @Export(name="discovery", type=DiscoveryNoteResponse.class, parameters={})
    private Output<DiscoveryNoteResponse> discovery;

    /**
     * @return A note describing the initial analysis of a resource.
     * 
     */
    public Output<DiscoveryNoteResponse> discovery() {
        return this.discovery;
    }
    /**
     * A note describing a dsse attestation note.
     * 
     */
    @Export(name="dsseAttestation", type=DSSEAttestationNoteResponse.class, parameters={})
    private Output<DSSEAttestationNoteResponse> dsseAttestation;

    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    public Output<DSSEAttestationNoteResponse> dsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return Time of expiration for this note. Empty if note does not expire.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    /**
     * A note describing a base image.
     * 
     */
    @Export(name="image", type=ImageNoteResponse.class, parameters={})
    private Output<ImageNoteResponse> image;

    /**
     * @return A note describing a base image.
     * 
     */
    public Output<ImageNoteResponse> image() {
        return this.image;
    }
    /**
     * The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A detailed description of this note.
     * 
     */
    @Export(name="longDescription", type=String.class, parameters={})
    private Output<String> longDescription;

    /**
     * @return A detailed description of this note.
     * 
     */
    public Output<String> longDescription() {
        return this.longDescription;
    }
    /**
     * The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required. The ID to use for this note.
     * 
     */
    @Export(name="noteId", type=String.class, parameters={})
    private Output<String> noteId;

    /**
     * @return Required. The ID to use for this note.
     * 
     */
    public Output<String> noteId() {
        return this.noteId;
    }
    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    @Export(name="package", type=PackageNoteResponse.class, parameters={})
    private Output<PackageNoteResponse> package_;

    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public Output<PackageNoteResponse> package_() {
        return this.package_;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Other notes related to this note.
     * 
     */
    @Export(name="relatedNoteNames", type=List.class, parameters={String.class})
    private Output<List<String>> relatedNoteNames;

    /**
     * @return Other notes related to this note.
     * 
     */
    public Output<List<String>> relatedNoteNames() {
        return this.relatedNoteNames;
    }
    /**
     * URLs associated with this note.
     * 
     */
    @Export(name="relatedUrl", type=List.class, parameters={RelatedUrlResponse.class})
    private Output<List<RelatedUrlResponse>> relatedUrl;

    /**
     * @return URLs associated with this note.
     * 
     */
    public Output<List<RelatedUrlResponse>> relatedUrl() {
        return this.relatedUrl;
    }
    /**
     * A one sentence description of this note.
     * 
     */
    @Export(name="shortDescription", type=String.class, parameters={})
    private Output<String> shortDescription;

    /**
     * @return A one sentence description of this note.
     * 
     */
    public Output<String> shortDescription() {
        return this.shortDescription;
    }
    /**
     * The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * A note describing available package upgrades.
     * 
     */
    @Export(name="upgrade", type=UpgradeNoteResponse.class, parameters={})
    private Output<UpgradeNoteResponse> upgrade;

    /**
     * @return A note describing available package upgrades.
     * 
     */
    public Output<UpgradeNoteResponse> upgrade() {
        return this.upgrade;
    }
    /**
     * A note describing a package vulnerability.
     * 
     */
    @Export(name="vulnerability", type=VulnerabilityNoteResponse.class, parameters={})
    private Output<VulnerabilityNoteResponse> vulnerability;

    /**
     * @return A note describing a package vulnerability.
     * 
     */
    public Output<VulnerabilityNoteResponse> vulnerability() {
        return this.vulnerability;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Note(String name) {
        this(name, NoteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Note(String name, NoteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Note(String name, NoteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1:Note", name, args == null ? NoteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Note(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1:Note", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Note get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Note(name, id, options);
    }
}
