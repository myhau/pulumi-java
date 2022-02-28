// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationGetArgs;
import io.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameState extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameState Empty = new DomainNameState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * The certificate issued for the domain name
     * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
     * `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateBody")
      private final @Nullable Input<String> certificateBody;

    public Input<String> getCertificateBody() {
        return this.certificateBody == null ? Input.empty() : this.certificateBody;
    }

    /**
     * The certificate for the CA that issued the
     * certificate, along with any intermediate CA certificates required to
     * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`,
     * `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateChain")
      private final @Nullable Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain == null ? Input.empty() : this.certificateChain;
    }

    /**
     * The unique name to use when registering this
     * certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
     * `regional_certificate_name`. Required if `certificate_arn` is not set.
     * 
     */
    @InputImport(name="certificateName")
      private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * The private key associated with the
     * domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificatePrivateKey")
      private final @Nullable Input<String> certificatePrivateKey;

    public Input<String> getCertificatePrivateKey() {
        return this.certificatePrivateKey == null ? Input.empty() : this.certificatePrivateKey;
    }

    /**
     * The upload date associated with the domain certificate.
     * 
     */
    @InputImport(name="certificateUploadDate")
      private final @Nullable Input<String> certificateUploadDate;

    public Input<String> getCertificateUploadDate() {
        return this.certificateUploadDate == null ? Input.empty() : this.certificateUploadDate;
    }

    /**
     * The hostname created by Cloudfront to represent
     * the distribution that implements this domain name mapping.
     * 
     */
    @InputImport(name="cloudfrontDomainName")
      private final @Nullable Input<String> cloudfrontDomainName;

    public Input<String> getCloudfrontDomainName() {
        return this.cloudfrontDomainName == null ? Input.empty() : this.cloudfrontDomainName;
    }

    /**
     * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
     * that can be used to create a Route53 alias record for the distribution.
     * 
     */
    @InputImport(name="cloudfrontZoneId")
      private final @Nullable Input<String> cloudfrontZoneId;

    public Input<String> getCloudfrontZoneId() {
        return this.cloudfrontZoneId == null ? Input.empty() : this.cloudfrontZoneId;
    }

    /**
     * The fully-qualified domain name to register
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * Configuration block defining API endpoint information including type. Defined below.
     * 
     */
    @InputImport(name="endpointConfiguration")
      private final @Nullable Input<DomainNameEndpointConfigurationGetArgs> endpointConfiguration;

    public Input<DomainNameEndpointConfigurationGetArgs> getEndpointConfiguration() {
        return this.endpointConfiguration == null ? Input.empty() : this.endpointConfiguration;
    }

    /**
     * The mutual TLS authentication configuration for the domain name. Defined below.
     * 
     */
    @InputImport(name="mutualTlsAuthentication")
      private final @Nullable Input<DomainNameMutualTlsAuthenticationGetArgs> mutualTlsAuthentication;

    public Input<DomainNameMutualTlsAuthenticationGetArgs> getMutualTlsAuthentication() {
        return this.mutualTlsAuthentication == null ? Input.empty() : this.mutualTlsAuthentication;
    }

    /**
     * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     */
    @InputImport(name="regionalCertificateArn")
      private final @Nullable Input<String> regionalCertificateArn;

    public Input<String> getRegionalCertificateArn() {
        return this.regionalCertificateArn == null ? Input.empty() : this.regionalCertificateArn;
    }

    /**
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and
     * `certificate_private_key`.
     * 
     */
    @InputImport(name="regionalCertificateName")
      private final @Nullable Input<String> regionalCertificateName;

    public Input<String> getRegionalCertificateName() {
        return this.regionalCertificateName == null ? Input.empty() : this.regionalCertificateName;
    }

    /**
     * The hostname for the custom domain's regional endpoint.
     * 
     */
    @InputImport(name="regionalDomainName")
      private final @Nullable Input<String> regionalDomainName;

    public Input<String> getRegionalDomainName() {
        return this.regionalDomainName == null ? Input.empty() : this.regionalDomainName;
    }

    /**
     * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
     * 
     */
    @InputImport(name="regionalZoneId")
      private final @Nullable Input<String> regionalZoneId;

    public Input<String> getRegionalZoneId() {
        return this.regionalZoneId == null ? Input.empty() : this.regionalZoneId;
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="securityPolicy")
      private final @Nullable Input<String> securityPolicy;

    public Input<String> getSecurityPolicy() {
        return this.securityPolicy == null ? Input.empty() : this.securityPolicy;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public DomainNameState(
        @Nullable Input<String> arn,
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> certificateBody,
        @Nullable Input<String> certificateChain,
        @Nullable Input<String> certificateName,
        @Nullable Input<String> certificatePrivateKey,
        @Nullable Input<String> certificateUploadDate,
        @Nullable Input<String> cloudfrontDomainName,
        @Nullable Input<String> cloudfrontZoneId,
        @Nullable Input<String> domainName,
        @Nullable Input<DomainNameEndpointConfigurationGetArgs> endpointConfiguration,
        @Nullable Input<DomainNameMutualTlsAuthenticationGetArgs> mutualTlsAuthentication,
        @Nullable Input<String> regionalCertificateArn,
        @Nullable Input<String> regionalCertificateName,
        @Nullable Input<String> regionalDomainName,
        @Nullable Input<String> regionalZoneId,
        @Nullable Input<String> securityPolicy,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.certificateName = certificateName;
        this.certificatePrivateKey = certificatePrivateKey;
        this.certificateUploadDate = certificateUploadDate;
        this.cloudfrontDomainName = cloudfrontDomainName;
        this.cloudfrontZoneId = cloudfrontZoneId;
        this.domainName = domainName;
        this.endpointConfiguration = endpointConfiguration;
        this.mutualTlsAuthentication = mutualTlsAuthentication;
        this.regionalCertificateArn = regionalCertificateArn;
        this.regionalCertificateName = regionalCertificateName;
        this.regionalDomainName = regionalDomainName;
        this.regionalZoneId = regionalZoneId;
        this.securityPolicy = securityPolicy;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DomainNameState() {
        this.arn = Input.empty();
        this.certificateArn = Input.empty();
        this.certificateBody = Input.empty();
        this.certificateChain = Input.empty();
        this.certificateName = Input.empty();
        this.certificatePrivateKey = Input.empty();
        this.certificateUploadDate = Input.empty();
        this.cloudfrontDomainName = Input.empty();
        this.cloudfrontZoneId = Input.empty();
        this.domainName = Input.empty();
        this.endpointConfiguration = Input.empty();
        this.mutualTlsAuthentication = Input.empty();
        this.regionalCertificateArn = Input.empty();
        this.regionalCertificateName = Input.empty();
        this.regionalDomainName = Input.empty();
        this.regionalZoneId = Input.empty();
        this.securityPolicy = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> certificateBody;
        private @Nullable Input<String> certificateChain;
        private @Nullable Input<String> certificateName;
        private @Nullable Input<String> certificatePrivateKey;
        private @Nullable Input<String> certificateUploadDate;
        private @Nullable Input<String> cloudfrontDomainName;
        private @Nullable Input<String> cloudfrontZoneId;
        private @Nullable Input<String> domainName;
        private @Nullable Input<DomainNameEndpointConfigurationGetArgs> endpointConfiguration;
        private @Nullable Input<DomainNameMutualTlsAuthenticationGetArgs> mutualTlsAuthentication;
        private @Nullable Input<String> regionalCertificateArn;
        private @Nullable Input<String> regionalCertificateName;
        private @Nullable Input<String> regionalDomainName;
        private @Nullable Input<String> regionalZoneId;
        private @Nullable Input<String> securityPolicy;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateName = defaults.certificateName;
    	      this.certificatePrivateKey = defaults.certificatePrivateKey;
    	      this.certificateUploadDate = defaults.certificateUploadDate;
    	      this.cloudfrontDomainName = defaults.cloudfrontDomainName;
    	      this.cloudfrontZoneId = defaults.cloudfrontZoneId;
    	      this.domainName = defaults.domainName;
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.mutualTlsAuthentication = defaults.mutualTlsAuthentication;
    	      this.regionalCertificateArn = defaults.regionalCertificateArn;
    	      this.regionalCertificateName = defaults.regionalCertificateName;
    	      this.regionalDomainName = defaults.regionalDomainName;
    	      this.regionalZoneId = defaults.regionalZoneId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setCertificateBody(@Nullable Input<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        public Builder setCertificateBody(@Nullable String certificateBody) {
            this.certificateBody = Input.ofNullable(certificateBody);
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

        public Builder setCertificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder setCertificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder setCertificatePrivateKey(@Nullable Input<String> certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        public Builder setCertificatePrivateKey(@Nullable String certificatePrivateKey) {
            this.certificatePrivateKey = Input.ofNullable(certificatePrivateKey);
            return this;
        }

        public Builder setCertificateUploadDate(@Nullable Input<String> certificateUploadDate) {
            this.certificateUploadDate = certificateUploadDate;
            return this;
        }

        public Builder setCertificateUploadDate(@Nullable String certificateUploadDate) {
            this.certificateUploadDate = Input.ofNullable(certificateUploadDate);
            return this;
        }

        public Builder setCloudfrontDomainName(@Nullable Input<String> cloudfrontDomainName) {
            this.cloudfrontDomainName = cloudfrontDomainName;
            return this;
        }

        public Builder setCloudfrontDomainName(@Nullable String cloudfrontDomainName) {
            this.cloudfrontDomainName = Input.ofNullable(cloudfrontDomainName);
            return this;
        }

        public Builder setCloudfrontZoneId(@Nullable Input<String> cloudfrontZoneId) {
            this.cloudfrontZoneId = cloudfrontZoneId;
            return this;
        }

        public Builder setCloudfrontZoneId(@Nullable String cloudfrontZoneId) {
            this.cloudfrontZoneId = Input.ofNullable(cloudfrontZoneId);
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable Input<DomainNameEndpointConfigurationGetArgs> endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable DomainNameEndpointConfigurationGetArgs endpointConfiguration) {
            this.endpointConfiguration = Input.ofNullable(endpointConfiguration);
            return this;
        }

        public Builder setMutualTlsAuthentication(@Nullable Input<DomainNameMutualTlsAuthenticationGetArgs> mutualTlsAuthentication) {
            this.mutualTlsAuthentication = mutualTlsAuthentication;
            return this;
        }

        public Builder setMutualTlsAuthentication(@Nullable DomainNameMutualTlsAuthenticationGetArgs mutualTlsAuthentication) {
            this.mutualTlsAuthentication = Input.ofNullable(mutualTlsAuthentication);
            return this;
        }

        public Builder setRegionalCertificateArn(@Nullable Input<String> regionalCertificateArn) {
            this.regionalCertificateArn = regionalCertificateArn;
            return this;
        }

        public Builder setRegionalCertificateArn(@Nullable String regionalCertificateArn) {
            this.regionalCertificateArn = Input.ofNullable(regionalCertificateArn);
            return this;
        }

        public Builder setRegionalCertificateName(@Nullable Input<String> regionalCertificateName) {
            this.regionalCertificateName = regionalCertificateName;
            return this;
        }

        public Builder setRegionalCertificateName(@Nullable String regionalCertificateName) {
            this.regionalCertificateName = Input.ofNullable(regionalCertificateName);
            return this;
        }

        public Builder setRegionalDomainName(@Nullable Input<String> regionalDomainName) {
            this.regionalDomainName = regionalDomainName;
            return this;
        }

        public Builder setRegionalDomainName(@Nullable String regionalDomainName) {
            this.regionalDomainName = Input.ofNullable(regionalDomainName);
            return this;
        }

        public Builder setRegionalZoneId(@Nullable Input<String> regionalZoneId) {
            this.regionalZoneId = regionalZoneId;
            return this;
        }

        public Builder setRegionalZoneId(@Nullable String regionalZoneId) {
            this.regionalZoneId = Input.ofNullable(regionalZoneId);
            return this;
        }

        public Builder setSecurityPolicy(@Nullable Input<String> securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }

        public Builder setSecurityPolicy(@Nullable String securityPolicy) {
            this.securityPolicy = Input.ofNullable(securityPolicy);
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
        public DomainNameState build() {
            return new DomainNameState(arn, certificateArn, certificateBody, certificateChain, certificateName, certificatePrivateKey, certificateUploadDate, cloudfrontDomainName, cloudfrontZoneId, domainName, endpointConfiguration, mutualTlsAuthentication, regionalCertificateArn, regionalCertificateName, regionalDomainName, regionalZoneId, securityPolicy, tags, tagsAll);
        }
    }
}
