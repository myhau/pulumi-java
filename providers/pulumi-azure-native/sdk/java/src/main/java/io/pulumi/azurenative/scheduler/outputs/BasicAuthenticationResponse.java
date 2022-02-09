// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BasicAuthenticationResponse {
    private final @Nullable String password;
    private final String type;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"password","type","username"})
    private BasicAuthenticationResponse(
        @Nullable String password,
        String type,
        @Nullable String username) {
        this.password = password;
        this.type = Objects.requireNonNull(type);
        this.username = username;
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public BasicAuthenticationResponse build() {
            return new BasicAuthenticationResponse(password, type, username);
        }
    }
}