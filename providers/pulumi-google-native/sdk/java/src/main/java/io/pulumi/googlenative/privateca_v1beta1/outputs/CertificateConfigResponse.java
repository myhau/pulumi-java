// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.PublicKeyResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ReusableConfigWrapperResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubjectConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class CertificateConfigResponse {
    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
     */
    private final PublicKeyResponse publicKey;
    /**
     * Describes how some of the technical fields in a certificate should be populated.
     * 
     */
    private final ReusableConfigWrapperResponse reusableConfig;
    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
     */
    private final SubjectConfigResponse subjectConfig;

    @OutputCustomType.Constructor({"publicKey","reusableConfig","subjectConfig"})
    private CertificateConfigResponse(
        PublicKeyResponse publicKey,
        ReusableConfigWrapperResponse reusableConfig,
        SubjectConfigResponse subjectConfig) {
        this.publicKey = publicKey;
        this.reusableConfig = reusableConfig;
        this.subjectConfig = subjectConfig;
    }

    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
    */
    public PublicKeyResponse getPublicKey() {
        return this.publicKey;
    }
    /**
     * Describes how some of the technical fields in a certificate should be populated.
     * 
    */
    public ReusableConfigWrapperResponse getReusableConfig() {
        return this.reusableConfig;
    }
    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
    */
    public SubjectConfigResponse getSubjectConfig() {
        return this.subjectConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyResponse publicKey;
        private ReusableConfigWrapperResponse reusableConfig;
        private SubjectConfigResponse subjectConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.subjectConfig = defaults.subjectConfig;
        }

        public Builder setPublicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setReusableConfig(ReusableConfigWrapperResponse reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }

        public Builder setSubjectConfig(SubjectConfigResponse subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }
        public CertificateConfigResponse build() {
            return new CertificateConfigResponse(publicKey, reusableConfig, subjectConfig);
        }
    }
}
