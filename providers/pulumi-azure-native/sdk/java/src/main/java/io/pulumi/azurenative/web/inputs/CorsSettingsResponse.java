// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cross-Origin Resource Sharing (CORS) settings for the app.
 * 
 */
public final class CorsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CorsSettingsResponse Empty = new CorsSettingsResponse();

    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use "*" to allow all.
     * 
     */
    @Import(name="allowedOrigins")
      private final @Nullable List<String> allowedOrigins;

    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }

    /**
     * Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     * 
     */
    @Import(name="supportCredentials")
      private final @Nullable Boolean supportCredentials;

    public Optional<Boolean> supportCredentials() {
        return this.supportCredentials == null ? Optional.empty() : Optional.ofNullable(this.supportCredentials);
    }

    public CorsSettingsResponse(
        @Nullable List<String> allowedOrigins,
        @Nullable Boolean supportCredentials) {
        this.allowedOrigins = allowedOrigins;
        this.supportCredentials = supportCredentials;
    }

    private CorsSettingsResponse() {
        this.allowedOrigins = List.of();
        this.supportCredentials = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }        public CorsSettingsResponse build() {
            return new CorsSettingsResponse(allowedOrigins, supportCredentials);
        }
    }
}
