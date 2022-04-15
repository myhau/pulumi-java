// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestCredentialResponse {
    /**
     * Gets or sets username to connect with the guest.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private GuestCredentialResponse(@CustomType.Parameter("username") @Nullable String username) {
        this.username = username;
    }

    /**
     * Gets or sets username to connect with the guest.
     * 
    */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public GuestCredentialResponse build() {
            return new GuestCredentialResponse(username);
        }
    }
}
