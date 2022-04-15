// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for the CORS configuration of the service instance.
 * 
 */
public final class ServiceCorsConfigurationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCorsConfigurationInfoArgs Empty = new ServiceCorsConfigurationInfoArgs();

    /**
     * If credentials are allowed via CORS.
     * 
     */
    @Import(name="allowCredentials")
      private final @Nullable Output<Boolean> allowCredentials;

    public Output<Boolean> allowCredentials() {
        return this.allowCredentials == null ? Codegen.empty() : this.allowCredentials;
    }

    /**
     * The headers to be allowed via CORS.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<String>> headers;

    public Output<List<String>> headers() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * The max age to be allowed via CORS.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<Integer> maxAge;

    public Output<Integer> maxAge() {
        return this.maxAge == null ? Codegen.empty() : this.maxAge;
    }

    /**
     * The methods to be allowed via CORS.
     * 
     */
    @Import(name="methods")
      private final @Nullable Output<List<String>> methods;

    public Output<List<String>> methods() {
        return this.methods == null ? Codegen.empty() : this.methods;
    }

    /**
     * The origins to be allowed via CORS.
     * 
     */
    @Import(name="origins")
      private final @Nullable Output<List<String>> origins;

    public Output<List<String>> origins() {
        return this.origins == null ? Codegen.empty() : this.origins;
    }

    public ServiceCorsConfigurationInfoArgs(
        @Nullable Output<Boolean> allowCredentials,
        @Nullable Output<List<String>> headers,
        @Nullable Output<Integer> maxAge,
        @Nullable Output<List<String>> methods,
        @Nullable Output<List<String>> origins) {
        this.allowCredentials = allowCredentials;
        this.headers = headers;
        this.maxAge = maxAge;
        this.methods = methods;
        this.origins = origins;
    }

    private ServiceCorsConfigurationInfoArgs() {
        this.allowCredentials = Codegen.empty();
        this.headers = Codegen.empty();
        this.maxAge = Codegen.empty();
        this.methods = Codegen.empty();
        this.origins = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorsConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowCredentials;
        private @Nullable Output<List<String>> headers;
        private @Nullable Output<Integer> maxAge;
        private @Nullable Output<List<String>> methods;
        private @Nullable Output<List<String>> origins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorsConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.headers = defaults.headers;
    	      this.maxAge = defaults.maxAge;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Codegen.ofNullable(allowCredentials);
            return this;
        }
        public Builder headers(@Nullable Output<List<String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = Codegen.ofNullable(maxAge);
            return this;
        }
        public Builder methods(@Nullable Output<List<String>> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(@Nullable List<String> methods) {
            this.methods = Codegen.ofNullable(methods);
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder origins(@Nullable Output<List<String>> origins) {
            this.origins = origins;
            return this;
        }
        public Builder origins(@Nullable List<String> origins) {
            this.origins = Codegen.ofNullable(origins);
            return this;
        }
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }        public ServiceCorsConfigurationInfoArgs build() {
            return new ServiceCorsConfigurationInfoArgs(allowCredentials, headers, maxAge, methods, origins);
        }
    }
}
