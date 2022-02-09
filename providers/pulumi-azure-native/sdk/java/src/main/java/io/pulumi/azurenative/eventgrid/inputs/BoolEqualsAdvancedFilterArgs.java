// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BoolEqualsAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BoolEqualsAdvancedFilterArgs Empty = new BoolEqualsAdvancedFilterArgs();

    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    @InputImport(name="operatorType", required=true)
    private final Input<String> operatorType;

    public Input<String> getOperatorType() {
        return this.operatorType;
    }

    @InputImport(name="value")
    private final @Nullable Input<Boolean> value;

    public Input<Boolean> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public BoolEqualsAdvancedFilterArgs(
        @Nullable Input<String> key,
        Input<String> operatorType,
        @Nullable Input<Boolean> value) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.value = value;
    }

    private BoolEqualsAdvancedFilterArgs() {
        this.key = Input.empty();
        this.operatorType = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoolEqualsAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private Input<String> operatorType;
        private @Nullable Input<Boolean> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BoolEqualsAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setOperatorType(Input<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Input.of(Objects.requireNonNull(operatorType));
            return this;
        }

        public Builder setValue(@Nullable Input<Boolean> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Boolean value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public BoolEqualsAdvancedFilterArgs build() {
            return new BoolEqualsAdvancedFilterArgs(key, operatorType, value);
        }
    }
}