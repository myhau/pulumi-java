// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class PatchDeploymentPatchConfigGoo {
    /**
     * goo update settings. Use this setting to override the default goo patch rules.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private PatchDeploymentPatchConfigGoo(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * goo update settings. Use this setting to override the default goo patch rules.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigGoo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigGoo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public PatchDeploymentPatchConfigGoo build() {
            return new PatchDeploymentPatchConfigGoo(enabled);
        }
    }
}
