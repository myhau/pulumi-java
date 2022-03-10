// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class HttpFaultDelayResponse {
    /**
     * Specifies the value of the fixed delay interval.
     * 
     */
    private final DurationResponse fixedDelay;
    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    private final Double percentage;

    @OutputCustomType.Constructor
    private HttpFaultDelayResponse(
        @OutputCustomType.Parameter("fixedDelay") DurationResponse fixedDelay,
        @OutputCustomType.Parameter("percentage") Double percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    /**
     * Specifies the value of the fixed delay interval.
     * 
    */
    public DurationResponse getFixedDelay() {
        return this.fixedDelay;
    }
    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
    */
    public Double getPercentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultDelayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse fixedDelay;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultDelayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(DurationResponse fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }

        public Builder setPercentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public HttpFaultDelayResponse build() {
            return new HttpFaultDelayResponse(fixedDelay, percentage);
        }
    }
}
