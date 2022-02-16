// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TaskSchedule {
    private final String scheduleExpression;

    @OutputCustomType.Constructor({"scheduleExpression"})
    private TaskSchedule(String scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
    }

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public TaskSchedule build() {
            return new TaskSchedule(scheduleExpression);
        }
    }
}