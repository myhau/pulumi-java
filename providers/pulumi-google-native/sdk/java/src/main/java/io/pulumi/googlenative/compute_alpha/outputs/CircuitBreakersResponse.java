// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class CircuitBreakersResponse {
    /**
     * The timeout for new network connections to hosts.
     * 
     */
    private final DurationResponse connectTimeout;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxConnections;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxPendingRequests;
    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
     */
    private final Integer maxRequests;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxRequestsPerConnection;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxRetries;

    @OutputCustomType.Constructor({"connectTimeout","maxConnections","maxPendingRequests","maxRequests","maxRequestsPerConnection","maxRetries"})
    private CircuitBreakersResponse(
        DurationResponse connectTimeout,
        Integer maxConnections,
        Integer maxPendingRequests,
        Integer maxRequests,
        Integer maxRequestsPerConnection,
        Integer maxRetries) {
        this.connectTimeout = connectTimeout;
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    /**
     * The timeout for new network connections to hosts.
     * 
    */
    public DurationResponse getConnectTimeout() {
        return this.connectTimeout;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxPendingRequests() {
        return this.maxPendingRequests;
    }
    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
    */
    public Integer getMaxRequests() {
        return this.maxRequests;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitBreakersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse connectTimeout;
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitBreakersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder setConnectTimeout(DurationResponse connectTimeout) {
            this.connectTimeout = Objects.requireNonNull(connectTimeout);
            return this;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }

        public Builder setMaxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }

        public Builder setMaxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public CircuitBreakersResponse build() {
            return new CircuitBreakersResponse(connectTimeout, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
