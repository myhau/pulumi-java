// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateDomainValidationOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateDomainValidationOptionArgs Empty = new CertificateDomainValidationOptionArgs();

    /**
     * A domain name for which the certificate should be issued
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The name of the DNS record to create to validate the certificate
     * 
     */
    @InputImport(name="resourceRecordName")
      private final @Nullable Input<String> resourceRecordName;

    public Input<String> getResourceRecordName() {
        return this.resourceRecordName == null ? Input.empty() : this.resourceRecordName;
    }

    /**
     * The type of DNS record to create
     * 
     */
    @InputImport(name="resourceRecordType")
      private final @Nullable Input<String> resourceRecordType;

    public Input<String> getResourceRecordType() {
        return this.resourceRecordType == null ? Input.empty() : this.resourceRecordType;
    }

    /**
     * The value the DNS record needs to have
     * 
     */
    @InputImport(name="resourceRecordValue")
      private final @Nullable Input<String> resourceRecordValue;

    public Input<String> getResourceRecordValue() {
        return this.resourceRecordValue == null ? Input.empty() : this.resourceRecordValue;
    }

    public CertificateDomainValidationOptionArgs(
        @Nullable Input<String> domainName,
        @Nullable Input<String> resourceRecordName,
        @Nullable Input<String> resourceRecordType,
        @Nullable Input<String> resourceRecordValue) {
        this.domainName = domainName;
        this.resourceRecordName = resourceRecordName;
        this.resourceRecordType = resourceRecordType;
        this.resourceRecordValue = resourceRecordValue;
    }

    private CertificateDomainValidationOptionArgs() {
        this.domainName = Input.empty();
        this.resourceRecordName = Input.empty();
        this.resourceRecordType = Input.empty();
        this.resourceRecordValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDomainValidationOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> resourceRecordName;
        private @Nullable Input<String> resourceRecordType;
        private @Nullable Input<String> resourceRecordValue;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDomainValidationOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.resourceRecordName = defaults.resourceRecordName;
    	      this.resourceRecordType = defaults.resourceRecordType;
    	      this.resourceRecordValue = defaults.resourceRecordValue;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setResourceRecordName(@Nullable Input<String> resourceRecordName) {
            this.resourceRecordName = resourceRecordName;
            return this;
        }

        public Builder setResourceRecordName(@Nullable String resourceRecordName) {
            this.resourceRecordName = Input.ofNullable(resourceRecordName);
            return this;
        }

        public Builder setResourceRecordType(@Nullable Input<String> resourceRecordType) {
            this.resourceRecordType = resourceRecordType;
            return this;
        }

        public Builder setResourceRecordType(@Nullable String resourceRecordType) {
            this.resourceRecordType = Input.ofNullable(resourceRecordType);
            return this;
        }

        public Builder setResourceRecordValue(@Nullable Input<String> resourceRecordValue) {
            this.resourceRecordValue = resourceRecordValue;
            return this;
        }

        public Builder setResourceRecordValue(@Nullable String resourceRecordValue) {
            this.resourceRecordValue = Input.ofNullable(resourceRecordValue);
            return this;
        }
        public CertificateDomainValidationOptionArgs build() {
            return new CertificateDomainValidationOptionArgs(domainName, resourceRecordName, resourceRecordType, resourceRecordValue);
        }
    }
}
