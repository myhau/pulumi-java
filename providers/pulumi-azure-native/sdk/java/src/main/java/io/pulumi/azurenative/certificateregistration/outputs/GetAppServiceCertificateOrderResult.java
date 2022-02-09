// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.outputs;

import io.pulumi.azurenative.certificateregistration.outputs.AppServiceCertificateResponse;
import io.pulumi.azurenative.certificateregistration.outputs.CertificateDetailsResponse;
import io.pulumi.azurenative.certificateregistration.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppServiceCertificateOrderResult {
    private final List<String> appServiceCertificateNotRenewableReasons;
    private final @Nullable Boolean autoRenew;
    private final @Nullable Map<String,AppServiceCertificateResponse> certificates;
    private final @Nullable String csr;
    private final @Nullable String distinguishedName;
    private final String domainVerificationToken;
    private final String expirationTime;
    private final String id;
    private final CertificateDetailsResponse intermediate;
    private final Boolean isPrivateKeyExternal;
    private final @Nullable Integer keySize;
    private final @Nullable String kind;
    private final String lastCertificateIssuanceTime;
    private final String location;
    private final String name;
    private final String nextAutoRenewalTimeStamp;
    private final String productType;
    private final String provisioningState;
    private final CertificateDetailsResponse root;
    private final String serialNumber;
    private final CertificateDetailsResponse signedCertificate;
    private final String status;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable Integer validityInYears;

    @OutputCustomType.Constructor({"appServiceCertificateNotRenewableReasons","autoRenew","certificates","csr","distinguishedName","domainVerificationToken","expirationTime","id","intermediate","isPrivateKeyExternal","keySize","kind","lastCertificateIssuanceTime","location","name","nextAutoRenewalTimeStamp","productType","provisioningState","root","serialNumber","signedCertificate","status","systemData","tags","type","validityInYears"})
    private GetAppServiceCertificateOrderResult(
        List<String> appServiceCertificateNotRenewableReasons,
        @Nullable Boolean autoRenew,
        @Nullable Map<String,AppServiceCertificateResponse> certificates,
        @Nullable String csr,
        @Nullable String distinguishedName,
        String domainVerificationToken,
        String expirationTime,
        String id,
        CertificateDetailsResponse intermediate,
        Boolean isPrivateKeyExternal,
        @Nullable Integer keySize,
        @Nullable String kind,
        String lastCertificateIssuanceTime,
        String location,
        String name,
        String nextAutoRenewalTimeStamp,
        String productType,
        String provisioningState,
        CertificateDetailsResponse root,
        String serialNumber,
        CertificateDetailsResponse signedCertificate,
        String status,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable Integer validityInYears) {
        this.appServiceCertificateNotRenewableReasons = Objects.requireNonNull(appServiceCertificateNotRenewableReasons);
        this.autoRenew = autoRenew;
        this.certificates = certificates;
        this.csr = csr;
        this.distinguishedName = distinguishedName;
        this.domainVerificationToken = Objects.requireNonNull(domainVerificationToken);
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.id = Objects.requireNonNull(id);
        this.intermediate = Objects.requireNonNull(intermediate);
        this.isPrivateKeyExternal = Objects.requireNonNull(isPrivateKeyExternal);
        this.keySize = keySize;
        this.kind = kind;
        this.lastCertificateIssuanceTime = Objects.requireNonNull(lastCertificateIssuanceTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.nextAutoRenewalTimeStamp = Objects.requireNonNull(nextAutoRenewalTimeStamp);
        this.productType = Objects.requireNonNull(productType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.root = Objects.requireNonNull(root);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.signedCertificate = Objects.requireNonNull(signedCertificate);
        this.status = Objects.requireNonNull(status);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.validityInYears = validityInYears;
    }

    public List<String> getAppServiceCertificateNotRenewableReasons() {
        return this.appServiceCertificateNotRenewableReasons;
    }
    public Optional<Boolean> getAutoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }
    public Map<String,AppServiceCertificateResponse> getCertificates() {
        return this.certificates == null ? Map.of() : this.certificates;
    }
    public Optional<String> getCsr() {
        return Optional.ofNullable(this.csr);
    }
    public Optional<String> getDistinguishedName() {
        return Optional.ofNullable(this.distinguishedName);
    }
    public String getDomainVerificationToken() {
        return this.domainVerificationToken;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }
    public String getId() {
        return this.id;
    }
    public CertificateDetailsResponse getIntermediate() {
        return this.intermediate;
    }
    public Boolean getIsPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }
    public Optional<Integer> getKeySize() {
        return Optional.ofNullable(this.keySize);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getLastCertificateIssuanceTime() {
        return this.lastCertificateIssuanceTime;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getNextAutoRenewalTimeStamp() {
        return this.nextAutoRenewalTimeStamp;
    }
    public String getProductType() {
        return this.productType;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public CertificateDetailsResponse getRoot() {
        return this.root;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }
    public CertificateDetailsResponse getSignedCertificate() {
        return this.signedCertificate;
    }
    public String getStatus() {
        return this.status;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Integer> getValidityInYears() {
        return Optional.ofNullable(this.validityInYears);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceCertificateOrderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> appServiceCertificateNotRenewableReasons;
        private @Nullable Boolean autoRenew;
        private @Nullable Map<String,AppServiceCertificateResponse> certificates;
        private @Nullable String csr;
        private @Nullable String distinguishedName;
        private String domainVerificationToken;
        private String expirationTime;
        private String id;
        private CertificateDetailsResponse intermediate;
        private Boolean isPrivateKeyExternal;
        private @Nullable Integer keySize;
        private @Nullable String kind;
        private String lastCertificateIssuanceTime;
        private String location;
        private String name;
        private String nextAutoRenewalTimeStamp;
        private String productType;
        private String provisioningState;
        private CertificateDetailsResponse root;
        private String serialNumber;
        private CertificateDetailsResponse signedCertificate;
        private String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Integer validityInYears;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceCertificateOrderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServiceCertificateNotRenewableReasons = defaults.appServiceCertificateNotRenewableReasons;
    	      this.autoRenew = defaults.autoRenew;
    	      this.certificates = defaults.certificates;
    	      this.csr = defaults.csr;
    	      this.distinguishedName = defaults.distinguishedName;
    	      this.domainVerificationToken = defaults.domainVerificationToken;
    	      this.expirationTime = defaults.expirationTime;
    	      this.id = defaults.id;
    	      this.intermediate = defaults.intermediate;
    	      this.isPrivateKeyExternal = defaults.isPrivateKeyExternal;
    	      this.keySize = defaults.keySize;
    	      this.kind = defaults.kind;
    	      this.lastCertificateIssuanceTime = defaults.lastCertificateIssuanceTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nextAutoRenewalTimeStamp = defaults.nextAutoRenewalTimeStamp;
    	      this.productType = defaults.productType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.root = defaults.root;
    	      this.serialNumber = defaults.serialNumber;
    	      this.signedCertificate = defaults.signedCertificate;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validityInYears = defaults.validityInYears;
        }

        public Builder setAppServiceCertificateNotRenewableReasons(List<String> appServiceCertificateNotRenewableReasons) {
            this.appServiceCertificateNotRenewableReasons = Objects.requireNonNull(appServiceCertificateNotRenewableReasons);
            return this;
        }

        public Builder setAutoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        public Builder setCertificates(@Nullable Map<String,AppServiceCertificateResponse> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setCsr(@Nullable String csr) {
            this.csr = csr;
            return this;
        }

        public Builder setDistinguishedName(@Nullable String distinguishedName) {
            this.distinguishedName = distinguishedName;
            return this;
        }

        public Builder setDomainVerificationToken(String domainVerificationToken) {
            this.domainVerificationToken = Objects.requireNonNull(domainVerificationToken);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIntermediate(CertificateDetailsResponse intermediate) {
            this.intermediate = Objects.requireNonNull(intermediate);
            return this;
        }

        public Builder setIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
            this.isPrivateKeyExternal = Objects.requireNonNull(isPrivateKeyExternal);
            return this;
        }

        public Builder setKeySize(@Nullable Integer keySize) {
            this.keySize = keySize;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLastCertificateIssuanceTime(String lastCertificateIssuanceTime) {
            this.lastCertificateIssuanceTime = Objects.requireNonNull(lastCertificateIssuanceTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextAutoRenewalTimeStamp(String nextAutoRenewalTimeStamp) {
            this.nextAutoRenewalTimeStamp = Objects.requireNonNull(nextAutoRenewalTimeStamp);
            return this;
        }

        public Builder setProductType(String productType) {
            this.productType = Objects.requireNonNull(productType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoot(CertificateDetailsResponse root) {
            this.root = Objects.requireNonNull(root);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSignedCertificate(CertificateDetailsResponse signedCertificate) {
            this.signedCertificate = Objects.requireNonNull(signedCertificate);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidityInYears(@Nullable Integer validityInYears) {
            this.validityInYears = validityInYears;
            return this;
        }

        public GetAppServiceCertificateOrderResult build() {
            return new GetAppServiceCertificateOrderResult(appServiceCertificateNotRenewableReasons, autoRenew, certificates, csr, distinguishedName, domainVerificationToken, expirationTime, id, intermediate, isPrivateKeyExternal, keySize, kind, lastCertificateIssuanceTime, location, name, nextAutoRenewalTimeStamp, productType, provisioningState, root, serialNumber, signedCertificate, status, systemData, tags, type, validityInYears);
        }
    }
}