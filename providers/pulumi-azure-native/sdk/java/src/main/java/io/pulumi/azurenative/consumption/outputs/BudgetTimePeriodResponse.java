// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetTimePeriodResponse {
    /**
     * The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
     */
    private final @Nullable String endDate;
    /**
     * The start date for the budget.
     * 
     */
    private final String startDate;

    @CustomType.Constructor
    private BudgetTimePeriodResponse(
        @CustomType.Parameter("endDate") @Nullable String endDate,
        @CustomType.Parameter("startDate") String startDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    /**
     * The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
    */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * The start date for the budget.
     * 
    */
    public String startDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private String startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetTimePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }        public BudgetTimePeriodResponse build() {
            return new BudgetTimePeriodResponse(endDate, startDate);
        }
    }
}
