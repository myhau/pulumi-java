// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ManagedRuleGroupOverrideResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedRuleSetResponse {
    /**
     * Verizon only : If the rule set supports anomaly detection mode, this describes the threshold for blocking requests.
     * 
     */
    private final @Nullable Integer anomalyScore;
    /**
     * Defines the rule overrides to apply to the rule set.
     * 
     */
    private final @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;
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
    private ManagedRuleSetResponse(
        @CustomType.Parameter("anomalyScore") @Nullable Integer anomalyScore,
        @CustomType.Parameter("ruleGroupOverrides") @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides,
        @CustomType.Parameter("ruleSetType") String ruleSetType,
        @CustomType.Parameter("ruleSetVersion") String ruleSetVersion) {
        this.anomalyScore = anomalyScore;
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetType = ruleSetType;
        this.ruleSetVersion = ruleSetVersion;
    }

    /**
     * Verizon only : If the rule set supports anomaly detection mode, this describes the threshold for blocking requests.
     * 
    */
    public Optional<Integer> anomalyScore() {
        return Optional.ofNullable(this.anomalyScore);
    }
    /**
     * Defines the rule overrides to apply to the rule set.
     * 
    */
    public List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides() {
        return this.ruleGroupOverrides == null ? List.of() : this.ruleGroupOverrides;
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

    public static Builder builder(ManagedRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer anomalyScore;
        private @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyScore = defaults.anomalyScore;
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder anomalyScore(@Nullable Integer anomalyScore) {
            this.anomalyScore = anomalyScore;
            return this;
        }
        public Builder ruleGroupOverrides(@Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }
        public Builder ruleGroupOverrides(ManagedRuleGroupOverrideResponse... ruleGroupOverrides) {
            return ruleGroupOverrides(List.of(ruleGroupOverrides));
        }
        public Builder ruleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }
        public Builder ruleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }        public ManagedRuleSetResponse build() {
            return new ManagedRuleSetResponse(anomalyScore, ruleGroupOverrides, ruleSetType, ruleSetVersion);
        }
    }
}
