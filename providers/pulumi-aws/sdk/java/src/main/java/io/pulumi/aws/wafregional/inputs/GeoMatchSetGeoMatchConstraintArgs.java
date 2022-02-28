// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GeoMatchSetGeoMatchConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetGeoMatchConstraintArgs Empty = new GeoMatchSetGeoMatchConstraintArgs();

    /**
     * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public GeoMatchSetGeoMatchConstraintArgs(
        Input<String> type,
        Input<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GeoMatchSetGeoMatchConstraintArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetGeoMatchConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetGeoMatchConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public GeoMatchSetGeoMatchConstraintArgs build() {
            return new GeoMatchSetGeoMatchConstraintArgs(type, value);
        }
    }
}
