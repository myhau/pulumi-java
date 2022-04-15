// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of custom domain for API portal
 * 
 */
public final class ApiPortalCustomDomainPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiPortalCustomDomainPropertiesResponse Empty = new ApiPortalCustomDomainPropertiesResponse();

    /**
     * The thumbprint of bound certificate.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> thumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public ApiPortalCustomDomainPropertiesResponse(@Nullable String thumbprint) {
        this.thumbprint = thumbprint;
    }

    private ApiPortalCustomDomainPropertiesResponse() {
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalCustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalCustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public ApiPortalCustomDomainPropertiesResponse build() {
            return new ApiPortalCustomDomainPropertiesResponse(thumbprint);
        }
    }
}
