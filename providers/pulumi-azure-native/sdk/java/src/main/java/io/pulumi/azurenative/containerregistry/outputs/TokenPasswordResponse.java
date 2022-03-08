// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenPasswordResponse {
    /**
     * The creation datetime of the password.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The expiry datetime of the password.
     * 
     */
    private final @Nullable String expiry;
    /**
     * The password name "password1" or "password2"
     * 
     */
    private final @Nullable String name;
    /**
     * The password value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"creationTime","expiry","name","value"})
    private TokenPasswordResponse(
        @Nullable String creationTime,
        @Nullable String expiry,
        @Nullable String name,
        String value) {
        this.creationTime = creationTime;
        this.expiry = expiry;
        this.name = name;
        this.value = value;
    }

    /**
     * The creation datetime of the password.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The expiry datetime of the password.
     * 
    */
    public Optional<String> getExpiry() {
        return Optional.ofNullable(this.expiry);
    }
    /**
     * The password name "password1" or "password2"
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The password value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenPasswordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String expiry;
        private @Nullable String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenPasswordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.expiry = defaults.expiry;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setExpiry(@Nullable String expiry) {
            this.expiry = expiry;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TokenPasswordResponse build() {
            return new TokenPasswordResponse(creationTime, expiry, name, value);
        }
    }
}
