// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.NodePoolArgs;
import io.pulumi.gcp.container.inputs.NodePoolState;
import io.pulumi.gcp.container.outputs.NodePoolAutoscaling;
import io.pulumi.gcp.container.outputs.NodePoolManagement;
import io.pulumi.gcp.container.outputs.NodePoolNetworkConfig;
import io.pulumi.gcp.container.outputs.NodePoolNodeConfig;
import io.pulumi.gcp.container.outputs.NodePoolUpgradeSettings;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:container/nodePool:NodePool")
public class NodePool extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoscaling", type=NodePoolAutoscaling.class, parameters={})
    private Output</* @Nullable */ NodePoolAutoscaling> autoscaling;

    public Output</* @Nullable */ NodePoolAutoscaling> getAutoscaling() {
        return this.autoscaling;
    }
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }
    @OutputExport(name="initialNodeCount", type=Integer.class, parameters={})
    private Output<Integer> initialNodeCount;

    public Output<Integer> getInitialNodeCount() {
        return this.initialNodeCount;
    }
    @OutputExport(name="instanceGroupUrls", type=List.class, parameters={String.class})
    private Output<List<String>> instanceGroupUrls;

    public Output<List<String>> getInstanceGroupUrls() {
        return this.instanceGroupUrls;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedInstanceGroupUrls", type=List.class, parameters={String.class})
    private Output<List<String>> managedInstanceGroupUrls;

    public Output<List<String>> getManagedInstanceGroupUrls() {
        return this.managedInstanceGroupUrls;
    }
    @OutputExport(name="management", type=NodePoolManagement.class, parameters={})
    private Output<NodePoolManagement> management;

    public Output<NodePoolManagement> getManagement() {
        return this.management;
    }
    @OutputExport(name="maxPodsPerNode", type=Integer.class, parameters={})
    private Output<Integer> maxPodsPerNode;

    public Output<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    @OutputExport(name="networkConfig", type=NodePoolNetworkConfig.class, parameters={})
    private Output<NodePoolNetworkConfig> networkConfig;

    public Output<NodePoolNetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }
    @OutputExport(name="nodeConfig", type=NodePoolNodeConfig.class, parameters={})
    private Output<NodePoolNodeConfig> nodeConfig;

    public Output<NodePoolNodeConfig> getNodeConfig() {
        return this.nodeConfig;
    }
    @OutputExport(name="nodeCount", type=Integer.class, parameters={})
    private Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount;
    }
    @OutputExport(name="nodeLocations", type=List.class, parameters={String.class})
    private Output<List<String>> nodeLocations;

    public Output<List<String>> getNodeLocations() {
        return this.nodeLocations;
    }
    @OutputExport(name="operation", type=String.class, parameters={})
    private Output<String> operation;

    public Output<String> getOperation() {
        return this.operation;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="upgradeSettings", type=NodePoolUpgradeSettings.class, parameters={})
    private Output<NodePoolUpgradeSettings> upgradeSettings;

    public Output<NodePoolUpgradeSettings> getUpgradeSettings() {
        return this.upgradeSettings;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public NodePool(String name, NodePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/nodePool:NodePool", name, args == null ? NodePoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodePool(String name, Input<String> id, @Nullable NodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/nodePool:NodePool", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NodePool get(String name, Input<String> id, @Nullable NodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, state, options);
    }
}