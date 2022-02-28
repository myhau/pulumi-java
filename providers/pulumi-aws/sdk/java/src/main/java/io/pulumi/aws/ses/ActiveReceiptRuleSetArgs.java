// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ActiveReceiptRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActiveReceiptRuleSetArgs Empty = new ActiveReceiptRuleSetArgs();

    /**
     * The name of the rule set
     * 
     */
    @InputImport(name="ruleSetName", required=true)
      private final Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName;
    }

    public ActiveReceiptRuleSetArgs(Input<String> ruleSetName) {
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
    }

    private ActiveReceiptRuleSetArgs() {
        this.ruleSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveReceiptRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveReceiptRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder setRuleSetName(Input<String> ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }

        public Builder setRuleSetName(String ruleSetName) {
            this.ruleSetName = Input.of(Objects.requireNonNull(ruleSetName));
            return this;
        }
        public ActiveReceiptRuleSetArgs build() {
            return new ActiveReceiptRuleSetArgs(ruleSetName);
        }
    }
}
