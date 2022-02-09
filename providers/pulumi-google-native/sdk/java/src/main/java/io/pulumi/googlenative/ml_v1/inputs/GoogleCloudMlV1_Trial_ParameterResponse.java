// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudMlV1_Trial_ParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_Trial_ParameterResponse Empty = new GoogleCloudMlV1_Trial_ParameterResponse();

    @InputImport(name="floatValue", required=true)
    private final Double floatValue;

    public Double getFloatValue() {
        return this.floatValue;
    }

    @InputImport(name="intValue", required=true)
    private final String intValue;

    public String getIntValue() {
        return this.intValue;
    }

    @InputImport(name="parameter", required=true)
    private final String parameter;

    public String getParameter() {
        return this.parameter;
    }

    @InputImport(name="stringValue", required=true)
    private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    public GoogleCloudMlV1_Trial_ParameterResponse(
        Double floatValue,
        String intValue,
        String parameter,
        String stringValue) {
        this.floatValue = Objects.requireNonNull(floatValue, "expected parameter 'floatValue' to be non-null");
        this.intValue = Objects.requireNonNull(intValue, "expected parameter 'intValue' to be non-null");
        this.parameter = Objects.requireNonNull(parameter, "expected parameter 'parameter' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private GoogleCloudMlV1_Trial_ParameterResponse() {
        this.floatValue = null;
        this.intValue = null;
        this.parameter = null;
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_Trial_ParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double floatValue;
        private String intValue;
        private String parameter;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_Trial_ParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.floatValue = defaults.floatValue;
    	      this.intValue = defaults.intValue;
    	      this.parameter = defaults.parameter;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setFloatValue(Double floatValue) {
            this.floatValue = Objects.requireNonNull(floatValue);
            return this;
        }

        public Builder setIntValue(String intValue) {
            this.intValue = Objects.requireNonNull(intValue);
            return this;
        }

        public Builder setParameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public GoogleCloudMlV1_Trial_ParameterResponse build() {
            return new GoogleCloudMlV1_Trial_ParameterResponse(floatValue, intValue, parameter, stringValue);
        }
    }
}