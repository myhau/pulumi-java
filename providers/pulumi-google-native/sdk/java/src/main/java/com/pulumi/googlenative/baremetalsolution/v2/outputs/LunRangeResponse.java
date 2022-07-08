// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class LunRangeResponse {
    /**
     * @return Number of LUNs to create.
     * 
     */
    private final Integer quantity;
    /**
     * @return The requested size of each LUN, in GB.
     * 
     */
    private final Integer sizeGb;

    @CustomType.Constructor
    private LunRangeResponse(
        @CustomType.Parameter("quantity") Integer quantity,
        @CustomType.Parameter("sizeGb") Integer sizeGb) {
        this.quantity = quantity;
        this.sizeGb = sizeGb;
    }

    /**
     * @return Number of LUNs to create.
     * 
     */
    public Integer quantity() {
        return this.quantity;
    }
    /**
     * @return The requested size of each LUN, in GB.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LunRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer quantity;
        private Integer sizeGb;

        public Builder() {
    	      // Empty
        }

        public Builder(LunRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quantity = defaults.quantity;
    	      this.sizeGb = defaults.sizeGb;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        public Builder sizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }        public LunRangeResponse build() {
            return new LunRangeResponse(quantity, sizeGb);
        }
    }
}
