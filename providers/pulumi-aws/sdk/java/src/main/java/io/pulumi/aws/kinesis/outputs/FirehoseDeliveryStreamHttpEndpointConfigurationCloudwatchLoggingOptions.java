// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions {
    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    private final @Nullable String logGroupName;
    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    private final @Nullable String logStreamName;

    @OutputCustomType.Constructor({"enabled","logGroupName","logStreamName"})
    private FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions(
        @Nullable Boolean enabled,
        @Nullable String logGroupName,
        @Nullable String logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    public Optional<String> getLogGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    public Optional<String> getLogStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String logGroupName;
        private @Nullable String logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogStreamName(@Nullable String logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions(enabled, logGroupName, logStreamName);
        }
    }
}
