// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchTemplatePlacement {
    private final String affinity;
    private final String availabilityZone;
    private final String groupName;
    private final String hostId;
    private final String hostResourceGroupArn;
    private final Integer partitionNumber;
    private final String spreadDomain;
    private final String tenancy;

    @OutputCustomType.Constructor({"affinity","availabilityZone","groupName","hostId","hostResourceGroupArn","partitionNumber","spreadDomain","tenancy"})
    private GetLaunchTemplatePlacement(
        String affinity,
        String availabilityZone,
        String groupName,
        String hostId,
        String hostResourceGroupArn,
        Integer partitionNumber,
        String spreadDomain,
        String tenancy) {
        this.affinity = Objects.requireNonNull(affinity);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.groupName = Objects.requireNonNull(groupName);
        this.hostId = Objects.requireNonNull(hostId);
        this.hostResourceGroupArn = Objects.requireNonNull(hostResourceGroupArn);
        this.partitionNumber = Objects.requireNonNull(partitionNumber);
        this.spreadDomain = Objects.requireNonNull(spreadDomain);
        this.tenancy = Objects.requireNonNull(tenancy);
    }

    public String getAffinity() {
        return this.affinity;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public String getGroupName() {
        return this.groupName;
    }
    public String getHostId() {
        return this.hostId;
    }
    public String getHostResourceGroupArn() {
        return this.hostResourceGroupArn;
    }
    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }
    public String getSpreadDomain() {
        return this.spreadDomain;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplatePlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affinity;
        private String availabilityZone;
        private String groupName;
        private String hostId;
        private String hostResourceGroupArn;
        private Integer partitionNumber;
        private String spreadDomain;
        private String tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplatePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.hostId = defaults.hostId;
    	      this.hostResourceGroupArn = defaults.hostResourceGroupArn;
    	      this.partitionNumber = defaults.partitionNumber;
    	      this.spreadDomain = defaults.spreadDomain;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder setAffinity(String affinity) {
            this.affinity = Objects.requireNonNull(affinity);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setHostId(String hostId) {
            this.hostId = Objects.requireNonNull(hostId);
            return this;
        }

        public Builder setHostResourceGroupArn(String hostResourceGroupArn) {
            this.hostResourceGroupArn = Objects.requireNonNull(hostResourceGroupArn);
            return this;
        }

        public Builder setPartitionNumber(Integer partitionNumber) {
            this.partitionNumber = Objects.requireNonNull(partitionNumber);
            return this;
        }

        public Builder setSpreadDomain(String spreadDomain) {
            this.spreadDomain = Objects.requireNonNull(spreadDomain);
            return this;
        }

        public Builder setTenancy(String tenancy) {
            this.tenancy = Objects.requireNonNull(tenancy);
            return this;
        }
        public GetLaunchTemplatePlacement build() {
            return new GetLaunchTemplatePlacement(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
        }
    }
}
