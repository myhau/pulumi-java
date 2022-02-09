// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ZoneArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:Zone")
public class Zone extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="maxNumberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordSets;

    public Output<Double> getMaxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    @OutputExport(name="maxNumberOfRecordsPerRecordSet", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordsPerRecordSet;

    public Output<Double> getMaxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    @OutputExport(name="numberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> numberOfRecordSets;

    public Output<Double> getNumberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    @OutputExport(name="registrationVirtualNetworks", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> registrationVirtualNetworks;

    public Output</* @Nullable */ List<SubResourceResponse>> getRegistrationVirtualNetworks() {
        return this.registrationVirtualNetworks;
    }
    @OutputExport(name="resolutionVirtualNetworks", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> resolutionVirtualNetworks;

    public Output</* @Nullable */ List<SubResourceResponse>> getResolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="zoneType", type=String.class, parameters={})
    private Output</* @Nullable */ String> zoneType;

    public Output</* @Nullable */ String> getZoneType() {
        return this.zoneType;
    }

    public Zone(String name, ZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Zone", name, args == null ? ZoneArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Zone(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Zone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20150504preview:Zone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160401:Zone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:Zone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:Zone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180301preview:Zone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180501:Zone").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Zone get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, options);
    }
}