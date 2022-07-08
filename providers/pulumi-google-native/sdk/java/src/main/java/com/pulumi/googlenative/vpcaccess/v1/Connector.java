// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vpcaccess.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vpcaccess.v1.ConnectorArgs;
import com.pulumi.googlenative.vpcaccess.v1.outputs.SubnetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Serverless VPC Access connector, returns an operation.
 * 
 */
@ResourceType(type="google-native:vpcaccess/v1:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    /**
     * List of projects using the connector.
     * 
     */
    @Export(name="connectedProjects", type=List.class, parameters={String.class})
    private Output<List<String>> connectedProjects;

    /**
     * @return List of projects using the connector.
     * 
     */
    public Output<List<String>> connectedProjects() {
        return this.connectedProjects;
    }
    /**
     * Required. The ID to use for this connector.
     * 
     */
    @Export(name="connectorId", type=String.class, parameters={})
    private Output<String> connectorId;

    /**
     * @return Required. The ID to use for this connector.
     * 
     */
    public Output<String> connectorId() {
        return this.connectorId;
    }
    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @Export(name="ipCidrRange", type=String.class, parameters={})
    private Output<String> ipCidrRange;

    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }
    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Export(name="maxInstances", type=Integer.class, parameters={})
    private Output<Integer> maxInstances;

    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> maxInstances() {
        return this.maxInstances;
    }
    /**
     * Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    @Export(name="maxThroughput", type=Integer.class, parameters={})
    private Output<Integer> maxThroughput;

    /**
     * @return Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    public Output<Integer> maxThroughput() {
        return this.maxThroughput;
    }
    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Export(name="minInstances", type=Integer.class, parameters={})
    private Output<Integer> minInstances;

    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> minInstances() {
        return this.minInstances;
    }
    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @Export(name="minThroughput", type=Integer.class, parameters={})
    private Output<Integer> minThroughput;

    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    public Output<Integer> minThroughput() {
        return this.minThroughput;
    }
    /**
     * The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of a VPC network.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Name of a VPC network.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * State of the VPC access connector.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the VPC access connector.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The subnet in which to house the VPC Access Connector.
     * 
     */
    @Export(name="subnet", type=SubnetResponse.class, parameters={})
    private Output<SubnetResponse> subnet;

    /**
     * @return The subnet in which to house the VPC Access Connector.
     * 
     */
    public Output<SubnetResponse> subnet() {
        return this.subnet;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vpcaccess/v1:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vpcaccess/v1:Connector", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connector get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}
