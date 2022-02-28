// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserAuthenticationModeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAuthenticationModeGetArgs Empty = new UserAuthenticationModeGetArgs();

    /**
     * The number of passwords belonging to the user.
     * 
     */
    @InputImport(name="passwordCount")
      private final @Nullable Input<Integer> passwordCount;

    public Input<Integer> getPasswordCount() {
        return this.passwordCount == null ? Input.empty() : this.passwordCount;
    }

    /**
     * The set of passwords used for authentication. You can create up to two passwords for each user.
     * 
     */
    @InputImport(name="passwords", required=true)
      private final Input<List<String>> passwords;

    public Input<List<String>> getPasswords() {
        return this.passwords;
    }

    /**
     * Indicates whether the user requires a password to authenticate. Must be set to `password`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public UserAuthenticationModeGetArgs(
        @Nullable Input<Integer> passwordCount,
        Input<List<String>> passwords,
        Input<String> type) {
        this.passwordCount = passwordCount;
        this.passwords = Objects.requireNonNull(passwords, "expected parameter 'passwords' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UserAuthenticationModeGetArgs() {
        this.passwordCount = Input.empty();
        this.passwords = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAuthenticationModeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> passwordCount;
        private Input<List<String>> passwords;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAuthenticationModeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordCount = defaults.passwordCount;
    	      this.passwords = defaults.passwords;
    	      this.type = defaults.type;
        }

        public Builder setPasswordCount(@Nullable Input<Integer> passwordCount) {
            this.passwordCount = passwordCount;
            return this;
        }

        public Builder setPasswordCount(@Nullable Integer passwordCount) {
            this.passwordCount = Input.ofNullable(passwordCount);
            return this;
        }

        public Builder setPasswords(Input<List<String>> passwords) {
            this.passwords = Objects.requireNonNull(passwords);
            return this;
        }

        public Builder setPasswords(List<String> passwords) {
            this.passwords = Input.of(Objects.requireNonNull(passwords));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public UserAuthenticationModeGetArgs build() {
            return new UserAuthenticationModeGetArgs(passwordCount, passwords, type);
        }
    }
}
