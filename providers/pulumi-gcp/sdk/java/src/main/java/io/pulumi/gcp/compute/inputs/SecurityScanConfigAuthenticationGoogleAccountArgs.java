// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityScanConfigAuthenticationGoogleAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigAuthenticationGoogleAccountArgs Empty = new SecurityScanConfigAuthenticationGoogleAccountArgs();

    /**
     * The password of the custom account. The credential is stored encrypted
     * in GCP.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public SecurityScanConfigAuthenticationGoogleAccountArgs(
        Input<String> password,
        Input<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private SecurityScanConfigAuthenticationGoogleAccountArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigAuthenticationGoogleAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigAuthenticationGoogleAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public SecurityScanConfigAuthenticationGoogleAccountArgs build() {
            return new SecurityScanConfigAuthenticationGoogleAccountArgs(password, username);
        }
    }
}
