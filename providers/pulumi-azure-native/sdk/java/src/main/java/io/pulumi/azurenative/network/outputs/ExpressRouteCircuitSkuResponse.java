// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitSkuResponse {
    /**
     * The family of the SKU.
     * 
     */
    private final @Nullable String family;
    /**
     * The name of the SKU.
     * 
     */
    private final @Nullable String name;
    /**
     * The tier of the SKU.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private ExpressRouteCircuitSkuResponse(
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.family = family;
        this.name = name;
        this.tier = tier;
    }

    /**
     * The family of the SKU.
     * 
    */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The name of the SKU.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The tier of the SKU.
     * 
    */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String family;
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ExpressRouteCircuitSkuResponse build() {
            return new ExpressRouteCircuitSkuResponse(family, name, tier);
        }
    }
}
