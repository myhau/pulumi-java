// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EndpointInfoResponse {
    /**
     * Destination IP address.
     * 
     */
    private final String destinationIp;
    /**
     * URI of the network where this packet is sent to.
     * 
     */
    private final String destinationNetworkUri;
    /**
     * Destination port. Only valid when protocol is TCP or UDP.
     * 
     */
    private final Integer destinationPort;
    /**
     * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
     * 
     */
    private final String protocol;
    /**
     * Source IP address.
     * 
     */
    private final String sourceIp;
    /**
     * URI of the network where this packet originates from.
     * 
     */
    private final String sourceNetworkUri;
    /**
     * Source port. Only valid when protocol is TCP or UDP.
     * 
     */
    private final Integer sourcePort;

    @OutputCustomType.Constructor({"destinationIp","destinationNetworkUri","destinationPort","protocol","sourceIp","sourceNetworkUri","sourcePort"})
    private EndpointInfoResponse(
        String destinationIp,
        String destinationNetworkUri,
        Integer destinationPort,
        String protocol,
        String sourceIp,
        String sourceNetworkUri,
        Integer sourcePort) {
        this.destinationIp = destinationIp;
        this.destinationNetworkUri = destinationNetworkUri;
        this.destinationPort = destinationPort;
        this.protocol = protocol;
        this.sourceIp = sourceIp;
        this.sourceNetworkUri = sourceNetworkUri;
        this.sourcePort = sourcePort;
    }

    /**
     * Destination IP address.
     * 
    */
    public String getDestinationIp() {
        return this.destinationIp;
    }
    /**
     * URI of the network where this packet is sent to.
     * 
    */
    public String getDestinationNetworkUri() {
        return this.destinationNetworkUri;
    }
    /**
     * Destination port. Only valid when protocol is TCP or UDP.
     * 
    */
    public Integer getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Source IP address.
     * 
    */
    public String getSourceIp() {
        return this.sourceIp;
    }
    /**
     * URI of the network where this packet originates from.
     * 
    */
    public String getSourceNetworkUri() {
        return this.sourceNetworkUri;
    }
    /**
     * Source port. Only valid when protocol is TCP or UDP.
     * 
    */
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationIp;
        private String destinationNetworkUri;
        private Integer destinationPort;
        private String protocol;
        private String sourceIp;
        private String sourceNetworkUri;
        private Integer sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationNetworkUri = defaults.destinationNetworkUri;
    	      this.destinationPort = defaults.destinationPort;
    	      this.protocol = defaults.protocol;
    	      this.sourceIp = defaults.sourceIp;
    	      this.sourceNetworkUri = defaults.sourceNetworkUri;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder setDestinationIp(String destinationIp) {
            this.destinationIp = Objects.requireNonNull(destinationIp);
            return this;
        }

        public Builder setDestinationNetworkUri(String destinationNetworkUri) {
            this.destinationNetworkUri = Objects.requireNonNull(destinationNetworkUri);
            return this;
        }

        public Builder setDestinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSourceIp(String sourceIp) {
            this.sourceIp = Objects.requireNonNull(sourceIp);
            return this;
        }

        public Builder setSourceNetworkUri(String sourceNetworkUri) {
            this.sourceNetworkUri = Objects.requireNonNull(sourceNetworkUri);
            return this;
        }

        public Builder setSourcePort(Integer sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }
        public EndpointInfoResponse build() {
            return new EndpointInfoResponse(destinationIp, destinationNetworkUri, destinationPort, protocol, sourceIp, sourceNetworkUri, sourcePort);
        }
    }
}
