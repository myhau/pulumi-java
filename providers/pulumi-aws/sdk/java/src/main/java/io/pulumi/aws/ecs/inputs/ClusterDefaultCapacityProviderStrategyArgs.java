// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterDefaultCapacityProviderStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDefaultCapacityProviderStrategyArgs Empty = new ClusterDefaultCapacityProviderStrategyArgs();

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    @InputImport(name="base")
      private final @Nullable Input<Integer> base;

    public Input<Integer> getBase() {
        return this.base == null ? Input.empty() : this.base;
    }

    /**
     * The short name of the capacity provider.
     * 
     */
    @InputImport(name="capacityProvider", required=true)
      private final Input<String> capacityProvider;

    public Input<String> getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @InputImport(name="weight")
      private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public ClusterDefaultCapacityProviderStrategyArgs(
        @Nullable Input<Integer> base,
        Input<String> capacityProvider,
        @Nullable Input<Integer> weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider, "expected parameter 'capacityProvider' to be non-null");
        this.weight = weight;
    }

    private ClusterDefaultCapacityProviderStrategyArgs() {
        this.base = Input.empty();
        this.capacityProvider = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefaultCapacityProviderStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> base;
        private Input<String> capacityProvider;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefaultCapacityProviderStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder setBase(@Nullable Input<Integer> base) {
            this.base = base;
            return this;
        }

        public Builder setBase(@Nullable Integer base) {
            this.base = Input.ofNullable(base);
            return this;
        }

        public Builder setCapacityProvider(Input<String> capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder setCapacityProvider(String capacityProvider) {
            this.capacityProvider = Input.of(Objects.requireNonNull(capacityProvider));
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }
        public ClusterDefaultCapacityProviderStrategyArgs build() {
            return new ClusterDefaultCapacityProviderStrategyArgs(base, capacityProvider, weight);
        }
    }
}
