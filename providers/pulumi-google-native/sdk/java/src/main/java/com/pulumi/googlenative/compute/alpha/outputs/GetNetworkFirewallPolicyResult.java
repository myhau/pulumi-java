// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.FirewallPolicyAssociationResponse;
import com.pulumi.googlenative.compute.alpha.outputs.FirewallPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkFirewallPolicyResult {
    /**
     * @return A list of associations that belong to this firewall policy.
     * 
     */
    private final List<FirewallPolicyAssociationResponse> associations;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     * @deprecated
     * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Deprecated /* Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. */
    private final String displayName;
    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    private final String fingerprint;
    /**
     * @return [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    private final String name;
    /**
     * @return The parent of the firewall policy.
     * 
     */
    private final String parent;
    /**
     * @return URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a firewall policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    private final List<FirewallPolicyRuleResponse> rules;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String shortName;
    /**
     * @return The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    private final String vpcNetworkScope;

    @CustomType.Constructor
    private GetNetworkFirewallPolicyResult(
        @CustomType.Parameter("associations") List<FirewallPolicyAssociationResponse> associations,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("ruleTupleCount") Integer ruleTupleCount,
        @CustomType.Parameter("rules") List<FirewallPolicyRuleResponse> rules,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("shortName") String shortName,
        @CustomType.Parameter("vpcNetworkScope") String vpcNetworkScope) {
        this.associations = associations;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.displayName = displayName;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.name = name;
        this.parent = parent;
        this.region = region;
        this.ruleTupleCount = ruleTupleCount;
        this.rules = rules;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.shortName = shortName;
        this.vpcNetworkScope = vpcNetworkScope;
    }

    /**
     * @return A list of associations that belong to this firewall policy.
     * 
     */
    public List<FirewallPolicyAssociationResponse> associations() {
        return this.associations;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     * @deprecated
     * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Deprecated /* Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The parent of the firewall policy.
     * 
     */
    public String parent() {
        return this.parent;
    }
    /**
     * @return URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    public Integer ruleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a firewall policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    public List<FirewallPolicyRuleResponse> rules() {
        return this.rules;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String shortName() {
        return this.shortName;
    }
    /**
     * @return The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    public String vpcNetworkScope() {
        return this.vpcNetworkScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FirewallPolicyAssociationResponse> associations;
        private String creationTimestamp;
        private String description;
        private String displayName;
        private String fingerprint;
        private String kind;
        private String name;
        private String parent;
        private String region;
        private Integer ruleTupleCount;
        private List<FirewallPolicyRuleResponse> rules;
        private String selfLink;
        private String selfLinkWithId;
        private String shortName;
        private String vpcNetworkScope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.region = defaults.region;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shortName = defaults.shortName;
    	      this.vpcNetworkScope = defaults.vpcNetworkScope;
        }

        public Builder associations(List<FirewallPolicyAssociationResponse> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }
        public Builder associations(FirewallPolicyAssociationResponse... associations) {
            return associations(List.of(associations));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder ruleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }
        public Builder rules(List<FirewallPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(FirewallPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public Builder vpcNetworkScope(String vpcNetworkScope) {
            this.vpcNetworkScope = Objects.requireNonNull(vpcNetworkScope);
            return this;
        }        public GetNetworkFirewallPolicyResult build() {
            return new GetNetworkFirewallPolicyResult(associations, creationTimestamp, description, displayName, fingerprint, kind, name, parent, region, ruleTupleCount, rules, selfLink, selfLinkWithId, shortName, vpcNetworkScope);
        }
    }
}
