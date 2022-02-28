// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticache.ReplicationGroupArgs;
import io.pulumi.aws.elasticache.inputs.ReplicationGroupState;
import io.pulumi.aws.elasticache.outputs.ReplicationGroupClusterMode;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an ElastiCache Replication Group resource.
 * 
 * For working with a [Memcached cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/WhatIs.html) or a
 * [single-node Redis instance (Cluster Mode Disabled)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/WhatIs.html),
 * see the `aws.elasticache.Cluster` resource.
 * 
 * > **Note:** When you change an attribute, such as `engine_version`, by
 * default the ElastiCache API applies it in the next maintenance window. Because
 * of this, this provider may report a difference in its planning phase because the
 * actual modification has not yet taken place. You can use the
 * `apply_immediately` flag to instruct the service to apply the change
 * immediately. Using `apply_immediately` can result in a brief downtime as
 * servers reboots.
 * See the AWS Documentation on
 * [Modifying an ElastiCache Cache Cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Modify.html)
 * for more information.
 * 
 * > **Note:** Any attribute changes that re-create the resource will be applied immediately, regardless of the value of `apply_immediately`.
 * 
 * > **Note:** Be aware of the terminology collision around "cluster" for `aws.elasticache.ReplicationGroup`. For example, it is possible to create a ["Cluster Mode Disabled [Redis] Cluster"](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Create.CON.Redis.html). With "Cluster Mode Enabled", the data will be stored in shards (called "node groups"). See [Redis Cluster Configuration](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/cluster-create-determine-requirements.html#redis-cluster-configuration) for a diagram of the differences. To enable cluster mode, use a parameter group that has cluster mode enabled. The default parameter groups provided by AWS end with ".cluster.on", for example `default.redis6.x.cluster.on`.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ElastiCache Replication Groups can be imported using the `replication_group_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticache/replicationGroup:ReplicationGroup my_replication_group replication-group-1
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/replicationGroup:ReplicationGroup")
public class ReplicationGroup extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @OutputExport(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * ARN of the created ElastiCache Replication Group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the created ElastiCache Replication Group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether to enable encryption at rest.
     * 
     */
    @OutputExport(name="atRestEncryptionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> atRestEncryptionEnabled;

    /**
     * @return Whether to enable encryption at rest.
     * 
     */
    public Output<Boolean> getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }
    /**
     * Password used to access a password protected server. Can be specified only if `transit_encryption_enabled = true`.
     * 
     */
    @OutputExport(name="authToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> authToken;

    /**
     * @return Password used to access a password protected server. Can be specified only if `transit_encryption_enabled = true`.
     * 
     */
    public Output</* @Nullable */ String> getAuthToken() {
        return this.authToken;
    }
    /**
     * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. This parameter is currently not supported by the AWS API. Defaults to `true`.
     * 
     */
    @OutputExport(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. This parameter is currently not supported by the AWS API. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If enabled, `number_cache_clusters` must be greater than 1. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
     * 
     */
    @OutputExport(name="automaticFailoverEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticFailoverEnabled;

    /**
     * @return Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If enabled, `number_cache_clusters` must be greater than 1. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }
    /**
     * List of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
     * 
     */
    @OutputExport(name="availabilityZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> availabilityZones;

    /**
     * @return List of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
     * 
     */
    public Output</* @Nullable */ List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * Indicates if cluster mode is enabled.
     * 
     */
    @OutputExport(name="clusterEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> clusterEnabled;

    /**
     * @return Indicates if cluster mode is enabled.
     * 
     */
    public Output<Boolean> getClusterEnabled() {
        return this.clusterEnabled;
    }
    /**
     * Create a native Redis cluster. `automatic_failover_enabled` must be set to true. Cluster Mode documented below. Only 1 `cluster_mode` block is allowed. Note that configuring this block does not enable cluster mode, i.e., data sharding, this requires using a parameter group that has the parameter `cluster-enabled` set to true.
     * 
     */
    @OutputExport(name="clusterMode", type=ReplicationGroupClusterMode.class, parameters={})
    private Output<ReplicationGroupClusterMode> clusterMode;

    /**
     * @return Create a native Redis cluster. `automatic_failover_enabled` must be set to true. Cluster Mode documented below. Only 1 `cluster_mode` block is allowed. Note that configuring this block does not enable cluster mode, i.e., data sharding, this requires using a parameter group that has the parameter `cluster-enabled` set to true.
     * 
     */
    public Output<ReplicationGroupClusterMode> getClusterMode() {
        return this.clusterMode;
    }
    /**
     * Address of the replication group configuration endpoint when cluster mode is enabled.
     * 
     */
    @OutputExport(name="configurationEndpointAddress", type=String.class, parameters={})
    private Output<String> configurationEndpointAddress;

    /**
     * @return Address of the replication group configuration endpoint when cluster mode is enabled.
     * 
     */
    public Output<String> getConfigurationEndpointAddress() {
        return this.configurationEndpointAddress;
    }
    /**
     * Enables data tiering. Data tiering is only supported for replication groups using the r6gd node type. This parameter must be set to `true` when using r6gd nodes.
     * 
     */
    @OutputExport(name="dataTieringEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> dataTieringEnabled;

    /**
     * @return Enables data tiering. Data tiering is only supported for replication groups using the r6gd node type. This parameter must be set to `true` when using r6gd nodes.
     * 
     */
    public Output<Boolean> getDataTieringEnabled() {
        return this.dataTieringEnabled;
    }
    /**
     * Name of the cache engine to be used for the clusters in this replication group. The only valid value is `redis`.
     * 
     */
    @OutputExport(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return Name of the cache engine to be used for the clusters in this replication group. The only valid value is `redis`.
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * Version number of the cache engine to be used for the cache clusters in this replication group. If the version is 6 or higher, only the major version can be set, e.g., `6.x`, otherwise, specify the full version desired, e.g., `5.0.6`. The actual engine version used is returned in the attribute `engine_version_actual`, defined below.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Version number of the cache engine to be used for the cache clusters in this replication group. If the version is 6 or higher, only the major version can be set, e.g., `6.x`, otherwise, specify the full version desired, e.g., `5.0.6`. The actual engine version used is returned in the attribute `engine_version_actual`, defined below.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Running version of the cache engine.
     * 
     */
    @OutputExport(name="engineVersionActual", type=String.class, parameters={})
    private Output<String> engineVersionActual;

    /**
     * @return Running version of the cache engine.
     * 
     */
    public Output<String> getEngineVersionActual() {
        return this.engineVersionActual;
    }
    /**
     * The name of your final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster. If omitted, no final snapshot will be made.
     * 
     */
    @OutputExport(name="finalSnapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The name of your final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster. If omitted, no final snapshot will be made.
     * 
     */
    public Output</* @Nullable */ String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }
    /**
     * The ID of the global replication group to which this replication group should belong. If this parameter is specified, the replication group is added to the specified global replication group as a secondary replication group; otherwise, the replication group is not part of any global replication group. If `global_replication_group_id` is set, the `num_node_groups` parameter of the `cluster_mode` block cannot be set.
     * 
     */
    @OutputExport(name="globalReplicationGroupId", type=String.class, parameters={})
    private Output<String> globalReplicationGroupId;

    /**
     * @return The ID of the global replication group to which this replication group should belong. If this parameter is specified, the replication group is added to the specified global replication group as a secondary replication group; otherwise, the replication group is not part of any global replication group. If `global_replication_group_id` is set, the `num_node_groups` parameter of the `cluster_mode` block cannot be set.
     * 
     */
    public Output<String> getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }
    /**
     * The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `at_rest_encryption_enabled = true`.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `at_rest_encryption_enabled = true`.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Specifies the weekly time range for when maintenance on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
     * 
     */
    @OutputExport(name="maintenanceWindow", type=String.class, parameters={})
    private Output<String> maintenanceWindow;

    /**
     * @return Specifies the weekly time range for when maintenance on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
     * 
     */
    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * Identifiers of all the nodes that are part of this replication group.
     * 
     */
    @OutputExport(name="memberClusters", type=List.class, parameters={String.class})
    private Output<List<String>> memberClusters;

    /**
     * @return Identifiers of all the nodes that are part of this replication group.
     * 
     */
    public Output<List<String>> getMemberClusters() {
        return this.memberClusters;
    }
    /**
     * Specifies whether to enable Multi-AZ Support for the replication group. If `true`, `automatic_failover_enabled` must also be enabled. Defaults to `false`.
     * 
     */
    @OutputExport(name="multiAzEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multiAzEnabled;

    /**
     * @return Specifies whether to enable Multi-AZ Support for the replication group. If `true`, `automatic_failover_enabled` must also be enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getMultiAzEnabled() {
        return this.multiAzEnabled;
    }
    /**
     * Instance class to be used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html). Required unless `global_replication_group_id` is set. Cannot be set if `global_replication_group_id` is set.
     * 
     */
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return Instance class to be used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html). Required unless `global_replication_group_id` is set. Cannot be set if `global_replication_group_id` is set.
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * ARN of an SNS topic to send ElastiCache notifications to. Example: `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    @OutputExport(name="notificationTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationTopicArn;

    /**
     * @return ARN of an SNS topic to send ElastiCache notifications to. Example: `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    public Output</* @Nullable */ String> getNotificationTopicArn() {
        return this.notificationTopicArn;
    }
    /**
     * Number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications. One of `number_cache_clusters` or `cluster_mode` is required.
     * 
     */
    @OutputExport(name="numberCacheClusters", type=Integer.class, parameters={})
    private Output<Integer> numberCacheClusters;

    /**
     * @return Number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications. One of `number_cache_clusters` or `cluster_mode` is required.
     * 
     */
    public Output<Integer> getNumberCacheClusters() {
        return this.numberCacheClusters;
    }
    /**
     * Name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used. To enable "cluster mode", i.e., data sharding, use a parameter group that has the parameter `cluster-enabled` set to true.
     * 
     */
    @OutputExport(name="parameterGroupName", type=String.class, parameters={})
    private Output<String> parameterGroupName;

    /**
     * @return Name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used. To enable "cluster mode", i.e., data sharding, use a parameter group that has the parameter `cluster-enabled` set to true.
     * 
     */
    public Output<String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * Port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * (Redis only) Address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
     * 
     */
    @OutputExport(name="primaryEndpointAddress", type=String.class, parameters={})
    private Output<String> primaryEndpointAddress;

    /**
     * @return (Redis only) Address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
     * 
     */
    public Output<String> getPrimaryEndpointAddress() {
        return this.primaryEndpointAddress;
    }
    /**
     * (Redis only) Address of the endpoint for the reader node in the replication group, if the cluster mode is disabled.
     * 
     */
    @OutputExport(name="readerEndpointAddress", type=String.class, parameters={})
    private Output<String> readerEndpointAddress;

    /**
     * @return (Redis only) Address of the endpoint for the reader node in the replication group, if the cluster mode is disabled.
     * 
     */
    public Output<String> getReaderEndpointAddress() {
        return this.readerEndpointAddress;
    }
    /**
     * User-created description for the replication group.
     * 
     */
    @OutputExport(name="replicationGroupDescription", type=String.class, parameters={})
    private Output<String> replicationGroupDescription;

    /**
     * @return User-created description for the replication group.
     * 
     */
    public Output<String> getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }
    /**
     * Replication group identifier. This parameter is stored as a lowercase string.
     * 
     */
    @OutputExport(name="replicationGroupId", type=String.class, parameters={})
    private Output<String> replicationGroupId;

    /**
     * @return Replication group identifier. This parameter is stored as a lowercase string.
     * 
     */
    public Output<String> getReplicationGroupId() {
        return this.replicationGroupId;
    }
    /**
     * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
     * 
     */
    @OutputExport(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupIds;

    /**
     * @return One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
     * 
     */
    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * List of cache security group names to associate with this replication group.
     * 
     */
    @OutputExport(name="securityGroupNames", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupNames;

    /**
     * @return List of cache security group names to associate with this replication group.
     * 
     */
    public Output<List<String>> getSecurityGroupNames() {
        return this.securityGroupNames;
    }
    /**
     * List of ARNs that identify Redis RDB snapshot files stored in Amazon S3. The names object names cannot contain any commas.
     * 
     */
    @OutputExport(name="snapshotArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> snapshotArns;

    /**
     * @return List of ARNs that identify Redis RDB snapshot files stored in Amazon S3. The names object names cannot contain any commas.
     * 
     */
    public Output</* @Nullable */ List<String>> getSnapshotArns() {
        return this.snapshotArns;
    }
    /**
     * Name of a snapshot from which to restore data into the new node group. Changing the `snapshot_name` forces a new resource.
     * 
     */
    @OutputExport(name="snapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotName;

    /**
     * @return Name of a snapshot from which to restore data into the new node group. Changing the `snapshot_name` forces a new resource.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotName() {
        return this.snapshotName;
    }
    /**
     * Number of days for which ElastiCache will retain automatic cache cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days before being deleted. If the value of `snapshot_retention_limit` is set to zero (0), backups are turned off. Please note that setting a `snapshot_retention_limit` is not supported on cache.t1.micro cache nodes
     * 
     */
    @OutputExport(name="snapshotRetentionLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> snapshotRetentionLimit;

    /**
     * @return Number of days for which ElastiCache will retain automatic cache cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days before being deleted. If the value of `snapshot_retention_limit` is set to zero (0), backups are turned off. Please note that setting a `snapshot_retention_limit` is not supported on cache.t1.micro cache nodes
     * 
     */
    public Output</* @Nullable */ Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * Daily time range (in UTC) during which ElastiCache will begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
     * 
     */
    @OutputExport(name="snapshotWindow", type=String.class, parameters={})
    private Output<String> snapshotWindow;

    /**
     * @return Daily time range (in UTC) during which ElastiCache will begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
     * 
     */
    public Output<String> getSnapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * Name of the cache subnet group to be used for the replication group.
     * 
     */
    @OutputExport(name="subnetGroupName", type=String.class, parameters={})
    private Output<String> subnetGroupName;

    /**
     * @return Name of the cache subnet group to be used for the replication group.
     * 
     */
    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Whether to enable encryption in transit.
     * 
     */
    @OutputExport(name="transitEncryptionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> transitEncryptionEnabled;

    /**
     * @return Whether to enable encryption in transit.
     * 
     */
    public Output<Boolean> getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }
    /**
     * User Group ID to associate with the replication group. Only a maximum of one (1) user group ID is valid. **NOTE:** This argument _is_ a set because the AWS specification allows for multiple IDs. However, in practice, AWS only allows a maximum size of one.
     * 
     */
    @OutputExport(name="userGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> userGroupIds;

    /**
     * @return User Group ID to associate with the replication group. Only a maximum of one (1) user group ID is valid. **NOTE:** This argument _is_ a set because the AWS specification allows for multiple IDs. However, in practice, AWS only allows a maximum size of one.
     * 
     */
    public Output</* @Nullable */ List<String>> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationGroup(String name) {
        this(name, ReplicationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationGroup(String name, ReplicationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationGroup(String name, ReplicationGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/replicationGroup:ReplicationGroup", name, args == null ? ReplicationGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReplicationGroup(String name, Input<String> id, @Nullable ReplicationGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/replicationGroup:ReplicationGroup", name, state, makeResourceOptions(options, id));
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
    public static ReplicationGroup get(String name, Input<String> id, @Nullable ReplicationGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationGroup(name, id, state, options);
    }
}
