// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs Empty = new LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs();

    /**
     * A map describing the logging destination for the chosen `log_destination_type`.
     * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
     * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
     * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
     * 
     */
    @InputImport(name="logDestination", required=true)
      private final Input<Map<String,String>> logDestination;

    public Input<Map<String,String>> getLogDestination() {
        return this.logDestination;
    }

    /**
     * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
     * 
     */
    @InputImport(name="logDestinationType", required=true)
      private final Input<String> logDestinationType;

    public Input<String> getLogDestinationType() {
        return this.logDestinationType;
    }

    /**
     * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
     * 
     */
    @InputImport(name="logType", required=true)
      private final Input<String> logType;

    public Input<String> getLogType() {
        return this.logType;
    }

    public LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs(
        Input<Map<String,String>> logDestination,
        Input<String> logDestinationType,
        Input<String> logType) {
        this.logDestination = Objects.requireNonNull(logDestination, "expected parameter 'logDestination' to be non-null");
        this.logDestinationType = Objects.requireNonNull(logDestinationType, "expected parameter 'logDestinationType' to be non-null");
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs() {
        this.logDestination = Input.empty();
        this.logDestinationType = Input.empty();
        this.logType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> logDestination;
        private Input<String> logDestinationType;
        private Input<String> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logType = defaults.logType;
        }

        public Builder setLogDestination(Input<Map<String,String>> logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }

        public Builder setLogDestination(Map<String,String> logDestination) {
            this.logDestination = Input.of(Objects.requireNonNull(logDestination));
            return this;
        }

        public Builder setLogDestinationType(Input<String> logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }

        public Builder setLogDestinationType(String logDestinationType) {
            this.logDestinationType = Input.of(Objects.requireNonNull(logDestinationType));
            return this;
        }

        public Builder setLogType(Input<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Input.of(Objects.requireNonNull(logType));
            return this;
        }
        public LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs build() {
            return new LoggingConfigurationLoggingConfigurationLogDestinationConfigGetArgs(logDestination, logDestinationType, logType);
        }
    }
}
