// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.outputs;

import io.pulumi.aws.route53recoveryreadiness.outputs.ResourceSetResourceDnsTargetResourceTargetResource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetResourceDnsTargetResource {
    /**
     * Domain name that is targeted.
     * 
     */
    private final String domainName;
    /**
     * Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * 
     */
    private final @Nullable String hostedZoneArn;
    /**
     * Resource record set ID that is targeted.
     * 
     */
    private final @Nullable String recordSetId;
    /**
     * Type of DNS Record of target resource.
     * 
     */
    private final @Nullable String recordType;
    /**
     * Target resource the R53 record specified with the above params points to.
     * 
     */
    private final @Nullable ResourceSetResourceDnsTargetResourceTargetResource targetResource;

    @OutputCustomType.Constructor({"domainName","hostedZoneArn","recordSetId","recordType","targetResource"})
    private ResourceSetResourceDnsTargetResource(
        String domainName,
        @Nullable String hostedZoneArn,
        @Nullable String recordSetId,
        @Nullable String recordType,
        @Nullable ResourceSetResourceDnsTargetResourceTargetResource targetResource) {
        this.domainName = Objects.requireNonNull(domainName);
        this.hostedZoneArn = hostedZoneArn;
        this.recordSetId = recordSetId;
        this.recordType = recordType;
        this.targetResource = targetResource;
    }

    /**
     * Domain name that is targeted.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * 
     */
    public Optional<String> getHostedZoneArn() {
        return Optional.ofNullable(this.hostedZoneArn);
    }
    /**
     * Resource record set ID that is targeted.
     * 
     */
    public Optional<String> getRecordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }
    /**
     * Type of DNS Record of target resource.
     * 
     */
    public Optional<String> getRecordType() {
        return Optional.ofNullable(this.recordType);
    }
    /**
     * Target resource the R53 record specified with the above params points to.
     * 
     */
    public Optional<ResourceSetResourceDnsTargetResourceTargetResource> getTargetResource() {
        return Optional.ofNullable(this.targetResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceDnsTargetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private @Nullable String hostedZoneArn;
        private @Nullable String recordSetId;
        private @Nullable String recordType;
        private @Nullable ResourceSetResourceDnsTargetResourceTargetResource targetResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResourceDnsTargetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostedZoneArn = defaults.hostedZoneArn;
    	      this.recordSetId = defaults.recordSetId;
    	      this.recordType = defaults.recordType;
    	      this.targetResource = defaults.targetResource;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setHostedZoneArn(@Nullable String hostedZoneArn) {
            this.hostedZoneArn = hostedZoneArn;
            return this;
        }

        public Builder setRecordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }

        public Builder setRecordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }

        public Builder setTargetResource(@Nullable ResourceSetResourceDnsTargetResourceTargetResource targetResource) {
            this.targetResource = targetResource;
            return this;
        }
        public ResourceSetResourceDnsTargetResource build() {
            return new ResourceSetResourceDnsTargetResource(domainName, hostedZoneArn, recordSetId, recordType, targetResource);
        }
    }
}
