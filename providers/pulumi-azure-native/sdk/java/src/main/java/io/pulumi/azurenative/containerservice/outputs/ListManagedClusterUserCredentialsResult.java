// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.CredentialResultResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListManagedClusterUserCredentialsResult {
    /**
     * Base64-encoded Kubernetes configuration file.
     * 
     */
    private final List<CredentialResultResponse> kubeconfigs;

    @CustomType.Constructor
    private ListManagedClusterUserCredentialsResult(@CustomType.Parameter("kubeconfigs") List<CredentialResultResponse> kubeconfigs) {
        this.kubeconfigs = kubeconfigs;
    }

    /**
     * Base64-encoded Kubernetes configuration file.
     * 
    */
    public List<CredentialResultResponse> kubeconfigs() {
        return this.kubeconfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagedClusterUserCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CredentialResultResponse> kubeconfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagedClusterUserCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubeconfigs = defaults.kubeconfigs;
        }

        public Builder kubeconfigs(List<CredentialResultResponse> kubeconfigs) {
            this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
            return this;
        }
        public Builder kubeconfigs(CredentialResultResponse... kubeconfigs) {
            return kubeconfigs(List.of(kubeconfigs));
        }        public ListManagedClusterUserCredentialsResult build() {
            return new ListManagedClusterUserCredentialsResult(kubeconfigs);
        }
    }
}
