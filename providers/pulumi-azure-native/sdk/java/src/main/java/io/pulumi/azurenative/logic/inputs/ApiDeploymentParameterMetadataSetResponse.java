// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ApiDeploymentParameterMetadataResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The API deployment parameters metadata.
 * 
 */
public final class ApiDeploymentParameterMetadataSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiDeploymentParameterMetadataSetResponse Empty = new ApiDeploymentParameterMetadataSetResponse();

    /**
     * The package content link parameter.
     * 
     */
    @Import(name="packageContentLink")
      private final @Nullable ApiDeploymentParameterMetadataResponse packageContentLink;

    public Optional<ApiDeploymentParameterMetadataResponse> packageContentLink() {
        return this.packageContentLink == null ? Optional.empty() : Optional.ofNullable(this.packageContentLink);
    }

    /**
     * The package content link parameter.
     * 
     */
    @Import(name="redisCacheConnectionString")
      private final @Nullable ApiDeploymentParameterMetadataResponse redisCacheConnectionString;

    public Optional<ApiDeploymentParameterMetadataResponse> redisCacheConnectionString() {
        return this.redisCacheConnectionString == null ? Optional.empty() : Optional.ofNullable(this.redisCacheConnectionString);
    }

    public ApiDeploymentParameterMetadataSetResponse(
        @Nullable ApiDeploymentParameterMetadataResponse packageContentLink,
        @Nullable ApiDeploymentParameterMetadataResponse redisCacheConnectionString) {
        this.packageContentLink = packageContentLink;
        this.redisCacheConnectionString = redisCacheConnectionString;
    }

    private ApiDeploymentParameterMetadataSetResponse() {
        this.packageContentLink = null;
        this.redisCacheConnectionString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDeploymentParameterMetadataSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiDeploymentParameterMetadataResponse packageContentLink;
        private @Nullable ApiDeploymentParameterMetadataResponse redisCacheConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDeploymentParameterMetadataSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageContentLink = defaults.packageContentLink;
    	      this.redisCacheConnectionString = defaults.redisCacheConnectionString;
        }

        public Builder packageContentLink(@Nullable ApiDeploymentParameterMetadataResponse packageContentLink) {
            this.packageContentLink = packageContentLink;
            return this;
        }
        public Builder redisCacheConnectionString(@Nullable ApiDeploymentParameterMetadataResponse redisCacheConnectionString) {
            this.redisCacheConnectionString = redisCacheConnectionString;
            return this;
        }        public ApiDeploymentParameterMetadataSetResponse build() {
            return new ApiDeploymentParameterMetadataSetResponse(packageContentLink, redisCacheConnectionString);
        }
    }
}
