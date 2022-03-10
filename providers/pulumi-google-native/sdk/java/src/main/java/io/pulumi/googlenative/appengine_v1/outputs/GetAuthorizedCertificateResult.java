// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1.outputs.CertificateRawDataResponse;
import io.pulumi.googlenative.appengine_v1.outputs.ManagedCertificateResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAuthorizedCertificateResult {
    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    private final CertificateRawDataResponse certificateRawData;
    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    private final String displayName;
    /**
     * Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    private final Integer domainMappingsCount;
    /**
     * Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.
     * 
     */
    private final List<String> domainNames;
    /**
     * The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.
     * 
     */
    private final String expireTime;
    /**
     * Only applicable if this certificate is managed by App Engine. Managed certificates are tied to the lifecycle of a DomainMapping and cannot be updated or deleted via the AuthorizedCertificates API. If this certificate is manually administered by the user, this field will be empty.
     * 
     */
    private final ManagedCertificateResponse managedCertificate;
    /**
     * Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.
     * 
     */
    private final String name;
    /**
     * The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    private final List<String> visibleDomainMappings;

    @OutputCustomType.Constructor
    private GetAuthorizedCertificateResult(
        @OutputCustomType.Parameter("certificateRawData") CertificateRawDataResponse certificateRawData,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("domainMappingsCount") Integer domainMappingsCount,
        @OutputCustomType.Parameter("domainNames") List<String> domainNames,
        @OutputCustomType.Parameter("expireTime") String expireTime,
        @OutputCustomType.Parameter("managedCertificate") ManagedCertificateResponse managedCertificate,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("visibleDomainMappings") List<String> visibleDomainMappings) {
        this.certificateRawData = certificateRawData;
        this.displayName = displayName;
        this.domainMappingsCount = domainMappingsCount;
        this.domainNames = domainNames;
        this.expireTime = expireTime;
        this.managedCertificate = managedCertificate;
        this.name = name;
        this.visibleDomainMappings = visibleDomainMappings;
    }

    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
    */
    public CertificateRawDataResponse getCertificateRawData() {
        return this.certificateRawData;
    }
    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
    */
    public Integer getDomainMappingsCount() {
        return this.domainMappingsCount;
    }
    /**
     * Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.
     * 
    */
    public List<String> getDomainNames() {
        return this.domainNames;
    }
    /**
     * The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.
     * 
    */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * Only applicable if this certificate is managed by App Engine. Managed certificates are tied to the lifecycle of a DomainMapping and cannot be updated or deleted via the AuthorizedCertificates API. If this certificate is manually administered by the user, this field will be empty.
     * 
    */
    public ManagedCertificateResponse getManagedCertificate() {
        return this.managedCertificate;
    }
    /**
     * Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
    */
    public List<String> getVisibleDomainMappings() {
        return this.visibleDomainMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizedCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateRawDataResponse certificateRawData;
        private String displayName;
        private Integer domainMappingsCount;
        private List<String> domainNames;
        private String expireTime;
        private ManagedCertificateResponse managedCertificate;
        private String name;
        private List<String> visibleDomainMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizedCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateRawData = defaults.certificateRawData;
    	      this.displayName = defaults.displayName;
    	      this.domainMappingsCount = defaults.domainMappingsCount;
    	      this.domainNames = defaults.domainNames;
    	      this.expireTime = defaults.expireTime;
    	      this.managedCertificate = defaults.managedCertificate;
    	      this.name = defaults.name;
    	      this.visibleDomainMappings = defaults.visibleDomainMappings;
        }

        public Builder setCertificateRawData(CertificateRawDataResponse certificateRawData) {
            this.certificateRawData = Objects.requireNonNull(certificateRawData);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDomainMappingsCount(Integer domainMappingsCount) {
            this.domainMappingsCount = Objects.requireNonNull(domainMappingsCount);
            return this;
        }

        public Builder setDomainNames(List<String> domainNames) {
            this.domainNames = Objects.requireNonNull(domainNames);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setManagedCertificate(ManagedCertificateResponse managedCertificate) {
            this.managedCertificate = Objects.requireNonNull(managedCertificate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVisibleDomainMappings(List<String> visibleDomainMappings) {
            this.visibleDomainMappings = Objects.requireNonNull(visibleDomainMappings);
            return this;
        }
        public GetAuthorizedCertificateResult build() {
            return new GetAuthorizedCertificateResult(certificateRawData, displayName, domainMappingsCount, domainNames, expireTime, managedCertificate, name, visibleDomainMappings);
        }
    }
}
