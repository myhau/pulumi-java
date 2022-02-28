// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverFirewallRuleState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallRuleState Empty = new ResolverFirewallRuleState();

    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     * 
     */
    @InputImport(name="blockOverrideDnsType")
      private final @Nullable Input<String> blockOverrideDnsType;

    public Input<String> getBlockOverrideDnsType() {
        return this.blockOverrideDnsType == null ? Input.empty() : this.blockOverrideDnsType;
    }

    /**
     * The custom DNS record to send back in response to the query.
     * 
     */
    @InputImport(name="blockOverrideDomain")
      private final @Nullable Input<String> blockOverrideDomain;

    public Input<String> getBlockOverrideDomain() {
        return this.blockOverrideDomain == null ? Input.empty() : this.blockOverrideDomain;
    }

    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     * 
     */
    @InputImport(name="blockOverrideTtl")
      private final @Nullable Input<Integer> blockOverrideTtl;

    public Input<Integer> getBlockOverrideTtl() {
        return this.blockOverrideTtl == null ? Input.empty() : this.blockOverrideTtl;
    }

    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     * 
     */
    @InputImport(name="blockResponse")
      private final @Nullable Input<String> blockResponse;

    public Input<String> getBlockResponse() {
        return this.blockResponse == null ? Input.empty() : this.blockResponse;
    }

    /**
     * The ID of the domain list that you want to use in the rule.
     * 
     */
    @InputImport(name="firewallDomainListId")
      private final @Nullable Input<String> firewallDomainListId;

    public Input<String> getFirewallDomainListId() {
        return this.firewallDomainListId == null ? Input.empty() : this.firewallDomainListId;
    }

    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     * 
     */
    @InputImport(name="firewallRuleGroupId")
      private final @Nullable Input<String> firewallRuleGroupId;

    public Input<String> getFirewallRuleGroupId() {
        return this.firewallRuleGroupId == null ? Input.empty() : this.firewallRuleGroupId;
    }

    /**
     * A name that lets you identify the rule, to manage and use it.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    public ResolverFirewallRuleState(
        @Nullable Input<String> action,
        @Nullable Input<String> blockOverrideDnsType,
        @Nullable Input<String> blockOverrideDomain,
        @Nullable Input<Integer> blockOverrideTtl,
        @Nullable Input<String> blockResponse,
        @Nullable Input<String> firewallDomainListId,
        @Nullable Input<String> firewallRuleGroupId,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority) {
        this.action = action;
        this.blockOverrideDnsType = blockOverrideDnsType;
        this.blockOverrideDomain = blockOverrideDomain;
        this.blockOverrideTtl = blockOverrideTtl;
        this.blockResponse = blockResponse;
        this.firewallDomainListId = firewallDomainListId;
        this.firewallRuleGroupId = firewallRuleGroupId;
        this.name = name;
        this.priority = priority;
    }

    private ResolverFirewallRuleState() {
        this.action = Input.empty();
        this.blockOverrideDnsType = Input.empty();
        this.blockOverrideDomain = Input.empty();
        this.blockOverrideTtl = Input.empty();
        this.blockResponse = Input.empty();
        this.firewallDomainListId = Input.empty();
        this.firewallRuleGroupId = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverFirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> blockOverrideDnsType;
        private @Nullable Input<String> blockOverrideDomain;
        private @Nullable Input<Integer> blockOverrideTtl;
        private @Nullable Input<String> blockResponse;
        private @Nullable Input<String> firewallDomainListId;
        private @Nullable Input<String> firewallRuleGroupId;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverFirewallRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.blockOverrideDnsType = defaults.blockOverrideDnsType;
    	      this.blockOverrideDomain = defaults.blockOverrideDomain;
    	      this.blockOverrideTtl = defaults.blockOverrideTtl;
    	      this.blockResponse = defaults.blockResponse;
    	      this.firewallDomainListId = defaults.firewallDomainListId;
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setBlockOverrideDnsType(@Nullable Input<String> blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }

        public Builder setBlockOverrideDnsType(@Nullable String blockOverrideDnsType) {
            this.blockOverrideDnsType = Input.ofNullable(blockOverrideDnsType);
            return this;
        }

        public Builder setBlockOverrideDomain(@Nullable Input<String> blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }

        public Builder setBlockOverrideDomain(@Nullable String blockOverrideDomain) {
            this.blockOverrideDomain = Input.ofNullable(blockOverrideDomain);
            return this;
        }

        public Builder setBlockOverrideTtl(@Nullable Input<Integer> blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }

        public Builder setBlockOverrideTtl(@Nullable Integer blockOverrideTtl) {
            this.blockOverrideTtl = Input.ofNullable(blockOverrideTtl);
            return this;
        }

        public Builder setBlockResponse(@Nullable Input<String> blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }

        public Builder setBlockResponse(@Nullable String blockResponse) {
            this.blockResponse = Input.ofNullable(blockResponse);
            return this;
        }

        public Builder setFirewallDomainListId(@Nullable Input<String> firewallDomainListId) {
            this.firewallDomainListId = firewallDomainListId;
            return this;
        }

        public Builder setFirewallDomainListId(@Nullable String firewallDomainListId) {
            this.firewallDomainListId = Input.ofNullable(firewallDomainListId);
            return this;
        }

        public Builder setFirewallRuleGroupId(@Nullable Input<String> firewallRuleGroupId) {
            this.firewallRuleGroupId = firewallRuleGroupId;
            return this;
        }

        public Builder setFirewallRuleGroupId(@Nullable String firewallRuleGroupId) {
            this.firewallRuleGroupId = Input.ofNullable(firewallRuleGroupId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }
        public ResolverFirewallRuleState build() {
            return new ResolverFirewallRuleState(action, blockOverrideDnsType, blockOverrideDomain, blockOverrideTtl, blockResponse, firewallDomainListId, firewallRuleGroupId, name, priority);
        }
    }
}
