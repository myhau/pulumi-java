// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appconfig.DeploymentArgs;
import io.pulumi.aws.appconfig.inputs.DeploymentState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AppConfig Deployment resource for an `aws.appconfig.Application` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AppConfig Deployments can be imported by using the application ID, environment ID, and deployment number separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/deployment:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @OutputExport(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppConfig Deployment.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    @OutputExport(name="configurationProfileId", type=String.class, parameters={})
    private Output<String> configurationProfileId;

    /**
     * @return The configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> getConfigurationProfileId() {
        return this.configurationProfileId;
    }
    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    @OutputExport(name="configurationVersion", type=String.class, parameters={})
    private Output<String> configurationVersion;

    /**
     * @return The configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    public Output<String> getConfigurationVersion() {
        return this.configurationVersion;
    }
    /**
     * The deployment number.
     * 
     */
    @OutputExport(name="deploymentNumber", type=Integer.class, parameters={})
    private Output<Integer> deploymentNumber;

    /**
     * @return The deployment number.
     * 
     */
    public Output<Integer> getDeploymentNumber() {
        return this.deploymentNumber;
    }
    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    @OutputExport(name="deploymentStrategyId", type=String.class, parameters={})
    private Output<String> deploymentStrategyId;

    /**
     * @return The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    public Output<String> getDeploymentStrategyId() {
        return this.deploymentStrategyId;
    }
    /**
     * The description of the deployment. Can be at most 1024 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the deployment. Can be at most 1024 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The environment ID. Must be between 4 and 7 characters in length.
     * 
     */
    @OutputExport(name="environmentId", type=String.class, parameters={})
    private Output<String> environmentId;

    /**
     * @return The environment ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }
    /**
     * The state of the deployment.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the deployment.
     * 
     */
    public Output<String> getState() {
        return this.state;
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

    public interface BuilderApplicator {
        public void apply(DeploymentArgs.Builder a);
    }
    private static io.pulumi.aws.appconfig.DeploymentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appconfig.DeploymentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Deployment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Deployment(String name, Input<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Input<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}