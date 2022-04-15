// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.ResourcePoolArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Define the resourcePool.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:ResourcePool ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/ResourcePools/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:ResourcePool")
public class ResourcePool extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
     */
    @Export(name="cpuLimitMHz", type=Double.class, parameters={})
    private Output<Double> cpuLimitMHz;

    /**
     * @return Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
     */
    public Output<Double> cpuLimitMHz() {
        return this.cpuLimitMHz;
    }
    /**
     * Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
     */
    @Export(name="cpuReservationMHz", type=Double.class, parameters={})
    private Output<Double> cpuReservationMHz;

    /**
     * @return Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
     */
    public Output<Double> cpuReservationMHz() {
        return this.cpuReservationMHz;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    @Export(name="cpuSharesLevel", type=String.class, parameters={})
    private Output<String> cpuSharesLevel;

    /**
     * @return Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    public Output<String> cpuSharesLevel() {
        return this.cpuSharesLevel;
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @Export(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> customResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Gets or sets the inventory Item ID for the resource pool.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the resource pool.
     * 
     */
    public Output</* @Nullable */ String> inventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
     */
    @Export(name="memLimitMB", type=Double.class, parameters={})
    private Output<Double> memLimitMB;

    /**
     * @return Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
     */
    public Output<Double> memLimitMB() {
        return this.memLimitMB;
    }
    /**
     * Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
     */
    @Export(name="memReservationMB", type=Double.class, parameters={})
    private Output<Double> memReservationMB;

    /**
     * @return Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
     */
    public Output<Double> memReservationMB() {
        return this.memReservationMB;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    @Export(name="memSharesLevel", type=String.class, parameters={})
    private Output<String> memSharesLevel;

    /**
     * @return Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    public Output<String> memSharesLevel() {
        return this.memSharesLevel;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the resource pool.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the resource pool.
     * 
     */
    public Output<String> moName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
     */
    public Output</* @Nullable */ String> moRefId() {
        return this.moRefId;
    }
    /**
     * Gets or sets the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> statuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    public Output</* @Nullable */ String> vCenterId() {
        return this.vCenterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePool(String name) {
        this(name, ResourcePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePool(String name, ResourcePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePool(String name, ResourcePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:ResourcePool", name, args == null ? ResourcePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:ResourcePool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:ResourcePool").build())
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
    public static ResourcePool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePool(name, id, options);
    }
}
