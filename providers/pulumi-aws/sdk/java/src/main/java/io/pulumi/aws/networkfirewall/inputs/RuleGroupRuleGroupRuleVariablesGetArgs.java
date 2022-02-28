// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRuleVariablesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesGetArgs Empty = new RuleGroupRuleGroupRuleVariablesGetArgs();

    /**
     * Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    @InputImport(name="ipSets")
      private final @Nullable Input<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets;

    public Input<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> getIpSets() {
        return this.ipSets == null ? Input.empty() : this.ipSets;
    }

    /**
     * Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    @InputImport(name="portSets")
      private final @Nullable Input<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets;

    public Input<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> getPortSets() {
        return this.portSets == null ? Input.empty() : this.portSets;
    }

    public RuleGroupRuleGroupRuleVariablesGetArgs(
        @Nullable Input<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets,
        @Nullable Input<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets) {
        this.ipSets = ipSets;
        this.portSets = portSets;
    }

    private RuleGroupRuleGroupRuleVariablesGetArgs() {
        this.ipSets = Input.empty();
        this.portSets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets;
        private @Nullable Input<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSets = defaults.ipSets;
    	      this.portSets = defaults.portSets;
        }

        public Builder setIpSets(@Nullable Input<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        public Builder setIpSets(@Nullable List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs> ipSets) {
            this.ipSets = Input.ofNullable(ipSets);
            return this;
        }

        public Builder setPortSets(@Nullable Input<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets) {
            this.portSets = portSets;
            return this;
        }

        public Builder setPortSets(@Nullable List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs> portSets) {
            this.portSets = Input.ofNullable(portSets);
            return this;
        }
        public RuleGroupRuleGroupRuleVariablesGetArgs build() {
            return new RuleGroupRuleGroupRuleVariablesGetArgs(ipSets, portSets);
        }
    }
}
