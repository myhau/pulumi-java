// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class MeshCertificatesResponse {
    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    private final Boolean enableCertificates;

    @OutputCustomType.Constructor({"enableCertificates"})
    private MeshCertificatesResponse(Boolean enableCertificates) {
        this.enableCertificates = enableCertificates;
    }

    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
    */
    public Boolean getEnableCertificates() {
        return this.enableCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshCertificatesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshCertificatesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCertificates = defaults.enableCertificates;
        }

        public Builder setEnableCertificates(Boolean enableCertificates) {
            this.enableCertificates = Objects.requireNonNull(enableCertificates);
            return this;
        }
        public MeshCertificatesResponse build() {
            return new MeshCertificatesResponse(enableCertificates);
        }
    }
}
