// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApiConfigGatewayConfigBackendConfig {
    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
     * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
     * 
     */
    private final String googleServiceAccount;

    @OutputCustomType.Constructor({"googleServiceAccount"})
    private ApiConfigGatewayConfigBackendConfig(String googleServiceAccount) {
        this.googleServiceAccount = googleServiceAccount;
    }

    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
     * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
     * 
    */
    public String getGoogleServiceAccount() {
        return this.googleServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGatewayConfigBackendConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigGatewayConfigBackendConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder setGoogleServiceAccount(String googleServiceAccount) {
            this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount);
            return this;
        }
        public ApiConfigGatewayConfigBackendConfig build() {
            return new ApiConfigGatewayConfigBackendConfig(googleServiceAccount);
        }
    }
}
