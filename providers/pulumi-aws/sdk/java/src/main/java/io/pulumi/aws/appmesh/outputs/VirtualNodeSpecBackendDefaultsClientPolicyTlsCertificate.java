// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate {
    /**
     * A local file certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile file;
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds sds;

    @OutputCustomType.Constructor({"file","sds"})
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate(
        @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile file,
        @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds sds) {
        this.file = file;
        this.sds = sds;
    }

    /**
     * A local file certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds> getSds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile file;
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFile file) {
            this.file = file;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate(file, sds);
        }
    }
}
