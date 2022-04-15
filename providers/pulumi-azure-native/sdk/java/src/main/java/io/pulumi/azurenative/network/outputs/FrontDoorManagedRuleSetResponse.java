// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FrontDoorManagedRuleGroupOverrideResponse;
import io.pulumi.azurenative.network.outputs.ManagedRuleExclusionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontDoorManagedRuleSetResponse {
    /**
     * Describes the exclusions that are applied to all rules in the set.
     * 
     */
    private final @Nullable List<ManagedRuleExclusionResponse> exclusions;
    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
     */
    private final @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides;
    /**
     * Defines the action to take when a managed rule set score threshold is met.
     * 
     */
    private final @Nullable String ruleSetAction;
    /**
     * Defines the rule set type to use.
     * 
     */
    private final String ruleSetType;
    /**
     * Defines the version of the rule set to use.
     * 
     */
    private final String ruleSetVersion;

    @CustomType.Constructor
    private FrontDoorManagedRuleSetResponse(
        @CustomType.Parameter("exclusions") @Nullable List<ManagedRuleExclusionResponse> exclusions,
        @CustomType.Parameter("ruleGroupOverrides") @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides,
        @CustomType.Parameter("ruleSetAction") @Nullable String ruleSetAction,
        @CustomType.Parameter("ruleSetType") String ruleSetType,
        @CustomType.Parameter("ruleSetVersion") String ruleSetVersion) {
        this.exclusions = exclusions;
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetAction = ruleSetAction;
        this.ruleSetType = ruleSetType;
        this.ruleSetVersion = ruleSetVersion;
    }

    /**
     * Describes the exclusions that are applied to all rules in the set.
     * 
    */
    public List<ManagedRuleExclusionResponse> exclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
    */
    public List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides() {
        return this.ruleGroupOverrides == null ? List.of() : this.ruleGroupOverrides;
    }
    /**
     * Defines the action to take when a managed rule set score threshold is met.
     * 
    */
    public Optional<String> ruleSetAction() {
        return Optional.ofNullable(this.ruleSetAction);
    }
    /**
     * Defines the rule set type to use.
     * 
    */
    public String ruleSetType() {
        return this.ruleSetType;
    }
    /**
     * Defines the version of the rule set to use.
     * 
    */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorManagedRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleExclusionResponse> exclusions;
        private @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides;
        private @Nullable String ruleSetAction;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorManagedRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetAction = defaults.ruleSetAction;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder exclusions(@Nullable List<ManagedRuleExclusionResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(ManagedRuleExclusionResponse... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder ruleGroupOverrides(@Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }
        public Builder ruleGroupOverrides(FrontDoorManagedRuleGroupOverrideResponse... ruleGroupOverrides) {
            return ruleGroupOverrides(List.of(ruleGroupOverrides));
        }
        public Builder ruleSetAction(@Nullable String ruleSetAction) {
            this.ruleSetAction = ruleSetAction;
            return this;
        }
        public Builder ruleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }
        public Builder ruleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }        public FrontDoorManagedRuleSetResponse build() {
            return new FrontDoorManagedRuleSetResponse(exclusions, ruleGroupOverrides, ruleSetAction, ruleSetType, ruleSetVersion);
        }
    }
}
