// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InvocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InvocationArgs Empty = new InvocationArgs();

    /**
     * Name of the lambda function.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName;
    }

    /**
     * JSON payload to the lambda function.
     * 
     */
    @InputImport(name="input", required=true)
      private final Input<String> input;

    public Input<String> getInput() {
        return this.input;
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

    @InputImport(name="triggers")
      private final @Nullable Input<Map<String,String>> triggers;

    public Input<Map<String,String>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    public InvocationArgs(
        Input<String> functionName,
        Input<String> input,
        @Nullable Input<String> qualifier,
        @Nullable Input<Map<String,String>> triggers) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.input = Objects.requireNonNull(input, "expected parameter 'input' to be non-null");
        this.qualifier = qualifier;
        this.triggers = triggers;
    }

    private InvocationArgs() {
        this.functionName = Input.empty();
        this.input = Input.empty();
        this.qualifier = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> functionName;
        private Input<String> input;
        private @Nullable Input<String> qualifier;
        private @Nullable Input<Map<String,String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(InvocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.input = defaults.input;
    	      this.qualifier = defaults.qualifier;
    	      this.triggers = defaults.triggers;
        }

        public Builder setFunctionName(Input<String> functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Input.of(Objects.requireNonNull(functionName));
            return this;
        }

        public Builder setInput(Input<String> input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder setInput(String input) {
            this.input = Input.of(Objects.requireNonNull(input));
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

        public Builder setTriggers(@Nullable Input<Map<String,String>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable Map<String,String> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }
        public InvocationArgs build() {
            return new InvocationArgs(functionName, input, qualifier, triggers);
        }
    }
}