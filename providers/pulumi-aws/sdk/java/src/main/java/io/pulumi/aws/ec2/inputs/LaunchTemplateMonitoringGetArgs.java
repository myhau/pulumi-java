// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateMonitoringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateMonitoringGetArgs Empty = new LaunchTemplateMonitoringGetArgs();

    /**
     * If `true`, the launched EC2 instance will have detailed monitoring enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public LaunchTemplateMonitoringGetArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private LaunchTemplateMonitoringGetArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateMonitoringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateMonitoringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public LaunchTemplateMonitoringGetArgs build() {
            return new LaunchTemplateMonitoringGetArgs(enabled);
        }
    }
}
