// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SeedNodeResponse {
    /**
     * IP address of this seed node.
     * 
     */
    private final @Nullable String ipAddress;

    @CustomType.Constructor
    private SeedNodeResponse(@CustomType.Parameter("ipAddress") @Nullable String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * IP address of this seed node.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeedNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SeedNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }        public SeedNodeResponse build() {
            return new SeedNodeResponse(ipAddress);
        }
    }
}
