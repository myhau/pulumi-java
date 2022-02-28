// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClusterVpcConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterVpcConfig Empty = new GetClusterVpcConfig();

    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     * 
     */
    @InputImport(name="clusterSecurityGroupId", required=true)
      private final String clusterSecurityGroupId;

    public String getClusterSecurityGroupId() {
        return this.clusterSecurityGroupId;
    }

    /**
     * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     * 
     */
    @InputImport(name="endpointPrivateAccess", required=true)
      private final Boolean endpointPrivateAccess;

    public Boolean getEndpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }

    /**
     * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     * 
     */
    @InputImport(name="endpointPublicAccess", required=true)
      private final Boolean endpointPublicAccess;

    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     * 
     */
    @InputImport(name="publicAccessCidrs", required=true)
      private final List<String> publicAccessCidrs;

    public List<String> getPublicAccessCidrs() {
        return this.publicAccessCidrs;
    }

    /**
     * List of security group IDs
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final List<String> securityGroupIds;

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * List of subnet IDs
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * The VPC associated with your cluster.
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetClusterVpcConfig(
        String clusterSecurityGroupId,
        Boolean endpointPrivateAccess,
        Boolean endpointPublicAccess,
        List<String> publicAccessCidrs,
        List<String> securityGroupIds,
        List<String> subnetIds,
        String vpcId) {
        this.clusterSecurityGroupId = Objects.requireNonNull(clusterSecurityGroupId, "expected parameter 'clusterSecurityGroupId' to be non-null");
        this.endpointPrivateAccess = Objects.requireNonNull(endpointPrivateAccess, "expected parameter 'endpointPrivateAccess' to be non-null");
        this.endpointPublicAccess = Objects.requireNonNull(endpointPublicAccess, "expected parameter 'endpointPublicAccess' to be non-null");
        this.publicAccessCidrs = Objects.requireNonNull(publicAccessCidrs, "expected parameter 'publicAccessCidrs' to be non-null");
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetClusterVpcConfig() {
        this.clusterSecurityGroupId = null;
        this.endpointPrivateAccess = null;
        this.endpointPublicAccess = null;
        this.publicAccessCidrs = List.of();
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterSecurityGroupId;
        private Boolean endpointPrivateAccess;
        private Boolean endpointPublicAccess;
        private List<String> publicAccessCidrs;
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroupId = defaults.clusterSecurityGroupId;
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setClusterSecurityGroupId(String clusterSecurityGroupId) {
            this.clusterSecurityGroupId = Objects.requireNonNull(clusterSecurityGroupId);
            return this;
        }

        public Builder setEndpointPrivateAccess(Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = Objects.requireNonNull(endpointPrivateAccess);
            return this;
        }

        public Builder setEndpointPublicAccess(Boolean endpointPublicAccess) {
            this.endpointPublicAccess = Objects.requireNonNull(endpointPublicAccess);
            return this;
        }

        public Builder setPublicAccessCidrs(List<String> publicAccessCidrs) {
            this.publicAccessCidrs = Objects.requireNonNull(publicAccessCidrs);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
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
        public GetClusterVpcConfig build() {
            return new GetClusterVpcConfig(clusterSecurityGroupId, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds, vpcId);
        }
    }
}
