// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedConcurrencyConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedConcurrencyConfigState Empty = new ProvisionedConcurrencyConfigState();

    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    @InputImport(name="functionName")
      private final @Nullable Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName == null ? Input.empty() : this.functionName;
    }

    /**
     * Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    @InputImport(name="provisionedConcurrentExecutions")
      private final @Nullable Input<Integer> provisionedConcurrentExecutions;

    public Input<Integer> getProvisionedConcurrentExecutions() {
        return this.provisionedConcurrentExecutions == null ? Input.empty() : this.provisionedConcurrentExecutions;
    }

    /**
     * Lambda Function version or Lambda Alias name.
     * 
     */
    @InputImport(name="qualifier")
      private final @Nullable Input<String> qualifier;

    public Input<String> getQualifier() {
        return this.qualifier == null ? Input.empty() : this.qualifier;
    }

    public ProvisionedConcurrencyConfigState(
        @Nullable Input<String> functionName,
        @Nullable Input<Integer> provisionedConcurrentExecutions,
        @Nullable Input<String> qualifier) {
        this.functionName = functionName;
        this.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
        this.qualifier = qualifier;
    }

    private ProvisionedConcurrencyConfigState() {
        this.functionName = Input.empty();
        this.provisionedConcurrentExecutions = Input.empty();
        this.qualifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedConcurrencyConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionName;
        private @Nullable Input<Integer> provisionedConcurrentExecutions;
        private @Nullable Input<String> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedConcurrencyConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.provisionedConcurrentExecutions = defaults.provisionedConcurrentExecutions;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder setFunctionName(@Nullable Input<String> functionName) {
            this.functionName = functionName;
            return this;
        }

        public Builder setFunctionName(@Nullable String functionName) {
            this.functionName = Input.ofNullable(functionName);
            return this;
        }

        public Builder setProvisionedConcurrentExecutions(@Nullable Input<Integer> provisionedConcurrentExecutions) {
            this.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
            return this;
        }

        public Builder setProvisionedConcurrentExecutions(@Nullable Integer provisionedConcurrentExecutions) {
            this.provisionedConcurrentExecutions = Input.ofNullable(provisionedConcurrentExecutions);
            return this;
        }

        public Builder setQualifier(@Nullable Input<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = Input.ofNullable(qualifier);
            return this;
        }
        public ProvisionedConcurrencyConfigState build() {
            return new ProvisionedConcurrencyConfigState(functionName, provisionedConcurrentExecutions, qualifier);
        }
    }
}
