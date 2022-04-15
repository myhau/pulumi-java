// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingRuleLinkResponse {
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private RoutingRuleLinkResponse(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingRuleLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingRuleLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public RoutingRuleLinkResponse build() {
            return new RoutingRuleLinkResponse(id);
        }
    }
}
