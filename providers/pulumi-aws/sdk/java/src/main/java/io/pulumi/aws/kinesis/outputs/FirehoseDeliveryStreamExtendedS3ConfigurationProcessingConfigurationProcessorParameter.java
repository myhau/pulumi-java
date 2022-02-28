// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter {
    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    private final String parameterName;
    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    private final String parameterValue;

    @OutputCustomType.Constructor({"parameterName","parameterValue"})
    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter(
        String parameterName,
        String parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName);
        this.parameterValue = Objects.requireNonNull(parameterValue);
    }

    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    public String getParameterName() {
        return this.parameterName;
    }
    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameter(parameterName, parameterValue);
        }
    }
}
