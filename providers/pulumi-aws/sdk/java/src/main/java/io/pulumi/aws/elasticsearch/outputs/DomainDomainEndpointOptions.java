// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainDomainEndpointOptions {
    /**
     * Fully qualified domain for your custom endpoint.
     * 
     */
    private final @Nullable String customEndpoint;
    /**
     * ACM certificate ARN for your custom endpoint.
     * 
     */
    private final @Nullable String customEndpointCertificateArn;
    /**
     * Whether to enable custom endpoint for the Elasticsearch domain.
     * 
     */
    private final @Nullable Boolean customEndpointEnabled;
    /**
     * Whether or not to require HTTPS. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean enforceHttps;
    private final @Nullable String tlsSecurityPolicy;

    @OutputCustomType.Constructor({"customEndpoint","customEndpointCertificateArn","customEndpointEnabled","enforceHttps","tlsSecurityPolicy"})
    private DomainDomainEndpointOptions(
        @Nullable String customEndpoint,
        @Nullable String customEndpointCertificateArn,
        @Nullable Boolean customEndpointEnabled,
        @Nullable Boolean enforceHttps,
        @Nullable String tlsSecurityPolicy) {
        this.customEndpoint = customEndpoint;
        this.customEndpointCertificateArn = customEndpointCertificateArn;
        this.customEndpointEnabled = customEndpointEnabled;
        this.enforceHttps = enforceHttps;
        this.tlsSecurityPolicy = tlsSecurityPolicy;
    }

    /**
     * Fully qualified domain for your custom endpoint.
     * 
     */
    public Optional<String> getCustomEndpoint() {
        return Optional.ofNullable(this.customEndpoint);
    }
    /**
     * ACM certificate ARN for your custom endpoint.
     * 
     */
    public Optional<String> getCustomEndpointCertificateArn() {
        return Optional.ofNullable(this.customEndpointCertificateArn);
    }
    /**
     * Whether to enable custom endpoint for the Elasticsearch domain.
     * 
     */
    public Optional<Boolean> getCustomEndpointEnabled() {
        return Optional.ofNullable(this.customEndpointEnabled);
    }
    /**
     * Whether or not to require HTTPS. Defaults to `true`.
     * 
     */
    public Optional<Boolean> getEnforceHttps() {
        return Optional.ofNullable(this.enforceHttps);
    }
    public Optional<String> getTlsSecurityPolicy() {
        return Optional.ofNullable(this.tlsSecurityPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDomainEndpointOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customEndpoint;
        private @Nullable String customEndpointCertificateArn;
        private @Nullable Boolean customEndpointEnabled;
        private @Nullable Boolean enforceHttps;
        private @Nullable String tlsSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDomainEndpointOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEndpoint = defaults.customEndpoint;
    	      this.customEndpointCertificateArn = defaults.customEndpointCertificateArn;
    	      this.customEndpointEnabled = defaults.customEndpointEnabled;
    	      this.enforceHttps = defaults.enforceHttps;
    	      this.tlsSecurityPolicy = defaults.tlsSecurityPolicy;
        }

        public Builder setCustomEndpoint(@Nullable String customEndpoint) {
            this.customEndpoint = customEndpoint;
            return this;
        }

        public Builder setCustomEndpointCertificateArn(@Nullable String customEndpointCertificateArn) {
            this.customEndpointCertificateArn = customEndpointCertificateArn;
            return this;
        }

        public Builder setCustomEndpointEnabled(@Nullable Boolean customEndpointEnabled) {
            this.customEndpointEnabled = customEndpointEnabled;
            return this;
        }

        public Builder setEnforceHttps(@Nullable Boolean enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        public Builder setTlsSecurityPolicy(@Nullable String tlsSecurityPolicy) {
            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }
        public DomainDomainEndpointOptions build() {
            return new DomainDomainEndpointOptions(customEndpoint, customEndpointCertificateArn, customEndpointEnabled, enforceHttps, tlsSecurityPolicy);
        }
    }
}
