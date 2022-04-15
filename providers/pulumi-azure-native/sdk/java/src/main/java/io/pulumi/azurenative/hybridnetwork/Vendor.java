// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.VendorArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Vendor resource.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridnetwork:Vendor TestVendor /subscriptions/subid/providers/Microsoft.HybridNetwork/vendors/TestVendor 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:Vendor")
public class Vendor extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the vendor resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the vendor resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * A list of IDs of the vendor skus offered by the vendor.
     * 
     */
    @Export(name="skus", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> skus;

    /**
     * @return A list of IDs of the vendor skus offered by the vendor.
     * 
     */
    public Output<List<SubResourceResponse>> skus() {
        return this.skus;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vendor(String name) {
        this(name, VendorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vendor(String name, @Nullable VendorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vendor(String name, @Nullable VendorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:Vendor", name, args == null ? VendorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vendor(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:Vendor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20200101preview:Vendor").build()),
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20210501:Vendor").build())
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
    public static Vendor get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vendor(name, id, options);
    }
}
