// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse();

    @InputImport(name="allowAllPackageNames", required=true)
    private final Boolean allowAllPackageNames;

    public Boolean getAllowAllPackageNames() {
        return this.allowAllPackageNames;
    }

    @InputImport(name="allowedPackageNames", required=true)
    private final List<String> allowedPackageNames;

    public List<String> getAllowedPackageNames() {
        return this.allowedPackageNames;
    }

    public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(
        Boolean allowAllPackageNames,
        List<String> allowedPackageNames) {
        this.allowAllPackageNames = Objects.requireNonNull(allowAllPackageNames, "expected parameter 'allowAllPackageNames' to be non-null");
        this.allowedPackageNames = Objects.requireNonNull(allowedPackageNames, "expected parameter 'allowedPackageNames' to be non-null");
    }

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse() {
        this.allowAllPackageNames = null;
        this.allowedPackageNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAllPackageNames;
        private List<String> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder setAllowAllPackageNames(Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Objects.requireNonNull(allowAllPackageNames);
            return this;
        }

        public Builder setAllowedPackageNames(List<String> allowedPackageNames) {
            this.allowedPackageNames = Objects.requireNonNull(allowedPackageNames);
            return this;
        }

        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(allowAllPackageNames, allowedPackageNames);
        }
    }
}