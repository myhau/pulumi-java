// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionHttpHeaderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionHttpHeaderGetArgs Empty = new ListenerRuleConditionHttpHeaderGetArgs();

    /**
     * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
     * 
     */
    @InputImport(name="httpHeaderName", required=true)
      private final Input<String> httpHeaderName;

    public Input<String> getHttpHeaderName() {
        return this.httpHeaderName;
    }

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @InputImport(name="values", required=true)
      private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public ListenerRuleConditionHttpHeaderGetArgs(
        Input<String> httpHeaderName,
        Input<List<String>> values) {
        this.httpHeaderName = Objects.requireNonNull(httpHeaderName, "expected parameter 'httpHeaderName' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ListenerRuleConditionHttpHeaderGetArgs() {
        this.httpHeaderName = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionHttpHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> httpHeaderName;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionHttpHeaderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.values = defaults.values;
        }

        public Builder setHttpHeaderName(Input<String> httpHeaderName) {
            this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
            return this;
        }

        public Builder setHttpHeaderName(String httpHeaderName) {
            this.httpHeaderName = Input.of(Objects.requireNonNull(httpHeaderName));
            return this;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public ListenerRuleConditionHttpHeaderGetArgs build() {
            return new ListenerRuleConditionHttpHeaderGetArgs(httpHeaderName, values);
        }
    }
}
