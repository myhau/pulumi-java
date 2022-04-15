// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGetHttpsEndpointResponse {
    /**
     * The list of access modes for the application.
     * 
     */
    private final @Nullable List<String> accessModes;
    /**
     * The destination port to connect to.
     * 
     */
    private final @Nullable Integer destinationPort;
    /**
     * The value indicates whether to disable GatewayAuth.
     * 
     */
    private final @Nullable Boolean disableGatewayAuth;
    /**
     * The location of the endpoint.
     * 
     */
    private final String location;
    /**
     * The private ip address of the endpoint.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * The public port to connect to.
     * 
     */
    private final Integer publicPort;
    /**
     * The subdomain suffix of the application.
     * 
     */
    private final @Nullable String subDomainSuffix;

    @CustomType.Constructor
    private ApplicationGetHttpsEndpointResponse(
        @CustomType.Parameter("accessModes") @Nullable List<String> accessModes,
        @CustomType.Parameter("destinationPort") @Nullable Integer destinationPort,
        @CustomType.Parameter("disableGatewayAuth") @Nullable Boolean disableGatewayAuth,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @CustomType.Parameter("publicPort") Integer publicPort,
        @CustomType.Parameter("subDomainSuffix") @Nullable String subDomainSuffix) {
        this.accessModes = accessModes;
        this.destinationPort = destinationPort;
        this.disableGatewayAuth = disableGatewayAuth;
        this.location = location;
        this.privateIPAddress = privateIPAddress;
        this.publicPort = publicPort;
        this.subDomainSuffix = subDomainSuffix;
    }

    /**
     * The list of access modes for the application.
     * 
    */
    public List<String> accessModes() {
        return this.accessModes == null ? List.of() : this.accessModes;
    }
    /**
     * The destination port to connect to.
     * 
    */
    public Optional<Integer> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    /**
     * The value indicates whether to disable GatewayAuth.
     * 
    */
    public Optional<Boolean> disableGatewayAuth() {
        return Optional.ofNullable(this.disableGatewayAuth);
    }
    /**
     * The location of the endpoint.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The private ip address of the endpoint.
     * 
    */
    public Optional<String> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * The public port to connect to.
     * 
    */
    public Integer publicPort() {
        return this.publicPort;
    }
    /**
     * The subdomain suffix of the application.
     * 
    */
    public Optional<String> subDomainSuffix() {
        return Optional.ofNullable(this.subDomainSuffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetHttpsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accessModes;
        private @Nullable Integer destinationPort;
        private @Nullable Boolean disableGatewayAuth;
        private String location;
        private @Nullable String privateIPAddress;
        private Integer publicPort;
        private @Nullable String subDomainSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetHttpsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.destinationPort = defaults.destinationPort;
    	      this.disableGatewayAuth = defaults.disableGatewayAuth;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
    	      this.subDomainSuffix = defaults.subDomainSuffix;
        }

        public Builder accessModes(@Nullable List<String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }
        public Builder accessModes(String... accessModes) {
            return accessModes(List.of(accessModes));
        }
        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Builder disableGatewayAuth(@Nullable Boolean disableGatewayAuth) {
            this.disableGatewayAuth = disableGatewayAuth;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder publicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }
        public Builder subDomainSuffix(@Nullable String subDomainSuffix) {
            this.subDomainSuffix = subDomainSuffix;
            return this;
        }        public ApplicationGetHttpsEndpointResponse build() {
            return new ApplicationGetHttpsEndpointResponse(accessModes, destinationPort, disableGatewayAuth, location, privateIPAddress, publicPort, subDomainSuffix);
        }
    }
}
