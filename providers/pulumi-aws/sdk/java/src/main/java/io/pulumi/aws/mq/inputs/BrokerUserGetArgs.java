// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerUserGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerUserGetArgs Empty = new BrokerUserGetArgs();

    /**
     * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user. Applies to `engine_type` of `ActiveMQ` only.
     * 
     */
    @InputImport(name="consoleAccess")
      private final @Nullable Input<Boolean> consoleAccess;

    public Input<Boolean> getConsoleAccess() {
        return this.consoleAccess == null ? Input.empty() : this.consoleAccess;
    }

    /**
     * List of groups (20 maximum) to which the ActiveMQ user belongs. Applies to `engine_type` of `ActiveMQ` only.
     * 
     */
    @InputImport(name="groups")
      private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    /**
     * Password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Username of the user.
     * 
     */
    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public BrokerUserGetArgs(
        @Nullable Input<Boolean> consoleAccess,
        @Nullable Input<List<String>> groups,
        Input<String> password,
        Input<String> username) {
        this.consoleAccess = consoleAccess;
        this.groups = groups;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private BrokerUserGetArgs() {
        this.consoleAccess = Input.empty();
        this.groups = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerUserGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> consoleAccess;
        private @Nullable Input<List<String>> groups;
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerUserGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleAccess = defaults.consoleAccess;
    	      this.groups = defaults.groups;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setConsoleAccess(@Nullable Input<Boolean> consoleAccess) {
            this.consoleAccess = consoleAccess;
            return this;
        }

        public Builder setConsoleAccess(@Nullable Boolean consoleAccess) {
            this.consoleAccess = Input.ofNullable(consoleAccess);
            return this;
        }

        public Builder setGroups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
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
        public BrokerUserGetArgs build() {
            return new BrokerUserGetArgs(consoleAccess, groups, password, username);
        }
    }
}
