// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs;
import io.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs;
import io.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs;
import io.pulumi.aws.eks.inputs.NodeGroupTaintArgs;
import io.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. See the [AWS documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_Nodegroup.html#AmazonEKS-Type-Nodegroup-amiType) for valid values. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="amiType")
      private final @Nullable Input<String> amiType;

    public Input<String> getAmiType() {
        return this.amiType == null ? Input.empty() : this.amiType;
    }

    /**
     * Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="capacityType")
      private final @Nullable Input<String> capacityType;

    public Input<String> getCapacityType() {
        return this.capacityType == null ? Input.empty() : this.capacityType;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="diskSize")
      private final @Nullable Input<Integer> diskSize;

    public Input<Integer> getDiskSize() {
        return this.diskSize == null ? Input.empty() : this.diskSize;
    }

    /**
     * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    @InputImport(name="forceUpdateVersion")
      private final @Nullable Input<Boolean> forceUpdateVersion;

    public Input<Boolean> getForceUpdateVersion() {
        return this.forceUpdateVersion == null ? Input.empty() : this.forceUpdateVersion;
    }

    /**
     * List of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="instanceTypes")
      private final @Nullable Input<List<String>> instanceTypes;

    public Input<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Input.empty() : this.instanceTypes;
    }

    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Configuration block with Launch Template settings. Detailed below.
     * 
     */
    @InputImport(name="launchTemplate")
      private final @Nullable Input<NodeGroupLaunchTemplateArgs> launchTemplate;

    public Input<NodeGroupLaunchTemplateArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Input.empty() : this.launchTemplate;
    }

    /**
     * Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `node_group_name_prefix`.
     * 
     */
    @InputImport(name="nodeGroupName")
      private final @Nullable Input<String> nodeGroupName;

    public Input<String> getNodeGroupName() {
        return this.nodeGroupName == null ? Input.empty() : this.nodeGroupName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `node_group_name`.
     * 
     */
    @InputImport(name="nodeGroupNamePrefix")
      private final @Nullable Input<String> nodeGroupNamePrefix;

    public Input<String> getNodeGroupNamePrefix() {
        return this.nodeGroupNamePrefix == null ? Input.empty() : this.nodeGroupNamePrefix;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    @InputImport(name="nodeRoleArn", required=true)
      private final Input<String> nodeRoleArn;

    public Input<String> getNodeRoleArn() {
        return this.nodeRoleArn;
    }

    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    @InputImport(name="releaseVersion")
      private final @Nullable Input<String> releaseVersion;

    public Input<String> getReleaseVersion() {
        return this.releaseVersion == null ? Input.empty() : this.releaseVersion;
    }

    /**
     * Configuration block with remote access settings. Detailed below.
     * 
     */
    @InputImport(name="remoteAccess")
      private final @Nullable Input<NodeGroupRemoteAccessArgs> remoteAccess;

    public Input<NodeGroupRemoteAccessArgs> getRemoteAccess() {
        return this.remoteAccess == null ? Input.empty() : this.remoteAccess;
    }

    /**
     * Configuration block with scaling settings. Detailed below.
     * 
     */
    @InputImport(name="scalingConfig", required=true)
      private final Input<NodeGroupScalingConfigArgs> scalingConfig;

    public Input<NodeGroupScalingConfigArgs> getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * Key-value map of resource tags. If configured with a provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group. Detailed below.
     * 
     */
    @InputImport(name="taints")
      private final @Nullable Input<List<NodeGroupTaintArgs>> taints;

    public Input<List<NodeGroupTaintArgs>> getTaints() {
        return this.taints == null ? Input.empty() : this.taints;
    }

    @InputImport(name="updateConfig")
      private final @Nullable Input<NodeGroupUpdateConfigArgs> updateConfig;

    public Input<NodeGroupUpdateConfigArgs> getUpdateConfig() {
        return this.updateConfig == null ? Input.empty() : this.updateConfig;
    }

    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NodeGroupArgs(
        @Nullable Input<String> amiType,
        @Nullable Input<String> capacityType,
        Input<String> clusterName,
        @Nullable Input<Integer> diskSize,
        @Nullable Input<Boolean> forceUpdateVersion,
        @Nullable Input<List<String>> instanceTypes,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<NodeGroupLaunchTemplateArgs> launchTemplate,
        @Nullable Input<String> nodeGroupName,
        @Nullable Input<String> nodeGroupNamePrefix,
        Input<String> nodeRoleArn,
        @Nullable Input<String> releaseVersion,
        @Nullable Input<NodeGroupRemoteAccessArgs> remoteAccess,
        Input<NodeGroupScalingConfigArgs> scalingConfig,
        Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<NodeGroupTaintArgs>> taints,
        @Nullable Input<NodeGroupUpdateConfigArgs> updateConfig,
        @Nullable Input<String> version) {
        this.amiType = amiType;
        this.capacityType = capacityType;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.diskSize = diskSize;
        this.forceUpdateVersion = forceUpdateVersion;
        this.instanceTypes = instanceTypes;
        this.labels = labels;
        this.launchTemplate = launchTemplate;
        this.nodeGroupName = nodeGroupName;
        this.nodeGroupNamePrefix = nodeGroupNamePrefix;
        this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn, "expected parameter 'nodeRoleArn' to be non-null");
        this.releaseVersion = releaseVersion;
        this.remoteAccess = remoteAccess;
        this.scalingConfig = Objects.requireNonNull(scalingConfig, "expected parameter 'scalingConfig' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.taints = taints;
        this.updateConfig = updateConfig;
        this.version = version;
    }

    private NodeGroupArgs() {
        this.amiType = Input.empty();
        this.capacityType = Input.empty();
        this.clusterName = Input.empty();
        this.diskSize = Input.empty();
        this.forceUpdateVersion = Input.empty();
        this.instanceTypes = Input.empty();
        this.labels = Input.empty();
        this.launchTemplate = Input.empty();
        this.nodeGroupName = Input.empty();
        this.nodeGroupNamePrefix = Input.empty();
        this.nodeRoleArn = Input.empty();
        this.releaseVersion = Input.empty();
        this.remoteAccess = Input.empty();
        this.scalingConfig = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.taints = Input.empty();
        this.updateConfig = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> amiType;
        private @Nullable Input<String> capacityType;
        private Input<String> clusterName;
        private @Nullable Input<Integer> diskSize;
        private @Nullable Input<Boolean> forceUpdateVersion;
        private @Nullable Input<List<String>> instanceTypes;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<NodeGroupLaunchTemplateArgs> launchTemplate;
        private @Nullable Input<String> nodeGroupName;
        private @Nullable Input<String> nodeGroupNamePrefix;
        private Input<String> nodeRoleArn;
        private @Nullable Input<String> releaseVersion;
        private @Nullable Input<NodeGroupRemoteAccessArgs> remoteAccess;
        private Input<NodeGroupScalingConfigArgs> scalingConfig;
        private Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<NodeGroupTaintArgs>> taints;
        private @Nullable Input<NodeGroupUpdateConfigArgs> updateConfig;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.capacityType = defaults.capacityType;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.forceUpdateVersion = defaults.forceUpdateVersion;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeGroupNamePrefix = defaults.nodeGroupNamePrefix;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccess = defaults.remoteAccess;
    	      this.scalingConfig = defaults.scalingConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.updateConfig = defaults.updateConfig;
    	      this.version = defaults.version;
        }

        public Builder setAmiType(@Nullable Input<String> amiType) {
            this.amiType = amiType;
            return this;
        }

        public Builder setAmiType(@Nullable String amiType) {
            this.amiType = Input.ofNullable(amiType);
            return this;
        }

        public Builder setCapacityType(@Nullable Input<String> capacityType) {
            this.capacityType = capacityType;
            return this;
        }

        public Builder setCapacityType(@Nullable String capacityType) {
            this.capacityType = Input.ofNullable(capacityType);
            return this;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setDiskSize(@Nullable Input<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public Builder setDiskSize(@Nullable Integer diskSize) {
            this.diskSize = Input.ofNullable(diskSize);
            return this;
        }

        public Builder setForceUpdateVersion(@Nullable Input<Boolean> forceUpdateVersion) {
            this.forceUpdateVersion = forceUpdateVersion;
            return this;
        }

        public Builder setForceUpdateVersion(@Nullable Boolean forceUpdateVersion) {
            this.forceUpdateVersion = Input.ofNullable(forceUpdateVersion);
            return this;
        }

        public Builder setInstanceTypes(@Nullable Input<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder setInstanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Input.ofNullable(instanceTypes);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLaunchTemplate(@Nullable Input<NodeGroupLaunchTemplateArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder setLaunchTemplate(@Nullable NodeGroupLaunchTemplateArgs launchTemplate) {
            this.launchTemplate = Input.ofNullable(launchTemplate);
            return this;
        }

        public Builder setNodeGroupName(@Nullable Input<String> nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        public Builder setNodeGroupName(@Nullable String nodeGroupName) {
            this.nodeGroupName = Input.ofNullable(nodeGroupName);
            return this;
        }

        public Builder setNodeGroupNamePrefix(@Nullable Input<String> nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = nodeGroupNamePrefix;
            return this;
        }

        public Builder setNodeGroupNamePrefix(@Nullable String nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = Input.ofNullable(nodeGroupNamePrefix);
            return this;
        }

        public Builder setNodeRoleArn(Input<String> nodeRoleArn) {
            this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn);
            return this;
        }

        public Builder setNodeRoleArn(String nodeRoleArn) {
            this.nodeRoleArn = Input.of(Objects.requireNonNull(nodeRoleArn));
            return this;
        }

        public Builder setReleaseVersion(@Nullable Input<String> releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        public Builder setReleaseVersion(@Nullable String releaseVersion) {
            this.releaseVersion = Input.ofNullable(releaseVersion);
            return this;
        }

        public Builder setRemoteAccess(@Nullable Input<NodeGroupRemoteAccessArgs> remoteAccess) {
            this.remoteAccess = remoteAccess;
            return this;
        }

        public Builder setRemoteAccess(@Nullable NodeGroupRemoteAccessArgs remoteAccess) {
            this.remoteAccess = Input.ofNullable(remoteAccess);
            return this;
        }

        public Builder setScalingConfig(Input<NodeGroupScalingConfigArgs> scalingConfig) {
            this.scalingConfig = Objects.requireNonNull(scalingConfig);
            return this;
        }

        public Builder setScalingConfig(NodeGroupScalingConfigArgs scalingConfig) {
            this.scalingConfig = Input.of(Objects.requireNonNull(scalingConfig));
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaints(@Nullable Input<List<NodeGroupTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder setTaints(@Nullable List<NodeGroupTaintArgs> taints) {
            this.taints = Input.ofNullable(taints);
            return this;
        }

        public Builder setUpdateConfig(@Nullable Input<NodeGroupUpdateConfigArgs> updateConfig) {
            this.updateConfig = updateConfig;
            return this;
        }

        public Builder setUpdateConfig(@Nullable NodeGroupUpdateConfigArgs updateConfig) {
            this.updateConfig = Input.ofNullable(updateConfig);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public NodeGroupArgs build() {
            return new NodeGroupArgs(amiType, capacityType, clusterName, diskSize, forceUpdateVersion, instanceTypes, labels, launchTemplate, nodeGroupName, nodeGroupNamePrefix, nodeRoleArn, releaseVersion, remoteAccess, scalingConfig, subnetIds, tags, taints, updateConfig, version);
        }
    }
}
