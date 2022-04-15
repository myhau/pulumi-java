// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrincipalResponse {
    /**
     * The name of the principal made changes
     * 
     */
    private final @Nullable String displayName;
    /**
     * Email of principal
     * 
     */
    private final @Nullable String email;
    /**
     * The id of the principal made changes
     * 
     */
    private final @Nullable String id;
    /**
     * Type of principal such as user , group etc
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private PrincipalResponse(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("type") @Nullable String type) {
        this.displayName = displayName;
        this.email = email;
        this.id = id;
        this.type = type;
    }

    /**
     * The name of the principal made changes
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Email of principal
     * 
    */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The id of the principal made changes
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Type of principal such as user , group etc
     * 
    */
    public Optional<String> type() {
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

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PrincipalResponse build() {
            return new PrincipalResponse(displayName, email, id, type);
        }
    }
}
