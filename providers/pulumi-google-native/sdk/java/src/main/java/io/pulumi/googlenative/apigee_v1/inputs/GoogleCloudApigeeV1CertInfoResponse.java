// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudApigeeV1CertInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1CertInfoResponse Empty = new GoogleCloudApigeeV1CertInfoResponse();

    @InputImport(name="basicConstraints", required=true)
    private final String basicConstraints;

    public String getBasicConstraints() {
        return this.basicConstraints;
    }

    @InputImport(name="expiryDate", required=true)
    private final String expiryDate;

    public String getExpiryDate() {
        return this.expiryDate;
    }

    @InputImport(name="isValid", required=true)
    private final String isValid;

    public String getIsValid() {
        return this.isValid;
    }

    @InputImport(name="issuer", required=true)
    private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    @InputImport(name="publicKey", required=true)
    private final String publicKey;

    public String getPublicKey() {
        return this.publicKey;
    }

    @InputImport(name="serialNumber", required=true)
    private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    @InputImport(name="sigAlgName", required=true)
    private final String sigAlgName;

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @InputImport(name="subject", required=true)
    private final String subject;

    public String getSubject() {
        return this.subject;
    }

    @InputImport(name="subjectAlternativeNames", required=true)
    private final List<String> subjectAlternativeNames;

    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    @InputImport(name="validFrom", required=true)
    private final String validFrom;

    public String getValidFrom() {
        return this.validFrom;
    }

    @InputImport(name="version", required=true)
    private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public GoogleCloudApigeeV1CertInfoResponse(
        String basicConstraints,
        String expiryDate,
        String isValid,
        String issuer,
        String publicKey,
        String serialNumber,
        String sigAlgName,
        String subject,
        List<String> subjectAlternativeNames,
        String validFrom,
        Integer version) {
        this.basicConstraints = Objects.requireNonNull(basicConstraints, "expected parameter 'basicConstraints' to be non-null");
        this.expiryDate = Objects.requireNonNull(expiryDate, "expected parameter 'expiryDate' to be non-null");
        this.isValid = Objects.requireNonNull(isValid, "expected parameter 'isValid' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.sigAlgName = Objects.requireNonNull(sigAlgName, "expected parameter 'sigAlgName' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames, "expected parameter 'subjectAlternativeNames' to be non-null");
        this.validFrom = Objects.requireNonNull(validFrom, "expected parameter 'validFrom' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GoogleCloudApigeeV1CertInfoResponse() {
        this.basicConstraints = null;
        this.expiryDate = null;
        this.isValid = null;
        this.issuer = null;
        this.publicKey = null;
        this.serialNumber = null;
        this.sigAlgName = null;
        this.subject = null;
        this.subjectAlternativeNames = List.of();
        this.validFrom = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CertInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String basicConstraints;
        private String expiryDate;
        private String isValid;
        private String issuer;
        private String publicKey;
        private String serialNumber;
        private String sigAlgName;
        private String subject;
        private List<String> subjectAlternativeNames;
        private String validFrom;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CertInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicConstraints = defaults.basicConstraints;
    	      this.expiryDate = defaults.expiryDate;
    	      this.isValid = defaults.isValid;
    	      this.issuer = defaults.issuer;
    	      this.publicKey = defaults.publicKey;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sigAlgName = defaults.sigAlgName;
    	      this.subject = defaults.subject;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.validFrom = defaults.validFrom;
    	      this.version = defaults.version;
        }

        public Builder setBasicConstraints(String basicConstraints) {
            this.basicConstraints = Objects.requireNonNull(basicConstraints);
            return this;
        }

        public Builder setExpiryDate(String expiryDate) {
            this.expiryDate = Objects.requireNonNull(expiryDate);
            return this;
        }

        public Builder setIsValid(String isValid) {
            this.isValid = Objects.requireNonNull(isValid);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSigAlgName(String sigAlgName) {
            this.sigAlgName = Objects.requireNonNull(sigAlgName);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
            return this;
        }

        public Builder setValidFrom(String validFrom) {
            this.validFrom = Objects.requireNonNull(validFrom);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GoogleCloudApigeeV1CertInfoResponse build() {
            return new GoogleCloudApigeeV1CertInfoResponse(basicConstraints, expiryDate, isValid, issuer, publicKey, serialNumber, sigAlgName, subject, subjectAlternativeNames, validFrom, version);
        }
    }
}