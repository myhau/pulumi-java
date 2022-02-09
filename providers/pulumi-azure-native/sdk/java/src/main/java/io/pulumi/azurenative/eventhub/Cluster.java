// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.ClusterArgs;
import io.pulumi.azurenative.eventhub.outputs.ClusterSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:eventhub:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    public Output<String> getMetricId() {
        return this.metricId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sku", type=ClusterSkuResponse.class, parameters={})
    private Output</* @Nullable */ ClusterSkuResponse> sku;

    public Output</* @Nullable */ ClusterSkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
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
    @OutputExport(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    public Output<String> getUpdatedAt() {
        return this.updatedAt;
    }

    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventhub/v20180101preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20210601preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20211101:Cluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}