// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.CertificateChainsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyOperationAttestationResponse {
    /**
     * The certificate chains needed to validate the attestation
     * 
     */
    private final CertificateChainsResponse certChains;
    /**
     * The attestation data provided by the HSM when the key operation was performed.
     * 
     */
    private final String content;
    /**
     * The format of the attestation data.
     * 
     */
    private final String format;

    @OutputCustomType.Constructor
    private KeyOperationAttestationResponse(
        @OutputCustomType.Parameter("certChains") CertificateChainsResponse certChains,
        @OutputCustomType.Parameter("content") String content,
        @OutputCustomType.Parameter("format") String format) {
        this.certChains = certChains;
        this.content = content;
        this.format = format;
    }

    /**
     * The certificate chains needed to validate the attestation
     * 
    */
    public CertificateChainsResponse getCertChains() {
        return this.certChains;
    }
    /**
     * The attestation data provided by the HSM when the key operation was performed.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The format of the attestation data.
     * 
    */
    public String getFormat() {
        return this.format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyOperationAttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateChainsResponse certChains;
        private String content;
        private String format;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyOperationAttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certChains = defaults.certChains;
    	      this.content = defaults.content;
    	      this.format = defaults.format;
        }

        public Builder setCertChains(CertificateChainsResponse certChains) {
            this.certChains = Objects.requireNonNull(certChains);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public KeyOperationAttestationResponse build() {
            return new KeyOperationAttestationResponse(certChains, content, format);
        }
    }
}
