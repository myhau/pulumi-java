// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amp;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.amp.WorkspaceArgs;
import io.pulumi.aws.amp.inputs.WorkspaceState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Amazon Managed Service for Prometheus (AMP) Workspace.
 * 
 * > **NOTE:** This AWS functionality is in Preview and may change before General Availability release. Backwards compatibility is not guaranteed between provider releases.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AMP Workspaces can be imported using the identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amp/workspace:Workspace demo ws-C6DCB907-F2D7-4D96-957B-66691F865D8B
 * ```
 * 
 */
@ResourceType(type="aws:amp/workspace:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    /**
     * The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
     * 
     */
    @OutputExport(name="alias", type=String.class, parameters={})
    private Output</* @Nullable */ String> alias;

    /**
     * @return The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
     * 
     */
    public Output</* @Nullable */ String> getAlias() {
        return this.alias;
    }
    /**
     * Amazon Resource Name (ARN) of the workspace.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the workspace.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Prometheus endpoint available for this workspace.
     * 
     */
    @OutputExport(name="prometheusEndpoint", type=String.class, parameters={})
    private Output<String> prometheusEndpoint;

    /**
     * @return Prometheus endpoint available for this workspace.
     * 
     */
    public Output<String> getPrometheusEndpoint() {
        return this.prometheusEndpoint;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable WorkspaceArgs.Builder a);
    }
    private static io.pulumi.aws.amp.WorkspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.amp.WorkspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workspace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workspace(String name) {
        this(name, WorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workspace(String name, @Nullable WorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, @Nullable WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/workspace:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable WorkspaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/workspace:Workspace", name, state, makeResourceOptions(options, id));
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
    public static Workspace get(String name, Input<String> id, @Nullable WorkspaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, state, options);
    }
}