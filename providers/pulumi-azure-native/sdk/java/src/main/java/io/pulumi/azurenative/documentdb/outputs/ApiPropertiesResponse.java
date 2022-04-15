// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiPropertiesResponse {
    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
     */
    private final @Nullable String serverVersion;

    @CustomType.Constructor
    private ApiPropertiesResponse(@CustomType.Parameter("serverVersion") @Nullable String serverVersion) {
        this.serverVersion = serverVersion;
    }

    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
    */
    public Optional<String> serverVersion() {
        return Optional.ofNullable(this.serverVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverVersion = defaults.serverVersion;
        }

        public Builder serverVersion(@Nullable String serverVersion) {
            this.serverVersion = serverVersion;
            return this;
        }        public ApiPropertiesResponse build() {
            return new ApiPropertiesResponse(serverVersion);
        }
    }
}
