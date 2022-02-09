// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudMlV1__RequestLoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__RequestLoggingConfigResponse Empty = new GoogleCloudMlV1__RequestLoggingConfigResponse();

    @InputImport(name="bigqueryTableName", required=true)
    private final String bigqueryTableName;

    public String getBigqueryTableName() {
        return this.bigqueryTableName;
    }

    @InputImport(name="samplingPercentage", required=true)
    private final Double samplingPercentage;

    public Double getSamplingPercentage() {
        return this.samplingPercentage;
    }

    public GoogleCloudMlV1__RequestLoggingConfigResponse(
        String bigqueryTableName,
        Double samplingPercentage) {
        this.bigqueryTableName = Objects.requireNonNull(bigqueryTableName, "expected parameter 'bigqueryTableName' to be non-null");
        this.samplingPercentage = Objects.requireNonNull(samplingPercentage, "expected parameter 'samplingPercentage' to be non-null");
    }

    private GoogleCloudMlV1__RequestLoggingConfigResponse() {
        this.bigqueryTableName = null;
        this.samplingPercentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__RequestLoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bigqueryTableName;
        private Double samplingPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__RequestLoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryTableName = defaults.bigqueryTableName;
    	      this.samplingPercentage = defaults.samplingPercentage;
        }

        public Builder setBigqueryTableName(String bigqueryTableName) {
            this.bigqueryTableName = Objects.requireNonNull(bigqueryTableName);
            return this;
        }

        public Builder setSamplingPercentage(Double samplingPercentage) {
            this.samplingPercentage = Objects.requireNonNull(samplingPercentage);
            return this;
        }

        public GoogleCloudMlV1__RequestLoggingConfigResponse build() {
            return new GoogleCloudMlV1__RequestLoggingConfigResponse(bigqueryTableName, samplingPercentage);
        }
    }
}