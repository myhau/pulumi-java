// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterCertificateAuthority extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterCertificateAuthority Empty = new GetClusterCertificateAuthority();

    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    @InputImport(name="data", required=true)
      private final String data;

    public String getData() {
        return this.data;
    }

    public GetClusterCertificateAuthority(String data) {
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
    }

    private GetClusterCertificateAuthority() {
        this.data = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCertificateAuthority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterCertificateAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder setData(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public GetClusterCertificateAuthority build() {
            return new GetClusterCertificateAuthority(data);
        }
    }
}
