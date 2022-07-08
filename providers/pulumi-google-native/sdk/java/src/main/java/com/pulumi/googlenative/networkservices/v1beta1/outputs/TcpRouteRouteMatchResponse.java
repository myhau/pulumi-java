// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TcpRouteRouteMatchResponse {
    /**
     * @return Must be specified in the CIDR range format. A CIDR range consists of an IP Address and a prefix length to construct the subnet mask. By default, the prefix length is 32 (i.e. matches a single IP address). Only IPV4 addresses are supported. Examples: &#34;10.0.0.1&#34; - matches against this exact IP address. &#34;10.0.0.0/8&#34; - matches against any IP address within the 10.0.0.0 subnet and 255.255.255.0 mask. &#34;0.0.0.0/0&#34; - matches against any IP address&#39;.
     * 
     */
    private final String address;
    /**
     * @return Specifies the destination port to match against.
     * 
     */
    private final String port;

    @CustomType.Constructor
    private TcpRouteRouteMatchResponse(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("port") String port) {
        this.address = address;
        this.port = port;
    }

    /**
     * @return Must be specified in the CIDR range format. A CIDR range consists of an IP Address and a prefix length to construct the subnet mask. By default, the prefix length is 32 (i.e. matches a single IP address). Only IPV4 addresses are supported. Examples: &#34;10.0.0.1&#34; - matches against this exact IP address. &#34;10.0.0.0/8&#34; - matches against any IP address within the 10.0.0.0 subnet and 255.255.255.0 mask. &#34;0.0.0.0/0&#34; - matches against any IP address&#39;.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Specifies the destination port to match against.
     * 
     */
    public String port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TcpRouteRouteMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String port;

        public Builder() {
    	      // Empty
        }

        public Builder(TcpRouteRouteMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public TcpRouteRouteMatchResponse build() {
            return new TcpRouteRouteMatchResponse(address, port);
        }
    }
}
