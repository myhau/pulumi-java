// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.enums.WeekDayOfMonthDayOfWeek;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WeekDayOfMonthArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeekDayOfMonthArgs Empty = new WeekDayOfMonthArgs();

    @InputImport(name="dayOfWeek", required=true)
    private final Input<WeekDayOfMonthDayOfWeek> dayOfWeek;

    public Input<WeekDayOfMonthDayOfWeek> getDayOfWeek() {
        return this.dayOfWeek;
    }

    @InputImport(name="dayOffset")
    private final @Nullable Input<Integer> dayOffset;

    public Input<Integer> getDayOffset() {
        return this.dayOffset == null ? Input.empty() : this.dayOffset;
    }

    @InputImport(name="weekOrdinal", required=true)
    private final Input<Integer> weekOrdinal;

    public Input<Integer> getWeekOrdinal() {
        return this.weekOrdinal;
    }

    public WeekDayOfMonthArgs(
        Input<WeekDayOfMonthDayOfWeek> dayOfWeek,
        @Nullable Input<Integer> dayOffset,
        Input<Integer> weekOrdinal) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.dayOffset = dayOffset;
        this.weekOrdinal = Objects.requireNonNull(weekOrdinal, "expected parameter 'weekOrdinal' to be non-null");
    }

    private WeekDayOfMonthArgs() {
        this.dayOfWeek = Input.empty();
        this.dayOffset = Input.empty();
        this.weekOrdinal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDayOfMonthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<WeekDayOfMonthDayOfWeek> dayOfWeek;
        private @Nullable Input<Integer> dayOffset;
        private Input<Integer> weekOrdinal;

        public Builder() {
    	      // Empty
        }

        public Builder(WeekDayOfMonthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.dayOffset = defaults.dayOffset;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        public Builder setDayOfWeek(Input<WeekDayOfMonthDayOfWeek> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setDayOfWeek(WeekDayOfMonthDayOfWeek dayOfWeek) {
            this.dayOfWeek = Input.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }

        public Builder setDayOffset(@Nullable Input<Integer> dayOffset) {
            this.dayOffset = dayOffset;
            return this;
        }

        public Builder setDayOffset(@Nullable Integer dayOffset) {
            this.dayOffset = Input.ofNullable(dayOffset);
            return this;
        }

        public Builder setWeekOrdinal(Input<Integer> weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }

        public Builder setWeekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Input.of(Objects.requireNonNull(weekOrdinal));
            return this;
        }

        public WeekDayOfMonthArgs build() {
            return new WeekDayOfMonthArgs(dayOfWeek, dayOffset, weekOrdinal);
        }
    }
}