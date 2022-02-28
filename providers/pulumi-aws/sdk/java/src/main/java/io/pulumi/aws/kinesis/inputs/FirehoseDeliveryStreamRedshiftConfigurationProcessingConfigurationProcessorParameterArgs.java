// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs();

    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    @InputImport(name="parameterName", required=true)
      private final Input<String> parameterName;

    public Input<String> getParameterName() {
        return this.parameterName;
    }

    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    @InputImport(name="parameterValue", required=true)
      private final Input<String> parameterValue;

    public Input<String> getParameterValue() {
        return this.parameterValue;
    }

    public FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs(
        Input<String> parameterName,
        Input<String> parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs() {
        this.parameterName = Input.empty();
        this.parameterValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> parameterName;
        private Input<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterName(Input<String> parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Input.of(Objects.requireNonNull(parameterName));
            return this;
        }

        public Builder setParameterValue(Input<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Input.of(Objects.requireNonNull(parameterValue));
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs(parameterName, parameterValue);
        }
    }
}
