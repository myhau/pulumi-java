// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.ResourceGroupArgs;
import io.pulumi.azurenative.resources.outputs.ResourceGroupPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:resources:ResourceGroup")
public class ResourceGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBy;

    public Output</* @Nullable */ String> getManagedBy() {
        return this.managedBy;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=ResourceGroupPropertiesResponse.class, parameters={})
    private Output<ResourceGroupPropertiesResponse> properties;

    public Output<ResourceGroupPropertiesResponse> getProperties() {
        return this.properties;
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

    public ResourceGroup(String name, @Nullable ResourceGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:ResourceGroup", name, args == null ? ResourceGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:ResourceGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:resources/v20151101:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20160201:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20160701:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20160901:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20170510:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20180201:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20180501:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190301:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190501:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190510:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190701:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190801:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20191001:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20200601:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20200801:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20201001:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20210101:ResourceGroup").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20210401:ResourceGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ResourceGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroup(name, id, options);
    }
}