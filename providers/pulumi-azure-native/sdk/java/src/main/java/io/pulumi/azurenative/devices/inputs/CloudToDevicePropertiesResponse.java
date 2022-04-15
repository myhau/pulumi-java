// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.FeedbackPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IoT hub cloud-to-device messaging properties.
 * 
 */
public final class CloudToDevicePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudToDevicePropertiesResponse Empty = new CloudToDevicePropertiesResponse();

    /**
     * The default time to live for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     */
    @Import(name="defaultTtlAsIso8601")
      private final @Nullable String defaultTtlAsIso8601;

    public Optional<String> defaultTtlAsIso8601() {
        return this.defaultTtlAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.defaultTtlAsIso8601);
    }

    /**
     * The properties of the feedback queue for cloud-to-device messages.
     * 
     */
    @Import(name="feedback")
      private final @Nullable FeedbackPropertiesResponse feedback;

    public Optional<FeedbackPropertiesResponse> feedback() {
        return this.feedback == null ? Optional.empty() : Optional.ofNullable(this.feedback);
    }

    /**
     * The max delivery count for cloud-to-device messages in the device queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     */
    @Import(name="maxDeliveryCount")
      private final @Nullable Integer maxDeliveryCount;

    public Optional<Integer> maxDeliveryCount() {
        return this.maxDeliveryCount == null ? Optional.empty() : Optional.ofNullable(this.maxDeliveryCount);
    }

    public CloudToDevicePropertiesResponse(
        @Nullable String defaultTtlAsIso8601,
        @Nullable FeedbackPropertiesResponse feedback,
        @Nullable Integer maxDeliveryCount) {
        this.defaultTtlAsIso8601 = defaultTtlAsIso8601;
        this.feedback = feedback;
        this.maxDeliveryCount = maxDeliveryCount;
    }

    private CloudToDevicePropertiesResponse() {
        this.defaultTtlAsIso8601 = null;
        this.feedback = null;
        this.maxDeliveryCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudToDevicePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultTtlAsIso8601;
        private @Nullable FeedbackPropertiesResponse feedback;
        private @Nullable Integer maxDeliveryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudToDevicePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTtlAsIso8601 = defaults.defaultTtlAsIso8601;
    	      this.feedback = defaults.feedback;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
        }

        public Builder defaultTtlAsIso8601(@Nullable String defaultTtlAsIso8601) {
            this.defaultTtlAsIso8601 = defaultTtlAsIso8601;
            return this;
        }
        public Builder feedback(@Nullable FeedbackPropertiesResponse feedback) {
            this.feedback = feedback;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }        public CloudToDevicePropertiesResponse build() {
            return new CloudToDevicePropertiesResponse(defaultTtlAsIso8601, feedback, maxDeliveryCount);
        }
    }
}
