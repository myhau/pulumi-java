// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MaintenanceWindowResponse {
    /**
     * Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end-time must be in the future, relative to `start_time`.
     * 
     */
    private final String endTime;
    /**
     * Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
     */
    private final String recurrence;
    /**
     * Start time of the first recurrence of the maintenance window.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"endTime","recurrence","startTime"})
    private MaintenanceWindowResponse(
        String endTime,
        String recurrence,
        String startTime) {
        this.endTime = endTime;
        this.recurrence = recurrence;
        this.startTime = startTime;
    }

    /**
     * Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end-time must be in the future, relative to `start_time`.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
    */
    public String getRecurrence() {
        return this.recurrence;
    }
    /**
     * Start time of the first recurrence of the maintenance window.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setRecurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(endTime, recurrence, startTime);
        }
    }
}
