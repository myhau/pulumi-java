// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeStepInstallDpkgResponse {
    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;

    @CustomType.Constructor
    private SoftwareRecipeStepInstallDpkgResponse(@CustomType.Parameter("artifactId") String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public String artifactId() {
        return this.artifactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallDpkgResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallDpkgResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }        public SoftwareRecipeStepInstallDpkgResponse build() {
            return new SoftwareRecipeStepInstallDpkgResponse(artifactId);
        }
    }
}
