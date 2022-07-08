// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class TrafficPercentStrategyResponse {
    /**
     * @return Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum must equal to 100.0.
     * 
     */
    private final Map<String,String> percentages;

    @CustomType.Constructor
    private TrafficPercentStrategyResponse(@CustomType.Parameter("percentages") Map<String,String> percentages) {
        this.percentages = percentages;
    }

    /**
     * @return Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum must equal to 100.0.
     * 
     */
    public Map<String,String> percentages() {
        return this.percentages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficPercentStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> percentages;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficPercentStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentages = defaults.percentages;
        }

        public Builder percentages(Map<String,String> percentages) {
            this.percentages = Objects.requireNonNull(percentages);
            return this;
        }        public TrafficPercentStrategyResponse build() {
            return new TrafficPercentStrategyResponse(percentages);
        }
    }
}
