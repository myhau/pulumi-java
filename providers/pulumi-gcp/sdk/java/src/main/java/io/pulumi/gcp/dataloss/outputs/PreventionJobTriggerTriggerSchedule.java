// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerTriggerSchedule {
    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
     * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
     * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String recurrencePeriodDuration;

    @OutputCustomType.Constructor({"recurrencePeriodDuration"})
    private PreventionJobTriggerTriggerSchedule(@Nullable String recurrencePeriodDuration) {
        this.recurrencePeriodDuration = recurrencePeriodDuration;
    }

    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
     * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
     * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getRecurrencePeriodDuration() {
        return Optional.ofNullable(this.recurrencePeriodDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerTriggerSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recurrencePeriodDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerTriggerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrencePeriodDuration = defaults.recurrencePeriodDuration;
        }

        public Builder setRecurrencePeriodDuration(@Nullable String recurrencePeriodDuration) {
            this.recurrencePeriodDuration = recurrencePeriodDuration;
            return this;
        }

        public PreventionJobTriggerTriggerSchedule build() {
            return new PreventionJobTriggerTriggerSchedule(recurrencePeriodDuration);
        }
    }
}
