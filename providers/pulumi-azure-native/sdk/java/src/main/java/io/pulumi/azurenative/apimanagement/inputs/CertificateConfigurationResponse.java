// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.CertificateInformationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Certificate configuration which consist of non-trusted intermediates and root certificates.
 * 
 */
public final class CertificateConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateConfigurationResponse Empty = new CertificateConfigurationResponse();

    /**
     * Certificate information.
     * 
     */
    @Import(name="certificate")
      private final @Nullable CertificateInformationResponse certificate;

    public Optional<CertificateInformationResponse> certificate() {
        return this.certificate == null ? Optional.empty() : Optional.ofNullable(this.certificate);
    }

    /**
     * Certificate Password.
     * 
     */
    @Import(name="certificatePassword")
      private final @Nullable String certificatePassword;

    public Optional<String> certificatePassword() {
        return this.certificatePassword == null ? Optional.empty() : Optional.ofNullable(this.certificatePassword);
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @Import(name="encodedCertificate")
      private final @Nullable String encodedCertificate;

    public Optional<String> encodedCertificate() {
        return this.encodedCertificate == null ? Optional.empty() : Optional.ofNullable(this.encodedCertificate);
    }

    /**
     * The System.Security.Cryptography.x509certificates.StoreName certificate store location. Only Root and CertificateAuthority are valid locations.
     * 
     */
    @Import(name="storeName", required=true)
      private final String storeName;

    public String storeName() {
        return this.storeName;
    }

    public CertificateConfigurationResponse(
        @Nullable CertificateInformationResponse certificate,
        @Nullable String certificatePassword,
        @Nullable String encodedCertificate,
        String storeName) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.encodedCertificate = encodedCertificate;
        this.storeName = Objects.requireNonNull(storeName, "expected parameter 'storeName' to be non-null");
    }

    private CertificateConfigurationResponse() {
        this.certificate = null;
        this.certificatePassword = null;
        this.encodedCertificate = null;
        this.storeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateInformationResponse certificate;
        private @Nullable String certificatePassword;
        private @Nullable String encodedCertificate;
        private String storeName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.encodedCertificate = defaults.encodedCertificate;
    	      this.storeName = defaults.storeName;
        }

        public Builder certificate(@Nullable CertificateInformationResponse certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }
        public Builder encodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }
        public Builder storeName(String storeName) {
            this.storeName = Objects.requireNonNull(storeName);
            return this;
        }        public CertificateConfigurationResponse build() {
            return new CertificateConfigurationResponse(certificate, certificatePassword, encodedCertificate, storeName);
        }
    }
}
