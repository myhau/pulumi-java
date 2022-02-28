// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentStatementCondition extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentStatementCondition Empty = new GetPolicyDocumentStatementCondition();

    /**
     * Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     * 
     */
    @InputImport(name="test", required=true)
      private final String test;

    public String getTest() {
        return this.test;
    }

    /**
     * Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
     * 
     */
    @InputImport(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    /**
     * Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     * 
     */
    @InputImport(name="variable", required=true)
      private final String variable;

    public String getVariable() {
        return this.variable;
    }

    public GetPolicyDocumentStatementCondition(
        String test,
        List<String> values,
        String variable) {
        this.test = Objects.requireNonNull(test, "expected parameter 'test' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
        this.variable = Objects.requireNonNull(variable, "expected parameter 'variable' to be non-null");
    }

    private GetPolicyDocumentStatementCondition() {
        this.test = null;
        this.values = List.of();
        this.variable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String test;
        private List<String> values;
        private String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentStatementCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.test = defaults.test;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        public Builder setTest(String test) {
            this.test = Objects.requireNonNull(test);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setVariable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }
        public GetPolicyDocumentStatementCondition build() {
            return new GetPolicyDocumentStatementCondition(test, values, variable);
        }
    }
}
