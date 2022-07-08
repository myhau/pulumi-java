// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deny maintenance Periods. This specifies a date range during when all CSA rollout will be denied.
 * 
 */
public final class DenyMaintenancePeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final DenyMaintenancePeriodArgs Empty = new DenyMaintenancePeriodArgs();

    /**
     * &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    @Import(name="startDate")
    private @Nullable Output<String> startDate;

    /**
     * @return &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    public Optional<Output<String>> startDate() {
        return Optional.ofNullable(this.startDate);
    }

    /**
     * Time in UTC when the &#34;deny maintenance period&#34; starts on start_date and ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return Time in UTC when the &#34;deny maintenance period&#34; starts on start_date and ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    private DenyMaintenancePeriodArgs() {}

    private DenyMaintenancePeriodArgs(DenyMaintenancePeriodArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DenyMaintenancePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DenyMaintenancePeriodArgs $;

        public Builder() {
            $ = new DenyMaintenancePeriodArgs();
        }

        public Builder(DenyMaintenancePeriodArgs defaults) {
            $ = new DenyMaintenancePeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param startDate &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
         * 
         * @return builder
         * 
         */
        public Builder startDate(@Nullable Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        /**
         * @param time Time in UTC when the &#34;deny maintenance period&#34; starts on start_date and ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time Time in UTC when the &#34;deny maintenance period&#34; starts on start_date and ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public DenyMaintenancePeriodArgs build() {
            return $;
        }
    }

}
