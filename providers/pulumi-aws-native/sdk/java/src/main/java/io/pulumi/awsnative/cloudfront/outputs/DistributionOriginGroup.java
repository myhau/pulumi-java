// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.DistributionOriginGroupFailoverCriteria;
import io.pulumi.awsnative.cloudfront.outputs.DistributionOriginGroupMembers;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginGroup {
    private final DistributionOriginGroupFailoverCriteria failoverCriteria;
    private final String id;
    private final DistributionOriginGroupMembers members;

    @OutputCustomType.Constructor({"failoverCriteria","id","members"})
    private DistributionOriginGroup(
        DistributionOriginGroupFailoverCriteria failoverCriteria,
        String id,
        DistributionOriginGroupMembers members) {
        this.failoverCriteria = failoverCriteria;
        this.id = id;
        this.members = members;
    }

    public DistributionOriginGroupFailoverCriteria getFailoverCriteria() {
        return this.failoverCriteria;
    }
    public String getId() {
        return this.id;
    }
    public DistributionOriginGroupMembers getMembers() {
        return this.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupFailoverCriteria failoverCriteria;
        private String id;
        private DistributionOriginGroupMembers members;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
        }

        public Builder setFailoverCriteria(DistributionOriginGroupFailoverCriteria failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMembers(DistributionOriginGroupMembers members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public DistributionOriginGroup build() {
            return new DistributionOriginGroup(failoverCriteria, id, members);
        }
    }
}
