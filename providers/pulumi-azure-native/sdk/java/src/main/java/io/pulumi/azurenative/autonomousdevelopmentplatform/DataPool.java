// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.autonomousdevelopmentplatform.DataPoolArgs;
import io.pulumi.azurenative.autonomousdevelopmentplatform.outputs.DataPoolLocationResponse;
import io.pulumi.azurenative.autonomousdevelopmentplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:autonomousdevelopmentplatform:DataPool")
public class DataPool extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataPoolId", type=String.class, parameters={})
    private Output<String> dataPoolId;

    public Output<String> getDataPoolId() {
        return this.dataPoolId;
    }
    @OutputExport(name="locations", type=List.class, parameters={DataPoolLocationResponse.class})
    private Output<List<DataPoolLocationResponse>> locations;

    public Output<List<DataPoolLocationResponse>> getLocations() {
        return this.locations;
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
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DataPool(String name, DataPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:autonomousdevelopmentplatform:DataPool", name, args == null ? DataPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:autonomousdevelopmentplatform:DataPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:autonomousdevelopmentplatform/v20200701preview:DataPool").build()),
                Input.of(Alias.builder().setType("azure-native:autonomousdevelopmentplatform/v20210201preview:DataPool").build()),
                Input.of(Alias.builder().setType("azure-native:autonomousdevelopmentplatform/v20211101preview:DataPool").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DataPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataPool(name, id, options);
    }
}