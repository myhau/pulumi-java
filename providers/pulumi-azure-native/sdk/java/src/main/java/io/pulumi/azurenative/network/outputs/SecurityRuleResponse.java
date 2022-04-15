// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationSecurityGroupResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityRuleResponse {
    /**
     * The network traffic is allowed or denied.
     * 
     */
    private final String access;
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final @Nullable String description;
    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    private final @Nullable String destinationAddressPrefix;
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final @Nullable List<String> destinationAddressPrefixes;
    /**
     * The application security group specified as destination.
     * 
     */
    private final @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;
    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    private final @Nullable String destinationPortRange;
    /**
     * The destination port ranges.
     * 
     */
    private final @Nullable List<String> destinationPortRanges;
    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    private final String direction;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * The provisioning state of the security rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    private final @Nullable String sourceAddressPrefix;
    /**
     * The CIDR or source IP ranges.
     * 
     */
    private final @Nullable List<String> sourceAddressPrefixes;
    /**
     * The application security group specified as source.
     * 
     */
    private final @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;
    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    private final @Nullable String sourcePortRange;
    /**
     * The source port ranges.
     * 
     */
    private final @Nullable List<String> sourcePortRanges;
    /**
     * The type of the resource.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private SecurityRuleResponse(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddressPrefix") @Nullable String destinationAddressPrefix,
        @CustomType.Parameter("destinationAddressPrefixes") @Nullable List<String> destinationAddressPrefixes,
        @CustomType.Parameter("destinationApplicationSecurityGroups") @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups,
        @CustomType.Parameter("destinationPortRange") @Nullable String destinationPortRange,
        @CustomType.Parameter("destinationPortRanges") @Nullable List<String> destinationPortRanges,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sourceAddressPrefix") @Nullable String sourceAddressPrefix,
        @CustomType.Parameter("sourceAddressPrefixes") @Nullable List<String> sourceAddressPrefixes,
        @CustomType.Parameter("sourceApplicationSecurityGroups") @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups,
        @CustomType.Parameter("sourcePortRange") @Nullable String sourcePortRange,
        @CustomType.Parameter("sourcePortRanges") @Nullable List<String> sourcePortRanges,
        @CustomType.Parameter("type") @Nullable String type) {
        this.access = access;
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = direction;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
        this.type = type;
    }

    /**
     * The network traffic is allowed or denied.
     * 
    */
    public String access() {
        return this.access;
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
    */
    public Optional<String> destinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
    */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? List.of() : this.destinationAddressPrefixes;
    }
    /**
     * The application security group specified as destination.
     * 
    */
    public List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups == null ? List.of() : this.destinationApplicationSecurityGroups;
    }
    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
    */
    public Optional<String> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    /**
     * The destination port ranges.
     * 
    */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
    */
    public String direction() {
        return this.direction;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
    */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Network protocol this rule applies to.
     * 
    */
    public String protocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the security rule resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
    */
    public Optional<String> sourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }
    /**
     * The CIDR or source IP ranges.
     * 
    */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? List.of() : this.sourceAddressPrefixes;
    }
    /**
     * The application security group specified as source.
     * 
    */
    public List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups == null ? List.of() : this.sourceApplicationSecurityGroups;
    }
    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
    */
    public Optional<String> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }
    /**
     * The source port ranges.
     * 
    */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }
    /**
     * The type of the resource.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable List<String> destinationAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;
        private @Nullable String destinationPortRange;
        private @Nullable List<String> destinationPortRanges;
        private String direction;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String protocol;
        private String provisioningState;
        private @Nullable String sourceAddressPrefix;
        private @Nullable List<String> sourceAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;
        private @Nullable String sourcePortRange;
        private @Nullable List<String> sourcePortRanges;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroups = defaults.destinationApplicationSecurityGroups;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroups = defaults.sourceApplicationSecurityGroups;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.type = defaults.type;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }
        public Builder destinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }
        public Builder destinationAddressPrefixes(String... destinationAddressPrefixes) {
            return destinationAddressPrefixes(List.of(destinationAddressPrefixes));
        }
        public Builder destinationApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }
        public Builder destinationApplicationSecurityGroups(ApplicationSecurityGroupResponse... destinationApplicationSecurityGroups) {
            return destinationApplicationSecurityGroups(List.of(destinationApplicationSecurityGroups));
        }
        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public Builder destinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }
        public Builder sourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }
        public Builder sourceAddressPrefixes(String... sourceAddressPrefixes) {
            return sourceAddressPrefixes(List.of(sourceAddressPrefixes));
        }
        public Builder sourceApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }
        public Builder sourceApplicationSecurityGroups(ApplicationSecurityGroupResponse... sourceApplicationSecurityGroups) {
            return sourceApplicationSecurityGroups(List.of(sourceApplicationSecurityGroups));
        }
        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public SecurityRuleResponse build() {
            return new SecurityRuleResponse(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, destinationPortRange, destinationPortRanges, direction, etag, id, name, priority, protocol, provisioningState, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, sourcePortRange, sourcePortRanges, type);
        }
    }
}
