// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RulePredicateArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulePredicateArgs Empty = new RulePredicateArgs();

    /**
     * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    @InputImport(name="dataId", required=true)
      private final Input<String> dataId;

    public Input<String> getDataId() {
        return this.dataId;
    }

    /**
     * Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `waf_byte_match_set`, `waf_ipset`, `aws.waf.SizeConstraintSet`, `aws.waf.SqlInjectionMatchSet` or `aws.waf.XssMatchSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses except `192.0.2.44`.
     * 
     */
    @InputImport(name="negated", required=true)
      private final Input<Boolean> negated;

    public Input<Boolean> getNegated() {
        return this.negated;
    }

    /**
     * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RulePredicateArgs(
        Input<String> dataId,
        Input<Boolean> negated,
        Input<String> type) {
        this.dataId = Objects.requireNonNull(dataId, "expected parameter 'dataId' to be non-null");
        this.negated = Objects.requireNonNull(negated, "expected parameter 'negated' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RulePredicateArgs() {
        this.dataId = Input.empty();
        this.negated = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulePredicateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataId;
        private Input<Boolean> negated;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RulePredicateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        public Builder setDataId(Input<String> dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }

        public Builder setDataId(String dataId) {
            this.dataId = Input.of(Objects.requireNonNull(dataId));
            return this;
        }

        public Builder setNegated(Input<Boolean> negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }

        public Builder setNegated(Boolean negated) {
            this.negated = Input.of(Objects.requireNonNull(negated));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RulePredicateArgs build() {
            return new RulePredicateArgs(dataId, negated, type);
        }
    }
}
