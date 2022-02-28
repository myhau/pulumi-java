// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.DomainAutoTuneOptionsMaintenanceScheduleDuration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DomainAutoTuneOptionsMaintenanceSchedule {
    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    private final String cronExpressionForRecurrence;
    /**
     * Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * 
     */
    private final DomainAutoTuneOptionsMaintenanceScheduleDuration duration;
    /**
     * Date and time at which to start the Auto-Tune maintenance schedule in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final String startAt;

    @OutputCustomType.Constructor({"cronExpressionForRecurrence","duration","startAt"})
    private DomainAutoTuneOptionsMaintenanceSchedule(
        String cronExpressionForRecurrence,
        DomainAutoTuneOptionsMaintenanceScheduleDuration duration,
        String startAt) {
        this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence);
        this.duration = Objects.requireNonNull(duration);
        this.startAt = Objects.requireNonNull(startAt);
    }

    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    public String getCronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }
    /**
     * Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * 
     */
    public DomainAutoTuneOptionsMaintenanceScheduleDuration getDuration() {
        return this.duration;
    }
    /**
     * Date and time at which to start the Auto-Tune maintenance schedule in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public String getStartAt() {
        return this.startAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsMaintenanceSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cronExpressionForRecurrence;
        private DomainAutoTuneOptionsMaintenanceScheduleDuration duration;
        private String startAt;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptionsMaintenanceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpressionForRecurrence = defaults.cronExpressionForRecurrence;
    	      this.duration = defaults.duration;
    	      this.startAt = defaults.startAt;
        }

        public Builder setCronExpressionForRecurrence(String cronExpressionForRecurrence) {
            this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence);
            return this;
        }

        public Builder setDuration(DomainAutoTuneOptionsMaintenanceScheduleDuration duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartAt(String startAt) {
            this.startAt = Objects.requireNonNull(startAt);
            return this;
        }
        public DomainAutoTuneOptionsMaintenanceSchedule build() {
            return new DomainAutoTuneOptionsMaintenanceSchedule(cronExpressionForRecurrence, duration, startAt);
        }
    }
}
