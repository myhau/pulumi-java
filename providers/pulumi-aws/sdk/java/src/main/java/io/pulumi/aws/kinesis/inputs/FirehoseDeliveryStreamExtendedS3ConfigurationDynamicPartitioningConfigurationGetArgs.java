// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs();

    /**
     * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
     * 
     */
    @InputImport(name="retryDuration")
      private final @Nullable Input<Integer> retryDuration;

    public Input<Integer> getRetryDuration() {
        return this.retryDuration == null ? Input.empty() : this.retryDuration;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> retryDuration) {
        this.enabled = enabled;
        this.retryDuration = retryDuration;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.retryDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> retryDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retryDuration = defaults.retryDuration;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setRetryDuration(@Nullable Input<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Input.ofNullable(retryDuration);
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationGetArgs(enabled, retryDuration);
        }
    }
}
