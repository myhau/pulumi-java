// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AppRegistrationResponse;
import io.pulumi.azurenative.web.outputs.LoginScopesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FacebookResponse {
    /**
     * <code>false</code> if the Facebook provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The version of the Facebook api to be used while logging in.
     * 
     */
    private final @Nullable String graphApiVersion;
    /**
     * The configuration settings of the login flow.
     * 
     */
    private final @Nullable LoginScopesResponse login;
    /**
     * The configuration settings of the app registration for the Facebook provider.
     * 
     */
    private final @Nullable AppRegistrationResponse registration;

    @CustomType.Constructor
    private FacebookResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("graphApiVersion") @Nullable String graphApiVersion,
        @CustomType.Parameter("login") @Nullable LoginScopesResponse login,
        @CustomType.Parameter("registration") @Nullable AppRegistrationResponse registration) {
        this.enabled = enabled;
        this.graphApiVersion = graphApiVersion;
        this.login = login;
        this.registration = registration;
    }

    /**
     * <code>false</code> if the Facebook provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The version of the Facebook api to be used while logging in.
     * 
    */
    public Optional<String> graphApiVersion() {
        return Optional.ofNullable(this.graphApiVersion);
    }
    /**
     * The configuration settings of the login flow.
     * 
    */
    public Optional<LoginScopesResponse> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The configuration settings of the app registration for the Facebook provider.
     * 
    */
    public Optional<AppRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String graphApiVersion;
        private @Nullable LoginScopesResponse login;
        private @Nullable AppRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.graphApiVersion = defaults.graphApiVersion;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder graphApiVersion(@Nullable String graphApiVersion) {
            this.graphApiVersion = graphApiVersion;
            return this;
        }
        public Builder login(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }
        public Builder registration(@Nullable AppRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }        public FacebookResponse build() {
            return new FacebookResponse(enabled, graphApiVersion, login, registration);
        }
    }
}
