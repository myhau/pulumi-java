// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentConfigMinimumHealthyHostsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigMinimumHealthyHostsArgs Empty = new DeploymentConfigMinimumHealthyHostsArgs();

    /**
     * The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
     * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public DeploymentConfigMinimumHealthyHostsArgs(
        @Nullable Input<String> type,
        @Nullable Input<Integer> value) {
        this.type = type;
        this.value = value;
    }

    private DeploymentConfigMinimumHealthyHostsArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigMinimumHealthyHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;
        private @Nullable Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigMinimumHealthyHostsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<Integer> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public DeploymentConfigMinimumHealthyHostsArgs build() {
            return new DeploymentConfigMinimumHealthyHostsArgs(type, value);
        }
    }
}
