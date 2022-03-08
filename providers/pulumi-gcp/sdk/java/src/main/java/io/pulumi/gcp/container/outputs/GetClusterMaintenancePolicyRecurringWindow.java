// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMaintenancePolicyRecurringWindow {
    private final String endTime;
    private final String recurrence;
    private final String startTime;

    @OutputCustomType.Constructor({"endTime","recurrence","startTime"})
    private GetClusterMaintenancePolicyRecurringWindow(
        String endTime,
        String recurrence,
        String startTime) {
        this.endTime = endTime;
        this.recurrence = recurrence;
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    public String getRecurrence() {
        return this.recurrence;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMaintenancePolicyRecurringWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMaintenancePolicyRecurringWindow defaults) {
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
        public GetClusterMaintenancePolicyRecurringWindow build() {
            return new GetClusterMaintenancePolicyRecurringWindow(endTime, recurrence, startTime);
        }
    }
}
