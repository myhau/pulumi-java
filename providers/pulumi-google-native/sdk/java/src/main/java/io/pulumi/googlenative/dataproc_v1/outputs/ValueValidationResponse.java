// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ValueValidationResponse {
    /**
     * List of allowed values for the parameter.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"values"})
    private ValueValidationResponse(List<String> values) {
        this.values = values;
    }

    /**
     * List of allowed values for the parameter.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ValueValidationResponse build() {
            return new ValueValidationResponse(values);
        }
    }
}
