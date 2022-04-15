// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingResourceMetricResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the average load trigger used for auto scaling.
 * 
 */
public final class AverageLoadScalingTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AverageLoadScalingTriggerResponse Empty = new AverageLoadScalingTriggerResponse();

    /**
     * Enumerates the triggers for auto scaling.
     * Expected value is 'AverageLoad'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
     */
    @Import(name="lowerLoadThreshold", required=true)
      private final Double lowerLoadThreshold;

    public Double lowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Description of the metric that is used for scaling.
     * 
     */
    @Import(name="metric", required=true)
      private final AutoScalingResourceMetricResponse metric;

    public AutoScalingResourceMetricResponse metric() {
        return this.metric;
    }

    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
     */
    @Import(name="scaleIntervalInSeconds", required=true)
      private final Integer scaleIntervalInSeconds;

    public Integer scaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
     */
    @Import(name="upperLoadThreshold", required=true)
      private final Double upperLoadThreshold;

    public Double upperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    public AverageLoadScalingTriggerResponse(
        String kind,
        Double lowerLoadThreshold,
        AutoScalingResourceMetricResponse metric,
        Integer scaleIntervalInSeconds,
        Double upperLoadThreshold) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold, "expected parameter 'lowerLoadThreshold' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds, "expected parameter 'scaleIntervalInSeconds' to be non-null");
        this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold, "expected parameter 'upperLoadThreshold' to be non-null");
    }

    private AverageLoadScalingTriggerResponse() {
        this.kind = null;
        this.lowerLoadThreshold = null;
        this.metric = null;
        this.scaleIntervalInSeconds = null;
        this.upperLoadThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AverageLoadScalingTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private Double lowerLoadThreshold;
        private AutoScalingResourceMetricResponse metric;
        private Integer scaleIntervalInSeconds;
        private Double upperLoadThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(AverageLoadScalingTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.lowerLoadThreshold = defaults.lowerLoadThreshold;
    	      this.metric = defaults.metric;
    	      this.scaleIntervalInSeconds = defaults.scaleIntervalInSeconds;
    	      this.upperLoadThreshold = defaults.upperLoadThreshold;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lowerLoadThreshold(Double lowerLoadThreshold) {
            this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold);
            return this;
        }
        public Builder metric(AutoScalingResourceMetricResponse metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public Builder scaleIntervalInSeconds(Integer scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds);
            return this;
        }
        public Builder upperLoadThreshold(Double upperLoadThreshold) {
            this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold);
            return this;
        }        public AverageLoadScalingTriggerResponse build() {
            return new AverageLoadScalingTriggerResponse(kind, lowerLoadThreshold, metric, scaleIntervalInSeconds, upperLoadThreshold);
        }
    }
}
