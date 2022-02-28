// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.EipArgs;
import io.pulumi.aws.ec2.inputs.EipState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic IP resource.
 * 
 * > **Note:** EIP may require IGW to exist prior to association. Use `depends_on` to set an explicit dependency on the IGW.
 * 
 * > **Note:** Do not use `network_interface` to associate the EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocation_id` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EIPs in a VPC can be imported using their Allocation ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/eip:Eip bar eipalloc-00a10e96
 * ```
 * 
 *  EIPs in EC2 Classic can be imported using their Public IP, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/eip:Eip bar 52.0.0.0
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateAddress.html
 * 
 */
@ResourceType(type="aws:ec2/eip:Eip")
public class Eip extends io.pulumi.resources.CustomResource {
    /**
     * IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    @OutputExport(name="address", type=String.class, parameters={})
    private Output</* @Nullable */ String> address;

    /**
     * @return IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    public Output</* @Nullable */ String> getAddress() {
        return this.address;
    }
    /**
     * ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    @OutputExport(name="allocationId", type=String.class, parameters={})
    private Output<String> allocationId;

    /**
     * @return ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    public Output<String> getAllocationId() {
        return this.allocationId;
    }
    /**
     * User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    @OutputExport(name="associateWithPrivateIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> associateWithPrivateIp;

    /**
     * @return User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    public Output</* @Nullable */ String> getAssociateWithPrivateIp() {
        return this.associateWithPrivateIp;
    }
    /**
     * ID representing the association of the address with an instance in a VPC.
     * 
     */
    @OutputExport(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    /**
     * @return ID representing the association of the address with an instance in a VPC.
     * 
     */
    public Output<String> getAssociationId() {
        return this.associationId;
    }
    /**
     * Carrier IP address.
     * 
     */
    @OutputExport(name="carrierIp", type=String.class, parameters={})
    private Output<String> carrierIp;

    /**
     * @return Carrier IP address.
     * 
     */
    public Output<String> getCarrierIp() {
        return this.carrierIp;
    }
    /**
     * Customer owned IP.
     * 
     */
    @OutputExport(name="customerOwnedIp", type=String.class, parameters={})
    private Output<String> customerOwnedIp;

    /**
     * @return Customer owned IP.
     * 
     */
    public Output<String> getCustomerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    @OutputExport(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    public Output</* @Nullable */ String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * EC2 instance ID.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return EC2 instance ID.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    @OutputExport(name="networkBorderGroup", type=String.class, parameters={})
    private Output<String> networkBorderGroup;

    /**
     * @return Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    public Output<String> getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }
    /**
     * Network interface ID to associate with.
     * 
     */
    @OutputExport(name="networkInterface", type=String.class, parameters={})
    private Output<String> networkInterface;

    /**
     * @return Network interface ID to associate with.
     * 
     */
    public Output<String> getNetworkInterface() {
        return this.networkInterface;
    }
    /**
     * The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    @OutputExport(name="privateDns", type=String.class, parameters={})
    private Output<String> privateDns;

    /**
     * @return The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    public Output<String> getPrivateDns() {
        return this.privateDns;
    }
    /**
     * Contains the private IP address (if in VPC).
     * 
     */
    @OutputExport(name="privateIp", type=String.class, parameters={})
    private Output<String> privateIp;

    /**
     * @return Contains the private IP address (if in VPC).
     * 
     */
    public Output<String> getPrivateIp() {
        return this.privateIp;
    }
    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    @OutputExport(name="publicDns", type=String.class, parameters={})
    private Output<String> publicDns;

    /**
     * @return Public DNS associated with the Elastic IP address.
     * 
     */
    public Output<String> getPublicDns() {
        return this.publicDns;
    }
    /**
     * Contains the public IP address.
     * 
     */
    @OutputExport(name="publicIp", type=String.class, parameters={})
    private Output<String> publicIp;

    /**
     * @return Contains the public IP address.
     * 
     */
    public Output<String> getPublicIp() {
        return this.publicIp;
    }
    /**
     * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
     * 
     */
    @OutputExport(name="publicIpv4Pool", type=String.class, parameters={})
    private Output<String> publicIpv4Pool;

    /**
     * @return EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
     * 
     */
    public Output<String> getPublicIpv4Pool() {
        return this.publicIpv4Pool;
    }
    /**
     * Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Boolean if the EIP is in a VPC or not.
     * 
     */
    @OutputExport(name="vpc", type=Boolean.class, parameters={})
    private Output<Boolean> vpc;

    /**
     * @return Boolean if the EIP is in a VPC or not.
     * 
     */
    public Output<Boolean> getVpc() {
        return this.vpc;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Eip(String name) {
        this(name, EipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Eip(String name, @Nullable EipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Eip(String name, @Nullable EipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/eip:Eip", name, args == null ? EipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Eip(String name, Input<String> id, @Nullable EipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/eip:Eip", name, state, makeResourceOptions(options, id));
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
    public static Eip get(String name, Input<String> id, @Nullable EipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Eip(name, id, state, options);
    }
}
