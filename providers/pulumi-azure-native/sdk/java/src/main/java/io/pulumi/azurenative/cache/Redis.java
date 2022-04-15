// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.RedisArgs;
import io.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.cache.outputs.RedisAccessKeysResponse;
import io.pulumi.azurenative.cache.outputs.RedisCommonPropertiesResponseRedisConfiguration;
import io.pulumi.azurenative.cache.outputs.RedisInstanceDetailsResponse;
import io.pulumi.azurenative.cache.outputs.RedisLinkedServerResponse;
import io.pulumi.azurenative.cache.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A single Redis item in List or Get Operation.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:Redis cache1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/Redis/cache1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:Redis")
public class Redis extends io.pulumi.resources.CustomResource {
    /**
     * The keys of the Redis cache - not set if this object is not the response to Create or Update redis cache
     * 
     */
    @Export(name="accessKeys", type=RedisAccessKeysResponse.class, parameters={})
    private Output<RedisAccessKeysResponse> accessKeys;

    /**
     * @return The keys of the Redis cache - not set if this object is not the response to Create or Update redis cache
     * 
     */
    public Output<RedisAccessKeysResponse> accessKeys() {
        return this.accessKeys;
    }
    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    @Export(name="enableNonSslPort", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNonSslPort;

    /**
     * @return Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> enableNonSslPort() {
        return this.enableNonSslPort;
    }
    /**
     * Redis host name.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return Redis host name.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * List of the Redis instances associated with the cache
     * 
     */
    @Export(name="instances", type=List.class, parameters={RedisInstanceDetailsResponse.class})
    private Output<List<RedisInstanceDetailsResponse>> instances;

    /**
     * @return List of the Redis instances associated with the cache
     * 
     */
    public Output<List<RedisInstanceDetailsResponse>> instances() {
        return this.instances;
    }
    /**
     * List of the linked servers associated with the cache
     * 
     */
    @Export(name="linkedServers", type=List.class, parameters={RedisLinkedServerResponse.class})
    private Output<List<RedisLinkedServerResponse>> linkedServers;

    /**
     * @return List of the linked servers associated with the cache
     * 
     */
    public Output<List<RedisLinkedServerResponse>> linkedServers() {
        return this.linkedServers;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     * 
     */
    @Export(name="minimumTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimumTlsVersion;

    /**
     * @return Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     * 
     */
    public Output</* @Nullable */ String> minimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Redis non-SSL port.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Redis non-SSL port.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * List of private endpoint connection associated with the specified redis cache
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connection associated with the specified redis cache
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Redis instance provisioning status.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Redis instance provisioning status.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is 'Enabled'
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is 'Enabled'
     * 
     */
    public Output</* @Nullable */ String> publicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    @Export(name="redisConfiguration", type=RedisCommonPropertiesResponseRedisConfiguration.class, parameters={})
    private Output</* @Nullable */ RedisCommonPropertiesResponseRedisConfiguration> redisConfiguration;

    /**
     * @return All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    public Output</* @Nullable */ RedisCommonPropertiesResponseRedisConfiguration> redisConfiguration() {
        return this.redisConfiguration;
    }
    /**
     * Redis version.
     * 
     */
    @Export(name="redisVersion", type=String.class, parameters={})
    private Output<String> redisVersion;

    /**
     * @return Redis version.
     * 
     */
    public Output<String> redisVersion() {
        return this.redisVersion;
    }
    /**
     * The number of replicas to be created per master.
     * 
     */
    @Export(name="replicasPerMaster", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicasPerMaster;

    /**
     * @return The number of replicas to be created per master.
     * 
     */
    public Output</* @Nullable */ Integer> replicasPerMaster() {
        return this.replicasPerMaster;
    }
    /**
     * The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    @Export(name="shardCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> shardCount;

    /**
     * @return The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    public Output</* @Nullable */ Integer> shardCount() {
        return this.shardCount;
    }
    /**
     * The SKU of the Redis cache to deploy.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The SKU of the Redis cache to deploy.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Redis SSL port.
     * 
     */
    @Export(name="sslPort", type=Integer.class, parameters={})
    private Output<Integer> sslPort;

    /**
     * @return Redis SSL port.
     * 
     */
    public Output<Integer> sslPort() {
        return this.sslPort;
    }
    /**
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    @Export(name="staticIP", type=String.class, parameters={})
    private Output</* @Nullable */ String> staticIP;

    /**
     * @return Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    public Output</* @Nullable */ String> staticIP() {
        return this.staticIP;
    }
    /**
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    public Output</* @Nullable */ String> subnetId() {
        return this.subnetId;
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
     * A dictionary of tenant settings
     * 
     */
    @Export(name="tenantSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tenantSettings;

    /**
     * @return A dictionary of tenant settings
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tenantSettings() {
        return this.tenantSettings;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public Output</* @Nullable */ List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Redis(String name) {
        this(name, RedisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Redis(String name, RedisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Redis(String name, RedisArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:Redis", name, args == null ? RedisArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Redis(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:Redis", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cache/v20150801:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20160401:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20170201:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20171001:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20180301:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20190701:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20200601:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20201201:Redis").build()),
                Output.of(Alias.builder().type("azure-native:cache/v20210601:Redis").build())
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
    public static Redis get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Redis(name, id, options);
    }
}
