// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecr.ReplicationConfigurationArgs;
import io.pulumi.aws.ecr.inputs.ReplicationConfigurationState;
import io.pulumi.aws.ecr.outputs.ReplicationConfigurationReplicationConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Container Registry Replication Configuration.
 * 
 * ## Example Usage
 * ## Multiple Region Usage
 * 
 * ## Repository Filter Usage
 * 
 * ## Import
 * 
 * ECR Replication Configuration can be imported using the `registry_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecr/replicationConfiguration:ReplicationConfiguration service 012345678912
 * ```
 * 
 */
@ResourceType(type="aws:ecr/replicationConfiguration:ReplicationConfiguration")
public class ReplicationConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @OutputExport(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The account ID of the destination registry to replicate to.
     * 
     */
    public Output<String> getRegistryId() {
        return this.registryId;
    }
    /**
     * Replication configuration for a registry. See Replication Configuration.
     * 
     */
    @OutputExport(name="replicationConfiguration", type=ReplicationConfigurationReplicationConfiguration.class, parameters={})
    private Output</* @Nullable */ ReplicationConfigurationReplicationConfiguration> replicationConfiguration;

    /**
     * @return Replication configuration for a registry. See Replication Configuration.
     * 
     */
    public Output</* @Nullable */ ReplicationConfigurationReplicationConfiguration> getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationConfiguration(String name) {
        this(name, ReplicationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationConfiguration(String name, @Nullable ReplicationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationConfiguration(String name, @Nullable ReplicationConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/replicationConfiguration:ReplicationConfiguration", name, args == null ? ReplicationConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReplicationConfiguration(String name, Input<String> id, @Nullable ReplicationConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/replicationConfiguration:ReplicationConfiguration", name, state, makeResourceOptions(options, id));
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
    public static ReplicationConfiguration get(String name, Input<String> id, @Nullable ReplicationConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationConfiguration(name, id, state, options);
    }
}
