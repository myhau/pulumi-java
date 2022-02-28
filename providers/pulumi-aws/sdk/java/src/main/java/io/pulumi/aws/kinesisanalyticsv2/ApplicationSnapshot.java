// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationSnapshotState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Kinesis Analytics v2 Application Snapshot.
 * Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_kinesisanalyticsv2_application` can be imported by using `application_name` together with `snapshot_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot example example-application/example-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot")
public class ApplicationSnapshot extends io.pulumi.resources.CustomResource {
    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     * 
     */
    @OutputExport(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    /**
     * @return The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     * 
     */
    public Output<String> getApplicationName() {
        return this.applicationName;
    }
    /**
     * The current application version ID when the snapshot was created.
     * 
     */
    @OutputExport(name="applicationVersionId", type=Integer.class, parameters={})
    private Output<Integer> applicationVersionId;

    /**
     * @return The current application version ID when the snapshot was created.
     * 
     */
    public Output<Integer> getApplicationVersionId() {
        return this.applicationVersionId;
    }
    /**
     * The timestamp of the application snapshot.
     * 
     */
    @OutputExport(name="snapshotCreationTimestamp", type=String.class, parameters={})
    private Output<String> snapshotCreationTimestamp;

    /**
     * @return The timestamp of the application snapshot.
     * 
     */
    public Output<String> getSnapshotCreationTimestamp() {
        return this.snapshotCreationTimestamp;
    }
    /**
     * The name of the application snapshot.
     * 
     */
    @OutputExport(name="snapshotName", type=String.class, parameters={})
    private Output<String> snapshotName;

    /**
     * @return The name of the application snapshot.
     * 
     */
    public Output<String> getSnapshotName() {
        return this.snapshotName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationSnapshot(String name) {
        this(name, ApplicationSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationSnapshot(String name, ApplicationSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationSnapshot(String name, ApplicationSnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, args == null ? ApplicationSnapshotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApplicationSnapshot(String name, Input<String> id, @Nullable ApplicationSnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, state, makeResourceOptions(options, id));
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
    public static ApplicationSnapshot get(String name, Input<String> id, @Nullable ApplicationSnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationSnapshot(name, id, state, options);
    }
}
