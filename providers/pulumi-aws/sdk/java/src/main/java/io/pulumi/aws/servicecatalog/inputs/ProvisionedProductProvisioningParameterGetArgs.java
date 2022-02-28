// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductProvisioningParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductProvisioningParameterGetArgs Empty = new ProvisionedProductProvisioningParameterGetArgs();

    /**
     * Parameter key.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Whether to ignore `value` and keep the previous parameter value. Ignored when initially provisioning a product.
     * 
     */
    @InputImport(name="usePreviousValue")
      private final @Nullable Input<Boolean> usePreviousValue;

    public Input<Boolean> getUsePreviousValue() {
        return this.usePreviousValue == null ? Input.empty() : this.usePreviousValue;
    }

    /**
     * Parameter value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ProvisionedProductProvisioningParameterGetArgs(
        Input<String> key,
        @Nullable Input<Boolean> usePreviousValue,
        @Nullable Input<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.usePreviousValue = usePreviousValue;
        this.value = value;
    }

    private ProvisionedProductProvisioningParameterGetArgs() {
        this.key = Input.empty();
        this.usePreviousValue = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductProvisioningParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<Boolean> usePreviousValue;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductProvisioningParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.usePreviousValue = defaults.usePreviousValue;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setUsePreviousValue(@Nullable Input<Boolean> usePreviousValue) {
            this.usePreviousValue = usePreviousValue;
            return this;
        }

        public Builder setUsePreviousValue(@Nullable Boolean usePreviousValue) {
            this.usePreviousValue = Input.ofNullable(usePreviousValue);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public ProvisionedProductProvisioningParameterGetArgs build() {
            return new ProvisionedProductProvisioningParameterGetArgs(key, usePreviousValue, value);
        }
    }
}
