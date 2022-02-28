// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingRecoveryMechanismGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class UserPoolAccountRecoverySettingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAccountRecoverySettingGetArgs Empty = new UserPoolAccountRecoverySettingGetArgs();

    /**
     * List of Account Recovery Options of the following structure:
     * 
     */
    @InputImport(name="recoveryMechanisms", required=true)
      private final Input<List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs>> recoveryMechanisms;

    public Input<List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs>> getRecoveryMechanisms() {
        return this.recoveryMechanisms;
    }

    public UserPoolAccountRecoverySettingGetArgs(Input<List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs>> recoveryMechanisms) {
        this.recoveryMechanisms = Objects.requireNonNull(recoveryMechanisms, "expected parameter 'recoveryMechanisms' to be non-null");
    }

    private UserPoolAccountRecoverySettingGetArgs() {
        this.recoveryMechanisms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs>> recoveryMechanisms;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryMechanisms = defaults.recoveryMechanisms;
        }

        public Builder setRecoveryMechanisms(Input<List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs>> recoveryMechanisms) {
            this.recoveryMechanisms = Objects.requireNonNull(recoveryMechanisms);
            return this;
        }

        public Builder setRecoveryMechanisms(List<UserPoolAccountRecoverySettingRecoveryMechanismGetArgs> recoveryMechanisms) {
            this.recoveryMechanisms = Input.of(Objects.requireNonNull(recoveryMechanisms));
            return this;
        }
        public UserPoolAccountRecoverySettingGetArgs build() {
            return new UserPoolAccountRecoverySettingGetArgs(recoveryMechanisms);
        }
    }
}
