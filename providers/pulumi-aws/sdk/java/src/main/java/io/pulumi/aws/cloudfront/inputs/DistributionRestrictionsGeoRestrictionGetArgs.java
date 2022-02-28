// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionRestrictionsGeoRestrictionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGeoRestrictionGetArgs Empty = new DistributionRestrictionsGeoRestrictionGetArgs();

    /**
     * The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`).
     * 
     */
    @InputImport(name="locations")
      private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    /**
     * The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    @InputImport(name="restrictionType", required=true)
      private final Input<String> restrictionType;

    public Input<String> getRestrictionType() {
        return this.restrictionType;
    }

    public DistributionRestrictionsGeoRestrictionGetArgs(
        @Nullable Input<List<String>> locations,
        Input<String> restrictionType) {
        this.locations = locations;
        this.restrictionType = Objects.requireNonNull(restrictionType, "expected parameter 'restrictionType' to be non-null");
    }

    private DistributionRestrictionsGeoRestrictionGetArgs() {
        this.locations = Input.empty();
        this.restrictionType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsGeoRestrictionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> locations;
        private Input<String> restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsGeoRestrictionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }

        public Builder setRestrictionType(Input<String> restrictionType) {
            this.restrictionType = Objects.requireNonNull(restrictionType);
            return this;
        }

        public Builder setRestrictionType(String restrictionType) {
            this.restrictionType = Input.of(Objects.requireNonNull(restrictionType));
            return this;
        }
        public DistributionRestrictionsGeoRestrictionGetArgs build() {
            return new DistributionRestrictionsGeoRestrictionGetArgs(locations, restrictionType);
        }
    }
}
