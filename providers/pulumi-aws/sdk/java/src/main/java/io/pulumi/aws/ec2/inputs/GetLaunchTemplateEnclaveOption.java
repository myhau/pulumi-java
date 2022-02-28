// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetLaunchTemplateEnclaveOption extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateEnclaveOption Empty = new GetLaunchTemplateEnclaveOption();

    /**
     * Whether Nitro Enclaves are enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetLaunchTemplateEnclaveOption(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetLaunchTemplateEnclaveOption() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateEnclaveOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateEnclaveOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetLaunchTemplateEnclaveOption build() {
            return new GetLaunchTemplateEnclaveOption(enabled);
        }
    }
}
