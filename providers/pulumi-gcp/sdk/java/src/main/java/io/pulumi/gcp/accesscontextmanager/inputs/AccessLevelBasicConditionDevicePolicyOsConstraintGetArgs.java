// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs Empty = new AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs();

    @InputImport(name="minimumVersion")
    private final @Nullable Input<String> minimumVersion;

    public Input<String> getMinimumVersion() {
        return this.minimumVersion == null ? Input.empty() : this.minimumVersion;
    }

    @InputImport(name="osType", required=true)
    private final Input<String> osType;

    public Input<String> getOsType() {
        return this.osType;
    }

    @InputImport(name="requireVerifiedChromeOs")
    private final @Nullable Input<Boolean> requireVerifiedChromeOs;

    public Input<Boolean> getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs == null ? Input.empty() : this.requireVerifiedChromeOs;
    }

    public AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs(
        @Nullable Input<String> minimumVersion,
        Input<String> osType,
        @Nullable Input<Boolean> requireVerifiedChromeOs) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    }

    private AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs() {
        this.minimumVersion = Input.empty();
        this.osType = Input.empty();
        this.requireVerifiedChromeOs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minimumVersion;
        private Input<String> osType;
        private @Nullable Input<Boolean> requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder setMinimumVersion(@Nullable Input<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }

        public Builder setMinimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Input.ofNullable(minimumVersion);
            return this;
        }

        public Builder setOsType(Input<String> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder setRequireVerifiedChromeOs(@Nullable Input<Boolean> requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }

        public Builder setRequireVerifiedChromeOs(@Nullable Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Input.ofNullable(requireVerifiedChromeOs);
            return this;
        }

        public AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs build() {
            return new AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}