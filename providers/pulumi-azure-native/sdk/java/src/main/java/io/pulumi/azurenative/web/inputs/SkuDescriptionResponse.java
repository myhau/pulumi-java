// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.CapabilityResponse;
import io.pulumi.azurenative.web.inputs.SkuCapacityResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a SKU for a scalable resource.
 * 
 */
public final class SkuDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuDescriptionResponse Empty = new SkuDescriptionResponse();

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     * 
     */
    @Import(name="capabilities")
      private final @Nullable List<CapabilityResponse> capabilities;

    public List<CapabilityResponse> capabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }

    /**
     * Current number of instances assigned to the resource.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> capacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Family code of the resource SKU.
     * 
     */
    @Import(name="family")
      private final @Nullable String family;

    public Optional<String> family() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    /**
     * Locations of the SKU.
     * 
     */
    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }

    /**
     * Name of the resource SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Size specifier of the resource SKU.
     * 
     */
    @Import(name="size")
      private final @Nullable String size;

    public Optional<String> size() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * Min, max, and default scale values of the SKU.
     * 
     */
    @Import(name="skuCapacity")
      private final @Nullable SkuCapacityResponse skuCapacity;

    public Optional<SkuCapacityResponse> skuCapacity() {
        return this.skuCapacity == null ? Optional.empty() : Optional.ofNullable(this.skuCapacity);
    }

    /**
     * Service tier of the resource SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> tier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public SkuDescriptionResponse(
        @Nullable List<CapabilityResponse> capabilities,
        @Nullable Integer capacity,
        @Nullable String family,
        @Nullable List<String> locations,
        @Nullable String name,
        @Nullable String size,
        @Nullable SkuCapacityResponse skuCapacity,
        @Nullable String tier) {
        this.capabilities = capabilities;
        this.capacity = capacity;
        this.family = family;
        this.locations = locations;
        this.name = name;
        this.size = size;
        this.skuCapacity = skuCapacity;
        this.tier = tier;
    }

    private SkuDescriptionResponse() {
        this.capabilities = List.of();
        this.capacity = null;
        this.family = null;
        this.locations = List.of();
        this.name = null;
        this.size = null;
        this.skuCapacity = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CapabilityResponse> capabilities;
        private @Nullable Integer capacity;
        private @Nullable String family;
        private @Nullable List<String> locations;
        private @Nullable String name;
        private @Nullable String size;
        private @Nullable SkuCapacityResponse skuCapacity;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.skuCapacity = defaults.skuCapacity;
    	      this.tier = defaults.tier;
        }

        public Builder capabilities(@Nullable List<CapabilityResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(CapabilityResponse... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder skuCapacity(@Nullable SkuCapacityResponse skuCapacity) {
            this.skuCapacity = skuCapacity;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuDescriptionResponse build() {
            return new SkuDescriptionResponse(capabilities, capacity, family, locations, name, size, skuCapacity, tier);
        }
    }
}
