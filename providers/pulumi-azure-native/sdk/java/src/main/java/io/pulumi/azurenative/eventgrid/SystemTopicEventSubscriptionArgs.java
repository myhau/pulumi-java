// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.EventDeliverySchema;
import io.pulumi.azurenative.eventgrid.inputs.AzureFunctionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.DeadLetterWithResourceIdentityArgs;
import io.pulumi.azurenative.eventgrid.inputs.DeliveryWithResourceIdentityArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventHubEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventSubscriptionFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.HybridConnectionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.RetryPolicyArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusTopicEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageBlobDeadLetterDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.WebHookEventSubscriptionDestinationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SystemTopicEventSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemTopicEventSubscriptionArgs Empty = new SystemTopicEventSubscriptionArgs();

    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deadLetterDestination")
      private final @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;

    public Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination() {
        return this.deadLetterDestination == null ? Codegen.empty() : this.deadLetterDestination;
    }

    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deadLetterWithResourceIdentity")
      private final @Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity;

    public Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity() {
        return this.deadLetterWithResourceIdentity == null ? Codegen.empty() : this.deadLetterWithResourceIdentity;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="deliveryWithResourceIdentity")
      private final @Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity;

    public Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity() {
        return this.deliveryWithResourceIdentity == null ? Codegen.empty() : this.deliveryWithResourceIdentity;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<Object> destination;

    public Output<Object> destination() {
        return this.destination == null ? Codegen.empty() : this.destination;
    }

    /**
     * The event delivery schema for the event subscription.
     * 
     */
    @Import(name="eventDeliverySchema")
      private final @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema;

    public Output<Either<String,EventDeliverySchema>> eventDeliverySchema() {
        return this.eventDeliverySchema == null ? Codegen.empty() : this.eventDeliverySchema;
    }

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName")
      private final @Nullable Output<String> eventSubscriptionName;

    public Output<String> eventSubscriptionName() {
        return this.eventSubscriptionName == null ? Codegen.empty() : this.eventSubscriptionName;
    }

    /**
     * Expiration time of the event subscription.
     * 
     */
    @Import(name="expirationTimeUtc")
      private final @Nullable Output<String> expirationTimeUtc;

    public Output<String> expirationTimeUtc() {
        return this.expirationTimeUtc == null ? Codegen.empty() : this.expirationTimeUtc;
    }

    /**
     * Information about the filter for the event subscription.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<EventSubscriptionFilterArgs> filter;

    public Output<EventSubscriptionFilterArgs> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * List of user defined labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<String>> labels;

    public Output<List<String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Output<RetryPolicyArgs> retryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName", required=true)
      private final Output<String> systemTopicName;

    public Output<String> systemTopicName() {
        return this.systemTopicName;
    }

    public SystemTopicEventSubscriptionArgs(
        @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination,
        @Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity,
        @Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity,
        @Nullable Output<Object> destination,
        @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema,
        @Nullable Output<String> eventSubscriptionName,
        @Nullable Output<String> expirationTimeUtc,
        @Nullable Output<EventSubscriptionFilterArgs> filter,
        @Nullable Output<List<String>> labels,
        Output<String> resourceGroupName,
        @Nullable Output<RetryPolicyArgs> retryPolicy,
        Output<String> systemTopicName) {
        this.deadLetterDestination = deadLetterDestination;
        this.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
        this.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
        this.destination = destination;
        this.eventDeliverySchema = eventDeliverySchema == null ? Output.ofLeft("EventGridSchema") : eventDeliverySchema;
        this.eventSubscriptionName = eventSubscriptionName;
        this.expirationTimeUtc = expirationTimeUtc;
        this.filter = filter;
        this.labels = labels;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retryPolicy = retryPolicy;
        this.systemTopicName = Objects.requireNonNull(systemTopicName, "expected parameter 'systemTopicName' to be non-null");
    }

    private SystemTopicEventSubscriptionArgs() {
        this.deadLetterDestination = Codegen.empty();
        this.deadLetterWithResourceIdentity = Codegen.empty();
        this.deliveryWithResourceIdentity = Codegen.empty();
        this.destination = Codegen.empty();
        this.eventDeliverySchema = Codegen.empty();
        this.eventSubscriptionName = Codegen.empty();
        this.expirationTimeUtc = Codegen.empty();
        this.filter = Codegen.empty();
        this.labels = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.systemTopicName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemTopicEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;
        private @Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity;
        private @Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity;
        private @Nullable Output<Object> destination;
        private @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema;
        private @Nullable Output<String> eventSubscriptionName;
        private @Nullable Output<String> expirationTimeUtc;
        private @Nullable Output<EventSubscriptionFilterArgs> filter;
        private @Nullable Output<List<String>> labels;
        private Output<String> resourceGroupName;
        private @Nullable Output<RetryPolicyArgs> retryPolicy;
        private Output<String> systemTopicName;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemTopicEventSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.deadLetterWithResourceIdentity = defaults.deadLetterWithResourceIdentity;
    	      this.deliveryWithResourceIdentity = defaults.deliveryWithResourceIdentity;
    	      this.destination = defaults.destination;
    	      this.eventDeliverySchema = defaults.eventDeliverySchema;
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.systemTopicName = defaults.systemTopicName;
        }

        public Builder deadLetterDestination(@Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }
        public Builder deadLetterDestination(@Nullable StorageBlobDeadLetterDestinationArgs deadLetterDestination) {
            this.deadLetterDestination = Codegen.ofNullable(deadLetterDestination);
            return this;
        }
        public Builder deadLetterWithResourceIdentity(@Nullable Output<DeadLetterWithResourceIdentityArgs> deadLetterWithResourceIdentity) {
            this.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
            return this;
        }
        public Builder deadLetterWithResourceIdentity(@Nullable DeadLetterWithResourceIdentityArgs deadLetterWithResourceIdentity) {
            this.deadLetterWithResourceIdentity = Codegen.ofNullable(deadLetterWithResourceIdentity);
            return this;
        }
        public Builder deliveryWithResourceIdentity(@Nullable Output<DeliveryWithResourceIdentityArgs> deliveryWithResourceIdentity) {
            this.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
            return this;
        }
        public Builder deliveryWithResourceIdentity(@Nullable DeliveryWithResourceIdentityArgs deliveryWithResourceIdentity) {
            this.deliveryWithResourceIdentity = Codegen.ofNullable(deliveryWithResourceIdentity);
            return this;
        }
        public Builder destination(@Nullable Output<Object> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable Object destination) {
            this.destination = Codegen.ofNullable(destination);
            return this;
        }
        public Builder eventDeliverySchema(@Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema) {
            this.eventDeliverySchema = eventDeliverySchema;
            return this;
        }
        public Builder eventDeliverySchema(@Nullable Either<String,EventDeliverySchema> eventDeliverySchema) {
            this.eventDeliverySchema = Codegen.ofNullable(eventDeliverySchema);
            return this;
        }
        public Builder eventSubscriptionName(@Nullable Output<String> eventSubscriptionName) {
            this.eventSubscriptionName = eventSubscriptionName;
            return this;
        }
        public Builder eventSubscriptionName(@Nullable String eventSubscriptionName) {
            this.eventSubscriptionName = Codegen.ofNullable(eventSubscriptionName);
            return this;
        }
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }
        public Builder expirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = Codegen.ofNullable(expirationTimeUtc);
            return this;
        }
        public Builder filter(@Nullable Output<EventSubscriptionFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable EventSubscriptionFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder labels(@Nullable Output<List<String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder systemTopicName(Output<String> systemTopicName) {
            this.systemTopicName = Objects.requireNonNull(systemTopicName);
            return this;
        }
        public Builder systemTopicName(String systemTopicName) {
            this.systemTopicName = Output.of(Objects.requireNonNull(systemTopicName));
            return this;
        }        public SystemTopicEventSubscriptionArgs build() {
            return new SystemTopicEventSubscriptionArgs(deadLetterDestination, deadLetterWithResourceIdentity, deliveryWithResourceIdentity, destination, eventDeliverySchema, eventSubscriptionName, expirationTimeUtc, filter, labels, resourceGroupName, retryPolicy, systemTopicName);
        }
    }
}
