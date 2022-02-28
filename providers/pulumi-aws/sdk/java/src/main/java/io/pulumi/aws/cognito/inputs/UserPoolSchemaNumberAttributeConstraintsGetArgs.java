// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolSchemaNumberAttributeConstraintsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaNumberAttributeConstraintsGetArgs Empty = new UserPoolSchemaNumberAttributeConstraintsGetArgs();

    /**
     * Maximum value of an attribute that is of the number data type.
     * 
     */
    @InputImport(name="maxValue")
      private final @Nullable Input<String> maxValue;

    public Input<String> getMaxValue() {
        return this.maxValue == null ? Input.empty() : this.maxValue;
    }

    /**
     * Minimum value of an attribute that is of the number data type.
     * 
     */
    @InputImport(name="minValue")
      private final @Nullable Input<String> minValue;

    public Input<String> getMinValue() {
        return this.minValue == null ? Input.empty() : this.minValue;
    }

    public UserPoolSchemaNumberAttributeConstraintsGetArgs(
        @Nullable Input<String> maxValue,
        @Nullable Input<String> minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    private UserPoolSchemaNumberAttributeConstraintsGetArgs() {
        this.maxValue = Input.empty();
        this.minValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaNumberAttributeConstraintsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> maxValue;
        private @Nullable Input<String> minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaNumberAttributeConstraintsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(@Nullable Input<String> maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public Builder setMaxValue(@Nullable String maxValue) {
            this.maxValue = Input.ofNullable(maxValue);
            return this;
        }

        public Builder setMinValue(@Nullable Input<String> minValue) {
            this.minValue = minValue;
            return this;
        }

        public Builder setMinValue(@Nullable String minValue) {
            this.minValue = Input.ofNullable(minValue);
            return this;
        }
        public UserPoolSchemaNumberAttributeConstraintsGetArgs build() {
            return new UserPoolSchemaNumberAttributeConstraintsGetArgs(maxValue, minValue);
        }
    }
}
