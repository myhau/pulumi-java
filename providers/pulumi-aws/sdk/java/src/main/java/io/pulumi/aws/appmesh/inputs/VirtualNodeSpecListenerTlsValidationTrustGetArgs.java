// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsValidationTrustGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsValidationTrustGetArgs Empty = new VirtualNodeSpecListenerTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file;

    public Input<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds;

    public Input<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualNodeSpecListenerTlsValidationTrustGetArgs(
        @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file,
        @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecListenerTlsValidationTrustGetArgs() {
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file;
        private @Nullable Input<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable Input<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable VirtualNodeSpecListenerTlsValidationTrustFileGetArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setSds(@Nullable Input<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecListenerTlsValidationTrustGetArgs build() {
            return new VirtualNodeSpecListenerTlsValidationTrustGetArgs(file, sds);
        }
    }
}
