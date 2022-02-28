// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsGetArgs Empty = new VirtualNodeSpecListenerTlsGetArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @InputImport(name="certificate", required=true)
      private final Input<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate;

    public Input<VirtualNodeSpecListenerTlsCertificateGetArgs> getCertificate() {
        return this.certificate;
    }

    /**
     * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    @InputImport(name="mode", required=true)
      private final Input<String> mode;

    public Input<String> getMode() {
        return this.mode;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @InputImport(name="validation")
      private final @Nullable Input<VirtualNodeSpecListenerTlsValidationGetArgs> validation;

    public Input<VirtualNodeSpecListenerTlsValidationGetArgs> getValidation() {
        return this.validation == null ? Input.empty() : this.validation;
    }

    public VirtualNodeSpecListenerTlsGetArgs(
        Input<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate,
        Input<String> mode,
        @Nullable Input<VirtualNodeSpecListenerTlsValidationGetArgs> validation) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.validation = validation;
    }

    private VirtualNodeSpecListenerTlsGetArgs() {
        this.certificate = Input.empty();
        this.mode = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate;
        private Input<String> mode;
        private @Nullable Input<VirtualNodeSpecListenerTlsValidationGetArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.mode = defaults.mode;
    	      this.validation = defaults.validation;
        }

        public Builder setCertificate(Input<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificate(VirtualNodeSpecListenerTlsCertificateGetArgs certificate) {
            this.certificate = Input.of(Objects.requireNonNull(certificate));
            return this;
        }

        public Builder setMode(Input<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder setValidation(@Nullable Input<VirtualNodeSpecListenerTlsValidationGetArgs> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setValidation(@Nullable VirtualNodeSpecListenerTlsValidationGetArgs validation) {
            this.validation = Input.ofNullable(validation);
            return this;
        }
        public VirtualNodeSpecListenerTlsGetArgs build() {
            return new VirtualNodeSpecListenerTlsGetArgs(certificate, mode, validation);
        }
    }
}
