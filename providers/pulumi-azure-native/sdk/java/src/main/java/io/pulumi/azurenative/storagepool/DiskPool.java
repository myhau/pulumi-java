// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagepool.DiskPoolArgs;
import io.pulumi.azurenative.storagepool.outputs.DiskResponse;
import io.pulumi.azurenative.storagepool.outputs.SystemMetadataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Response for Disk pool request.
 * API Version: 2020-03-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagepool:DiskPool myDiskPool /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.StoragePool/diskPools/myDiskPool 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagepool:DiskPool")
public class DiskPool extends io.pulumi.resources.CustomResource {
    /**
     * List of additional capabilities for Disk pool.
     * 
     */
    @Export(name="additionalCapabilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalCapabilities;

    /**
     * @return List of additional capabilities for Disk pool.
     * 
     */
    public Output</* @Nullable */ List<String>> additionalCapabilities() {
        return this.additionalCapabilities;
    }
    /**
     * Logical zone for Disk pool resource; example: ["1"].
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return Logical zone for Disk pool resource; example: ["1"].
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
     */
    @Export(name="disks", type=List.class, parameters={DiskResponse.class})
    private Output</* @Nullable */ List<DiskResponse>> disks;

    /**
     * @return List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
     */
    public Output</* @Nullable */ List<DiskResponse>> disks() {
        return this.disks;
    }
    /**
     * The geo-location where the resource lives.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
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
     * State of the operation on the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the operation on the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Operational status of the Disk pool.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Operational status of the Disk pool.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Azure Resource ID of a Subnet for the Disk pool.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * Resource metadata required by ARM RPC
     * 
     */
    @Export(name="systemData", type=SystemMetadataResponse.class, parameters={})
    private Output<SystemMetadataResponse> systemData;

    /**
     * @return Resource metadata required by ARM RPC
     * 
     */
    public Output<SystemMetadataResponse> systemData() {
        return this.systemData;
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
     * Determines the SKU of VM deployed for Disk pool
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return Determines the SKU of VM deployed for Disk pool
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskPool(String name) {
        this(name, DiskPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskPool(String name, DiskPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskPool(String name, DiskPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagepool:DiskPool", name, args == null ? DiskPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskPool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagepool:DiskPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storagepool/v20200315preview:DiskPool").build()),
                Output.of(Alias.builder().type("azure-native:storagepool/v20210401preview:DiskPool").build()),
                Output.of(Alias.builder().type("azure-native:storagepool/v20210801:DiskPool").build())
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
    public static DiskPool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiskPool(name, id, options);
    }
}
