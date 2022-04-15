// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IotDpsSkuInfoResponse {
    /**
     * The number of units to provision
     * 
     */
    private final @Nullable Double capacity;
    /**
     * Sku name.
     * 
     */
    private final @Nullable String name;
    /**
     * Pricing tier name of the provisioning service.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private IotDpsSkuInfoResponse(
        @CustomType.Parameter("capacity") @Nullable Double capacity,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tier") String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * The number of units to provision
     * 
    */
    public Optional<Double> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Sku name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Pricing tier name of the provisioning service.
     * 
    */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsSkuInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public IotDpsSkuInfoResponse build() {
            return new IotDpsSkuInfoResponse(capacity, name, tier);
        }
    }
}
