// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ConsistentHashLoadBalancerSettingsHttpCookieResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConsistentHashLoadBalancerSettingsResponse {
    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie;
    /**
     * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    private final String httpHeaderName;
    /**
     * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
     * 
     */
    private final String minimumRingSize;

    @OutputCustomType.Constructor
    private ConsistentHashLoadBalancerSettingsResponse(
        @OutputCustomType.Parameter("httpCookie") ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie,
        @OutputCustomType.Parameter("httpHeaderName") String httpHeaderName,
        @OutputCustomType.Parameter("minimumRingSize") String minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public ConsistentHashLoadBalancerSettingsHttpCookieResponse getHttpCookie() {
        return this.httpCookie;
    }
    /**
     * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
    */
    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }
    /**
     * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
     * 
    */
    public String getMinimumRingSize() {
        return this.minimumRingSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie;
        private String httpHeaderName;
        private String minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder setHttpCookie(ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie) {
            this.httpCookie = Objects.requireNonNull(httpCookie);
            return this;
        }

        public Builder setHttpHeaderName(String httpHeaderName) {
            this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
            return this;
        }

        public Builder setMinimumRingSize(String minimumRingSize) {
            this.minimumRingSize = Objects.requireNonNull(minimumRingSize);
            return this;
        }
        public ConsistentHashLoadBalancerSettingsResponse build() {
            return new ConsistentHashLoadBalancerSettingsResponse(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}
