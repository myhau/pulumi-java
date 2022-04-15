// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ManagedRuleSetResponse;
import io.pulumi.azurenative.network.outputs.OwaspCrsExclusionEntryResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedRulesDefinitionResponse {
    /**
     * The Exclusions that are applied on the policy.
     * 
     */
    private final @Nullable List<OwaspCrsExclusionEntryResponse> exclusions;
    /**
     * The managed rule sets that are associated with the policy.
     * 
     */
    private final List<ManagedRuleSetResponse> managedRuleSets;

    @CustomType.Constructor
    private ManagedRulesDefinitionResponse(
        @CustomType.Parameter("exclusions") @Nullable List<OwaspCrsExclusionEntryResponse> exclusions,
        @CustomType.Parameter("managedRuleSets") List<ManagedRuleSetResponse> managedRuleSets) {
        this.exclusions = exclusions;
        this.managedRuleSets = managedRuleSets;
    }

    /**
     * The Exclusions that are applied on the policy.
     * 
    */
    public List<OwaspCrsExclusionEntryResponse> exclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * The managed rule sets that are associated with the policy.
     * 
    */
    public List<ManagedRuleSetResponse> managedRuleSets() {
        return this.managedRuleSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRulesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OwaspCrsExclusionEntryResponse> exclusions;
        private List<ManagedRuleSetResponse> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRulesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder exclusions(@Nullable List<OwaspCrsExclusionEntryResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(OwaspCrsExclusionEntryResponse... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder managedRuleSets(List<ManagedRuleSetResponse> managedRuleSets) {
            this.managedRuleSets = Objects.requireNonNull(managedRuleSets);
            return this;
        }
        public Builder managedRuleSets(ManagedRuleSetResponse... managedRuleSets) {
            return managedRuleSets(List.of(managedRuleSets));
        }        public ManagedRulesDefinitionResponse build() {
            return new ManagedRulesDefinitionResponse(exclusions, managedRuleSets);
        }
    }
}
