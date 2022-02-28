// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InvocationState extends io.pulumi.resources.ResourceArgs {

    public static final InvocationState Empty = new InvocationState();

    /**
     * Name of the lambda function.
     * 
     */
    @InputImport(name="functionName")
      private final @Nullable Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName == null ? Input.empty() : this.functionName;
    }

    /**
     * JSON payload to the lambda function.
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<String> input;

    public Input<String> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     * 
     */
    @InputImport(name="qualifier")
      private final @Nullable Input<String> qualifier;

    public Input<String> getQualifier() {
        return this.qualifier == null ? Input.empty() : this.qualifier;
    }

    /**
     * String result of the lambda function invocation.
     * 
     */
    @InputImport(name="result")
      private final @Nullable Input<String> result;

    public Input<String> getResult() {
        return this.result == null ? Input.empty() : this.result;
    }

    @InputImport(name="triggers")
      private final @Nullable Input<Map<String,String>> triggers;

    public Input<Map<String,String>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    public InvocationState(
        @Nullable Input<String> functionName,
        @Nullable Input<String> input,
        @Nullable Input<String> qualifier,
        @Nullable Input<String> result,
        @Nullable Input<Map<String,String>> triggers) {
        this.functionName = functionName;
        this.input = input;
        this.qualifier = qualifier;
        this.result = result;
        this.triggers = triggers;
    }

    private InvocationState() {
        this.functionName = Input.empty();
        this.input = Input.empty();
        this.qualifier = Input.empty();
        this.result = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionName;
        private @Nullable Input<String> input;
        private @Nullable Input<String> qualifier;
        private @Nullable Input<String> result;
        private @Nullable Input<Map<String,String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(InvocationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.input = defaults.input;
    	      this.qualifier = defaults.qualifier;
    	      this.result = defaults.result;
    	      this.triggers = defaults.triggers;
        }

        public Builder setFunctionName(@Nullable Input<String> functionName) {
            this.functionName = functionName;
            return this;
        }

        public Builder setFunctionName(@Nullable String functionName) {
            this.functionName = Input.ofNullable(functionName);
            return this;
        }

        public Builder setInput(@Nullable Input<String> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable String input) {
            this.input = Input.ofNullable(input);
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

        public Builder setResult(@Nullable Input<String> result) {
            this.result = result;
            return this;
        }

        public Builder setResult(@Nullable String result) {
            this.result = Input.ofNullable(result);
            return this;
        }

        public Builder setTriggers(@Nullable Input<Map<String,String>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable Map<String,String> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }
        public InvocationState build() {
            return new InvocationState(functionName, input, qualifier, result, triggers);
        }
    }
}
