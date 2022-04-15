// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.IpAllocationArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * IpAllocation resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:IpAllocation test-ipallocation /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/IpAllocations/test-ipallocation 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:IpAllocation")
public class IpAllocation extends io.pulumi.resources.CustomResource {
    /**
     * IpAllocation tags.
     * 
     */
    @Export(name="allocationTags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> allocationTags;

    /**
     * @return IpAllocation tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> allocationTags() {
        return this.allocationTags;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The IPAM allocation ID.
     * 
     */
    @Export(name="ipamAllocationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipamAllocationId;

    /**
     * @return The IPAM allocation ID.
     * 
     */
    public Output</* @Nullable */ String> ipamAllocationId() {
        return this.ipamAllocationId;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The address prefix for the IpAllocation.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return The address prefix for the IpAllocation.
     * 
     */
    public Output</* @Nullable */ String> prefix() {
        return this.prefix;
    }
    /**
     * The address prefix length for the IpAllocation.
     * 
     */
    @Export(name="prefixLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> prefixLength;

    /**
     * @return The address prefix length for the IpAllocation.
     * 
     */
    public Output</* @Nullable */ Integer> prefixLength() {
        return this.prefixLength;
    }
    /**
     * The address prefix Type for the IpAllocation.
     * 
     */
    @Export(name="prefixType", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefixType;

    /**
     * @return The address prefix Type for the IpAllocation.
     * 
     */
    public Output</* @Nullable */ String> prefixType() {
        return this.prefixType;
    }
    /**
     * The Subnet that using the prefix of this IpAllocation resource.
     * 
     */
    @Export(name="subnet", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> subnet;

    /**
     * @return The Subnet that using the prefix of this IpAllocation resource.
     * 
     */
    public Output<SubResourceResponse> subnet() {
        return this.subnet;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The VirtualNetwork that using the prefix of this IpAllocation resource.
     * 
     */
    @Export(name="virtualNetwork", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> virtualNetwork;

    /**
     * @return The VirtualNetwork that using the prefix of this IpAllocation resource.
     * 
     */
    public Output<SubResourceResponse> virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpAllocation(String name) {
        this(name, IpAllocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpAllocation(String name, IpAllocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpAllocation(String name, IpAllocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:IpAllocation", name, args == null ? IpAllocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpAllocation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:IpAllocation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200301:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:IpAllocation").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:IpAllocation").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IpAllocation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IpAllocation(name, id, options);
    }
}
