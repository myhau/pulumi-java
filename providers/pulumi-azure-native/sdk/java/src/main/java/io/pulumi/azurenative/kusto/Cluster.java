// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ClusterArgs;
import io.pulumi.azurenative.kusto.outputs.AzureSkuResponse;
import io.pulumi.azurenative.kusto.outputs.IdentityResponse;
import io.pulumi.azurenative.kusto.outputs.KeyVaultPropertiesResponse;
import io.pulumi.azurenative.kusto.outputs.LanguageExtensionsListResponse;
import io.pulumi.azurenative.kusto.outputs.OptimizedAutoscaleResponse;
import io.pulumi.azurenative.kusto.outputs.TrustedExternalTenantResponse;
import io.pulumi.azurenative.kusto.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:kusto:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataIngestionUri", type=String.class, parameters={})
    private Output<String> dataIngestionUri;

    public Output<String> getDataIngestionUri() {
        return this.dataIngestionUri;
    }
    @OutputExport(name="enableDiskEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDiskEncryption;

    public Output</* @Nullable */ Boolean> getEnableDiskEncryption() {
        return this.enableDiskEncryption;
    }
    @OutputExport(name="enableDoubleEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDoubleEncryption;

    public Output</* @Nullable */ Boolean> getEnableDoubleEncryption() {
        return this.enableDoubleEncryption;
    }
    @OutputExport(name="enablePurge", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePurge;

    public Output</* @Nullable */ Boolean> getEnablePurge() {
        return this.enablePurge;
    }
    @OutputExport(name="enableStreamingIngest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStreamingIngest;

    public Output</* @Nullable */ Boolean> getEnableStreamingIngest() {
        return this.enableStreamingIngest;
    }
    @OutputExport(name="engineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineType;

    public Output</* @Nullable */ String> getEngineType() {
        return this.engineType;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    public Output</* @Nullable */ KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    @OutputExport(name="languageExtensions", type=LanguageExtensionsListResponse.class, parameters={})
    private Output<LanguageExtensionsListResponse> languageExtensions;

    public Output<LanguageExtensionsListResponse> getLanguageExtensions() {
        return this.languageExtensions;
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
    @OutputExport(name="optimizedAutoscale", type=OptimizedAutoscaleResponse.class, parameters={})
    private Output</* @Nullable */ OptimizedAutoscaleResponse> optimizedAutoscale;

    public Output</* @Nullable */ OptimizedAutoscaleResponse> getOptimizedAutoscale() {
        return this.optimizedAutoscale;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="sku", type=AzureSkuResponse.class, parameters={})
    private Output<AzureSkuResponse> sku;

    public Output<AzureSkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="stateReason", type=String.class, parameters={})
    private Output<String> stateReason;

    public Output<String> getStateReason() {
        return this.stateReason;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="trustedExternalTenants", type=List.class, parameters={TrustedExternalTenantResponse.class})
    private Output</* @Nullable */ List<TrustedExternalTenantResponse>> trustedExternalTenants;

    public Output</* @Nullable */ List<TrustedExternalTenantResponse>> getTrustedExternalTenants() {
        return this.trustedExternalTenants;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }
    @OutputExport(name="virtualNetworkConfiguration", type=VirtualNetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkConfigurationResponse> virtualNetworkConfiguration;

    public Output</* @Nullable */ VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20170907privatepreview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20180907preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:Cluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}