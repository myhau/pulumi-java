// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ConsistentHashLoadBalancerSettingsHttpCookieResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConsistentHashLoadBalancerSettingsResponse {
    private final ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie;
    private final String httpHeaderName;
    private final String minimumRingSize;

    @OutputCustomType.Constructor({"httpCookie","httpHeaderName","minimumRingSize"})
    private ConsistentHashLoadBalancerSettingsResponse(
        ConsistentHashLoadBalancerSettingsHttpCookieResponse httpCookie,
        String httpHeaderName,
        String minimumRingSize) {
        this.httpCookie = Objects.requireNonNull(httpCookie);
        this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
        this.minimumRingSize = Objects.requireNonNull(minimumRingSize);
    }

    public ConsistentHashLoadBalancerSettingsHttpCookieResponse getHttpCookie() {
        return this.httpCookie;
    }
    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }
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