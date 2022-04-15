// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.timeseriesinsights.Gen1EnvironmentArgs;
import io.pulumi.azurenative.timeseriesinsights.outputs.EnvironmentStatusResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.SkuResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.TimeSeriesIdPropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An environment is a set of time-series data available for query, and is the top level Azure Time Series Insights resource. Gen1 environments have data retention limits.
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:timeseriesinsights:Gen1Environment env1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:Gen1Environment")
public class Gen1Environment extends io.pulumi.resources.CustomResource {
    /**
     * The time the resource was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the resource was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    @Export(name="dataAccessFqdn", type=String.class, parameters={})
    private Output<String> dataAccessFqdn;

    /**
     * @return The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public Output<String> dataAccessFqdn() {
        return this.dataAccessFqdn;
    }
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    @Export(name="dataAccessId", type=String.class, parameters={})
    private Output<String> dataAccessId;

    /**
     * @return An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public Output<String> dataAccessId() {
        return this.dataAccessId;
    }
    /**
     * ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
     */
    @Export(name="dataRetentionTime", type=String.class, parameters={})
    private Output<String> dataRetentionTime;

    /**
     * @return ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
     */
    public Output<String> dataRetentionTime() {
        return this.dataRetentionTime;
    }
    /**
     * The kind of the environment.
     * Expected value is 'Gen1'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the environment.
     * Expected value is 'Gen1'.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
     */
    @Export(name="partitionKeyProperties", type=List.class, parameters={TimeSeriesIdPropertyResponse.class})
    private Output</* @Nullable */ List<TimeSeriesIdPropertyResponse>> partitionKeyProperties;

    /**
     * @return The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
     */
    public Output</* @Nullable */ List<TimeSeriesIdPropertyResponse>> partitionKeyProperties() {
        return this.partitionKeyProperties;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    @Export(name="status", type=EnvironmentStatusResponse.class, parameters={})
    private Output<EnvironmentStatusResponse> status;

    /**
     * @return An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    public Output<EnvironmentStatusResponse> status() {
        return this.status;
    }
    /**
     * The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
     */
    @Export(name="storageLimitExceededBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageLimitExceededBehavior;

    /**
     * @return The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
     */
    public Output</* @Nullable */ String> storageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gen1Environment(String name) {
        this(name, Gen1EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gen1Environment(String name, Gen1EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gen1Environment(String name, Gen1EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:Gen1Environment", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private Gen1Environment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:Gen1Environment", name, null, makeResourceOptions(options, id));
    }

    private static Gen1EnvironmentArgs makeArgs(Gen1EnvironmentArgs args) {
        var builder = args == null ? Gen1EnvironmentArgs.builder() : Gen1EnvironmentArgs.builder(args);
        return builder
            .kind("Gen1")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20170228preview:Gen1Environment").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20171115:Gen1Environment").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20180815preview:Gen1Environment").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20200515:Gen1Environment").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210331preview:Gen1Environment").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210630preview:Gen1Environment").build())
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
    public static Gen1Environment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gen1Environment(name, id, options);
    }
}
