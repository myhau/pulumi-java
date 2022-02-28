// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetCapacityProviderStrategy {
    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    private final @Nullable Integer base;
    /**
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * 
     */
    private final String capacityProvider;
    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    private final Integer weight;

    @OutputCustomType.Constructor({"base","capacityProvider","weight"})
    private TaskSetCapacityProviderStrategy(
        @Nullable Integer base,
        String capacityProvider,
        Integer weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider);
        this.weight = Objects.requireNonNull(weight);
    }

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    public Optional<Integer> getBase() {
        return Optional.ofNullable(this.base);
    }
    /**
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * 
     */
    public String getCapacityProvider() {
        return this.capacityProvider;
    }
    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetCapacityProviderStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer base;
        private String capacityProvider;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetCapacityProviderStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder setBase(@Nullable Integer base) {
            this.base = base;
            return this;
        }

        public Builder setCapacityProvider(String capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public TaskSetCapacityProviderStrategy build() {
            return new TaskSetCapacityProviderStrategy(base, capacityProvider, weight);
        }
    }
}
