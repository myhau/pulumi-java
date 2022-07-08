// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.healthcare.v1.ConsentArtifactArgs;
import com.pulumi.googlenative.healthcare.v1.outputs.ImageResponse;
import com.pulumi.googlenative.healthcare.v1.outputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Consent artifact in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:ConsentArtifact")
public class ConsentArtifact extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
     * 
     */
    @Export(name="consentContentScreenshots", type=List.class, parameters={ImageResponse.class})
    private Output<List<ImageResponse>> consentContentScreenshots;

    /**
     * @return Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
     * 
     */
    public Output<List<ImageResponse>> consentContentScreenshots() {
        return this.consentContentScreenshots;
    }
    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @Export(name="consentContentVersion", type=String.class, parameters={})
    private Output<String> consentContentVersion;

    /**
     * @return Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    public Output<String> consentContentVersion() {
        return this.consentContentVersion;
    }
    @Export(name="consentStoreId", type=String.class, parameters={})
    private Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }
    @Export(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * Optional. A signature from a guardian.
     * 
     */
    @Export(name="guardianSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> guardianSignature;

    /**
     * @return Optional. A signature from a guardian.
     * 
     */
    public Output<SignatureResponse> guardianSignature() {
        return this.guardianSignature;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * Optional. User&#39;s signature.
     * 
     */
    @Export(name="userSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> userSignature;

    /**
     * @return Optional. User&#39;s signature.
     * 
     */
    public Output<SignatureResponse> userSignature() {
        return this.userSignature;
    }
    /**
     * Optional. A signature from a witness.
     * 
     */
    @Export(name="witnessSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> witnessSignature;

    /**
     * @return Optional. A signature from a witness.
     * 
     */
    public Output<SignatureResponse> witnessSignature() {
        return this.witnessSignature;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsentArtifact(String name) {
        this(name, ConsentArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsentArtifact(String name, ConsentArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsentArtifact(String name, ConsentArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:ConsentArtifact", name, args == null ? ConsentArtifactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConsentArtifact(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:ConsentArtifact", name, null, makeResourceOptions(options, id));
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
    public static ConsentArtifact get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsentArtifact(name, id, options);
    }
}
