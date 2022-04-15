// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * The time.
 * 
 */
public final class TimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimeResponse Empty = new TimeResponse();

    /**
     * The hour.
     * 
     */
    @Import(name="hours", required=true)
      private final Integer hours;

    public Integer hours() {
        return this.hours;
    }

    /**
     * The minute.
     * 
     */
    @Import(name="minutes", required=true)
      private final Integer minutes;

    public Integer minutes() {
        return this.minutes;
    }

    /**
     * The second.
     * 
     */
    @Import(name="seconds", required=true)
      private final Integer seconds;

    public Integer seconds() {
        return this.seconds;
    }

    public TimeResponse(
        Integer hours,
        Integer minutes,
        Integer seconds) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private TimeResponse() {
        this.hours = null;
        this.minutes = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public TimeResponse build() {
            return new TimeResponse(hours, minutes, seconds);
        }
    }
}
