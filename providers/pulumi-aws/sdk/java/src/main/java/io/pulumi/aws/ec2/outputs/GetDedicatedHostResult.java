// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetDedicatedHostFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDedicatedHostResult {
    /**
     * The ARN of the Dedicated Host.
     * 
     */
    private final String arn;
    /**
     * Whether auto-placement is on or off.
     * 
     */
    private final String autoPlacement;
    /**
     * The Availability Zone of the Dedicated Host.
     * 
     */
    private final String availabilityZone;
    /**
     * The number of cores on the Dedicated Host.
     * 
     */
    private final Integer cores;
    private final @Nullable List<GetDedicatedHostFilter> filters;
    private final String hostId;
    /**
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * 
     */
    private final String hostRecovery;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The instance family supported by the Dedicated Host. For example, "m5".
     * 
     */
    private final String instanceFamily;
    /**
     * The instance type supported by the Dedicated Host. For example, "m5.large". If the host supports multiple instance types, no instanceType is returned.
     * 
     */
    private final String instanceType;
    /**
     * The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    private final String ownerId;
    /**
     * The number of sockets on the Dedicated Host.
     * 
     */
    private final Integer sockets;
    private final Map<String,String> tags;
    /**
     * The total number of vCPUs on the Dedicated Host.
     * 
     */
    private final Integer totalVcpus;

    @OutputCustomType.Constructor({"arn","autoPlacement","availabilityZone","cores","filters","hostId","hostRecovery","id","instanceFamily","instanceType","ownerId","sockets","tags","totalVcpus"})
    private GetDedicatedHostResult(
        String arn,
        String autoPlacement,
        String availabilityZone,
        Integer cores,
        @Nullable List<GetDedicatedHostFilter> filters,
        String hostId,
        String hostRecovery,
        String id,
        String instanceFamily,
        String instanceType,
        String ownerId,
        Integer sockets,
        Map<String,String> tags,
        Integer totalVcpus) {
        this.arn = Objects.requireNonNull(arn);
        this.autoPlacement = Objects.requireNonNull(autoPlacement);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.cores = Objects.requireNonNull(cores);
        this.filters = filters;
        this.hostId = Objects.requireNonNull(hostId);
        this.hostRecovery = Objects.requireNonNull(hostRecovery);
        this.id = Objects.requireNonNull(id);
        this.instanceFamily = Objects.requireNonNull(instanceFamily);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.sockets = Objects.requireNonNull(sockets);
        this.tags = Objects.requireNonNull(tags);
        this.totalVcpus = Objects.requireNonNull(totalVcpus);
    }

    /**
     * The ARN of the Dedicated Host.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Whether auto-placement is on or off.
     * 
     */
    public String getAutoPlacement() {
        return this.autoPlacement;
    }
    /**
     * The Availability Zone of the Dedicated Host.
     * 
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The number of cores on the Dedicated Host.
     * 
     */
    public Integer getCores() {
        return this.cores;
    }
    public List<GetDedicatedHostFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getHostId() {
        return this.hostId;
    }
    /**
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * 
     */
    public String getHostRecovery() {
        return this.hostRecovery;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The instance family supported by the Dedicated Host. For example, "m5".
     * 
     */
    public String getInstanceFamily() {
        return this.instanceFamily;
    }
    /**
     * The instance type supported by the Dedicated Host. For example, "m5.large". If the host supports multiple instance types, no instanceType is returned.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * The number of sockets on the Dedicated Host.
     * 
     */
    public Integer getSockets() {
        return this.sockets;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The total number of vCPUs on the Dedicated Host.
     * 
     */
    public Integer getTotalVcpus() {
        return this.totalVcpus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String autoPlacement;
        private String availabilityZone;
        private Integer cores;
        private @Nullable List<GetDedicatedHostFilter> filters;
        private String hostId;
        private String hostRecovery;
        private String id;
        private String instanceFamily;
        private String instanceType;
        private String ownerId;
        private Integer sockets;
        private Map<String,String> tags;
        private Integer totalVcpus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.cores = defaults.cores;
    	      this.filters = defaults.filters;
    	      this.hostId = defaults.hostId;
    	      this.hostRecovery = defaults.hostRecovery;
    	      this.id = defaults.id;
    	      this.instanceFamily = defaults.instanceFamily;
    	      this.instanceType = defaults.instanceType;
    	      this.ownerId = defaults.ownerId;
    	      this.sockets = defaults.sockets;
    	      this.tags = defaults.tags;
    	      this.totalVcpus = defaults.totalVcpus;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAutoPlacement(String autoPlacement) {
            this.autoPlacement = Objects.requireNonNull(autoPlacement);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setCores(Integer cores) {
            this.cores = Objects.requireNonNull(cores);
            return this;
        }

        public Builder setFilters(@Nullable List<GetDedicatedHostFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setHostId(String hostId) {
            this.hostId = Objects.requireNonNull(hostId);
            return this;
        }

        public Builder setHostRecovery(String hostRecovery) {
            this.hostRecovery = Objects.requireNonNull(hostRecovery);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceFamily(String instanceFamily) {
            this.instanceFamily = Objects.requireNonNull(instanceFamily);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setSockets(Integer sockets) {
            this.sockets = Objects.requireNonNull(sockets);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = Objects.requireNonNull(totalVcpus);
            return this;
        }
        public GetDedicatedHostResult build() {
            return new GetDedicatedHostResult(arn, autoPlacement, availabilityZone, cores, filters, hostId, hostRecovery, id, instanceFamily, instanceType, ownerId, sockets, tags, totalVcpus);
        }
    }
}
