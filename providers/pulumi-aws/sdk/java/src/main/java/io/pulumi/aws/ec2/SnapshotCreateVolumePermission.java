// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs;
import io.pulumi.aws.ec2.inputs.SnapshotCreateVolumePermissionState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Adds permission to create volumes off of a given EBS Snapshot.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission")
public class SnapshotCreateVolumePermission extends io.pulumi.resources.CustomResource {
    /**
     * An AWS Account ID to add create volume permissions
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return An AWS Account ID to add create volume permissions
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * A snapshot ID
     * 
     */
    @OutputExport(name="snapshotId", type=String.class, parameters={})
    private Output<String> snapshotId;

    /**
     * @return A snapshot ID
     * 
     */
    public Output<String> getSnapshotId() {
        return this.snapshotId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotCreateVolumePermission(String name) {
        this(name, SnapshotCreateVolumePermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotCreateVolumePermission(String name, SnapshotCreateVolumePermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotCreateVolumePermission(String name, SnapshotCreateVolumePermissionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission", name, args == null ? SnapshotCreateVolumePermissionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SnapshotCreateVolumePermission(String name, Input<String> id, @Nullable SnapshotCreateVolumePermissionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission", name, state, makeResourceOptions(options, id));
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
    public static SnapshotCreateVolumePermission get(String name, Input<String> id, @Nullable SnapshotCreateVolumePermissionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotCreateVolumePermission(name, id, state, options);
    }
}
