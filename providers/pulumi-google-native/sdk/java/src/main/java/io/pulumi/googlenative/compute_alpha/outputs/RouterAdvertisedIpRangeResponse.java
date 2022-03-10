// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterAdvertisedIpRangeResponse {
    /**
     * User-specified description for the IP range.
     * 
     */
    private final String description;
    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    private final String range;

    @OutputCustomType.Constructor
    private RouterAdvertisedIpRangeResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("range") String range) {
        this.description = description;
        this.range = range;
    }

    /**
     * User-specified description for the IP range.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
    */
    public String getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterAdvertisedIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public RouterAdvertisedIpRangeResponse build() {
            return new RouterAdvertisedIpRangeResponse(description, range);
        }
    }
}
