// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TlsRouteRouteDestinationResponse {
    /**
     * @return The URL of a BackendService to route traffic to.
     * 
     */
    private final String serviceName;
    /**
     * @return Optional. Specifies the proportion of requests forwareded to the backend referenced by the service_name field. This is computed as: weight/Sum(weights in destinations) Weights in all destinations does not need to sum up to 100.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private TlsRouteRouteDestinationResponse(
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("weight") Integer weight) {
        this.serviceName = serviceName;
        this.weight = weight;
    }

    /**
     * @return The URL of a BackendService to route traffic to.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Optional. Specifies the proportion of requests forwareded to the backend referenced by the service_name field. This is computed as: weight/Sum(weights in destinations) Weights in all destinations does not need to sum up to 100.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsRouteRouteDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceName;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsRouteRouteDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
    	      this.weight = defaults.weight;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public TlsRouteRouteDestinationResponse build() {
            return new TlsRouteRouteDestinationResponse(serviceName, weight);
        }
    }
}
