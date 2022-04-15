// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagecache.CacheArgs;
import io.pulumi.azurenative.storagecache.outputs.CacheDirectorySettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheEncryptionSettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheHealthResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheIdentityResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheNetworkSettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheResponseSku;
import io.pulumi.azurenative.storagecache.outputs.CacheSecuritySettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheUpgradeStatusResponse;
import io.pulumi.azurenative.storagecache.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Cache instance. Follows Azure Resource Manager standards: https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/resource-api-reference.md
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagecache:Cache sc1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scgroup/providers/Microsoft.StorageCache/caches/sc1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagecache:Cache")
public class Cache extends io.pulumi.resources.CustomResource {
    /**
     * The size of this Cache, in GB.
     * 
     */
    @Export(name="cacheSizeGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cacheSizeGB;

    /**
     * @return The size of this Cache, in GB.
     * 
     */
    public Output</* @Nullable */ Integer> cacheSizeGB() {
        return this.cacheSizeGB;
    }
    /**
     * Specifies Directory Services settings of the cache.
     * 
     */
    @Export(name="directoryServicesSettings", type=CacheDirectorySettingsResponse.class, parameters={})
    private Output</* @Nullable */ CacheDirectorySettingsResponse> directoryServicesSettings;

    /**
     * @return Specifies Directory Services settings of the cache.
     * 
     */
    public Output</* @Nullable */ CacheDirectorySettingsResponse> directoryServicesSettings() {
        return this.directoryServicesSettings;
    }
    /**
     * Specifies encryption settings of the cache.
     * 
     */
    @Export(name="encryptionSettings", type=CacheEncryptionSettingsResponse.class, parameters={})
    private Output</* @Nullable */ CacheEncryptionSettingsResponse> encryptionSettings;

    /**
     * @return Specifies encryption settings of the cache.
     * 
     */
    public Output</* @Nullable */ CacheEncryptionSettingsResponse> encryptionSettings() {
        return this.encryptionSettings;
    }
    /**
     * Health of the Cache.
     * 
     */
    @Export(name="health", type=CacheHealthResponse.class, parameters={})
    private Output<CacheHealthResponse> health;

    /**
     * @return Health of the Cache.
     * 
     */
    public Output<CacheHealthResponse> health() {
        return this.health;
    }
    /**
     * The identity of the cache, if configured.
     * 
     */
    @Export(name="identity", type=CacheIdentityResponse.class, parameters={})
    private Output</* @Nullable */ CacheIdentityResponse> identity;

    /**
     * @return The identity of the cache, if configured.
     * 
     */
    public Output</* @Nullable */ CacheIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * Region name string.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Region name string.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Array of IP addresses that can be used by clients mounting this Cache.
     * 
     */
    @Export(name="mountAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> mountAddresses;

    /**
     * @return Array of IP addresses that can be used by clients mounting this Cache.
     * 
     */
    public Output<List<String>> mountAddresses() {
        return this.mountAddresses;
    }
    /**
     * Name of Cache.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of Cache.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies network settings of the cache.
     * 
     */
    @Export(name="networkSettings", type=CacheNetworkSettingsResponse.class, parameters={})
    private Output</* @Nullable */ CacheNetworkSettingsResponse> networkSettings;

    /**
     * @return Specifies network settings of the cache.
     * 
     */
    public Output</* @Nullable */ CacheNetworkSettingsResponse> networkSettings() {
        return this.networkSettings;
    }
    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    public Output</* @Nullable */ String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies security settings of the cache.
     * 
     */
    @Export(name="securitySettings", type=CacheSecuritySettingsResponse.class, parameters={})
    private Output</* @Nullable */ CacheSecuritySettingsResponse> securitySettings;

    /**
     * @return Specifies security settings of the cache.
     * 
     */
    public Output</* @Nullable */ CacheSecuritySettingsResponse> securitySettings() {
        return this.securitySettings;
    }
    /**
     * SKU for the Cache.
     * 
     */
    @Export(name="sku", type=CacheResponseSku.class, parameters={})
    private Output</* @Nullable */ CacheResponseSku> sku;

    /**
     * @return SKU for the Cache.
     * 
     */
    public Output</* @Nullable */ CacheResponseSku> sku() {
        return this.sku;
    }
    /**
     * Subnet used for the Cache.
     * 
     */
    @Export(name="subnet", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnet;

    /**
     * @return Subnet used for the Cache.
     * 
     */
    public Output</* @Nullable */ String> subnet() {
        return this.subnet;
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system meta data relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
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
     * Type of the Cache; Microsoft.StorageCache/Cache
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the Cache; Microsoft.StorageCache/Cache
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Upgrade status of the Cache.
     * 
     */
    @Export(name="upgradeStatus", type=CacheUpgradeStatusResponse.class, parameters={})
    private Output</* @Nullable */ CacheUpgradeStatusResponse> upgradeStatus;

    /**
     * @return Upgrade status of the Cache.
     * 
     */
    public Output</* @Nullable */ CacheUpgradeStatusResponse> upgradeStatus() {
        return this.upgradeStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cache(String name) {
        this(name, CacheArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cache(String name, CacheArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cache(String name, CacheArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagecache:Cache", name, args == null ? CacheArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cache(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagecache:Cache", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storagecache/v20190801preview:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20191101:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20200301:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20201001:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20210301:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20210501:Cache").build()),
                Output.of(Alias.builder().type("azure-native:storagecache/v20210901:Cache").build())
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
    public static Cache get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cache(name, id, options);
    }
}
