// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketCorsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsRuleArgs Empty = new BucketCorsRuleArgs();

    /**
     * Specifies which headers are allowed.
     * 
     */
    @InputImport(name="allowedHeaders")
      private final @Nullable Input<List<String>> allowedHeaders;

    public Input<List<String>> getAllowedHeaders() {
        return this.allowedHeaders == null ? Input.empty() : this.allowedHeaders;
    }

    /**
     * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
     * 
     */
    @InputImport(name="allowedMethods", required=true)
      private final Input<List<String>> allowedMethods;

    public Input<List<String>> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Specifies which origins are allowed.
     * 
     */
    @InputImport(name="allowedOrigins", required=true)
      private final Input<List<String>> allowedOrigins;

    public Input<List<String>> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Specifies expose header in the response.
     * 
     */
    @InputImport(name="exposeHeaders")
      private final @Nullable Input<List<String>> exposeHeaders;

    public Input<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Input.empty() : this.exposeHeaders;
    }

    /**
     * Specifies time in seconds that browser can cache the response for a preflight request.
     * 
     */
    @InputImport(name="maxAgeSeconds")
      private final @Nullable Input<Integer> maxAgeSeconds;

    public Input<Integer> getMaxAgeSeconds() {
        return this.maxAgeSeconds == null ? Input.empty() : this.maxAgeSeconds;
    }

    public BucketCorsRuleArgs(
        @Nullable Input<List<String>> allowedHeaders,
        Input<List<String>> allowedMethods,
        Input<List<String>> allowedOrigins,
        @Nullable Input<List<String>> exposeHeaders,
        @Nullable Input<Integer> maxAgeSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposeHeaders = exposeHeaders;
        this.maxAgeSeconds = maxAgeSeconds;
    }

    private BucketCorsRuleArgs() {
        this.allowedHeaders = Input.empty();
        this.allowedMethods = Input.empty();
        this.allowedOrigins = Input.empty();
        this.exposeHeaders = Input.empty();
        this.maxAgeSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedHeaders;
        private Input<List<String>> allowedMethods;
        private Input<List<String>> allowedOrigins;
        private @Nullable Input<List<String>> exposeHeaders;
        private @Nullable Input<Integer> maxAgeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
        }

        public Builder setAllowedHeaders(@Nullable Input<List<String>> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = Input.ofNullable(allowedHeaders);
            return this;
        }

        public Builder setAllowedMethods(Input<List<String>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Input.of(Objects.requireNonNull(allowedMethods));
            return this;
        }

        public Builder setAllowedOrigins(Input<List<String>> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Input.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }

        public Builder setExposeHeaders(@Nullable Input<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Input.ofNullable(exposeHeaders);
            return this;
        }

        public Builder setMaxAgeSeconds(@Nullable Input<Integer> maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public Builder setMaxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = Input.ofNullable(maxAgeSeconds);
            return this;
        }
        public BucketCorsRuleArgs build() {
            return new BucketCorsRuleArgs(allowedHeaders, allowedMethods, allowedOrigins, exposeHeaders, maxAgeSeconds);
        }
    }
}
