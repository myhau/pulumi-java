// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API OAuth2 Authentication settings details.
 * 
 */
public final class OpenIdAuthenticationSettingsContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final OpenIdAuthenticationSettingsContractResponse Empty = new OpenIdAuthenticationSettingsContractResponse();

    /**
     * How to send token to the server.
     * 
     */
    @Import(name="bearerTokenSendingMethods")
      private final @Nullable List<String> bearerTokenSendingMethods;

    public List<String> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods == null ? List.of() : this.bearerTokenSendingMethods;
    }

    /**
     * OAuth authorization server identifier.
     * 
     */
    @Import(name="openidProviderId")
      private final @Nullable String openidProviderId;

    public Optional<String> openidProviderId() {
        return this.openidProviderId == null ? Optional.empty() : Optional.ofNullable(this.openidProviderId);
    }

    public OpenIdAuthenticationSettingsContractResponse(
        @Nullable List<String> bearerTokenSendingMethods,
        @Nullable String openidProviderId) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        this.openidProviderId = openidProviderId;
    }

    private OpenIdAuthenticationSettingsContractResponse() {
        this.bearerTokenSendingMethods = List.of();
        this.openidProviderId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdAuthenticationSettingsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> bearerTokenSendingMethods;
        private @Nullable String openidProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdAuthenticationSettingsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bearerTokenSendingMethods = defaults.bearerTokenSendingMethods;
    	      this.openidProviderId = defaults.openidProviderId;
        }

        public Builder bearerTokenSendingMethods(@Nullable List<String> bearerTokenSendingMethods) {
            this.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }
        public Builder bearerTokenSendingMethods(String... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }
        public Builder openidProviderId(@Nullable String openidProviderId) {
            this.openidProviderId = openidProviderId;
            return this;
        }        public OpenIdAuthenticationSettingsContractResponse build() {
            return new OpenIdAuthenticationSettingsContractResponse(bearerTokenSendingMethods, openidProviderId);
        }
    }
}
