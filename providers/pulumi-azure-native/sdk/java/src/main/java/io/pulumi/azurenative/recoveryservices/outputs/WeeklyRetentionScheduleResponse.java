// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.RetentionDurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WeeklyRetentionScheduleResponse {
    /**
     * List of days of week for weekly retention policy.
     * 
     */
    private final @Nullable List<String> daysOfTheWeek;
    /**
     * Retention duration of retention Policy.
     * 
     */
    private final @Nullable RetentionDurationResponse retentionDuration;
    /**
     * Retention times of retention policy.
     * 
     */
    private final @Nullable List<String> retentionTimes;

    @CustomType.Constructor
    private WeeklyRetentionScheduleResponse(
        @CustomType.Parameter("daysOfTheWeek") @Nullable List<String> daysOfTheWeek,
        @CustomType.Parameter("retentionDuration") @Nullable RetentionDurationResponse retentionDuration,
        @CustomType.Parameter("retentionTimes") @Nullable List<String> retentionTimes) {
        this.daysOfTheWeek = daysOfTheWeek;
        this.retentionDuration = retentionDuration;
        this.retentionTimes = retentionTimes;
    }

    /**
     * List of days of week for weekly retention policy.
     * 
    */
    public List<String> daysOfTheWeek() {
        return this.daysOfTheWeek == null ? List.of() : this.daysOfTheWeek;
    }
    /**
     * Retention duration of retention Policy.
     * 
    */
    public Optional<RetentionDurationResponse> retentionDuration() {
        return Optional.ofNullable(this.retentionDuration);
    }
    /**
     * Retention times of retention policy.
     * 
    */
    public List<String> retentionTimes() {
        return this.retentionTimes == null ? List.of() : this.retentionTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyRetentionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> daysOfTheWeek;
        private @Nullable RetentionDurationResponse retentionDuration;
        private @Nullable List<String> retentionTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyRetentionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionTimes = defaults.retentionTimes;
        }

        public Builder daysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }
        public Builder daysOfTheWeek(String... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }
        public Builder retentionDuration(@Nullable RetentionDurationResponse retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }
        public Builder retentionTimes(@Nullable List<String> retentionTimes) {
            this.retentionTimes = retentionTimes;
            return this;
        }
        public Builder retentionTimes(String... retentionTimes) {
            return retentionTimes(List.of(retentionTimes));
        }        public WeeklyRetentionScheduleResponse build() {
            return new WeeklyRetentionScheduleResponse(daysOfTheWeek, retentionDuration, retentionTimes);
        }
    }
}
