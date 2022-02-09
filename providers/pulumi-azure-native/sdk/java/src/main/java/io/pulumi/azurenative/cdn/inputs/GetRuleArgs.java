// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuleArgs Empty = new GetRuleArgs();

    @InputImport(name="profileName", required=true)
    private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleName", required=true)
    private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    @InputImport(name="ruleSetName", required=true)
    private final String ruleSetName;

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    public GetRuleArgs(
        String profileName,
        String resourceGroupName,
        String ruleName,
        String ruleSetName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
    }

    private GetRuleArgs() {
        this.profileName = null;
        this.resourceGroupName = null;
        this.ruleName = null;
        this.ruleSetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String resourceGroupName;
        private String ruleName;
        private String ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public Builder setRuleSetName(String ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }

        public GetRuleArgs build() {
            return new GetRuleArgs(profileName, resourceGroupName, ruleName, ruleSetName);
        }
    }
}