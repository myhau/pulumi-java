// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.RouteAsPathResponse;
import com.pulumi.googlenative.compute.beta.outputs.RouteWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteResult {
    /**
     * @return AS path.
     * 
     */
    private final List<RouteAsPathResponse> asPaths;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    private final String destRange;
    /**
     * @return Type of this resource. Always compute#routes for Route resources.
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    private final String network;
    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    private final String nextHopGateway;
    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    private final String nextHopIlb;
    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    private final String nextHopInstance;
    /**
     * @return The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    private final String nextHopInterconnectAttachment;
    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    private final String nextHopIp;
    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    private final String nextHopNetwork;
    /**
     * @return The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    private final String nextHopPeering;
    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    private final String nextHopVpnTunnel;
    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    private final Integer priority;
    /**
     * @return [Output only] The status of the route.
     * 
     */
    private final String routeStatus;
    /**
     * @return The type of this route, which can be one of the following values: - &#39;TRANSIT&#39; for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - &#39;SUBNET&#39; for a route from a subnet of the VPC - &#39;BGP&#39; for a route learned from a BGP peer of this router - &#39;STATIC&#39; for a static route
     * 
     */
    private final String routeType;
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    private final List<String> tags;
    /**
     * @return If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    private final List<RouteWarningsItemResponse> warnings;

    @CustomType.Constructor
    private GetRouteResult(
        @CustomType.Parameter("asPaths") List<RouteAsPathResponse> asPaths,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destRange") String destRange,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nextHopGateway") String nextHopGateway,
        @CustomType.Parameter("nextHopIlb") String nextHopIlb,
        @CustomType.Parameter("nextHopInstance") String nextHopInstance,
        @CustomType.Parameter("nextHopInterconnectAttachment") String nextHopInterconnectAttachment,
        @CustomType.Parameter("nextHopIp") String nextHopIp,
        @CustomType.Parameter("nextHopNetwork") String nextHopNetwork,
        @CustomType.Parameter("nextHopPeering") String nextHopPeering,
        @CustomType.Parameter("nextHopVpnTunnel") String nextHopVpnTunnel,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("routeStatus") String routeStatus,
        @CustomType.Parameter("routeType") String routeType,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("warnings") List<RouteWarningsItemResponse> warnings) {
        this.asPaths = asPaths;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.destRange = destRange;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.nextHopGateway = nextHopGateway;
        this.nextHopIlb = nextHopIlb;
        this.nextHopInstance = nextHopInstance;
        this.nextHopInterconnectAttachment = nextHopInterconnectAttachment;
        this.nextHopIp = nextHopIp;
        this.nextHopNetwork = nextHopNetwork;
        this.nextHopPeering = nextHopPeering;
        this.nextHopVpnTunnel = nextHopVpnTunnel;
        this.priority = priority;
        this.routeStatus = routeStatus;
        this.routeType = routeType;
        this.selfLink = selfLink;
        this.tags = tags;
        this.warnings = warnings;
    }

    /**
     * @return AS path.
     * 
     */
    public List<RouteAsPathResponse> asPaths() {
        return this.asPaths;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    public String destRange() {
        return this.destRange;
    }
    /**
     * @return Type of this resource. Always compute#routes for Route resources.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    public String nextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    public String nextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    public String nextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * @return The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    public String nextHopInterconnectAttachment() {
        return this.nextHopInterconnectAttachment;
    }
    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    public String nextHopIp() {
        return this.nextHopIp;
    }
    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    public String nextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * @return The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    public String nextHopPeering() {
        return this.nextHopPeering;
    }
    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public String nextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return [Output only] The status of the route.
     * 
     */
    public String routeStatus() {
        return this.routeStatus;
    }
    /**
     * @return The type of this route, which can be one of the following values: - &#39;TRANSIT&#39; for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - &#39;SUBNET&#39; for a route from a subnet of the VPC - &#39;BGP&#39; for a route learned from a BGP peer of this router - &#39;STATIC&#39; for a static route
     * 
     */
    public String routeType() {
        return this.routeType;
    }
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    public List<RouteWarningsItemResponse> warnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteAsPathResponse> asPaths;
        private String creationTimestamp;
        private String description;
        private String destRange;
        private String kind;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopInterconnectAttachment;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopPeering;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String routeStatus;
        private String routeType;
        private String selfLink;
        private List<String> tags;
        private List<RouteWarningsItemResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asPaths = defaults.asPaths;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInterconnectAttachment = defaults.nextHopInterconnectAttachment;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopPeering = defaults.nextHopPeering;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.routeStatus = defaults.routeStatus;
    	      this.routeType = defaults.routeType;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
    	      this.warnings = defaults.warnings;
        }

        public Builder asPaths(List<RouteAsPathResponse> asPaths) {
            this.asPaths = Objects.requireNonNull(asPaths);
            return this;
        }
        public Builder asPaths(RouteAsPathResponse... asPaths) {
            return asPaths(List.of(asPaths));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
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
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder nextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }
        public Builder nextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }
        public Builder nextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }
        public Builder nextHopInterconnectAttachment(String nextHopInterconnectAttachment) {
            this.nextHopInterconnectAttachment = Objects.requireNonNull(nextHopInterconnectAttachment);
            return this;
        }
        public Builder nextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }
        public Builder nextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }
        public Builder nextHopPeering(String nextHopPeering) {
            this.nextHopPeering = Objects.requireNonNull(nextHopPeering);
            return this;
        }
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeStatus(String routeStatus) {
            this.routeStatus = Objects.requireNonNull(routeStatus);
            return this;
        }
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder warnings(List<RouteWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(RouteWarningsItemResponse... warnings) {
            return warnings(List.of(warnings));
        }        public GetRouteResult build() {
            return new GetRouteResult(asPaths, creationTimestamp, description, destRange, kind, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInterconnectAttachment, nextHopIp, nextHopNetwork, nextHopPeering, nextHopVpnTunnel, priority, routeStatus, routeType, selfLink, tags, warnings);
        }
    }
}
