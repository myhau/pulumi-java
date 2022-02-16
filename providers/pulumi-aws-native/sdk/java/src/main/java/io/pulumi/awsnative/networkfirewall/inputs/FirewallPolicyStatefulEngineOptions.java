// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.FirewallPolicyRuleOrder;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyStatefulEngineOptions extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyStatefulEngineOptions Empty = new FirewallPolicyStatefulEngineOptions();

    @InputImport(name="ruleOrder")
    private final @Nullable FirewallPolicyRuleOrder ruleOrder;

    public Optional<FirewallPolicyRuleOrder> getRuleOrder() {
        return this.ruleOrder == null ? Optional.empty() : Optional.ofNullable(this.ruleOrder);
    }

    public FirewallPolicyStatefulEngineOptions(@Nullable FirewallPolicyRuleOrder ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    private FirewallPolicyStatefulEngineOptions() {
        this.ruleOrder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatefulEngineOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyRuleOrder ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatefulEngineOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder setRuleOrder(@Nullable FirewallPolicyRuleOrder ruleOrder) {
            this.ruleOrder = ruleOrder;
            return this;
        }

        public FirewallPolicyStatefulEngineOptions build() {
            return new FirewallPolicyStatefulEngineOptions(ruleOrder);
        }
    }
}