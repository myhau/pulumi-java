// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetResourceDnsTargetResourceTargetResourceR53Resource {
    /**
     * Domain name that is targeted.
     * 
     */
    private final @Nullable String domainName;
    /**
     * Resource record set ID that is targeted.
     * 
     */
    private final @Nullable String recordSetId;

    @OutputCustomType.Constructor({"domainName","recordSetId"})
    private ResourceSetResourceDnsTargetResourceTargetResourceR53Resource(
        @Nullable String domainName,
        @Nullable String recordSetId) {
        this.domainName = domainName;
        this.recordSetId = recordSetId;
    }

    /**
     * Domain name that is targeted.
     * 
    */
    public Optional<String> getDomainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * Resource record set ID that is targeted.
     * 
    */
    public Optional<String> getRecordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceDnsTargetResourceTargetResourceR53Resource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String recordSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResourceDnsTargetResourceTargetResourceR53Resource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.recordSetId = defaults.recordSetId;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setRecordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }
        public ResourceSetResourceDnsTargetResourceTargetResourceR53Resource build() {
            return new ResourceSetResourceDnsTargetResourceTargetResourceR53Resource(domainName, recordSetId);
        }
    }
}