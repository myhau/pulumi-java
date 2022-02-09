// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WeekDayOfMonthResponse {
    private final String dayOfWeek;
    private final Integer dayOffset;
    private final Integer weekOrdinal;

    @OutputCustomType.Constructor({"dayOfWeek","dayOffset","weekOrdinal"})
    private WeekDayOfMonthResponse(
        String dayOfWeek,
        Integer dayOffset,
        Integer weekOrdinal) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
        this.dayOffset = Objects.requireNonNull(dayOffset);
        this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }
    public Integer getDayOffset() {
        return this.dayOffset;
    }
    public Integer getWeekOrdinal() {
        return this.weekOrdinal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDayOfMonthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private Integer dayOffset;
        private Integer weekOrdinal;

        public Builder() {
    	      // Empty
        }

        public Builder(WeekDayOfMonthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.dayOffset = defaults.dayOffset;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setDayOffset(Integer dayOffset) {
            this.dayOffset = Objects.requireNonNull(dayOffset);
            return this;
        }

        public Builder setWeekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }

        public WeekDayOfMonthResponse build() {
            return new WeekDayOfMonthResponse(dayOfWeek, dayOffset, weekOrdinal);
        }
    }
}