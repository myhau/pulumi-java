// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.EventHubArgs;
import io.pulumi.azurenative.eventhub.outputs.CaptureDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in List or Get Event Hub operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:EventHub sdk-EventHub-10 /subscriptions/e2f361f0-3b27-4503-a9cc-21cfba380093/resourceGroups/Default-NotificationHubs-AustraliaEast/providers/Microsoft.EventHub/namespaces/sdk-Namespace-716/eventhubs/sdk-EventHub-10 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:EventHub")
public class EventHub extends io.pulumi.resources.CustomResource {
    /**
     * Properties of capture description
     * 
     */
    @Export(name="captureDescription", type=CaptureDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ CaptureDescriptionResponse> captureDescription;

    /**
     * @return Properties of capture description
     * 
     */
    public Output</* @Nullable */ CaptureDescriptionResponse> captureDescription() {
        return this.captureDescription;
    }
    /**
     * Exact time the Event Hub was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Exact time the Event Hub was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
     */
    @Export(name="messageRetentionInDays", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> messageRetentionInDays;

    /**
     * @return Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
     */
    public Output</* @Nullable */ Double> messageRetentionInDays() {
        return this.messageRetentionInDays;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
     */
    @Export(name="partitionCount", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> partitionCount;

    /**
     * @return Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
     */
    public Output</* @Nullable */ Double> partitionCount() {
        return this.partitionCount;
    }
    /**
     * Current number of shards on the Event Hub.
     * 
     */
    @Export(name="partitionIds", type=List.class, parameters={String.class})
    private Output<List<String>> partitionIds;

    /**
     * @return Current number of shards on the Event Hub.
     * 
     */
    public Output<List<String>> partitionIds() {
        return this.partitionIds;
    }
    /**
     * Enumerates the possible values for the status of the Event Hub.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Enumerates the possible values for the status of the Event Hub.
     * 
     */
    public Output</* @Nullable */ String> status() {
        return this.status;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The exact time the message was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventHub(String name) {
        this(name, EventHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventHub(String name, EventHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventHub(String name, EventHubArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:EventHub", name, args == null ? EventHubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventHub(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:EventHub", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20140901:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20150801:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20170401:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210101preview:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:EventHub").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:EventHub").build())
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
    public static EventHub get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHub(name, id, options);
    }
}
