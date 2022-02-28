// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.outputs;

import io.pulumi.aws.cloudhsmv2.outputs.GetClusterClusterCertificates;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The list of cluster certificates.
     * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
     * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
     * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
     *   The number of available cluster certificates may vary depending on state of the cluster.
     * 
     */
    private final GetClusterClusterCertificates clusterCertificates;
    private final String clusterId;
    private final String clusterState;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ID of the security group associated with the CloudHSM cluster.
     * 
     */
    private final String securityGroupId;
    /**
     * The IDs of subnets in which cluster operates.
     * 
     */
    private final List<String> subnetIds;
    /**
     * The id of the VPC that the CloudHSM cluster resides in.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"clusterCertificates","clusterId","clusterState","id","securityGroupId","subnetIds","vpcId"})
    private GetClusterResult(
        GetClusterClusterCertificates clusterCertificates,
        String clusterId,
        String clusterState,
        String id,
        String securityGroupId,
        List<String> subnetIds,
        String vpcId) {
        this.clusterCertificates = Objects.requireNonNull(clusterCertificates);
        this.clusterId = Objects.requireNonNull(clusterId);
        this.clusterState = Objects.requireNonNull(clusterState);
        this.id = Objects.requireNonNull(id);
        this.securityGroupId = Objects.requireNonNull(securityGroupId);
        this.subnetIds = Objects.requireNonNull(subnetIds);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * The list of cluster certificates.
     * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
     * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
     * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
     *   The number of available cluster certificates may vary depending on state of the cluster.
     * 
     */
    public GetClusterClusterCertificates getClusterCertificates() {
        return this.clusterCertificates;
    }
    public String getClusterId() {
        return this.clusterId;
    }
    public String getClusterState() {
        return this.clusterState;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The ID of the security group associated with the CloudHSM cluster.
     * 
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The IDs of subnets in which cluster operates.
     * 
     */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The id of the VPC that the CloudHSM cluster resides in.
     * 
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterCertificates clusterCertificates;
        private String clusterId;
        private String clusterState;
        private String id;
        private String securityGroupId;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterCertificates = defaults.clusterCertificates;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.id = defaults.id;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setClusterCertificates(GetClusterClusterCertificates clusterCertificates) {
            this.clusterCertificates = Objects.requireNonNull(clusterCertificates);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterState(String clusterState) {
            this.clusterState = Objects.requireNonNull(clusterState);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(clusterCertificates, clusterId, clusterState, id, securityGroupId, subnetIds, vpcId);
        }
    }
}
