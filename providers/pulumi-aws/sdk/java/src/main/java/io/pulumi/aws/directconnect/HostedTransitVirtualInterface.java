// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.HostedTransitVirtualInterfaceArgs;
import io.pulumi.aws.directconnect.inputs.HostedTransitVirtualInterfaceState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect hosted transit virtual interface resource.
 * This resource represents the allocator's side of the hosted virtual interface.
 * A hosted virtual interface is a virtual interface that is owned by another AWS account.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Direct Connect hosted transit virtual interfaces can be imported using the `vif id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/hostedTransitVirtualInterface:HostedTransitVirtualInterface test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/hostedTransitVirtualInterface:HostedTransitVirtualInterface")
public class HostedTransitVirtualInterface extends io.pulumi.resources.CustomResource {
    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @OutputExport(name="addressFamily", type=String.class, parameters={})
    private Output<String> addressFamily;

    /**
     * @return The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    public Output<String> getAddressFamily() {
        return this.addressFamily;
    }
    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @OutputExport(name="amazonAddress", type=String.class, parameters={})
    private Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> getAmazonAddress() {
        return this.amazonAddress;
    }
    @OutputExport(name="amazonSideAsn", type=String.class, parameters={})
    private Output<String> amazonSideAsn;

    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * The ARN of the virtual interface.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the virtual interface.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @OutputExport(name="awsDevice", type=String.class, parameters={})
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    public Output<String> getAwsDevice() {
        return this.awsDevice;
    }
    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @OutputExport(name="bgpAsn", type=Integer.class, parameters={})
    private Output<Integer> bgpAsn;

    /**
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    public Output<Integer> getBgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The authentication key for BGP configuration.
     * 
     */
    @OutputExport(name="bgpAuthKey", type=String.class, parameters={})
    private Output<String> bgpAuthKey;

    /**
     * @return The authentication key for BGP configuration.
     * 
     */
    public Output<String> getBgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @OutputExport(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    public Output<String> getConnectionId() {
        return this.connectionId;
    }
    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @OutputExport(name="customerAddress", type=String.class, parameters={})
    private Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> getCustomerAddress() {
        return this.customerAddress;
    }
    /**
     * Indicates whether jumbo frames (8500 MTU) are supported.
     * 
     */
    @OutputExport(name="jumboFrameCapable", type=Boolean.class, parameters={})
    private Output<Boolean> jumboFrameCapable;

    /**
     * @return Indicates whether jumbo frames (8500 MTU) are supported.
     * 
     */
    public Output<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
     * 
     */
    @OutputExport(name="mtu", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> mtu;

    /**
     * @return The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
     * 
     */
    public Output</* @Nullable */ Integer> getMtu() {
        return this.mtu;
    }
    /**
     * The name for the virtual interface.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the virtual interface.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @OutputExport(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return The AWS account that will own the new virtual interface.
     * 
     */
    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The VLAN ID.
     * 
     */
    @OutputExport(name="vlan", type=Integer.class, parameters={})
    private Output<Integer> vlan;

    /**
     * @return The VLAN ID.
     * 
     */
    public Output<Integer> getVlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedTransitVirtualInterface(String name) {
        this(name, HostedTransitVirtualInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedTransitVirtualInterface(String name, HostedTransitVirtualInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedTransitVirtualInterface(String name, HostedTransitVirtualInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterface:HostedTransitVirtualInterface", name, args == null ? HostedTransitVirtualInterfaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HostedTransitVirtualInterface(String name, Input<String> id, @Nullable HostedTransitVirtualInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterface:HostedTransitVirtualInterface", name, state, makeResourceOptions(options, id));
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
    public static HostedTransitVirtualInterface get(String name, Input<String> id, @Nullable HostedTransitVirtualInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostedTransitVirtualInterface(name, id, state, options);
    }
}
