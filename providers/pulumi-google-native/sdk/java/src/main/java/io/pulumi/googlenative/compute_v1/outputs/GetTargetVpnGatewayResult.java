// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTargetVpnGatewayResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated with a VPN gateway.
     * 
     */
    private final List<String> forwardingRules;
    /**
     * Type of resource. Always compute#targetVpnGateway for target VPN gateways.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    private final String network;
    /**
     * URL of the region where the target VPN gateway resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The status of the VPN gateway, which can be one of the following: CREATING, READY, FAILED, or DELETING.
     * 
     */
    private final String status;
    /**
     * A list of URLs to VpnTunnel resources. VpnTunnels are created using the compute.vpntunnels.insert method and associated with a VPN gateway.
     * 
     */
    private final List<String> tunnels;

    @OutputCustomType.Constructor({"creationTimestamp","description","forwardingRules","kind","name","network","region","selfLink","status","tunnels"})
    private GetTargetVpnGatewayResult(
        String creationTimestamp,
        String description,
        List<String> forwardingRules,
        String kind,
        String name,
        String network,
        String region,
        String selfLink,
        String status,
        List<String> tunnels) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.forwardingRules = forwardingRules;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
        this.status = status;
        this.tunnels = tunnels;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated with a VPN gateway.
     * 
    */
    public List<String> getForwardingRules() {
        return this.forwardingRules;
    }
    /**
     * Type of resource. Always compute#targetVpnGateway for target VPN gateways.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * URL of the region where the target VPN gateway resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The status of the VPN gateway, which can be one of the following: CREATING, READY, FAILED, or DELETING.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * A list of URLs to VpnTunnel resources. VpnTunnels are created using the compute.vpntunnels.insert method and associated with a VPN gateway.
     * 
    */
    public List<String> getTunnels() {
        return this.tunnels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private List<String> forwardingRules;
        private String kind;
        private String name;
        private String network;
        private String region;
        private String selfLink;
        private String status;
        private List<String> tunnels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.forwardingRules = defaults.forwardingRules;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.tunnels = defaults.tunnels;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setForwardingRules(List<String> forwardingRules) {
            this.forwardingRules = Objects.requireNonNull(forwardingRules);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTunnels(List<String> tunnels) {
            this.tunnels = Objects.requireNonNull(tunnels);
            return this;
        }
        public GetTargetVpnGatewayResult build() {
            return new GetTargetVpnGatewayResult(creationTimestamp, description, forwardingRules, kind, name, network, region, selfLink, status, tunnels);
        }
    }
}
