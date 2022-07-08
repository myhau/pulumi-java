// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.alpha.AddressArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an address resource in the specified project by using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:Address")
public class Address extends com.pulumi.resources.CustomResource {
    /**
     * The static IP address represented by this resource.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output<String> address;

    /**
     * @return The static IP address represented by this resource.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    @Export(name="addressType", type=String.class, parameters={})
    private Output<String> addressType;

    /**
     * @return The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output<String> ipVersion;

    /**
     * @return The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The endpoint type of this address, which should be VM. This is used for deciding which endpoint this address will be assigned to during the IPv6 external IP address reservation.
     * 
     */
    @Export(name="ipv6EndpointType", type=String.class, parameters={})
    private Output<String> ipv6EndpointType;

    /**
     * @return The endpoint type of this address, which should be VM. This is used for deciding which endpoint this address will be assigned to during the IPv6 external IP address reservation.
     * 
     */
    public Output<String> ipv6EndpointType() {
        return this.ipv6EndpointType;
    }
    /**
     * Type of the resource. Always compute#address for addresses.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#address for addresses.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this Address, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Address.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this Address, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Address.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @Export(name="networkTier", type=String.class, parameters={})
    private Output<String> networkTier;

    /**
     * @return This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    public Output<String> networkTier() {
        return this.networkTier;
    }
    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @Export(name="prefixLength", type=Integer.class, parameters={})
    private Output<Integer> prefixLength;

    /**
     * @return The prefix length if the resource represents an IP range.
     * 
     */
    public Output<Integer> prefixLength() {
        return this.prefixLength;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output<String> purpose;

    /**
     * @return The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    public Output<String> purpose() {
        return this.purpose;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork&#39;s IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork&#39;s IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    public Output<String> subnetwork() {
        return this.subnetwork;
    }
    /**
     * The URLs of the resources that are using this address.
     * 
     */
    @Export(name="users", type=List.class, parameters={String.class})
    private Output<List<String>> users;

    /**
     * @return The URLs of the resources that are using this address.
     * 
     */
    public Output<List<String>> users() {
        return this.users;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Address(String name) {
        this(name, AddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Address(String name, AddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Address(String name, AddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Address", name, args == null ? AddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Address(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Address", name, null, makeResourceOptions(options, id));
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
    public static Address get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Address(name, id, options);
    }
}
