// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDefaultUserRuleResult {
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final String description;
    /**
     * The destination port ranges.
     * 
     */
    private final List<String> destinationPortRanges;
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> destinations;
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    private final String direction;
    /**
     * A friendly name for the rule.
     * 
     */
    private final String displayName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Default rule flag.
     * 
     */
    private final @Nullable String flag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    private final String kind;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * The provisioning state of the security configuration user rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * The source port ranges.
     * 
     */
    private final List<String> sourcePortRanges;
    /**
     * The CIDR or source IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> sources;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDefaultUserRuleResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destinationPortRanges") List<String> destinationPortRanges,
        @CustomType.Parameter("destinations") List<AddressPrefixItemResponse> destinations,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("flag") @Nullable String flag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sourcePortRanges") List<String> sourcePortRanges,
        @CustomType.Parameter("sources") List<AddressPrefixItemResponse> sources,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.destinationPortRanges = destinationPortRanges;
        this.destinations = destinations;
        this.direction = direction;
        this.displayName = displayName;
        this.etag = etag;
        this.flag = flag;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.sourcePortRanges = sourcePortRanges;
        this.sources = sources;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The destination port ranges.
     * 
    */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
    */
    public List<AddressPrefixItemResponse> destinations() {
        return this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
    */
    public String direction() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Default rule flag.
     * 
    */
    public Optional<String> flag() {
        return Optional.ofNullable(this.flag);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Network protocol this rule applies to.
     * 
    */
    public String protocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the security configuration user rule resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The source port ranges.
     * 
    */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
    */
    public List<AddressPrefixItemResponse> sources() {
        return this.sources;
    }
    /**
     * The system metadata related to this resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultUserRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private String etag;
        private @Nullable String flag;
        private String id;
        private String kind;
        private String name;
        private String protocol;
        private String provisioningState;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultUserRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder destinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(AddressPrefixItemResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder flag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder sources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(AddressPrefixItemResponse... sources) {
            return sources(List.of(sources));
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDefaultUserRuleResult build() {
            return new GetDefaultUserRuleResult(description, destinationPortRanges, destinations, direction, displayName, etag, flag, id, kind, name, protocol, provisioningState, sourcePortRanges, sources, systemData, type);
        }
    }
}
