// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkEndpointResponse {
    /**
     * @return The IP address of this network endpoint.
     * 
     */
    private final String ipAddress;
    /**
     * @return The port of this network endpoint.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private NetworkEndpointResponse(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("port") Integer port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    /**
     * @return The IP address of this network endpoint.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The port of this network endpoint.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public NetworkEndpointResponse build() {
            return new NetworkEndpointResponse(ipAddress, port);
        }
    }
}
