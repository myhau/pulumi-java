// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigAptGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigAptGetArgs Empty = new PatchDeploymentPatchConfigAptGetArgs();

    /**
     * List of KBs to exclude from update.
     * 
     */
    @InputImport(name="excludes")
    private final @Nullable Input<List<String>> excludes;

    public Input<List<String>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated.
     * If these packages are not installed, they will be ignored. This field cannot be specified with
     * any other patch configuration fields.
     * 
     */
    @InputImport(name="exclusivePackages")
    private final @Nullable Input<List<String>> exclusivePackages;

    public Input<List<String>> getExclusivePackages() {
        return this.exclusivePackages == null ? Input.empty() : this.exclusivePackages;
    }

    /**
     * By changing the type to DIST, the patching is performed using apt-get dist-upgrade instead.
     * Possible values are `DIST` and `UPGRADE`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public PatchDeploymentPatchConfigAptGetArgs(
        @Nullable Input<List<String>> excludes,
        @Nullable Input<List<String>> exclusivePackages,
        @Nullable Input<String> type) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.type = type;
    }

    private PatchDeploymentPatchConfigAptGetArgs() {
        this.excludes = Input.empty();
        this.exclusivePackages = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigAptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> excludes;
        private @Nullable Input<List<String>> exclusivePackages;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigAptGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.type = defaults.type;
        }

        public Builder setExcludes(@Nullable Input<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setExclusivePackages(@Nullable Input<List<String>> exclusivePackages) {
            this.exclusivePackages = exclusivePackages;
            return this;
        }

        public Builder setExclusivePackages(@Nullable List<String> exclusivePackages) {
            this.exclusivePackages = Input.ofNullable(exclusivePackages);
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

        public PatchDeploymentPatchConfigAptGetArgs build() {
            return new PatchDeploymentPatchConfigAptGetArgs(excludes, exclusivePackages, type);
        }
    }
}
