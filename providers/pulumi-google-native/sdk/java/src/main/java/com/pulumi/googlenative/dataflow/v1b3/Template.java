// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataflow.v1b3.TemplateArgs;
import com.pulumi.googlenative.dataflow.v1b3.outputs.RuntimeMetadataResponse;
import com.pulumi.googlenative.dataflow.v1b3.outputs.StatusResponse;
import com.pulumi.googlenative.dataflow.v1b3.outputs.TemplateMetadataResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dataflow/v1b3:Template")
public class Template extends com.pulumi.resources.CustomResource {
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The template metadata describing the template name, available parameters, etc.
     * 
     */
    @Export(name="metadata", type=TemplateMetadataResponse.class, parameters={})
    private Output<TemplateMetadataResponse> metadata;

    /**
     * @return The template metadata describing the template name, available parameters, etc.
     * 
     */
    public Output<TemplateMetadataResponse> metadata() {
        return this.metadata;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Describes the runtime metadata with SDKInfo and available parameters.
     * 
     */
    @Export(name="runtimeMetadata", type=RuntimeMetadataResponse.class, parameters={})
    private Output<RuntimeMetadataResponse> runtimeMetadata;

    /**
     * @return Describes the runtime metadata with SDKInfo and available parameters.
     * 
     */
    public Output<RuntimeMetadataResponse> runtimeMetadata() {
        return this.runtimeMetadata;
    }
    /**
     * The status of the get template request. Any problems with the request will be indicated in the error_details.
     * 
     */
    @Export(name="status", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> status;

    /**
     * @return The status of the get template request. Any problems with the request will be indicated in the error_details.
     * 
     */
    public Output<StatusResponse> status() {
        return this.status;
    }
    /**
     * Template Type.
     * 
     */
    @Export(name="templateType", type=String.class, parameters={})
    private Output<String> templateType;

    /**
     * @return Template Type.
     * 
     */
    public Output<String> templateType() {
        return this.templateType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, TemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Template(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Template", name, null, makeResourceOptions(options, id));
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
    public static Template get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, options);
    }
}
