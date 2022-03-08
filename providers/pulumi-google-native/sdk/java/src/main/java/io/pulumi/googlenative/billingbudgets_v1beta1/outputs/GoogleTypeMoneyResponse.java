// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleTypeMoneyResponse {
    /**
     * The three-letter currency code defined in ISO 4217.
     * 
     */
    private final String currencyCode;
    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    private final Integer nanos;
    /**
     * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * 
     */
    private final String units;

    @OutputCustomType.Constructor({"currencyCode","nanos","units"})
    private GoogleTypeMoneyResponse(
        String currencyCode,
        Integer nanos,
        String units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    /**
     * The three-letter currency code defined in ISO 4217.
     * 
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
    */
    public Integer getNanos() {
        return this.nanos;
    }
    /**
     * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * 
    */
    public String getUnits() {
        return this.units;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeMoneyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currencyCode;
        private Integer nanos;
        private String units;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeMoneyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setUnits(String units) {
            this.units = Objects.requireNonNull(units);
            return this;
        }
        public GoogleTypeMoneyResponse build() {
            return new GoogleTypeMoneyResponse(currencyCode, nanos, units);
        }
    }
}
