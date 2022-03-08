// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSkuResponse {
    /**
     * Optional, integer. The unit count of SignalR resource. 1 by default.
     * 
     * If present, following values are allowed:
     *     Free: 1
     *     Standard: 1,2,5,10,20,50,100
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Not used. Retained for future use.
     * 
     */
    private final String family;
    /**
     * The name of the SKU. Required.
     * 
     * Allowed values: Standard_S1, Free_F1
     * 
     */
    private final String name;
    /**
     * Not used. Retained for future use.
     * 
     */
    private final String size;
    /**
     * Optional tier of this particular SKU. 'Standard' or 'Free'.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"capacity","family","name","size","tier"})
    private ResourceSkuResponse(
        @Nullable Integer capacity,
        String family,
        String name,
        String size,
        @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * Optional, integer. The unit count of SignalR resource. 1 by default.
     * 
     * If present, following values are allowed:
     *     Free: 1
     *     Standard: 1,2,5,10,20,50,100
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Not used. Retained for future use.
     * 
    */
    public String getFamily() {
        return this.family;
    }
    /**
     * The name of the SKU. Required.
     * 
     * Allowed values: Standard_S1, Free_F1
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Not used. Retained for future use.
     * 
    */
    public String getSize() {
        return this.size;
    }
    /**
     * Optional tier of this particular SKU. 'Standard' or 'Free'.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String family;
        private String name;
        private String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setFamily(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSize(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, family, name, size, tier);
        }
    }
}
