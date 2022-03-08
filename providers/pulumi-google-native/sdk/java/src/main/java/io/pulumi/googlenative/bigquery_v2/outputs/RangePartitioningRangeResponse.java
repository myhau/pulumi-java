// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RangePartitioningRangeResponse {
    /**
     * [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
     */
    private final String end;
    /**
     * [TrustedTester] [Required] The width of each interval.
     * 
     */
    private final String interval;
    /**
     * [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
     */
    private final String start;

    @OutputCustomType.Constructor({"end","interval","start"})
    private RangePartitioningRangeResponse(
        String end,
        String interval,
        String start) {
        this.end = end;
        this.interval = interval;
        this.start = start;
    }

    /**
     * [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
    */
    public String getEnd() {
        return this.end;
    }
    /**
     * [TrustedTester] [Required] The width of each interval.
     * 
    */
    public String getInterval() {
        return this.interval;
    }
    /**
     * [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
    */
    public String getStart() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RangePartitioningRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String end;
        private String interval;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(RangePartitioningRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.interval = defaults.interval;
    	      this.start = defaults.start;
        }

        public Builder setEnd(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder setInterval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public RangePartitioningRangeResponse build() {
            return new RangePartitioningRangeResponse(end, interval, start);
        }
    }
}
