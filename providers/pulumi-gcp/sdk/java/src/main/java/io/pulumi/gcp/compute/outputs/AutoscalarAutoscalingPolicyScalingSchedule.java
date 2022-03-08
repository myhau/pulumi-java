// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscalarAutoscalingPolicyScalingSchedule {
    /**
     * An optional description of this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    private final Integer durationSec;
    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    private final Integer minRequiredReplicas;
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String name;
    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    private final String schedule;
    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"description","disabled","durationSec","minRequiredReplicas","name","schedule","timeZone"})
    private AutoscalarAutoscalingPolicyScalingSchedule(
        @Nullable String description,
        @Nullable Boolean disabled,
        Integer durationSec,
        Integer minRequiredReplicas,
        String name,
        String schedule,
        @Nullable String timeZone) {
        this.description = description;
        this.disabled = disabled;
        this.durationSec = durationSec;
        this.minRequiredReplicas = minRequiredReplicas;
        this.name = name;
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    /**
     * An optional description of this resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
    */
    public Optional<Boolean> getDisabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
    */
    public Integer getDurationSec() {
        return this.durationSec;
    }
    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
    */
    public Integer getMinRequiredReplicas() {
        return this.minRequiredReplicas;
    }
    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
    */
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
    */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScalingSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean disabled;
        private Integer durationSec;
        private Integer minRequiredReplicas;
        private String name;
        private String schedule;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScalingSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.durationSec = defaults.durationSec;
    	      this.minRequiredReplicas = defaults.minRequiredReplicas;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDurationSec(Integer durationSec) {
            this.durationSec = Objects.requireNonNull(durationSec);
            return this;
        }

        public Builder setMinRequiredReplicas(Integer minRequiredReplicas) {
            this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public AutoscalarAutoscalingPolicyScalingSchedule build() {
            return new AutoscalarAutoscalingPolicyScalingSchedule(description, disabled, durationSec, minRequiredReplicas, name, schedule, timeZone);
        }
    }
}
