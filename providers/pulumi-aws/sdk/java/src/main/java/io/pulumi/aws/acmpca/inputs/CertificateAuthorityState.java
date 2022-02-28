// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationGetArgs;
import io.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityState extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityState Empty = new CertificateAuthorityState();

    /**
     * Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    @InputImport(name="certificateAuthorityConfiguration")
      private final @Nullable Input<CertificateAuthorityCertificateAuthorityConfigurationGetArgs> certificateAuthorityConfiguration;

    public Input<CertificateAuthorityCertificateAuthorityConfigurationGetArgs> getCertificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration == null ? Input.empty() : this.certificateAuthorityConfiguration;
    }

    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    @InputImport(name="certificateChain")
      private final @Nullable Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain == null ? Input.empty() : this.certificateChain;
    }

    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    @InputImport(name="certificateSigningRequest")
      private final @Nullable Input<String> certificateSigningRequest;

    public Input<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest == null ? Input.empty() : this.certificateSigningRequest;
    }

    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    @InputImport(name="notAfter")
      private final @Nullable Input<String> notAfter;

    public Input<String> getNotAfter() {
        return this.notAfter == null ? Input.empty() : this.notAfter;
    }

    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    @InputImport(name="notBefore")
      private final @Nullable Input<String> notBefore;

    public Input<String> getNotBefore() {
        return this.notBefore == null ? Input.empty() : this.notBefore;
    }

    /**
     * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    @InputImport(name="permanentDeletionTimeInDays")
      private final @Nullable Input<Integer> permanentDeletionTimeInDays;

    public Input<Integer> getPermanentDeletionTimeInDays() {
        return this.permanentDeletionTimeInDays == null ? Input.empty() : this.permanentDeletionTimeInDays;
    }

    /**
     * Nested argument containing revocation configuration. Defined below.
     * 
     */
    @InputImport(name="revocationConfiguration")
      private final @Nullable Input<CertificateAuthorityRevocationConfigurationGetArgs> revocationConfiguration;

    public Input<CertificateAuthorityRevocationConfigurationGetArgs> getRevocationConfiguration() {
        return this.revocationConfiguration == null ? Input.empty() : this.revocationConfiguration;
    }

    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    @InputImport(name="serial")
      private final @Nullable Input<String> serial;

    public Input<String> getSerial() {
        return this.serial == null ? Input.empty() : this.serial;
    }

    /**
     * Status of the certificate authority.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public CertificateAuthorityState(
        @Nullable Input<String> arn,
        @Nullable Input<String> certificate,
        @Nullable Input<CertificateAuthorityCertificateAuthorityConfigurationGetArgs> certificateAuthorityConfiguration,
        @Nullable Input<String> certificateChain,
        @Nullable Input<String> certificateSigningRequest,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> notAfter,
        @Nullable Input<String> notBefore,
        @Nullable Input<Integer> permanentDeletionTimeInDays,
        @Nullable Input<CertificateAuthorityRevocationConfigurationGetArgs> revocationConfiguration,
        @Nullable Input<String> serial,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.arn = arn;
        this.certificate = certificate;
        this.certificateAuthorityConfiguration = certificateAuthorityConfiguration;
        this.certificateChain = certificateChain;
        this.certificateSigningRequest = certificateSigningRequest;
        this.enabled = enabled;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
        this.revocationConfiguration = revocationConfiguration;
        this.serial = serial;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private CertificateAuthorityState() {
        this.arn = Input.empty();
        this.certificate = Input.empty();
        this.certificateAuthorityConfiguration = Input.empty();
        this.certificateChain = Input.empty();
        this.certificateSigningRequest = Input.empty();
        this.enabled = Input.empty();
        this.notAfter = Input.empty();
        this.notBefore = Input.empty();
        this.permanentDeletionTimeInDays = Input.empty();
        this.revocationConfiguration = Input.empty();
        this.serial = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> certificate;
        private @Nullable Input<CertificateAuthorityCertificateAuthorityConfigurationGetArgs> certificateAuthorityConfiguration;
        private @Nullable Input<String> certificateChain;
        private @Nullable Input<String> certificateSigningRequest;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> notAfter;
        private @Nullable Input<String> notBefore;
        private @Nullable Input<Integer> permanentDeletionTimeInDays;
        private @Nullable Input<CertificateAuthorityRevocationConfigurationGetArgs> revocationConfiguration;
        private @Nullable Input<String> serial;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateAuthorityConfiguration = defaults.certificateAuthorityConfiguration;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.enabled = defaults.enabled;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.permanentDeletionTimeInDays = defaults.permanentDeletionTimeInDays;
    	      this.revocationConfiguration = defaults.revocationConfiguration;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setCertificateAuthorityConfiguration(@Nullable Input<CertificateAuthorityCertificateAuthorityConfigurationGetArgs> certificateAuthorityConfiguration) {
            this.certificateAuthorityConfiguration = certificateAuthorityConfiguration;
            return this;
        }

        public Builder setCertificateAuthorityConfiguration(@Nullable CertificateAuthorityCertificateAuthorityConfigurationGetArgs certificateAuthorityConfiguration) {
            this.certificateAuthorityConfiguration = Input.ofNullable(certificateAuthorityConfiguration);
            return this;
        }

        public Builder setCertificateChain(@Nullable Input<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        public Builder setCertificateChain(@Nullable String certificateChain) {
            this.certificateChain = Input.ofNullable(certificateChain);
            return this;
        }

        public Builder setCertificateSigningRequest(@Nullable Input<String> certificateSigningRequest) {
            this.certificateSigningRequest = certificateSigningRequest;
            return this;
        }

        public Builder setCertificateSigningRequest(@Nullable String certificateSigningRequest) {
            this.certificateSigningRequest = Input.ofNullable(certificateSigningRequest);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setNotAfter(@Nullable Input<String> notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        public Builder setNotAfter(@Nullable String notAfter) {
            this.notAfter = Input.ofNullable(notAfter);
            return this;
        }

        public Builder setNotBefore(@Nullable Input<String> notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder setNotBefore(@Nullable String notBefore) {
            this.notBefore = Input.ofNullable(notBefore);
            return this;
        }

        public Builder setPermanentDeletionTimeInDays(@Nullable Input<Integer> permanentDeletionTimeInDays) {
            this.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
            return this;
        }

        public Builder setPermanentDeletionTimeInDays(@Nullable Integer permanentDeletionTimeInDays) {
            this.permanentDeletionTimeInDays = Input.ofNullable(permanentDeletionTimeInDays);
            return this;
        }

        public Builder setRevocationConfiguration(@Nullable Input<CertificateAuthorityRevocationConfigurationGetArgs> revocationConfiguration) {
            this.revocationConfiguration = revocationConfiguration;
            return this;
        }

        public Builder setRevocationConfiguration(@Nullable CertificateAuthorityRevocationConfigurationGetArgs revocationConfiguration) {
            this.revocationConfiguration = Input.ofNullable(revocationConfiguration);
            return this;
        }

        public Builder setSerial(@Nullable Input<String> serial) {
            this.serial = serial;
            return this;
        }

        public Builder setSerial(@Nullable String serial) {
            this.serial = Input.ofNullable(serial);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public CertificateAuthorityState build() {
            return new CertificateAuthorityState(arn, certificate, certificateAuthorityConfiguration, certificateChain, certificateSigningRequest, enabled, notAfter, notBefore, permanentDeletionTimeInDays, revocationConfiguration, serial, status, tags, tagsAll, type);
        }
    }
}
