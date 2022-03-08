// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.InstallationResponse;
import java.util.Objects;

@OutputCustomType
public final class GrafeasV1beta1PackageDetailsResponse {
    /**
     * Where the package was installed.
     * 
     */
    private final InstallationResponse installation;

    @OutputCustomType.Constructor({"installation"})
    private GrafeasV1beta1PackageDetailsResponse(InstallationResponse installation) {
        this.installation = installation;
    }

    /**
     * Where the package was installed.
     * 
    */
    public InstallationResponse getInstallation() {
        return this.installation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1PackageDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstallationResponse installation;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1PackageDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.installation = defaults.installation;
        }

        public Builder setInstallation(InstallationResponse installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }
        public GrafeasV1beta1PackageDetailsResponse build() {
            return new GrafeasV1beta1PackageDetailsResponse(installation);
        }
    }
}
