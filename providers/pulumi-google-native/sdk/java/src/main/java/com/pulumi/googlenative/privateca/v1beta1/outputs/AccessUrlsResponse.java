// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessUrlsResponse {
    /**
     * @return The URL where this CertificateAuthority&#39;s CA certificate is published. This will only be set for CAs that have been activated.
     * 
     */
    private final String caCertificateAccessUrl;
    /**
     * @return The URL where this CertificateAuthority&#39;s CRLs are published. This will only be set for CAs that have been activated.
     * 
     */
    private final String crlAccessUrl;

    @CustomType.Constructor
    private AccessUrlsResponse(
        @CustomType.Parameter("caCertificateAccessUrl") String caCertificateAccessUrl,
        @CustomType.Parameter("crlAccessUrl") String crlAccessUrl) {
        this.caCertificateAccessUrl = caCertificateAccessUrl;
        this.crlAccessUrl = crlAccessUrl;
    }

    /**
     * @return The URL where this CertificateAuthority&#39;s CA certificate is published. This will only be set for CAs that have been activated.
     * 
     */
    public String caCertificateAccessUrl() {
        return this.caCertificateAccessUrl;
    }
    /**
     * @return The URL where this CertificateAuthority&#39;s CRLs are published. This will only be set for CAs that have been activated.
     * 
     */
    public String crlAccessUrl() {
        return this.crlAccessUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessUrlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificateAccessUrl;
        private String crlAccessUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessUrlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificateAccessUrl = defaults.caCertificateAccessUrl;
    	      this.crlAccessUrl = defaults.crlAccessUrl;
        }

        public Builder caCertificateAccessUrl(String caCertificateAccessUrl) {
            this.caCertificateAccessUrl = Objects.requireNonNull(caCertificateAccessUrl);
            return this;
        }
        public Builder crlAccessUrl(String crlAccessUrl) {
            this.crlAccessUrl = Objects.requireNonNull(crlAccessUrl);
            return this;
        }        public AccessUrlsResponse build() {
            return new AccessUrlsResponse(caCertificateAccessUrl, crlAccessUrl);
        }
    }
}
