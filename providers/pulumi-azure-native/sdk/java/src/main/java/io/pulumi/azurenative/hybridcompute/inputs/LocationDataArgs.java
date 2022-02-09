// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationDataArgs Empty = new LocationDataArgs();

    @InputImport(name="city")
    private final @Nullable Input<String> city;

    public Input<String> getCity() {
        return this.city == null ? Input.empty() : this.city;
    }

    @InputImport(name="countryOrRegion")
    private final @Nullable Input<String> countryOrRegion;

    public Input<String> getCountryOrRegion() {
        return this.countryOrRegion == null ? Input.empty() : this.countryOrRegion;
    }

    @InputImport(name="district")
    private final @Nullable Input<String> district;

    public Input<String> getDistrict() {
        return this.district == null ? Input.empty() : this.district;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public LocationDataArgs(
        @Nullable Input<String> city,
        @Nullable Input<String> countryOrRegion,
        @Nullable Input<String> district,
        Input<String> name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private LocationDataArgs() {
        this.city = Input.empty();
        this.countryOrRegion = Input.empty();
        this.district = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> city;
        private @Nullable Input<String> countryOrRegion;
        private @Nullable Input<String> district;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
        }

        public Builder setCity(@Nullable Input<String> city) {
            this.city = city;
            return this;
        }

        public Builder setCity(@Nullable String city) {
            this.city = Input.ofNullable(city);
            return this;
        }

        public Builder setCountryOrRegion(@Nullable Input<String> countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }

        public Builder setCountryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = Input.ofNullable(countryOrRegion);
            return this;
        }

        public Builder setDistrict(@Nullable Input<String> district) {
            this.district = district;
            return this;
        }

        public Builder setDistrict(@Nullable String district) {
            this.district = Input.ofNullable(district);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public LocationDataArgs build() {
            return new LocationDataArgs(city, countryOrRegion, district, name);
        }
    }
}