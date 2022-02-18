// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionAuthorityKeyIdGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionCertFingerprintGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionPublicKeyGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectKeyIdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionGetArgs Empty = new CertificateCertificateDescriptionGetArgs();

    @InputImport(name="aiaIssuingCertificateUrls")
    private final @Nullable Input<List<String>> aiaIssuingCertificateUrls;

    public Input<List<String>> getAiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls == null ? Input.empty() : this.aiaIssuingCertificateUrls;
    }

    @InputImport(name="authorityKeyIds")
    private final @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs>> authorityKeyIds;

    public Input<List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs>> getAuthorityKeyIds() {
        return this.authorityKeyIds == null ? Input.empty() : this.authorityKeyIds;
    }

    @InputImport(name="certFingerprints")
    private final @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintGetArgs>> certFingerprints;

    public Input<List<CertificateCertificateDescriptionCertFingerprintGetArgs>> getCertFingerprints() {
        return this.certFingerprints == null ? Input.empty() : this.certFingerprints;
    }

    @InputImport(name="configValues")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueGetArgs>> configValues;

    public Input<List<CertificateCertificateDescriptionConfigValueGetArgs>> getConfigValues() {
        return this.configValues == null ? Input.empty() : this.configValues;
    }

    @InputImport(name="crlDistributionPoints")
    private final @Nullable Input<List<String>> crlDistributionPoints;

    public Input<List<String>> getCrlDistributionPoints() {
        return this.crlDistributionPoints == null ? Input.empty() : this.crlDistributionPoints;
    }

    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="publicKeys")
    private final @Nullable Input<List<CertificateCertificateDescriptionPublicKeyGetArgs>> publicKeys;

    public Input<List<CertificateCertificateDescriptionPublicKeyGetArgs>> getPublicKeys() {
        return this.publicKeys == null ? Input.empty() : this.publicKeys;
    }

    @InputImport(name="subjectDescriptions")
    private final @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionGetArgs>> subjectDescriptions;

    public Input<List<CertificateCertificateDescriptionSubjectDescriptionGetArgs>> getSubjectDescriptions() {
        return this.subjectDescriptions == null ? Input.empty() : this.subjectDescriptions;
    }

    @InputImport(name="subjectKeyIds")
    private final @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdGetArgs>> subjectKeyIds;

    public Input<List<CertificateCertificateDescriptionSubjectKeyIdGetArgs>> getSubjectKeyIds() {
        return this.subjectKeyIds == null ? Input.empty() : this.subjectKeyIds;
    }

    public CertificateCertificateDescriptionGetArgs(
        @Nullable Input<List<String>> aiaIssuingCertificateUrls,
        @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs>> authorityKeyIds,
        @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintGetArgs>> certFingerprints,
        @Nullable Input<List<CertificateCertificateDescriptionConfigValueGetArgs>> configValues,
        @Nullable Input<List<String>> crlDistributionPoints,
        @Nullable Input<List<CertificateCertificateDescriptionPublicKeyGetArgs>> publicKeys,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionGetArgs>> subjectDescriptions,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdGetArgs>> subjectKeyIds) {
        this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
        this.authorityKeyIds = authorityKeyIds;
        this.certFingerprints = certFingerprints;
        this.configValues = configValues;
        this.crlDistributionPoints = crlDistributionPoints;
        this.publicKeys = publicKeys;
        this.subjectDescriptions = subjectDescriptions;
        this.subjectKeyIds = subjectKeyIds;
    }

    private CertificateCertificateDescriptionGetArgs() {
        this.aiaIssuingCertificateUrls = Input.empty();
        this.authorityKeyIds = Input.empty();
        this.certFingerprints = Input.empty();
        this.configValues = Input.empty();
        this.crlDistributionPoints = Input.empty();
        this.publicKeys = Input.empty();
        this.subjectDescriptions = Input.empty();
        this.subjectKeyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> aiaIssuingCertificateUrls;
        private @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs>> authorityKeyIds;
        private @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintGetArgs>> certFingerprints;
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueGetArgs>> configValues;
        private @Nullable Input<List<String>> crlDistributionPoints;
        private @Nullable Input<List<CertificateCertificateDescriptionPublicKeyGetArgs>> publicKeys;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionGetArgs>> subjectDescriptions;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdGetArgs>> subjectKeyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyIds = defaults.authorityKeyIds;
    	      this.certFingerprints = defaults.certFingerprints;
    	      this.configValues = defaults.configValues;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKeys = defaults.publicKeys;
    	      this.subjectDescriptions = defaults.subjectDescriptions;
    	      this.subjectKeyIds = defaults.subjectKeyIds;
        }

        public Builder setAiaIssuingCertificateUrls(@Nullable Input<List<String>> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            return this;
        }

        public Builder setAiaIssuingCertificateUrls(@Nullable List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Input.ofNullable(aiaIssuingCertificateUrls);
            return this;
        }

        public Builder setAuthorityKeyIds(@Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs>> authorityKeyIds) {
            this.authorityKeyIds = authorityKeyIds;
            return this;
        }

        public Builder setAuthorityKeyIds(@Nullable List<CertificateCertificateDescriptionAuthorityKeyIdGetArgs> authorityKeyIds) {
            this.authorityKeyIds = Input.ofNullable(authorityKeyIds);
            return this;
        }

        public Builder setCertFingerprints(@Nullable Input<List<CertificateCertificateDescriptionCertFingerprintGetArgs>> certFingerprints) {
            this.certFingerprints = certFingerprints;
            return this;
        }

        public Builder setCertFingerprints(@Nullable List<CertificateCertificateDescriptionCertFingerprintGetArgs> certFingerprints) {
            this.certFingerprints = Input.ofNullable(certFingerprints);
            return this;
        }

        public Builder setConfigValues(@Nullable Input<List<CertificateCertificateDescriptionConfigValueGetArgs>> configValues) {
            this.configValues = configValues;
            return this;
        }

        public Builder setConfigValues(@Nullable List<CertificateCertificateDescriptionConfigValueGetArgs> configValues) {
            this.configValues = Input.ofNullable(configValues);
            return this;
        }

        public Builder setCrlDistributionPoints(@Nullable Input<List<String>> crlDistributionPoints) {
            this.crlDistributionPoints = crlDistributionPoints;
            return this;
        }

        public Builder setCrlDistributionPoints(@Nullable List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Input.ofNullable(crlDistributionPoints);
            return this;
        }

        public Builder setPublicKeys(@Nullable Input<List<CertificateCertificateDescriptionPublicKeyGetArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        public Builder setPublicKeys(@Nullable List<CertificateCertificateDescriptionPublicKeyGetArgs> publicKeys) {
            this.publicKeys = Input.ofNullable(publicKeys);
            return this;
        }

        public Builder setSubjectDescriptions(@Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionGetArgs>> subjectDescriptions) {
            this.subjectDescriptions = subjectDescriptions;
            return this;
        }

        public Builder setSubjectDescriptions(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionGetArgs> subjectDescriptions) {
            this.subjectDescriptions = Input.ofNullable(subjectDescriptions);
            return this;
        }

        public Builder setSubjectKeyIds(@Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdGetArgs>> subjectKeyIds) {
            this.subjectKeyIds = subjectKeyIds;
            return this;
        }

        public Builder setSubjectKeyIds(@Nullable List<CertificateCertificateDescriptionSubjectKeyIdGetArgs> subjectKeyIds) {
            this.subjectKeyIds = Input.ofNullable(subjectKeyIds);
            return this;
        }

        public CertificateCertificateDescriptionGetArgs build() {
            return new CertificateCertificateDescriptionGetArgs(aiaIssuingCertificateUrls, authorityKeyIds, certFingerprints, configValues, crlDistributionPoints, publicKeys, subjectDescriptions, subjectKeyIds);
        }
    }
}
