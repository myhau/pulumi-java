// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SloWindowsBasedSliMetricSumInRangeRange {
    /**
     * max value for the range (inclusive). If not given,
     * will be set to "infinity", defining an open range
     * ">= range.min"
     * 
     */
    private final @Nullable Double max;
    /**
     * Min value for the range (inclusive). If not given,
     * will be set to "-infinity", defining an open range
     * "< range.max"
     * 
     */
    private final @Nullable Double min;

    @OutputCustomType.Constructor({"max","min"})
    private SloWindowsBasedSliMetricSumInRangeRange(
        @Nullable Double max,
        @Nullable Double min) {
        this.max = max;
        this.min = min;
    }

    /**
     * max value for the range (inclusive). If not given,
     * will be set to "infinity", defining an open range
     * ">= range.min"
     * 
     */
    public Optional<Double> getMax() {
        return Optional.ofNullable(this.max);
    }
    /**
     * Min value for the range (inclusive). If not given,
     * will be set to "-infinity", defining an open range
     * "< range.max"
     * 
     */
    public Optional<Double> getMin() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricSumInRangeRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double max;
        private @Nullable Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricSumInRangeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(@Nullable Double max) {
            this.max = max;
            return this;
        }

        public Builder setMin(@Nullable Double min) {
            this.min = min;
            return this;
        }

        public SloWindowsBasedSliMetricSumInRangeRange build() {
            return new SloWindowsBasedSliMetricSumInRangeRange(max, min);
        }
    }
}
