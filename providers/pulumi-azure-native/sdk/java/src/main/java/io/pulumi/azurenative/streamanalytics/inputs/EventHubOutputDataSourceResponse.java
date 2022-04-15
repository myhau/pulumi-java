// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub output data source.
 * 
 */
public final class EventHubOutputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventHubOutputDataSourceResponse Empty = new EventHubOutputDataSourceResponse();

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable String eventHubName;

    public Optional<String> eventHubName() {
        return this.eventHubName == null ? Optional.empty() : Optional.ofNullable(this.eventHubName);
    }

    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable String partitionKey;

    public Optional<String> partitionKey() {
        return this.partitionKey == null ? Optional.empty() : Optional.ofNullable(this.partitionKey);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serviceBusNamespace")
      private final @Nullable String serviceBusNamespace;

    public Optional<String> serviceBusNamespace() {
        return this.serviceBusNamespace == null ? Optional.empty() : Optional.ofNullable(this.serviceBusNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
      private final @Nullable String sharedAccessPolicyKey;

    public Optional<String> sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyName")
      private final @Nullable String sharedAccessPolicyName;

    public Optional<String> sharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public EventHubOutputDataSourceResponse(
        @Nullable String eventHubName,
        @Nullable String partitionKey,
        @Nullable String serviceBusNamespace,
        @Nullable String sharedAccessPolicyKey,
        @Nullable String sharedAccessPolicyName,
        String type) {
        this.eventHubName = eventHubName;
        this.partitionKey = partitionKey;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventHubOutputDataSourceResponse() {
        this.eventHubName = null;
        this.partitionKey = null;
        this.serviceBusNamespace = null;
        this.sharedAccessPolicyKey = null;
        this.sharedAccessPolicyName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubName;
        private @Nullable String partitionKey;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.partitionKey = defaults.partitionKey;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }
        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }
        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EventHubOutputDataSourceResponse build() {
            return new EventHubOutputDataSourceResponse(eventHubName, partitionKey, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
