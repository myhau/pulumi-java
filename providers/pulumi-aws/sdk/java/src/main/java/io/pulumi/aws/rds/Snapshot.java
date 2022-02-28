// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.SnapshotArgs;
import io.pulumi.aws.rds.inputs.SnapshotState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an RDS database instance snapshot. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_db_snapshot` can be imported by using the snapshot identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/snapshot:Snapshot example my-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:rds/snapshot:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @OutputExport(name="allocatedStorage", type=Integer.class, parameters={})
    private Output<Integer> allocatedStorage;

    /**
     * @return Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    public Output<Integer> getAllocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @OutputExport(name="dbInstanceIdentifier", type=String.class, parameters={})
    private Output<String> dbInstanceIdentifier;

    /**
     * @return The DB Instance Identifier from which to take the snapshot.
     * 
     */
    public Output<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    @OutputExport(name="dbSnapshotArn", type=String.class, parameters={})
    private Output<String> dbSnapshotArn;

    /**
     * @return The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    public Output<String> getDbSnapshotArn() {
        return this.dbSnapshotArn;
    }
    /**
     * The Identifier for the snapshot.
     * 
     */
    @OutputExport(name="dbSnapshotIdentifier", type=String.class, parameters={})
    private Output<String> dbSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    @OutputExport(name="encrypted", type=Boolean.class, parameters={})
    private Output<Boolean> encrypted;

    /**
     * @return Specifies whether the DB snapshot is encrypted.
     * 
     */
    public Output<Boolean> getEncrypted() {
        return this.encrypted;
    }
    /**
     * Specifies the name of the database engine.
     * 
     */
    @OutputExport(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Specifies the name of the database engine.
     * 
     */
    public Output<String> getEngine() {
        return this.engine;
    }
    /**
     * Specifies the version of the database engine.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Specifies the version of the database engine.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    @OutputExport(name="iops", type=Integer.class, parameters={})
    private Output<Integer> iops;

    /**
     * @return Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    public Output<Integer> getIops() {
        return this.iops;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB instance.
     * 
     */
    @OutputExport(name="licenseModel", type=String.class, parameters={})
    private Output<String> licenseModel;

    /**
     * @return License model information for the restored DB instance.
     * 
     */
    public Output<String> getLicenseModel() {
        return this.licenseModel;
    }
    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    @OutputExport(name="optionGroupName", type=String.class, parameters={})
    private Output<String> optionGroupName;

    /**
     * @return Provides the option group name for the DB snapshot.
     * 
     */
    public Output<String> getOptionGroupName() {
        return this.optionGroupName;
    }
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }
    @OutputExport(name="snapshotType", type=String.class, parameters={})
    private Output<String> snapshotType;

    public Output<String> getSnapshotType() {
        return this.snapshotType;
    }
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    @OutputExport(name="sourceDbSnapshotIdentifier", type=String.class, parameters={})
    private Output<String> sourceDbSnapshotIdentifier;

    /**
     * @return The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    public Output<String> getSourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    @OutputExport(name="sourceRegion", type=String.class, parameters={})
    private Output<String> sourceRegion;

    /**
     * @return The region that the DB snapshot was created in or copied from.
     * 
     */
    public Output<String> getSourceRegion() {
        return this.sourceRegion;
    }
    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Specifies the status of this DB snapshot.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    @OutputExport(name="storageType", type=String.class, parameters={})
    private Output<String> storageType;

    /**
     * @return Specifies the storage type associated with DB snapshot.
     * 
     */
    public Output<String> getStorageType() {
        return this.storageType;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Provides the VPC ID associated with the DB snapshot.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Provides the VPC ID associated with the DB snapshot.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Snapshot(String name, Input<String> id, @Nullable SnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Input<String> id, @Nullable SnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
