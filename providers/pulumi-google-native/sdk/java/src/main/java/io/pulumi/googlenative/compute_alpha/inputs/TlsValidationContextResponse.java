// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.SdsConfigResponse;
import java.lang.String;
import java.util.Objects;


public final class TlsValidationContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsValidationContextResponse Empty = new TlsValidationContextResponse();

    @InputImport(name="certificatePath", required=true)
    private final String certificatePath;

    public String getCertificatePath() {
        return this.certificatePath;
    }

    @InputImport(name="sdsConfig", required=true)
    private final SdsConfigResponse sdsConfig;

    public SdsConfigResponse getSdsConfig() {
        return this.sdsConfig;
    }

    @InputImport(name="validationSource", required=true)
    private final String validationSource;

    public String getValidationSource() {
        return this.validationSource;
    }

    public TlsValidationContextResponse(
        String certificatePath,
        SdsConfigResponse sdsConfig,
        String validationSource) {
        this.certificatePath = Objects.requireNonNull(certificatePath, "expected parameter 'certificatePath' to be non-null");
        this.sdsConfig = Objects.requireNonNull(sdsConfig, "expected parameter 'sdsConfig' to be non-null");
        this.validationSource = Objects.requireNonNull(validationSource, "expected parameter 'validationSource' to be non-null");
    }

    private TlsValidationContextResponse() {
        this.certificatePath = null;
        this.sdsConfig = null;
        this.validationSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsValidationContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificatePath;
        private SdsConfigResponse sdsConfig;
        private String validationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsValidationContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.sdsConfig = defaults.sdsConfig;
    	      this.validationSource = defaults.validationSource;
        }

        public Builder setCertificatePath(String certificatePath) {
            this.certificatePath = Objects.requireNonNull(certificatePath);
            return this;
        }

        public Builder setSdsConfig(SdsConfigResponse sdsConfig) {
            this.sdsConfig = Objects.requireNonNull(sdsConfig);
            return this;
        }

        public Builder setValidationSource(String validationSource) {
            this.validationSource = Objects.requireNonNull(validationSource);
            return this;
        }

        public TlsValidationContextResponse build() {
            return new TlsValidationContextResponse(certificatePath, sdsConfig, validationSource);
        }
    }
}