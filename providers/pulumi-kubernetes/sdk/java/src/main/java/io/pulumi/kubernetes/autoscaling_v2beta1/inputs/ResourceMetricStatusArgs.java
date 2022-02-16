// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceMetricStatusArgs Empty = new ResourceMetricStatusArgs();

    @InputImport(name="currentAverageUtilization")
    private final @Nullable Input<Integer> currentAverageUtilization;

    public Input<Integer> getCurrentAverageUtilization() {
        return this.currentAverageUtilization == null ? Input.empty() : this.currentAverageUtilization;
    }

    @InputImport(name="currentAverageValue", required=true)
    private final Input<String> currentAverageValue;

    public Input<String> getCurrentAverageValue() {
        return this.currentAverageValue;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ResourceMetricStatusArgs(
        @Nullable Input<Integer> currentAverageUtilization,
        Input<String> currentAverageValue,
        Input<String> name) {
        this.currentAverageUtilization = currentAverageUtilization;
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue, "expected parameter 'currentAverageValue' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ResourceMetricStatusArgs() {
        this.currentAverageUtilization = Input.empty();
        this.currentAverageValue = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> currentAverageUtilization;
        private Input<String> currentAverageValue;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageUtilization = defaults.currentAverageUtilization;
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.name = defaults.name;
        }

        public Builder setCurrentAverageUtilization(@Nullable Input<Integer> currentAverageUtilization) {
            this.currentAverageUtilization = currentAverageUtilization;
            return this;
        }

        public Builder setCurrentAverageUtilization(@Nullable Integer currentAverageUtilization) {
            this.currentAverageUtilization = Input.ofNullable(currentAverageUtilization);
            return this;
        }

        public Builder setCurrentAverageValue(Input<String> currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder setCurrentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Input.of(Objects.requireNonNull(currentAverageValue));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public ResourceMetricStatusArgs build() {
            return new ResourceMetricStatusArgs(currentAverageUtilization, currentAverageValue, name);
        }
    }
}