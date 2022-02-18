// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyRuleArgs Empty = new OrganizationSecurityPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either
     * "allow", "deny" or "goto_next".
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * A description of the rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The direction in which this rule applies. If unspecified an INGRESS rule is created.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    @InputImport(name="direction")
    private final @Nullable Input<String> direction;

    public Input<String> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    /**
     * Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the
     * configured export destination in Stackdriver.
     * 
     */
    @InputImport(name="enableLogging")
    private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * Structure is documented below.
     * 
     */
    @InputImport(name="match", required=true)
    private final Input<OrganizationSecurityPolicyRuleMatchArgs> match;

    public Input<OrganizationSecurityPolicyRuleMatchArgs> getMatch() {
        return this.match;
    }

    /**
     * The ID of the OrganizationSecurityPolicy this rule applies to.
     * 
     */
    @InputImport(name="policyId", required=true)
    private final Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @InputImport(name="preview")
    private final @Nullable Input<Boolean> preview;

    public Input<Boolean> getPreview() {
        return this.preview == null ? Input.empty() : this.preview;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a value
     * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
     * highest priority and 2147483647 is the lowest prority.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies.
     * This field allows you to control which network's VMs get
     * this rule. If this field is left blank, all VMs
     * within the organization will receive the rule.
     * 
     */
    @InputImport(name="targetResources")
    private final @Nullable Input<List<String>> targetResources;

    public Input<List<String>> getTargetResources() {
        return this.targetResources == null ? Input.empty() : this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of
     * instances that are applied with this rule.
     * 
     */
    @InputImport(name="targetServiceAccounts")
    private final @Nullable Input<List<String>> targetServiceAccounts;

    public Input<List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts == null ? Input.empty() : this.targetServiceAccounts;
    }

    public OrganizationSecurityPolicyRuleArgs(
        Input<String> action,
        @Nullable Input<String> description,
        @Nullable Input<String> direction,
        @Nullable Input<Boolean> enableLogging,
        Input<OrganizationSecurityPolicyRuleMatchArgs> match,
        Input<String> policyId,
        @Nullable Input<Boolean> preview,
        Input<Integer> priority,
        @Nullable Input<List<String>> targetResources,
        @Nullable Input<List<String>> targetServiceAccounts) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = description;
        this.direction = direction;
        this.enableLogging = enableLogging;
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.preview = preview;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    private OrganizationSecurityPolicyRuleArgs() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.direction = Input.empty();
        this.enableLogging = Input.empty();
        this.match = Input.empty();
        this.policyId = Input.empty();
        this.preview = Input.empty();
        this.priority = Input.empty();
        this.targetResources = Input.empty();
        this.targetServiceAccounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private @Nullable Input<String> description;
        private @Nullable Input<String> direction;
        private @Nullable Input<Boolean> enableLogging;
        private Input<OrganizationSecurityPolicyRuleMatchArgs> match;
        private Input<String> policyId;
        private @Nullable Input<Boolean> preview;
        private Input<Integer> priority;
        private @Nullable Input<List<String>> targetResources;
        private @Nullable Input<List<String>> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.enableLogging = defaults.enableLogging;
    	      this.match = defaults.match;
    	      this.policyId = defaults.policyId;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDirection(@Nullable Input<String> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder setMatch(Input<OrganizationSecurityPolicyRuleMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(OrganizationSecurityPolicyRuleMatchArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }

        public Builder setPolicyId(Input<String> policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Input.of(Objects.requireNonNull(policyId));
            return this;
        }

        public Builder setPreview(@Nullable Input<Boolean> preview) {
            this.preview = preview;
            return this;
        }

        public Builder setPreview(@Nullable Boolean preview) {
            this.preview = Input.ofNullable(preview);
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setTargetResources(@Nullable Input<List<String>> targetResources) {
            this.targetResources = targetResources;
            return this;
        }

        public Builder setTargetResources(@Nullable List<String> targetResources) {
            this.targetResources = Input.ofNullable(targetResources);
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable Input<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Input.ofNullable(targetServiceAccounts);
            return this;
        }

        public OrganizationSecurityPolicyRuleArgs build() {
            return new OrganizationSecurityPolicyRuleArgs(action, description, direction, enableLogging, match, policyId, preview, priority, targetResources, targetServiceAccounts);
        }
    }
}
