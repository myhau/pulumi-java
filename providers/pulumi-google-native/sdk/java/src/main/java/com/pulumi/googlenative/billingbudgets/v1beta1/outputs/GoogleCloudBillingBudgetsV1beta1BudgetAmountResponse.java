// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.billingbudgets.v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse;
import com.pulumi.googlenative.billingbudgets.v1beta1.outputs.GoogleTypeMoneyResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse {
    /**
     * @return Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    private final GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse lastPeriodAmount;
    /**
     * @return A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    private final GoogleTypeMoneyResponse specifiedAmount;

    @CustomType.Constructor
    private GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse(
        @CustomType.Parameter("lastPeriodAmount") GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse lastPeriodAmount,
        @CustomType.Parameter("specifiedAmount") GoogleTypeMoneyResponse specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    /**
     * @return Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    public GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse lastPeriodAmount() {
        return this.lastPeriodAmount;
    }
    /**
     * @return A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    public GoogleTypeMoneyResponse specifiedAmount() {
        return this.specifiedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse lastPeriodAmount;
        private GoogleTypeMoneyResponse specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder lastPeriodAmount(GoogleCloudBillingBudgetsV1beta1LastPeriodAmountResponse lastPeriodAmount) {
            this.lastPeriodAmount = Objects.requireNonNull(lastPeriodAmount);
            return this;
        }
        public Builder specifiedAmount(GoogleTypeMoneyResponse specifiedAmount) {
            this.specifiedAmount = Objects.requireNonNull(specifiedAmount);
            return this;
        }        public GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse(lastPeriodAmount, specifiedAmount);
        }
    }
}
