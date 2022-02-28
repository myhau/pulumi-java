// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationProductionVariantArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationProductionVariantArgs Empty = new EndpointConfigurationProductionVariantArgs();

    /**
     * The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    @InputImport(name="acceleratorType")
      private final @Nullable Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType == null ? Input.empty() : this.acceleratorType;
    }

    /**
     * Initial number of instances used for auto-scaling.
     * 
     */
    @InputImport(name="initialInstanceCount", required=true)
      private final Input<Integer> initialInstanceCount;

    public Input<Integer> getInitialInstanceCount() {
        return this.initialInstanceCount;
    }

    /**
     * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to 1.0.
     * 
     */
    @InputImport(name="initialVariantWeight")
      private final @Nullable Input<Double> initialVariantWeight;

    public Input<Double> getInitialVariantWeight() {
        return this.initialVariantWeight == null ? Input.empty() : this.initialVariantWeight;
    }

    /**
     * The type of instance to start.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The name of the model to use.
     * 
     */
    @InputImport(name="modelName", required=true)
      private final Input<String> modelName;

    public Input<String> getModelName() {
        return this.modelName;
    }

    /**
     * The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="variantName")
      private final @Nullable Input<String> variantName;

    public Input<String> getVariantName() {
        return this.variantName == null ? Input.empty() : this.variantName;
    }

    public EndpointConfigurationProductionVariantArgs(
        @Nullable Input<String> acceleratorType,
        Input<Integer> initialInstanceCount,
        @Nullable Input<Double> initialVariantWeight,
        Input<String> instanceType,
        Input<String> modelName,
        @Nullable Input<String> variantName) {
        this.acceleratorType = acceleratorType;
        this.initialInstanceCount = Objects.requireNonNull(initialInstanceCount, "expected parameter 'initialInstanceCount' to be non-null");
        this.initialVariantWeight = initialVariantWeight;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.modelName = Objects.requireNonNull(modelName, "expected parameter 'modelName' to be non-null");
        this.variantName = variantName;
    }

    private EndpointConfigurationProductionVariantArgs() {
        this.acceleratorType = Input.empty();
        this.initialInstanceCount = Input.empty();
        this.initialVariantWeight = Input.empty();
        this.instanceType = Input.empty();
        this.modelName = Input.empty();
        this.variantName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationProductionVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceleratorType;
        private Input<Integer> initialInstanceCount;
        private @Nullable Input<Double> initialVariantWeight;
        private Input<String> instanceType;
        private Input<String> modelName;
        private @Nullable Input<String> variantName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationProductionVariantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.initialInstanceCount = defaults.initialInstanceCount;
    	      this.initialVariantWeight = defaults.initialVariantWeight;
    	      this.instanceType = defaults.instanceType;
    	      this.modelName = defaults.modelName;
    	      this.variantName = defaults.variantName;
        }

        public Builder setAcceleratorType(@Nullable Input<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder setAcceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Input.ofNullable(acceleratorType);
            return this;
        }

        public Builder setInitialInstanceCount(Input<Integer> initialInstanceCount) {
            this.initialInstanceCount = Objects.requireNonNull(initialInstanceCount);
            return this;
        }

        public Builder setInitialInstanceCount(Integer initialInstanceCount) {
            this.initialInstanceCount = Input.of(Objects.requireNonNull(initialInstanceCount));
            return this;
        }

        public Builder setInitialVariantWeight(@Nullable Input<Double> initialVariantWeight) {
            this.initialVariantWeight = initialVariantWeight;
            return this;
        }

        public Builder setInitialVariantWeight(@Nullable Double initialVariantWeight) {
            this.initialVariantWeight = Input.ofNullable(initialVariantWeight);
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setModelName(Input<String> modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }

        public Builder setModelName(String modelName) {
            this.modelName = Input.of(Objects.requireNonNull(modelName));
            return this;
        }

        public Builder setVariantName(@Nullable Input<String> variantName) {
            this.variantName = variantName;
            return this;
        }

        public Builder setVariantName(@Nullable String variantName) {
            this.variantName = Input.ofNullable(variantName);
            return this;
        }
        public EndpointConfigurationProductionVariantArgs build() {
            return new EndpointConfigurationProductionVariantArgs(acceleratorType, initialInstanceCount, initialVariantWeight, instanceType, modelName, variantName);
        }
    }
}
