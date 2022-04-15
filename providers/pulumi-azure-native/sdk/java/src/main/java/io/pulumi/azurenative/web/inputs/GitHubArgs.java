// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ClientRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the GitHub provider.
 * 
 */
public final class GitHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitHubArgs Empty = new GitHubArgs();

    /**
     * <code>false</code> if the GitHub provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<LoginScopesArgs> login;

    public Output<LoginScopesArgs> login() {
        return this.login == null ? Codegen.empty() : this.login;
    }

    /**
     * The configuration settings of the app registration for the GitHub provider.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<ClientRegistrationArgs> registration;

    public Output<ClientRegistrationArgs> registration() {
        return this.registration == null ? Codegen.empty() : this.registration;
    }

    public GitHubArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<LoginScopesArgs> login,
        @Nullable Output<ClientRegistrationArgs> registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    private GitHubArgs() {
        this.enabled = Codegen.empty();
        this.login = Codegen.empty();
        this.registration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<LoginScopesArgs> login;
        private @Nullable Output<ClientRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }
        public Builder login(@Nullable LoginScopesArgs login) {
            this.login = Codegen.ofNullable(login);
            return this;
        }
        public Builder registration(@Nullable Output<ClientRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }
        public Builder registration(@Nullable ClientRegistrationArgs registration) {
            this.registration = Codegen.ofNullable(registration);
            return this;
        }        public GitHubArgs build() {
            return new GitHubArgs(enabled, login, registration);
        }
    }
}
