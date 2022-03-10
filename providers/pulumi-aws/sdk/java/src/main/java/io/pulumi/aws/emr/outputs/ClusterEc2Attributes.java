// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEc2Attributes {
    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node.
     * 
     */
    private final @Nullable String additionalMasterSecurityGroups;
    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string.
     * 
     */
    private final @Nullable String additionalSlaveSecurityGroups;
    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the master node.
     * 
     */
    private final @Nullable String emrManagedMasterSecurityGroup;
    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes.
     * 
     */
    private final @Nullable String emrManagedSlaveSecurityGroup;
    /**
     * Instance Profile for EC2 instances of the cluster assume this role.
     * 
     */
    private final String instanceProfile;
    /**
     * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`.
     * 
     */
    private final @Nullable String keyName;
    /**
     * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet.
     * 
     */
    private final @Nullable String serviceAccessSecurityGroup;
    /**
     * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in an Amazon VPC.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * List of VPC subnet id-s where you want the job flow to launch.  Amazon EMR identifies the best Availability Zone to launch instances according to your fleet specifications.
     * 
     */
    private final @Nullable List<String> subnetIds;

    @OutputCustomType.Constructor({"additionalMasterSecurityGroups","additionalSlaveSecurityGroups","emrManagedMasterSecurityGroup","emrManagedSlaveSecurityGroup","instanceProfile","keyName","serviceAccessSecurityGroup","subnetId","subnetIds"})
    private ClusterEc2Attributes(
        @Nullable String additionalMasterSecurityGroups,
        @Nullable String additionalSlaveSecurityGroups,
        @Nullable String emrManagedMasterSecurityGroup,
        @Nullable String emrManagedSlaveSecurityGroup,
        String instanceProfile,
        @Nullable String keyName,
        @Nullable String serviceAccessSecurityGroup,
        @Nullable String subnetId,
        @Nullable List<String> subnetIds) {
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        this.instanceProfile = instanceProfile;
        this.keyName = keyName;
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
        this.subnetId = subnetId;
        this.subnetIds = subnetIds;
    }

    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node.
     * 
    */
    public Optional<String> getAdditionalMasterSecurityGroups() {
        return Optional.ofNullable(this.additionalMasterSecurityGroups);
    }
    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string.
     * 
    */
    public Optional<String> getAdditionalSlaveSecurityGroups() {
        return Optional.ofNullable(this.additionalSlaveSecurityGroups);
    }
    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the master node.
     * 
    */
    public Optional<String> getEmrManagedMasterSecurityGroup() {
        return Optional.ofNullable(this.emrManagedMasterSecurityGroup);
    }
    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes.
     * 
    */
    public Optional<String> getEmrManagedSlaveSecurityGroup() {
        return Optional.ofNullable(this.emrManagedSlaveSecurityGroup);
    }
    /**
     * Instance Profile for EC2 instances of the cluster assume this role.
     * 
    */
    public String getInstanceProfile() {
        return this.instanceProfile;
    }
    /**
     * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`.
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet.
     * 
    */
    public Optional<String> getServiceAccessSecurityGroup() {
        return Optional.ofNullable(this.serviceAccessSecurityGroup);
    }
    /**
     * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in an Amazon VPC.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * List of VPC subnet id-s where you want the job flow to launch.  Amazon EMR identifies the best Availability Zone to launch instances according to your fleet specifications.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEc2Attributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalMasterSecurityGroups;
        private @Nullable String additionalSlaveSecurityGroups;
        private @Nullable String emrManagedMasterSecurityGroup;
        private @Nullable String emrManagedSlaveSecurityGroup;
        private String instanceProfile;
        private @Nullable String keyName;
        private @Nullable String serviceAccessSecurityGroup;
        private @Nullable String subnetId;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEc2Attributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMasterSecurityGroups = defaults.additionalMasterSecurityGroups;
    	      this.additionalSlaveSecurityGroups = defaults.additionalSlaveSecurityGroups;
    	      this.emrManagedMasterSecurityGroup = defaults.emrManagedMasterSecurityGroup;
    	      this.emrManagedSlaveSecurityGroup = defaults.emrManagedSlaveSecurityGroup;
    	      this.instanceProfile = defaults.instanceProfile;
    	      this.keyName = defaults.keyName;
    	      this.serviceAccessSecurityGroup = defaults.serviceAccessSecurityGroup;
    	      this.subnetId = defaults.subnetId;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder setAdditionalMasterSecurityGroups(@Nullable String additionalMasterSecurityGroups) {
            this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
            return this;
        }

        public Builder setAdditionalSlaveSecurityGroups(@Nullable String additionalSlaveSecurityGroups) {
            this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
            return this;
        }

        public Builder setEmrManagedMasterSecurityGroup(@Nullable String emrManagedMasterSecurityGroup) {
            this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
            return this;
        }

        public Builder setEmrManagedSlaveSecurityGroup(@Nullable String emrManagedSlaveSecurityGroup) {
            this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
            return this;
        }

        public Builder setInstanceProfile(String instanceProfile) {
            this.instanceProfile = Objects.requireNonNull(instanceProfile);
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setServiceAccessSecurityGroup(@Nullable String serviceAccessSecurityGroup) {
            this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public ClusterEc2Attributes build() {
            return new ClusterEc2Attributes(additionalMasterSecurityGroups, additionalSlaveSecurityGroups, emrManagedMasterSecurityGroup, emrManagedSlaveSecurityGroup, instanceProfile, keyName, serviceAccessSecurityGroup, subnetId, subnetIds);
        }
    }
}