// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CorsPolicyResponse {
    /**
     * The request headers that the origin domain may specify on the CORS request.
     * 
     */
    private final @Nullable String allowedHeaders;
    /**
     * The methods (HTTP request verbs) that the origin domain may use for a CORS request.
     * 
     */
    private final @Nullable String allowedMethods;
    /**
     * The origin domains that are permitted to make a request against the service via CORS.
     * 
     */
    private final String allowedOrigins;
    /**
     * The response headers that may be sent in the response to the CORS request and exposed by the browser to the request issuer.
     * 
     */
    private final @Nullable String exposedHeaders;
    /**
     * The maximum amount time that a browser should cache the preflight OPTIONS request.
     * 
     */
    private final @Nullable Double maxAgeInSeconds;

    @OutputCustomType.Constructor({"allowedHeaders","allowedMethods","allowedOrigins","exposedHeaders","maxAgeInSeconds"})
    private CorsPolicyResponse(
        @Nullable String allowedHeaders,
        @Nullable String allowedMethods,
        String allowedOrigins,
        @Nullable String exposedHeaders,
        @Nullable Double maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    /**
     * The request headers that the origin domain may specify on the CORS request.
     * 
    */
    public Optional<String> getAllowedHeaders() {
        return Optional.ofNullable(this.allowedHeaders);
    }
    /**
     * The methods (HTTP request verbs) that the origin domain may use for a CORS request.
     * 
    */
    public Optional<String> getAllowedMethods() {
        return Optional.ofNullable(this.allowedMethods);
    }
    /**
     * The origin domains that are permitted to make a request against the service via CORS.
     * 
    */
    public String getAllowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * The response headers that may be sent in the response to the CORS request and exposed by the browser to the request issuer.
     * 
    */
    public Optional<String> getExposedHeaders() {
        return Optional.ofNullable(this.exposedHeaders);
    }
    /**
     * The maximum amount time that a browser should cache the preflight OPTIONS request.
     * 
    */
    public Optional<Double> getMaxAgeInSeconds() {
        return Optional.ofNullable(this.maxAgeInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedHeaders;
        private @Nullable String allowedMethods;
        private String allowedOrigins;
        private @Nullable String exposedHeaders;
        private @Nullable Double maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder setAllowedHeaders(@Nullable String allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedMethods(@Nullable String allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder setAllowedOrigins(String allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setExposedHeaders(@Nullable String exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }

        public Builder setMaxAgeInSeconds(@Nullable Double maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }
        public CorsPolicyResponse build() {
            return new CorsPolicyResponse(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}
