// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SkuResponse {
    /**
     * The SKU name of the container registry. Required for registry creation.
     * 
     */
    private final String name;
    /**
     * The SKU tier based on the SKU name.
     * 
     */
    private final String tier;

    @OutputCustomType.Constructor({"name","tier"})
    private SkuResponse(
        String name,
        String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * The SKU name of the container registry. Required for registry creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The SKU tier based on the SKU name.
     * 
    */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(name, tier);
        }
    }
}
