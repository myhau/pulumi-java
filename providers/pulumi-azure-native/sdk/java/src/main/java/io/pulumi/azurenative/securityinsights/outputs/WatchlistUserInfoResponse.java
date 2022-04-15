// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WatchlistUserInfoResponse {
    /**
     * The email of the user.
     * 
     */
    private final String email;
    /**
     * The name of the user.
     * 
     */
    private final String name;
    /**
     * The object id of the user.
     * 
     */
    private final @Nullable String objectId;

    @CustomType.Constructor
    private WatchlistUserInfoResponse(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectId") @Nullable String objectId) {
        this.email = email;
        this.name = name;
        this.objectId = objectId;
    }

    /**
     * The email of the user.
     * 
    */
    public String email() {
        return this.email;
    }
    /**
     * The name of the user.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The object id of the user.
     * 
    */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WatchlistUserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String name;
        private @Nullable String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(WatchlistUserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }        public WatchlistUserInfoResponse build() {
            return new WatchlistUserInfoResponse(email, name, objectId);
        }
    }
}
