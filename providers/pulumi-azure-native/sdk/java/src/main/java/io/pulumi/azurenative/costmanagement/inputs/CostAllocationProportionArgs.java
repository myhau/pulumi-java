// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Target resources and allocation
 * 
 */
public final class CostAllocationProportionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CostAllocationProportionArgs Empty = new CostAllocationProportionArgs();

    /**
     * Target resource for cost allocation
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    @Import(name="percentage", required=true)
      private final Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage;
    }

    public CostAllocationProportionArgs(
        Output<String> name,
        Output<Double> percentage) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private CostAllocationProportionArgs() {
        this.name = Codegen.empty();
        this.percentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationProportionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationProportionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.percentage = defaults.percentage;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder percentage(Output<Double> percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public Builder percentage(Double percentage) {
            this.percentage = Output.of(Objects.requireNonNull(percentage));
            return this;
        }        public CostAllocationProportionArgs build() {
            return new CostAllocationProportionArgs(name, percentage);
        }
    }
}
