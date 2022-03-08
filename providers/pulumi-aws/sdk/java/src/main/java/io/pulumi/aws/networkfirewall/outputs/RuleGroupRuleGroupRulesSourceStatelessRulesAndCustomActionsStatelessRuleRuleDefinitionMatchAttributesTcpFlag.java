// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag {
    /**
     * Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    private final List<String> flags;
    /**
     * Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    private final @Nullable List<String> masks;

    @OutputCustomType.Constructor({"flags","masks"})
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag(
        List<String> flags,
        @Nullable List<String> masks) {
        this.flags = flags;
        this.masks = masks;
    }

    /**
     * Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
    */
    public List<String> getFlags() {
        return this.flags;
    }
    /**
     * Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
    */
    public List<String> getMasks() {
        return this.masks == null ? List.of() : this.masks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> flags;
        private @Nullable List<String> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder setFlags(List<String> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public Builder setMasks(@Nullable List<String> masks) {
            this.masks = masks;
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag(flags, masks);
        }
    }
}
