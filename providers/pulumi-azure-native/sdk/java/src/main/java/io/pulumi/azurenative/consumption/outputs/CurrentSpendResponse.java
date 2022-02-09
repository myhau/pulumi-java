// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CurrentSpendResponse {
    private final Double amount;
    private final String unit;

    @OutputCustomType.Constructor({"amount","unit"})
    private CurrentSpendResponse(
        Double amount,
        String unit) {
        this.amount = Objects.requireNonNull(amount);
        this.unit = Objects.requireNonNull(unit);
    }

    public Double getAmount() {
        return this.amount;
    }
    public String getUnit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentSpendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double amount;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CurrentSpendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public CurrentSpendResponse build() {
            return new CurrentSpendResponse(amount, unit);
        }
    }
}