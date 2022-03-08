// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PeriodicTimerSourceInfoResponse {
    /**
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
     */
    private final String schedule;
    /**
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
     */
    private final String startTime;
    /**
     * Topic where periodic events are published to IoT device.
     * 
     */
    private final @Nullable String topic;

    @OutputCustomType.Constructor({"schedule","startTime","topic"})
    private PeriodicTimerSourceInfoResponse(
        String schedule,
        String startTime,
        @Nullable String topic) {
        this.schedule = schedule;
        this.startTime = startTime;
        this.topic = topic;
    }

    /**
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
    */
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Topic where periodic events are published to IoT device.
     * 
    */
    public Optional<String> getTopic() {
        return Optional.ofNullable(this.topic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicTimerSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedule;
        private String startTime;
        private @Nullable String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicTimerSourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.topic = defaults.topic;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = topic;
            return this;
        }
        public PeriodicTimerSourceInfoResponse build() {
            return new PeriodicTimerSourceInfoResponse(schedule, startTime, topic);
        }
    }
}
