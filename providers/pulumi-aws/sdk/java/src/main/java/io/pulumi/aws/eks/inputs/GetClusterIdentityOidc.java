// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterIdentityOidc extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterIdentityOidc Empty = new GetClusterIdentityOidc();

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    @InputImport(name="issuer", required=true)
      private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    public GetClusterIdentityOidc(String issuer) {
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
    }

    private GetClusterIdentityOidc() {
        this.issuer = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIdentityOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIdentityOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public GetClusterIdentityOidc build() {
            return new GetClusterIdentityOidc(issuer);
        }
    }
}
