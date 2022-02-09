// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagepool.DiskPoolArgs;
import io.pulumi.azurenative.storagepool.outputs.DiskResponse;
import io.pulumi.azurenative.storagepool.outputs.SystemMetadataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storagepool:DiskPool")
public class DiskPool extends io.pulumi.resources.CustomResource {
    @OutputExport(name="additionalCapabilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalCapabilities;

    public Output</* @Nullable */ List<String>> getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }
    @OutputExport(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    @OutputExport(name="disks", type=List.class, parameters={DiskResponse.class})
    private Output</* @Nullable */ List<DiskResponse>> disks;

    public Output</* @Nullable */ List<DiskResponse>> getDisks() {
        return this.disks;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    @OutputExport(name="systemData", type=SystemMetadataResponse.class, parameters={})
    private Output<SystemMetadataResponse> systemData;

    public Output<SystemMetadataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    public Output<String> getTier() {
        return this.tier;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DiskPool(String name, DiskPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagepool:DiskPool", name, args == null ? DiskPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DiskPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagepool:DiskPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storagepool/v20200315preview:DiskPool").build()),
                Input.of(Alias.builder().setType("azure-native:storagepool/v20210401preview:DiskPool").build()),
                Input.of(Alias.builder().setType("azure-native:storagepool/v20210801:DiskPool").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DiskPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiskPool(name, id, options);
    }
}