// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.location.enums.RouteCalculatorPricingPlan;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteCalculatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteCalculatorArgs Empty = new RouteCalculatorArgs();

    @InputImport(name="calculatorName", required=true)
    private final Input<String> calculatorName;

    public Input<String> getCalculatorName() {
        return this.calculatorName;
    }

    @InputImport(name="dataSource", required=true)
    private final Input<String> dataSource;

    public Input<String> getDataSource() {
        return this.dataSource;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="pricingPlan")
    private final @Nullable Input<RouteCalculatorPricingPlan> pricingPlan;

    public Input<RouteCalculatorPricingPlan> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    public RouteCalculatorArgs(
        Input<String> calculatorName,
        Input<String> dataSource,
        @Nullable Input<String> description,
        @Nullable Input<RouteCalculatorPricingPlan> pricingPlan) {
        this.calculatorName = Objects.requireNonNull(calculatorName, "expected parameter 'calculatorName' to be non-null");
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.description = description;
        this.pricingPlan = pricingPlan;
    }

    private RouteCalculatorArgs() {
        this.calculatorName = Input.empty();
        this.dataSource = Input.empty();
        this.description = Input.empty();
        this.pricingPlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteCalculatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> calculatorName;
        private Input<String> dataSource;
        private @Nullable Input<String> description;
        private @Nullable Input<RouteCalculatorPricingPlan> pricingPlan;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteCalculatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calculatorName = defaults.calculatorName;
    	      this.dataSource = defaults.dataSource;
    	      this.description = defaults.description;
    	      this.pricingPlan = defaults.pricingPlan;
        }

        public Builder setCalculatorName(Input<String> calculatorName) {
            this.calculatorName = Objects.requireNonNull(calculatorName);
            return this;
        }

        public Builder setCalculatorName(String calculatorName) {
            this.calculatorName = Input.of(Objects.requireNonNull(calculatorName));
            return this;
        }

        public Builder setDataSource(Input<String> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder setDataSource(String dataSource) {
            this.dataSource = Input.of(Objects.requireNonNull(dataSource));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPricingPlan(@Nullable Input<RouteCalculatorPricingPlan> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder setPricingPlan(@Nullable RouteCalculatorPricingPlan pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }

        public RouteCalculatorArgs build() {
            return new RouteCalculatorArgs(calculatorName, dataSource, description, pricingPlan);
        }
    }
}