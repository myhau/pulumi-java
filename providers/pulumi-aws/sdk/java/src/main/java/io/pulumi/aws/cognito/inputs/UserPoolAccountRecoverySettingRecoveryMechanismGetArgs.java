// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class UserPoolAccountRecoverySettingRecoveryMechanismGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAccountRecoverySettingRecoveryMechanismGetArgs Empty = new UserPoolAccountRecoverySettingRecoveryMechanismGetArgs();

    /**
     * Name of the attribute.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    public UserPoolAccountRecoverySettingRecoveryMechanismGetArgs(
        Input<String> name,
        Input<Integer> priority) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private UserPoolAccountRecoverySettingRecoveryMechanismGetArgs() {
        this.name = Input.empty();
        this.priority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingRecoveryMechanismGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingRecoveryMechanismGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }
        public UserPoolAccountRecoverySettingRecoveryMechanismGetArgs build() {
            return new UserPoolAccountRecoverySettingRecoveryMechanismGetArgs(name, priority);
        }
    }
}
