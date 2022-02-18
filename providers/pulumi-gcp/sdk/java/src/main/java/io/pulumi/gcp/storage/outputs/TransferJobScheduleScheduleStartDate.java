// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class TransferJobScheduleScheduleStartDate {
    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    private final Integer day;
    /**
     * Month of year. Must be from 1 to 12.
     * 
     */
    private final Integer month;
    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    private final Integer year;

    @OutputCustomType.Constructor({"day","month","year"})
    private TransferJobScheduleScheduleStartDate(
        Integer day,
        Integer month,
        Integer year) {
        this.day = Objects.requireNonNull(day);
        this.month = Objects.requireNonNull(month);
        this.year = Objects.requireNonNull(year);
    }

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    public Integer getDay() {
        return this.day;
    }
    /**
     * Month of year. Must be from 1 to 12.
     * 
     */
    public Integer getMonth() {
        return this.month;
    }
    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    public Integer getYear() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleScheduleStartDate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobScheduleScheduleStartDate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder setDay(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setMonth(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder setYear(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }

        public TransferJobScheduleScheduleStartDate build() {
            return new TransferJobScheduleScheduleStartDate(day, month, year);
        }
    }
}
