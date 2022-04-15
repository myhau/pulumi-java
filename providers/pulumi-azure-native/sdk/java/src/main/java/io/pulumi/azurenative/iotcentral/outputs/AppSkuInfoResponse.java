// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotcentral.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppSkuInfoResponse {
    /**
     * The name of the SKU.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AppSkuInfoResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * The name of the SKU.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSkuInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public AppSkuInfoResponse build() {
            return new AppSkuInfoResponse(name);
        }
    }
}
