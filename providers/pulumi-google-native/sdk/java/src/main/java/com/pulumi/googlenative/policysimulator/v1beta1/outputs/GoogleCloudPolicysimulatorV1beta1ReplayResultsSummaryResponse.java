// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.policysimulator.v1beta1.outputs.GoogleTypeDateResponse;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse {
    /**
     * @return The number of replayed log entries with a difference between baseline and simulated policies.
     * 
     */
    private final Integer differenceCount;
    /**
     * @return The number of log entries that could not be replayed.
     * 
     */
    private final Integer errorCount;
    /**
     * @return The total number of log entries replayed.
     * 
     */
    private final Integer logCount;
    /**
     * @return The date of the newest log entry replayed.
     * 
     */
    private final GoogleTypeDateResponse newestDate;
    /**
     * @return The date of the oldest log entry replayed.
     * 
     */
    private final GoogleTypeDateResponse oldestDate;
    /**
     * @return The number of replayed log entries with no difference between baseline and simulated policies.
     * 
     */
    private final Integer unchangedCount;

    @CustomType.Constructor
    private GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse(
        @CustomType.Parameter("differenceCount") Integer differenceCount,
        @CustomType.Parameter("errorCount") Integer errorCount,
        @CustomType.Parameter("logCount") Integer logCount,
        @CustomType.Parameter("newestDate") GoogleTypeDateResponse newestDate,
        @CustomType.Parameter("oldestDate") GoogleTypeDateResponse oldestDate,
        @CustomType.Parameter("unchangedCount") Integer unchangedCount) {
        this.differenceCount = differenceCount;
        this.errorCount = errorCount;
        this.logCount = logCount;
        this.newestDate = newestDate;
        this.oldestDate = oldestDate;
        this.unchangedCount = unchangedCount;
    }

    /**
     * @return The number of replayed log entries with a difference between baseline and simulated policies.
     * 
     */
    public Integer differenceCount() {
        return this.differenceCount;
    }
    /**
     * @return The number of log entries that could not be replayed.
     * 
     */
    public Integer errorCount() {
        return this.errorCount;
    }
    /**
     * @return The total number of log entries replayed.
     * 
     */
    public Integer logCount() {
        return this.logCount;
    }
    /**
     * @return The date of the newest log entry replayed.
     * 
     */
    public GoogleTypeDateResponse newestDate() {
        return this.newestDate;
    }
    /**
     * @return The date of the oldest log entry replayed.
     * 
     */
    public GoogleTypeDateResponse oldestDate() {
        return this.oldestDate;
    }
    /**
     * @return The number of replayed log entries with no difference between baseline and simulated policies.
     * 
     */
    public Integer unchangedCount() {
        return this.unchangedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer differenceCount;
        private Integer errorCount;
        private Integer logCount;
        private GoogleTypeDateResponse newestDate;
        private GoogleTypeDateResponse oldestDate;
        private Integer unchangedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.differenceCount = defaults.differenceCount;
    	      this.errorCount = defaults.errorCount;
    	      this.logCount = defaults.logCount;
    	      this.newestDate = defaults.newestDate;
    	      this.oldestDate = defaults.oldestDate;
    	      this.unchangedCount = defaults.unchangedCount;
        }

        public Builder differenceCount(Integer differenceCount) {
            this.differenceCount = Objects.requireNonNull(differenceCount);
            return this;
        }
        public Builder errorCount(Integer errorCount) {
            this.errorCount = Objects.requireNonNull(errorCount);
            return this;
        }
        public Builder logCount(Integer logCount) {
            this.logCount = Objects.requireNonNull(logCount);
            return this;
        }
        public Builder newestDate(GoogleTypeDateResponse newestDate) {
            this.newestDate = Objects.requireNonNull(newestDate);
            return this;
        }
        public Builder oldestDate(GoogleTypeDateResponse oldestDate) {
            this.oldestDate = Objects.requireNonNull(oldestDate);
            return this;
        }
        public Builder unchangedCount(Integer unchangedCount) {
            this.unchangedCount = Objects.requireNonNull(unchangedCount);
            return this;
        }        public GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse build() {
            return new GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse(differenceCount, errorCount, logCount, newestDate, oldestDate, unchangedCount);
        }
    }
}
