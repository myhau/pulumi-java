// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionRestrictionsGeoRestrictionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class DistributionRestrictionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGetArgs Empty = new DistributionRestrictionsGetArgs();

    @InputImport(name="geoRestriction", required=true)
      private final Input<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction;

    public Input<DistributionRestrictionsGeoRestrictionGetArgs> getGeoRestriction() {
        return this.geoRestriction;
    }

    public DistributionRestrictionsGetArgs(Input<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction) {
        this.geoRestriction = Objects.requireNonNull(geoRestriction, "expected parameter 'geoRestriction' to be non-null");
    }

    private DistributionRestrictionsGetArgs() {
        this.geoRestriction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoRestriction = defaults.geoRestriction;
        }

        public Builder setGeoRestriction(Input<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction) {
            this.geoRestriction = Objects.requireNonNull(geoRestriction);
            return this;
        }

        public Builder setGeoRestriction(DistributionRestrictionsGeoRestrictionGetArgs geoRestriction) {
            this.geoRestriction = Input.of(Objects.requireNonNull(geoRestriction));
            return this;
        }
        public DistributionRestrictionsGetArgs build() {
            return new DistributionRestrictionsGetArgs(geoRestriction);
        }
    }
}
