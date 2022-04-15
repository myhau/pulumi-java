// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointPropertyResponse {
    /**
     * Resource id of the private endpoint.
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private PrivateEndpointPropertyResponse(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * Resource id of the private endpoint.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public PrivateEndpointPropertyResponse build() {
            return new PrivateEndpointPropertyResponse(id);
        }
    }
}
