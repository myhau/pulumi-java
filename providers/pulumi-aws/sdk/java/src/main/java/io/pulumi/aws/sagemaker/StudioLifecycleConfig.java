// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.StudioLifecycleConfigArgs;
import io.pulumi.aws.sagemaker.inputs.StudioLifecycleConfigState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Studio Lifecycle Config resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code Studio Lifecycle Configs can be imported using the `studio_lifecycle_config_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/studioLifecycleConfig:StudioLifecycleConfig example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/studioLifecycleConfig:StudioLifecycleConfig")
public class StudioLifecycleConfig extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Studio Lifecycle Config.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Studio Lifecycle Config.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The App type that the Lifecycle Configuration is attached to. Valid values are `JupyterServer` and `KernelGateway`.
     * 
     */
    @OutputExport(name="studioLifecycleConfigAppType", type=String.class, parameters={})
    private Output<String> studioLifecycleConfigAppType;

    /**
     * @return The App type that the Lifecycle Configuration is attached to. Valid values are `JupyterServer` and `KernelGateway`.
     * 
     */
    public Output<String> getStudioLifecycleConfigAppType() {
        return this.studioLifecycleConfigAppType;
    }
    /**
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * 
     */
    @OutputExport(name="studioLifecycleConfigContent", type=String.class, parameters={})
    private Output<String> studioLifecycleConfigContent;

    /**
     * @return The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * 
     */
    public Output<String> getStudioLifecycleConfigContent() {
        return this.studioLifecycleConfigContent;
    }
    /**
     * The name of the Studio Lifecycle Configuration to create.
     * 
     */
    @OutputExport(name="studioLifecycleConfigName", type=String.class, parameters={})
    private Output<String> studioLifecycleConfigName;

    /**
     * @return The name of the Studio Lifecycle Configuration to create.
     * 
     */
    public Output<String> getStudioLifecycleConfigName() {
        return this.studioLifecycleConfigName;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioLifecycleConfig(String name) {
        this(name, StudioLifecycleConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioLifecycleConfig(String name, StudioLifecycleConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioLifecycleConfig(String name, StudioLifecycleConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/studioLifecycleConfig:StudioLifecycleConfig", name, args == null ? StudioLifecycleConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StudioLifecycleConfig(String name, Input<String> id, @Nullable StudioLifecycleConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/studioLifecycleConfig:StudioLifecycleConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StudioLifecycleConfig get(String name, Input<String> id, @Nullable StudioLifecycleConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StudioLifecycleConfig(name, id, state, options);
    }
}
