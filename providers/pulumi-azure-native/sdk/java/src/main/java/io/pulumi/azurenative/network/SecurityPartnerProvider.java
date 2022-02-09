// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.SecurityPartnerProviderArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:SecurityPartnerProvider")
public class SecurityPartnerProvider extends io.pulumi.resources.CustomResource {
    @OutputExport(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    public Output<String> getConnectionStatus() {
        return this.connectionStatus;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
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
    @OutputExport(name="securityProviderName", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProviderName;

    public Output</* @Nullable */ String> getSecurityProviderName() {
        return this.securityProviderName;
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
    @OutputExport(name="virtualHub", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualHub;

    public Output</* @Nullable */ SubResourceResponse> getVirtualHub() {
        return this.virtualHub;
    }

    public SecurityPartnerProvider(String name, SecurityPartnerProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityPartnerProvider", name, args == null ? SecurityPartnerProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityPartnerProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityPartnerProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200301:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:SecurityPartnerProvider").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:SecurityPartnerProvider").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SecurityPartnerProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityPartnerProvider(name, id, options);
    }
}