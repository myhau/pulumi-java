// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * VPN client connection health detail.
 * 
 */
public final class VpnClientConnectionHealthDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnClientConnectionHealthDetailResponse Empty = new VpnClientConnectionHealthDetailResponse();

    /**
     * The egress bytes per second.
     * 
     */
    @Import(name="egressBytesTransferred", required=true)
      private final Double egressBytesTransferred;

    public Double egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * The egress packets per second.
     * 
     */
    @Import(name="egressPacketsTransferred", required=true)
      private final Double egressPacketsTransferred;

    public Double egressPacketsTransferred() {
        return this.egressPacketsTransferred;
    }

    /**
     * The ingress bytes per second.
     * 
     */
    @Import(name="ingressBytesTransferred", required=true)
      private final Double ingressBytesTransferred;

    public Double ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * The ingress packets per second.
     * 
     */
    @Import(name="ingressPacketsTransferred", required=true)
      private final Double ingressPacketsTransferred;

    public Double ingressPacketsTransferred() {
        return this.ingressPacketsTransferred;
    }

    /**
     * The max band width.
     * 
     */
    @Import(name="maxBandwidth", required=true)
      private final Double maxBandwidth;

    public Double maxBandwidth() {
        return this.maxBandwidth;
    }

    /**
     * The max packets transferred per second.
     * 
     */
    @Import(name="maxPacketsPerSecond", required=true)
      private final Double maxPacketsPerSecond;

    public Double maxPacketsPerSecond() {
        return this.maxPacketsPerSecond;
    }

    /**
     * The assigned private Ip of a connected vpn client.
     * 
     */
    @Import(name="privateIpAddress", required=true)
      private final String privateIpAddress;

    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * The public Ip of a connected vpn client.
     * 
     */
    @Import(name="publicIpAddress", required=true)
      private final String publicIpAddress;

    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * The duration time of a connected vpn client.
     * 
     */
    @Import(name="vpnConnectionDuration", required=true)
      private final Double vpnConnectionDuration;

    public Double vpnConnectionDuration() {
        return this.vpnConnectionDuration;
    }

    /**
     * The vpn client Id.
     * 
     */
    @Import(name="vpnConnectionId", required=true)
      private final String vpnConnectionId;

    public String vpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * The start time of a connected vpn client.
     * 
     */
    @Import(name="vpnConnectionTime", required=true)
      private final String vpnConnectionTime;

    public String vpnConnectionTime() {
        return this.vpnConnectionTime;
    }

    /**
     * The user name of a connected vpn client.
     * 
     */
    @Import(name="vpnUserName", required=true)
      private final String vpnUserName;

    public String vpnUserName() {
        return this.vpnUserName;
    }

    public VpnClientConnectionHealthDetailResponse(
        Double egressBytesTransferred,
        Double egressPacketsTransferred,
        Double ingressBytesTransferred,
        Double ingressPacketsTransferred,
        Double maxBandwidth,
        Double maxPacketsPerSecond,
        String privateIpAddress,
        String publicIpAddress,
        Double vpnConnectionDuration,
        String vpnConnectionId,
        String vpnConnectionTime,
        String vpnUserName) {
        this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred, "expected parameter 'egressBytesTransferred' to be non-null");
        this.egressPacketsTransferred = Objects.requireNonNull(egressPacketsTransferred, "expected parameter 'egressPacketsTransferred' to be non-null");
        this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred, "expected parameter 'ingressBytesTransferred' to be non-null");
        this.ingressPacketsTransferred = Objects.requireNonNull(ingressPacketsTransferred, "expected parameter 'ingressPacketsTransferred' to be non-null");
        this.maxBandwidth = Objects.requireNonNull(maxBandwidth, "expected parameter 'maxBandwidth' to be non-null");
        this.maxPacketsPerSecond = Objects.requireNonNull(maxPacketsPerSecond, "expected parameter 'maxPacketsPerSecond' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress, "expected parameter 'publicIpAddress' to be non-null");
        this.vpnConnectionDuration = Objects.requireNonNull(vpnConnectionDuration, "expected parameter 'vpnConnectionDuration' to be non-null");
        this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId, "expected parameter 'vpnConnectionId' to be non-null");
        this.vpnConnectionTime = Objects.requireNonNull(vpnConnectionTime, "expected parameter 'vpnConnectionTime' to be non-null");
        this.vpnUserName = Objects.requireNonNull(vpnUserName, "expected parameter 'vpnUserName' to be non-null");
    }

    private VpnClientConnectionHealthDetailResponse() {
        this.egressBytesTransferred = null;
        this.egressPacketsTransferred = null;
        this.ingressBytesTransferred = null;
        this.ingressPacketsTransferred = null;
        this.maxBandwidth = null;
        this.maxPacketsPerSecond = null;
        this.privateIpAddress = null;
        this.publicIpAddress = null;
        this.vpnConnectionDuration = null;
        this.vpnConnectionId = null;
        this.vpnConnectionTime = null;
        this.vpnUserName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConnectionHealthDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double egressBytesTransferred;
        private Double egressPacketsTransferred;
        private Double ingressBytesTransferred;
        private Double ingressPacketsTransferred;
        private Double maxBandwidth;
        private Double maxPacketsPerSecond;
        private String privateIpAddress;
        private String publicIpAddress;
        private Double vpnConnectionDuration;
        private String vpnConnectionId;
        private String vpnConnectionTime;
        private String vpnUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConnectionHealthDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.egressPacketsTransferred = defaults.egressPacketsTransferred;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ingressPacketsTransferred = defaults.ingressPacketsTransferred;
    	      this.maxBandwidth = defaults.maxBandwidth;
    	      this.maxPacketsPerSecond = defaults.maxPacketsPerSecond;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.vpnConnectionDuration = defaults.vpnConnectionDuration;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
    	      this.vpnConnectionTime = defaults.vpnConnectionTime;
    	      this.vpnUserName = defaults.vpnUserName;
        }

        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder egressPacketsTransferred(Double egressPacketsTransferred) {
            this.egressPacketsTransferred = Objects.requireNonNull(egressPacketsTransferred);
            return this;
        }
        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder ingressPacketsTransferred(Double ingressPacketsTransferred) {
            this.ingressPacketsTransferred = Objects.requireNonNull(ingressPacketsTransferred);
            return this;
        }
        public Builder maxBandwidth(Double maxBandwidth) {
            this.maxBandwidth = Objects.requireNonNull(maxBandwidth);
            return this;
        }
        public Builder maxPacketsPerSecond(Double maxPacketsPerSecond) {
            this.maxPacketsPerSecond = Objects.requireNonNull(maxPacketsPerSecond);
            return this;
        }
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        public Builder vpnConnectionDuration(Double vpnConnectionDuration) {
            this.vpnConnectionDuration = Objects.requireNonNull(vpnConnectionDuration);
            return this;
        }
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId);
            return this;
        }
        public Builder vpnConnectionTime(String vpnConnectionTime) {
            this.vpnConnectionTime = Objects.requireNonNull(vpnConnectionTime);
            return this;
        }
        public Builder vpnUserName(String vpnUserName) {
            this.vpnUserName = Objects.requireNonNull(vpnUserName);
            return this;
        }        public VpnClientConnectionHealthDetailResponse build() {
            return new VpnClientConnectionHealthDetailResponse(egressBytesTransferred, egressPacketsTransferred, ingressBytesTransferred, ingressPacketsTransferred, maxBandwidth, maxPacketsPerSecond, privateIpAddress, publicIpAddress, vpnConnectionDuration, vpnConnectionId, vpnConnectionTime, vpnUserName);
        }
    }
}
