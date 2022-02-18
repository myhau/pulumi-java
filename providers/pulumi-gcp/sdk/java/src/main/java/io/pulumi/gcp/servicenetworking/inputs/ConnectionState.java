// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="peering")
    private final @Nullable Input<String> peering;

    public Input<String> getPeering() {
        return this.peering == null ? Input.empty() : this.peering;
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @InputImport(name="reservedPeeringRanges")
    private final @Nullable Input<List<String>> reservedPeeringRanges;

    public Input<List<String>> getReservedPeeringRanges() {
        return this.reservedPeeringRanges == null ? Input.empty() : this.reservedPeeringRanges;
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public ConnectionState(
        @Nullable Input<String> network,
        @Nullable Input<String> peering,
        @Nullable Input<List<String>> reservedPeeringRanges,
        @Nullable Input<String> service) {
        this.network = network;
        this.peering = peering;
        this.reservedPeeringRanges = reservedPeeringRanges;
        this.service = service;
    }

    private ConnectionState() {
        this.network = Input.empty();
        this.peering = Input.empty();
        this.reservedPeeringRanges = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> network;
        private @Nullable Input<String> peering;
        private @Nullable Input<List<String>> reservedPeeringRanges;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.peering = defaults.peering;
    	      this.reservedPeeringRanges = defaults.reservedPeeringRanges;
    	      this.service = defaults.service;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPeering(@Nullable Input<String> peering) {
            this.peering = peering;
            return this;
        }

        public Builder setPeering(@Nullable String peering) {
            this.peering = Input.ofNullable(peering);
            return this;
        }

        public Builder setReservedPeeringRanges(@Nullable Input<List<String>> reservedPeeringRanges) {
            this.reservedPeeringRanges = reservedPeeringRanges;
            return this;
        }

        public Builder setReservedPeeringRanges(@Nullable List<String> reservedPeeringRanges) {
            this.reservedPeeringRanges = Input.ofNullable(reservedPeeringRanges);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public ConnectionState build() {
            return new ConnectionState(network, peering, reservedPeeringRanges, service);
        }
    }
}
