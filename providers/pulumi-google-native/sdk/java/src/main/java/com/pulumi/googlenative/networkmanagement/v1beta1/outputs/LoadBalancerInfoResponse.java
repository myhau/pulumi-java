// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkmanagement.v1beta1.outputs.LoadBalancerBackendResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoadBalancerInfoResponse {
    /**
     * @return Type of load balancer&#39;s backend configuration.
     * 
     */
    private final String backendType;
    /**
     * @return Backend configuration URI.
     * 
     */
    private final String backendUri;
    /**
     * @return Information for the loadbalancer backends.
     * 
     */
    private final List<LoadBalancerBackendResponse> backends;
    /**
     * @return URI of the health check for the load balancer.
     * 
     */
    private final String healthCheckUri;
    /**
     * @return Type of the load balancer.
     * 
     */
    private final String loadBalancerType;

    @CustomType.Constructor
    private LoadBalancerInfoResponse(
        @CustomType.Parameter("backendType") String backendType,
        @CustomType.Parameter("backendUri") String backendUri,
        @CustomType.Parameter("backends") List<LoadBalancerBackendResponse> backends,
        @CustomType.Parameter("healthCheckUri") String healthCheckUri,
        @CustomType.Parameter("loadBalancerType") String loadBalancerType) {
        this.backendType = backendType;
        this.backendUri = backendUri;
        this.backends = backends;
        this.healthCheckUri = healthCheckUri;
        this.loadBalancerType = loadBalancerType;
    }

    /**
     * @return Type of load balancer&#39;s backend configuration.
     * 
     */
    public String backendType() {
        return this.backendType;
    }
    /**
     * @return Backend configuration URI.
     * 
     */
    public String backendUri() {
        return this.backendUri;
    }
    /**
     * @return Information for the loadbalancer backends.
     * 
     */
    public List<LoadBalancerBackendResponse> backends() {
        return this.backends;
    }
    /**
     * @return URI of the health check for the load balancer.
     * 
     */
    public String healthCheckUri() {
        return this.healthCheckUri;
    }
    /**
     * @return Type of the load balancer.
     * 
     */
    public String loadBalancerType() {
        return this.loadBalancerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendType;
        private String backendUri;
        private List<LoadBalancerBackendResponse> backends;
        private String healthCheckUri;
        private String loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.backendUri = defaults.backendUri;
    	      this.backends = defaults.backends;
    	      this.healthCheckUri = defaults.healthCheckUri;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder backendType(String backendType) {
            this.backendType = Objects.requireNonNull(backendType);
            return this;
        }
        public Builder backendUri(String backendUri) {
            this.backendUri = Objects.requireNonNull(backendUri);
            return this;
        }
        public Builder backends(List<LoadBalancerBackendResponse> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }
        public Builder backends(LoadBalancerBackendResponse... backends) {
            return backends(List.of(backends));
        }
        public Builder healthCheckUri(String healthCheckUri) {
            this.healthCheckUri = Objects.requireNonNull(healthCheckUri);
            return this;
        }
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }        public LoadBalancerInfoResponse build() {
            return new LoadBalancerInfoResponse(backendType, backendUri, backends, healthCheckUri, loadBalancerType);
        }
    }
}
