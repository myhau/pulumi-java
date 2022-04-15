// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.RecurrentScheduleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RecurrenceResponse {
    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    private final String frequency;
    /**
     * the scheduling constraints for when the profile begins.
     * 
     */
    private final RecurrentScheduleResponse schedule;

    @CustomType.Constructor
    private RecurrenceResponse(
        @CustomType.Parameter("frequency") String frequency,
        @CustomType.Parameter("schedule") RecurrentScheduleResponse schedule) {
        this.frequency = frequency;
        this.schedule = schedule;
    }

    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
    */
    public String frequency() {
        return this.frequency;
    }
    /**
     * the scheduling constraints for when the profile begins.
     * 
    */
    public RecurrentScheduleResponse schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private RecurrentScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.schedule = defaults.schedule;
        }

        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder schedule(RecurrentScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }        public RecurrenceResponse build() {
            return new RecurrenceResponse(frequency, schedule);
        }
    }
}
