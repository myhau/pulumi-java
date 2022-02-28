// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiCorsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiCorsConfigurationArgs Empty = new ApiCorsConfigurationArgs();

    /**
     * Whether credentials are included in the CORS request.
     * 
     */
    @InputImport(name="allowCredentials")
      private final @Nullable Input<Boolean> allowCredentials;

    public Input<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Input.empty() : this.allowCredentials;
    }

    /**
     * The set of allowed HTTP headers.
     * 
     */
    @InputImport(name="allowHeaders")
      private final @Nullable Input<List<String>> allowHeaders;

    public Input<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Input.empty() : this.allowHeaders;
    }

    /**
     * The set of allowed HTTP methods.
     * 
     */
    @InputImport(name="allowMethods")
      private final @Nullable Input<List<String>> allowMethods;

    public Input<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Input.empty() : this.allowMethods;
    }

    /**
     * The set of allowed origins.
     * 
     */
    @InputImport(name="allowOrigins")
      private final @Nullable Input<List<String>> allowOrigins;

    public Input<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Input.empty() : this.allowOrigins;
    }

    /**
     * The set of exposed HTTP headers.
     * 
     */
    @InputImport(name="exposeHeaders")
      private final @Nullable Input<List<String>> exposeHeaders;

    public Input<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Input.empty() : this.exposeHeaders;
    }

    /**
     * The number of seconds that the browser should cache preflight request results.
     * 
     */
    @InputImport(name="maxAge")
      private final @Nullable Input<Integer> maxAge;

    public Input<Integer> getMaxAge() {
        return this.maxAge == null ? Input.empty() : this.maxAge;
    }

    public ApiCorsConfigurationArgs(
        @Nullable Input<Boolean> allowCredentials,
        @Nullable Input<List<String>> allowHeaders,
        @Nullable Input<List<String>> allowMethods,
        @Nullable Input<List<String>> allowOrigins,
        @Nullable Input<List<String>> exposeHeaders,
        @Nullable Input<Integer> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    private ApiCorsConfigurationArgs() {
        this.allowCredentials = Input.empty();
        this.allowHeaders = Input.empty();
        this.allowMethods = Input.empty();
        this.allowOrigins = Input.empty();
        this.exposeHeaders = Input.empty();
        this.maxAge = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiCorsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCredentials;
        private @Nullable Input<List<String>> allowHeaders;
        private @Nullable Input<List<String>> allowMethods;
        private @Nullable Input<List<String>> allowOrigins;
        private @Nullable Input<List<String>> exposeHeaders;
        private @Nullable Input<Integer> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiCorsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Input<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Input.ofNullable(allowCredentials);
            return this;
        }

        public Builder setAllowHeaders(@Nullable Input<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder setAllowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Input.ofNullable(allowHeaders);
            return this;
        }

        public Builder setAllowMethods(@Nullable Input<List<String>> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder setAllowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = Input.ofNullable(allowMethods);
            return this;
        }

        public Builder setAllowOrigins(@Nullable Input<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder setAllowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Input.ofNullable(allowOrigins);
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

        public Builder setMaxAge(@Nullable Input<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = Input.ofNullable(maxAge);
            return this;
        }
        public ApiCorsConfigurationArgs build() {
            return new ApiCorsConfigurationArgs(allowCredentials, allowHeaders, allowMethods, allowOrigins, exposeHeaders, maxAge);
        }
    }
}
