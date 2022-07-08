// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.v1.outputs.SslCertificateManagedSslCertificateResponse;
import com.pulumi.googlenative.compute.v1.outputs.SslCertificateSelfManagedSslCertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSslCertificateResult {
    /**
     * @return A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    private final String certificate;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Expire time of the certificate. RFC3339
     * 
     */
    private final String expireTime;
    /**
     * @return Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
     */
    private final String kind;
    /**
     * @return Configuration and status of a managed SSL certificate.
     * 
     */
    private final SslCertificateManagedSslCertificateResponse managed;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    private final String privateKey;
    /**
     * @return URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
     */
    private final String region;
    /**
     * @return [Output only] Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Configuration and status of a self-managed SSL certificate.
     * 
     */
    private final SslCertificateSelfManagedSslCertificateResponse selfManaged;
    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    private final List<String> subjectAlternativeNames;
    /**
     * @return (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSslCertificateResult(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("managed") SslCertificateManagedSslCertificateResponse managed,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateKey") String privateKey,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfManaged") SslCertificateSelfManagedSslCertificateResponse selfManaged,
        @CustomType.Parameter("subjectAlternativeNames") List<String> subjectAlternativeNames,
        @CustomType.Parameter("type") String type) {
        this.certificate = certificate;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.expireTime = expireTime;
        this.kind = kind;
        this.managed = managed;
        this.name = name;
        this.privateKey = privateKey;
        this.region = region;
        this.selfLink = selfLink;
        this.selfManaged = selfManaged;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = type;
    }

    /**
     * @return A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Expire time of the certificate. RFC3339
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Configuration and status of a managed SSL certificate.
     * 
     */
    public SslCertificateManagedSslCertificateResponse managed() {
        return this.managed;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return [Output only] Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Configuration and status of a self-managed SSL certificate.
     * 
     */
    public SslCertificateSelfManagedSslCertificateResponse selfManaged() {
        return this.selfManaged;
    }
    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * @return (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String creationTimestamp;
        private String description;
        private String expireTime;
        private String kind;
        private SslCertificateManagedSslCertificateResponse managed;
        private String name;
        private String privateKey;
        private String region;
        private String selfLink;
        private SslCertificateSelfManagedSslCertificateResponse selfManaged;
        private List<String> subjectAlternativeNames;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.expireTime = defaults.expireTime;
    	      this.kind = defaults.kind;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.privateKey = defaults.privateKey;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfManaged = defaults.selfManaged;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder managed(SslCertificateManagedSslCertificateResponse managed) {
            this.managed = Objects.requireNonNull(managed);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfManaged(SslCertificateSelfManagedSslCertificateResponse selfManaged) {
            this.selfManaged = Objects.requireNonNull(selfManaged);
            return this;
        }
        public Builder subjectAlternativeNames(List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSslCertificateResult build() {
            return new GetSslCertificateResult(certificate, creationTimestamp, description, expireTime, kind, managed, name, privateKey, region, selfLink, selfManaged, subjectAlternativeNames, type);
        }
    }
}
