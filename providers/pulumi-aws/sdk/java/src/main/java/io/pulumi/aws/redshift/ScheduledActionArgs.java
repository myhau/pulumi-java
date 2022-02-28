// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * The description of the scheduled action.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to enable the scheduled action. Default is `true` .
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The IAM role to assume to run the scheduled action.
     * 
     */
    @InputImport(name="iamRole", required=true)
      private final Input<String> iamRole;

    public Input<String> getIamRole() {
        return this.iamRole;
    }

    /**
     * The scheduled action name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Target action. Documented below.
     * 
     */
    @InputImport(name="targetAction", required=true)
      private final Input<ScheduledActionTargetActionArgs> targetAction;

    public Input<ScheduledActionTargetActionArgs> getTargetAction() {
        return this.targetAction;
    }

    public ScheduledActionArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> endTime,
        Input<String> iamRole,
        @Nullable Input<String> name,
        Input<String> schedule,
        @Nullable Input<String> startTime,
        Input<ScheduledActionTargetActionArgs> targetAction) {
        this.description = description;
        this.enable = enable;
        this.endTime = endTime;
        this.iamRole = Objects.requireNonNull(iamRole, "expected parameter 'iamRole' to be non-null");
        this.name = name;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startTime = startTime;
        this.targetAction = Objects.requireNonNull(targetAction, "expected parameter 'targetAction' to be non-null");
    }

    private ScheduledActionArgs() {
        this.description = Input.empty();
        this.enable = Input.empty();
        this.endTime = Input.empty();
        this.iamRole = Input.empty();
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.startTime = Input.empty();
        this.targetAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> endTime;
        private Input<String> iamRole;
        private @Nullable Input<String> name;
        private Input<String> schedule;
        private @Nullable Input<String> startTime;
        private Input<ScheduledActionTargetActionArgs> targetAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.endTime = defaults.endTime;
    	      this.iamRole = defaults.iamRole;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.targetAction = defaults.targetAction;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setIamRole(Input<String> iamRole) {
            this.iamRole = Objects.requireNonNull(iamRole);
            return this;
        }

        public Builder setIamRole(String iamRole) {
            this.iamRole = Input.of(Objects.requireNonNull(iamRole));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTargetAction(Input<ScheduledActionTargetActionArgs> targetAction) {
            this.targetAction = Objects.requireNonNull(targetAction);
            return this;
        }

        public Builder setTargetAction(ScheduledActionTargetActionArgs targetAction) {
            this.targetAction = Input.of(Objects.requireNonNull(targetAction));
            return this;
        }
        public ScheduledActionArgs build() {
            return new ScheduledActionArgs(description, enable, endTime, iamRole, name, schedule, startTime, targetAction);
        }
    }
}
