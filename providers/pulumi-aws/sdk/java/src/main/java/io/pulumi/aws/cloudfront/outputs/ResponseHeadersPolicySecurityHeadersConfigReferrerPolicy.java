// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy {
    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;
    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    private final String referrerPolicy;

    @OutputCustomType.Constructor({"override","referrerPolicy"})
    private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy(
        Boolean override,
        String referrerPolicy) {
        this.override = Objects.requireNonNull(override);
        this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean getOverride() {
        return this.override;
    }
    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    public String getReferrerPolicy() {
        return this.referrerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;
        private String referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setReferrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy build() {
            return new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy(override, referrerPolicy);
        }
    }
}
