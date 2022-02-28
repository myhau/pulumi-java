// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd {
    /**
     * The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    private final @Nullable Integer cents;
    /**
     * The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    private final @Nullable Integer dollars;
    /**
     * Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    private final @Nullable Integer tenthFractionsOfACent;

    @OutputCustomType.Constructor({"cents","dollars","tenthFractionsOfACent"})
    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd(
        @Nullable Integer cents,
        @Nullable Integer dollars,
        @Nullable Integer tenthFractionsOfACent) {
        this.cents = cents;
        this.dollars = dollars;
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    /**
     * The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    public Optional<Integer> getCents() {
        return Optional.ofNullable(this.cents);
    }
    /**
     * The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    public Optional<Integer> getDollars() {
        return Optional.ofNullable(this.dollars);
    }
    /**
     * Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    public Optional<Integer> getTenthFractionsOfACent() {
        return Optional.ofNullable(this.tenthFractionsOfACent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cents;
        private @Nullable Integer dollars;
        private @Nullable Integer tenthFractionsOfACent;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cents = defaults.cents;
    	      this.dollars = defaults.dollars;
    	      this.tenthFractionsOfACent = defaults.tenthFractionsOfACent;
        }

        public Builder setCents(@Nullable Integer cents) {
            this.cents = cents;
            return this;
        }

        public Builder setDollars(@Nullable Integer dollars) {
            this.dollars = dollars;
            return this;
        }

        public Builder setTenthFractionsOfACent(@Nullable Integer tenthFractionsOfACent) {
            this.tenthFractionsOfACent = tenthFractionsOfACent;
            return this;
        }
        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd(cents, dollars, tenthFractionsOfACent);
        }
    }
}
