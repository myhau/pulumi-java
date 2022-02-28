// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingRecoveryMechanismArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class UserPoolAccountRecoverySettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAccountRecoverySettingArgs Empty = new UserPoolAccountRecoverySettingArgs();

    /**
     * List of Account Recovery Options of the following structure:
     * 
     */
    @InputImport(name="recoveryMechanisms", required=true)
      private final Input<List<UserPoolAccountRecoverySettingRecoveryMechanismArgs>> recoveryMechanisms;

    public Input<List<UserPoolAccountRecoverySettingRecoveryMechanismArgs>> getRecoveryMechanisms() {
        return this.recoveryMechanisms;
    }

    public UserPoolAccountRecoverySettingArgs(Input<List<UserPoolAccountRecoverySettingRecoveryMechanismArgs>> recoveryMechanisms) {
        this.recoveryMechanisms = Objects.requireNonNull(recoveryMechanisms, "expected parameter 'recoveryMechanisms' to be non-null");
    }

    private UserPoolAccountRecoverySettingArgs() {
        this.recoveryMechanisms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<UserPoolAccountRecoverySettingRecoveryMechanismArgs>> recoveryMechanisms;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryMechanisms = defaults.recoveryMechanisms;
        }

        public Builder setRecoveryMechanisms(Input<List<UserPoolAccountRecoverySettingRecoveryMechanismArgs>> recoveryMechanisms) {
            this.recoveryMechanisms = Objects.requireNonNull(recoveryMechanisms);
            return this;
        }

        public Builder setRecoveryMechanisms(List<UserPoolAccountRecoverySettingRecoveryMechanismArgs> recoveryMechanisms) {
            this.recoveryMechanisms = Input.of(Objects.requireNonNull(recoveryMechanisms));
            return this;
        }
        public UserPoolAccountRecoverySettingArgs build() {
            return new UserPoolAccountRecoverySettingArgs(recoveryMechanisms);
        }
    }
}
