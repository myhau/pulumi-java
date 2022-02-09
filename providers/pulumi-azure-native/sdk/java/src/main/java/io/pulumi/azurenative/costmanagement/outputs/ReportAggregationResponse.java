// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReportAggregationResponse {
    private final String function;
    private final String name;

    @OutputCustomType.Constructor({"function","name"})
    private ReportAggregationResponse(
        String function,
        String name) {
        this.function = Objects.requireNonNull(function);
        this.name = Objects.requireNonNull(name);
    }

    public String getFunction() {
        return this.function;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ReportAggregationResponse build() {
            return new ReportAggregationResponse(function, name);
        }
    }
}