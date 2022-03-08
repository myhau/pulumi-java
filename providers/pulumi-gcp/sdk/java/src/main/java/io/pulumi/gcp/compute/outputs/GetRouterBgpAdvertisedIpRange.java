// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRouterBgpAdvertisedIpRange {
    private final String description;
    private final String range;

    @OutputCustomType.Constructor({"description","range"})
    private GetRouterBgpAdvertisedIpRange(
        String description,
        String range) {
        this.description = description;
        this.range = range;
    }

    public String getDescription() {
        return this.description;
    }
    public String getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterBgpAdvertisedIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterBgpAdvertisedIpRange defaults) {
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
        public GetRouterBgpAdvertisedIpRange build() {
            return new GetRouterBgpAdvertisedIpRange(description, range);
        }
    }
}
