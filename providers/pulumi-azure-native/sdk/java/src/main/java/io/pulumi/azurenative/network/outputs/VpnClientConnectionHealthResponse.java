// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnClientConnectionHealthResponse {
    /**
     * List of allocated ip addresses to the connected p2s vpn clients.
     * 
     */
    private final @Nullable List<String> allocatedIpAddresses;
    /**
     * Total of the Egress Bytes Transferred in this connection.
     * 
     */
    private final Double totalEgressBytesTransferred;
    /**
     * Total of the Ingress Bytes Transferred in this P2S Vpn connection.
     * 
     */
    private final Double totalIngressBytesTransferred;
    /**
     * The total of p2s vpn clients connected at this time to this P2SVpnGateway.
     * 
     */
    private final @Nullable Integer vpnClientConnectionsCount;

    @OutputCustomType.Constructor({"allocatedIpAddresses","totalEgressBytesTransferred","totalIngressBytesTransferred","vpnClientConnectionsCount"})
    private VpnClientConnectionHealthResponse(
        @Nullable List<String> allocatedIpAddresses,
        Double totalEgressBytesTransferred,
        Double totalIngressBytesTransferred,
        @Nullable Integer vpnClientConnectionsCount) {
        this.allocatedIpAddresses = allocatedIpAddresses;
        this.totalEgressBytesTransferred = totalEgressBytesTransferred;
        this.totalIngressBytesTransferred = totalIngressBytesTransferred;
        this.vpnClientConnectionsCount = vpnClientConnectionsCount;
    }

    /**
     * List of allocated ip addresses to the connected p2s vpn clients.
     * 
    */
    public List<String> getAllocatedIpAddresses() {
        return this.allocatedIpAddresses == null ? List.of() : this.allocatedIpAddresses;
    }
    /**
     * Total of the Egress Bytes Transferred in this connection.
     * 
    */
    public Double getTotalEgressBytesTransferred() {
        return this.totalEgressBytesTransferred;
    }
    /**
     * Total of the Ingress Bytes Transferred in this P2S Vpn connection.
     * 
    */
    public Double getTotalIngressBytesTransferred() {
        return this.totalIngressBytesTransferred;
    }
    /**
     * The total of p2s vpn clients connected at this time to this P2SVpnGateway.
     * 
    */
    public Optional<Integer> getVpnClientConnectionsCount() {
        return Optional.ofNullable(this.vpnClientConnectionsCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConnectionHealthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allocatedIpAddresses;
        private Double totalEgressBytesTransferred;
        private Double totalIngressBytesTransferred;
        private @Nullable Integer vpnClientConnectionsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConnectionHealthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpAddresses = defaults.allocatedIpAddresses;
    	      this.totalEgressBytesTransferred = defaults.totalEgressBytesTransferred;
    	      this.totalIngressBytesTransferred = defaults.totalIngressBytesTransferred;
    	      this.vpnClientConnectionsCount = defaults.vpnClientConnectionsCount;
        }

        public Builder setAllocatedIpAddresses(@Nullable List<String> allocatedIpAddresses) {
            this.allocatedIpAddresses = allocatedIpAddresses;
            return this;
        }

        public Builder setTotalEgressBytesTransferred(Double totalEgressBytesTransferred) {
            this.totalEgressBytesTransferred = Objects.requireNonNull(totalEgressBytesTransferred);
            return this;
        }

        public Builder setTotalIngressBytesTransferred(Double totalIngressBytesTransferred) {
            this.totalIngressBytesTransferred = Objects.requireNonNull(totalIngressBytesTransferred);
            return this;
        }

        public Builder setVpnClientConnectionsCount(@Nullable Integer vpnClientConnectionsCount) {
            this.vpnClientConnectionsCount = vpnClientConnectionsCount;
            return this;
        }
        public VpnClientConnectionHealthResponse build() {
            return new VpnClientConnectionHealthResponse(allocatedIpAddresses, totalEgressBytesTransferred, totalIngressBytesTransferred, vpnClientConnectionsCount);
        }
    }
}
