// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Username and password credentials.
 * 
 */
public final class UsernamePasswordCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsernamePasswordCredentialsArgs Empty = new UsernamePasswordCredentialsArgs();

    /**
     * Password to be presented as part of the credentials. It is recommended that this value is parameterized as a secret string in order to prevent this value to be returned as part of the resource on API requests.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.UsernamePasswordCredentials'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Username to be presented as part of the credentials.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public UsernamePasswordCredentialsArgs(
        Output<String> password,
        Output<String> type,
        Output<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private UsernamePasswordCredentialsArgs() {
        this.password = Codegen.empty();
        this.type = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsernamePasswordCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> password;
        private Output<String> type;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(UsernamePasswordCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public UsernamePasswordCredentialsArgs build() {
            return new UsernamePasswordCredentialsArgs(password, type, username);
        }
    }
}
