// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs();

    /**
     * A local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs> file;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs> sds;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs> file,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs() {
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs> file;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setSds(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateArgs(file, sds);
        }
    }
}
