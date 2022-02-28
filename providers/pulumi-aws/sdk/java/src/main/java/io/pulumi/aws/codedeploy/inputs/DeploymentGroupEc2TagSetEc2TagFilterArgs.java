// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupEc2TagSetEc2TagFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupEc2TagSetEc2TagFilterArgs Empty = new DeploymentGroupEc2TagSetEc2TagFilterArgs();

    /**
     * The key of the tag filter.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The value of the tag filter.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public DeploymentGroupEc2TagSetEc2TagFilterArgs(
        @Nullable Input<String> key,
        @Nullable Input<String> type,
        @Nullable Input<String> value) {
        this.key = key;
        this.type = type;
        this.value = value;
    }

    private DeploymentGroupEc2TagSetEc2TagFilterArgs() {
        this.key = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupEc2TagSetEc2TagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<String> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupEc2TagSetEc2TagFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
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

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
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
        public DeploymentGroupEc2TagSetEc2TagFilterArgs build() {
            return new DeploymentGroupEc2TagSetEc2TagFilterArgs(key, type, value);
        }
    }
}
