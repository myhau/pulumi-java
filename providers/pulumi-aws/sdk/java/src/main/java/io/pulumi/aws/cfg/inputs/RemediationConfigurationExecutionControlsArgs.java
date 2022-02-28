// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationConfigurationExecutionControlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationConfigurationExecutionControlsArgs Empty = new RemediationConfigurationExecutionControlsArgs();

    /**
     * Configuration block for SSM controls. See below.
     * 
     */
    @InputImport(name="ssmControls")
      private final @Nullable Input<RemediationConfigurationExecutionControlsSsmControlsArgs> ssmControls;

    public Input<RemediationConfigurationExecutionControlsSsmControlsArgs> getSsmControls() {
        return this.ssmControls == null ? Input.empty() : this.ssmControls;
    }

    public RemediationConfigurationExecutionControlsArgs(@Nullable Input<RemediationConfigurationExecutionControlsSsmControlsArgs> ssmControls) {
        this.ssmControls = ssmControls;
    }

    private RemediationConfigurationExecutionControlsArgs() {
        this.ssmControls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationExecutionControlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RemediationConfigurationExecutionControlsSsmControlsArgs> ssmControls;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationExecutionControlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssmControls = defaults.ssmControls;
        }

        public Builder setSsmControls(@Nullable Input<RemediationConfigurationExecutionControlsSsmControlsArgs> ssmControls) {
            this.ssmControls = ssmControls;
            return this;
        }

        public Builder setSsmControls(@Nullable RemediationConfigurationExecutionControlsSsmControlsArgs ssmControls) {
            this.ssmControls = Input.ofNullable(ssmControls);
            return this;
        }
        public RemediationConfigurationExecutionControlsArgs build() {
            return new RemediationConfigurationExecutionControlsArgs(ssmControls);
        }
    }
}
