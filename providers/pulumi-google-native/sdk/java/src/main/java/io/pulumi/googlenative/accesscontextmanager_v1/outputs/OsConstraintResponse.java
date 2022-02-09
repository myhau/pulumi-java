// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OsConstraintResponse {
    private final String minimumVersion;
    private final String osType;
    private final Boolean requireVerifiedChromeOs;

    @OutputCustomType.Constructor({"minimumVersion","osType","requireVerifiedChromeOs"})
    private OsConstraintResponse(
        String minimumVersion,
        String osType,
        Boolean requireVerifiedChromeOs) {
        this.minimumVersion = Objects.requireNonNull(minimumVersion);
        this.osType = Objects.requireNonNull(osType);
        this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
    }

    public String getMinimumVersion() {
        return this.minimumVersion;
    }
    public String getOsType() {
        return this.osType;
    }
    public Boolean getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minimumVersion;
        private String osType;
        private Boolean requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(OsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder setMinimumVersion(String minimumVersion) {
            this.minimumVersion = Objects.requireNonNull(minimumVersion);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setRequireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
            return this;
        }

        public OsConstraintResponse build() {
            return new OsConstraintResponse(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}