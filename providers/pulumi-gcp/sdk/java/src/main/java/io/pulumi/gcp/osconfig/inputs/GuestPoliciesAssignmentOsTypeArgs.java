// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentOsTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentOsTypeArgs Empty = new GuestPoliciesAssignmentOsTypeArgs();

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    @InputImport(name="osArchitecture")
    private final @Nullable Input<String> osArchitecture;

    public Input<String> getOsArchitecture() {
        return this.osArchitecture == null ? Input.empty() : this.osArchitecture;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    @InputImport(name="osShortName")
    private final @Nullable Input<String> osShortName;

    public Input<String> getOsShortName() {
        return this.osShortName == null ? Input.empty() : this.osShortName;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    @InputImport(name="osVersion")
    private final @Nullable Input<String> osVersion;

    public Input<String> getOsVersion() {
        return this.osVersion == null ? Input.empty() : this.osVersion;
    }

    public GuestPoliciesAssignmentOsTypeArgs(
        @Nullable Input<String> osArchitecture,
        @Nullable Input<String> osShortName,
        @Nullable Input<String> osVersion) {
        this.osArchitecture = osArchitecture;
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    private GuestPoliciesAssignmentOsTypeArgs() {
        this.osArchitecture = Input.empty();
        this.osShortName = Input.empty();
        this.osVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> osArchitecture;
        private @Nullable Input<String> osShortName;
        private @Nullable Input<String> osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsArchitecture(@Nullable Input<String> osArchitecture) {
            this.osArchitecture = osArchitecture;
            return this;
        }

        public Builder setOsArchitecture(@Nullable String osArchitecture) {
            this.osArchitecture = Input.ofNullable(osArchitecture);
            return this;
        }

        public Builder setOsShortName(@Nullable Input<String> osShortName) {
            this.osShortName = osShortName;
            return this;
        }

        public Builder setOsShortName(@Nullable String osShortName) {
            this.osShortName = Input.ofNullable(osShortName);
            return this;
        }

        public Builder setOsVersion(@Nullable Input<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = Input.ofNullable(osVersion);
            return this;
        }

        public GuestPoliciesAssignmentOsTypeArgs build() {
            return new GuestPoliciesAssignmentOsTypeArgs(osArchitecture, osShortName, osVersion);
        }
    }
}
