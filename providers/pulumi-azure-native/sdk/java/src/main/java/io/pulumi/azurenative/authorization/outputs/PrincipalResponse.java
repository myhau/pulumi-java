// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrincipalResponse {
    private final @Nullable String displayName;
    private final @Nullable String email;
    private final @Nullable String id;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"displayName","email","id","type"})
    private PrincipalResponse(
        @Nullable String displayName,
        @Nullable String email,
        @Nullable String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.email = email;
        this.id = id;
        this.type = type;
    }

    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String email;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public PrincipalResponse build() {
            return new PrincipalResponse(displayName, email, id, type);
        }
    }
}