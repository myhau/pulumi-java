// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final TopicSubscriptionState Empty = new TopicSubscriptionState();

    /**
     * ARN of the subscription.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     * 
     */
    @InputImport(name="confirmationTimeoutInMinutes")
      private final @Nullable Input<Integer> confirmationTimeoutInMinutes;

    public Input<Integer> getConfirmationTimeoutInMinutes() {
        return this.confirmationTimeoutInMinutes == null ? Input.empty() : this.confirmationTimeoutInMinutes;
    }

    /**
     * Whether the subscription confirmation request was authenticated.
     * 
     */
    @InputImport(name="confirmationWasAuthenticated")
      private final @Nullable Input<Boolean> confirmationWasAuthenticated;

    public Input<Boolean> getConfirmationWasAuthenticated() {
        return this.confirmationWasAuthenticated == null ? Input.empty() : this.confirmationWasAuthenticated;
    }

    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     * 
     */
    @InputImport(name="deliveryPolicy")
      private final @Nullable Input<String> deliveryPolicy;

    public Input<String> getDeliveryPolicy() {
        return this.deliveryPolicy == null ? Input.empty() : this.deliveryPolicy;
    }

    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     * 
     */
    @InputImport(name="endpointAutoConfirms")
      private final @Nullable Input<Boolean> endpointAutoConfirms;

    public Input<Boolean> getEndpointAutoConfirms() {
        return this.endpointAutoConfirms == null ? Input.empty() : this.endpointAutoConfirms;
    }

    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     * 
     */
    @InputImport(name="filterPolicy")
      private final @Nullable Input<String> filterPolicy;

    public Input<String> getFilterPolicy() {
        return this.filterPolicy == null ? Input.empty() : this.filterPolicy;
    }

    /**
     * AWS account ID of the subscription's owner.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * Whether the subscription has not been confirmed.
     * 
     */
    @InputImport(name="pendingConfirmation")
      private final @Nullable Input<Boolean> pendingConfirmation;

    public Input<Boolean> getPendingConfirmation() {
        return this.pendingConfirmation == null ? Input.empty() : this.pendingConfirmation;
    }

    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     * 
     */
    @InputImport(name="rawMessageDelivery")
      private final @Nullable Input<Boolean> rawMessageDelivery;

    public Input<Boolean> getRawMessageDelivery() {
        return this.rawMessageDelivery == null ? Input.empty() : this.rawMessageDelivery;
    }

    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     * 
     */
    @InputImport(name="redrivePolicy")
      private final @Nullable Input<String> redrivePolicy;

    public Input<String> getRedrivePolicy() {
        return this.redrivePolicy == null ? Input.empty() : this.redrivePolicy;
    }

    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     * 
     */
    @InputImport(name="subscriptionRoleArn")
      private final @Nullable Input<String> subscriptionRoleArn;

    public Input<String> getSubscriptionRoleArn() {
        return this.subscriptionRoleArn == null ? Input.empty() : this.subscriptionRoleArn;
    }

    /**
     * ARN of the SNS topic to subscribe to.
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public TopicSubscriptionState(
        @Nullable Input<String> arn,
        @Nullable Input<Integer> confirmationTimeoutInMinutes,
        @Nullable Input<Boolean> confirmationWasAuthenticated,
        @Nullable Input<String> deliveryPolicy,
        @Nullable Input<String> endpoint,
        @Nullable Input<Boolean> endpointAutoConfirms,
        @Nullable Input<String> filterPolicy,
        @Nullable Input<String> ownerId,
        @Nullable Input<Boolean> pendingConfirmation,
        @Nullable Input<String> protocol,
        @Nullable Input<Boolean> rawMessageDelivery,
        @Nullable Input<String> redrivePolicy,
        @Nullable Input<String> subscriptionRoleArn,
        @Nullable Input<String> topic) {
        this.arn = arn;
        this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
        this.confirmationWasAuthenticated = confirmationWasAuthenticated;
        this.deliveryPolicy = deliveryPolicy;
        this.endpoint = endpoint;
        this.endpointAutoConfirms = endpointAutoConfirms;
        this.filterPolicy = filterPolicy;
        this.ownerId = ownerId;
        this.pendingConfirmation = pendingConfirmation;
        this.protocol = protocol;
        this.rawMessageDelivery = rawMessageDelivery;
        this.redrivePolicy = redrivePolicy;
        this.subscriptionRoleArn = subscriptionRoleArn;
        this.topic = topic;
    }

    private TopicSubscriptionState() {
        this.arn = Input.empty();
        this.confirmationTimeoutInMinutes = Input.empty();
        this.confirmationWasAuthenticated = Input.empty();
        this.deliveryPolicy = Input.empty();
        this.endpoint = Input.empty();
        this.endpointAutoConfirms = Input.empty();
        this.filterPolicy = Input.empty();
        this.ownerId = Input.empty();
        this.pendingConfirmation = Input.empty();
        this.protocol = Input.empty();
        this.rawMessageDelivery = Input.empty();
        this.redrivePolicy = Input.empty();
        this.subscriptionRoleArn = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Integer> confirmationTimeoutInMinutes;
        private @Nullable Input<Boolean> confirmationWasAuthenticated;
        private @Nullable Input<String> deliveryPolicy;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<Boolean> endpointAutoConfirms;
        private @Nullable Input<String> filterPolicy;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Boolean> pendingConfirmation;
        private @Nullable Input<String> protocol;
        private @Nullable Input<Boolean> rawMessageDelivery;
        private @Nullable Input<String> redrivePolicy;
        private @Nullable Input<String> subscriptionRoleArn;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.confirmationTimeoutInMinutes = defaults.confirmationTimeoutInMinutes;
    	      this.confirmationWasAuthenticated = defaults.confirmationWasAuthenticated;
    	      this.deliveryPolicy = defaults.deliveryPolicy;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointAutoConfirms = defaults.endpointAutoConfirms;
    	      this.filterPolicy = defaults.filterPolicy;
    	      this.ownerId = defaults.ownerId;
    	      this.pendingConfirmation = defaults.pendingConfirmation;
    	      this.protocol = defaults.protocol;
    	      this.rawMessageDelivery = defaults.rawMessageDelivery;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.subscriptionRoleArn = defaults.subscriptionRoleArn;
    	      this.topic = defaults.topic;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setConfirmationTimeoutInMinutes(@Nullable Input<Integer> confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            return this;
        }

        public Builder setConfirmationTimeoutInMinutes(@Nullable Integer confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = Input.ofNullable(confirmationTimeoutInMinutes);
            return this;
        }

        public Builder setConfirmationWasAuthenticated(@Nullable Input<Boolean> confirmationWasAuthenticated) {
            this.confirmationWasAuthenticated = confirmationWasAuthenticated;
            return this;
        }

        public Builder setConfirmationWasAuthenticated(@Nullable Boolean confirmationWasAuthenticated) {
            this.confirmationWasAuthenticated = Input.ofNullable(confirmationWasAuthenticated);
            return this;
        }

        public Builder setDeliveryPolicy(@Nullable Input<String> deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        public Builder setDeliveryPolicy(@Nullable String deliveryPolicy) {
            this.deliveryPolicy = Input.ofNullable(deliveryPolicy);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setEndpointAutoConfirms(@Nullable Input<Boolean> endpointAutoConfirms) {
            this.endpointAutoConfirms = endpointAutoConfirms;
            return this;
        }

        public Builder setEndpointAutoConfirms(@Nullable Boolean endpointAutoConfirms) {
            this.endpointAutoConfirms = Input.ofNullable(endpointAutoConfirms);
            return this;
        }

        public Builder setFilterPolicy(@Nullable Input<String> filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }

        public Builder setFilterPolicy(@Nullable String filterPolicy) {
            this.filterPolicy = Input.ofNullable(filterPolicy);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPendingConfirmation(@Nullable Input<Boolean> pendingConfirmation) {
            this.pendingConfirmation = pendingConfirmation;
            return this;
        }

        public Builder setPendingConfirmation(@Nullable Boolean pendingConfirmation) {
            this.pendingConfirmation = Input.ofNullable(pendingConfirmation);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setRawMessageDelivery(@Nullable Input<Boolean> rawMessageDelivery) {
            this.rawMessageDelivery = rawMessageDelivery;
            return this;
        }

        public Builder setRawMessageDelivery(@Nullable Boolean rawMessageDelivery) {
            this.rawMessageDelivery = Input.ofNullable(rawMessageDelivery);
            return this;
        }

        public Builder setRedrivePolicy(@Nullable Input<String> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder setRedrivePolicy(@Nullable String redrivePolicy) {
            this.redrivePolicy = Input.ofNullable(redrivePolicy);
            return this;
        }

        public Builder setSubscriptionRoleArn(@Nullable Input<String> subscriptionRoleArn) {
            this.subscriptionRoleArn = subscriptionRoleArn;
            return this;
        }

        public Builder setSubscriptionRoleArn(@Nullable String subscriptionRoleArn) {
            this.subscriptionRoleArn = Input.ofNullable(subscriptionRoleArn);
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }
        public TopicSubscriptionState build() {
            return new TopicSubscriptionState(arn, confirmationTimeoutInMinutes, confirmationWasAuthenticated, deliveryPolicy, endpoint, endpointAutoConfirms, filterPolicy, ownerId, pendingConfirmation, protocol, rawMessageDelivery, redrivePolicy, subscriptionRoleArn, topic);
        }
    }
}
