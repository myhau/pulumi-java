// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.billingbudgets.v1.outputs.GoogleTypeDateResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudBillingBudgetsV1CustomPeriodResponse {
    /**
     * @return Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    private final GoogleTypeDateResponse endDate;
    /**
     * @return The start date must be after January 1, 2017.
     * 
     */
    private final GoogleTypeDateResponse startDate;

    @CustomType.Constructor
    private GoogleCloudBillingBudgetsV1CustomPeriodResponse(
        @CustomType.Parameter("endDate") GoogleTypeDateResponse endDate,
        @CustomType.Parameter("startDate") GoogleTypeDateResponse startDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    /**
     * @return Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    public GoogleTypeDateResponse endDate() {
        return this.endDate;
    }
    /**
     * @return The start date must be after January 1, 2017.
     * 
     */
    public GoogleTypeDateResponse startDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeDateResponse endDate;
        private GoogleTypeDateResponse startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(GoogleTypeDateResponse endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        public Builder startDate(GoogleTypeDateResponse startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }        public GoogleCloudBillingBudgetsV1CustomPeriodResponse build() {
            return new GoogleCloudBillingBudgetsV1CustomPeriodResponse(endDate, startDate);
        }
    }
}
