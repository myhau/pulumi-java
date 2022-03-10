// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.GoogleMonitoringV3RangeResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionCutResponse {
    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final String distributionFilter;
    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
     */
    private final GoogleMonitoringV3RangeResponse range;

    @OutputCustomType.Constructor
    private DistributionCutResponse(
        @OutputCustomType.Parameter("distributionFilter") String distributionFilter,
        @OutputCustomType.Parameter("range") GoogleMonitoringV3RangeResponse range) {
        this.distributionFilter = distributionFilter;
        this.range = range;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
    */
    public String getDistributionFilter() {
        return this.distributionFilter;
    }
    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
    */
    public GoogleMonitoringV3RangeResponse getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionFilter;
        private GoogleMonitoringV3RangeResponse range;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder setDistributionFilter(String distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }

        public Builder setRange(GoogleMonitoringV3RangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public DistributionCutResponse build() {
            return new DistributionCutResponse(distributionFilter, range);
        }
    }
}
