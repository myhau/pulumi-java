// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerEndpointDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerEndpointDetailsArgs Empty = new ServerEndpointDetailsArgs();

    /**
     * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    @InputImport(name="addressAllocationIds")
      private final @Nullable Input<List<String>> addressAllocationIds;

    public Input<List<String>> getAddressAllocationIds() {
        return this.addressAllocationIds == null ? Input.empty() : this.addressAllocationIds;
    }

    /**
     * A list of security groups IDs that are available to attach to your server's endpoint. If no security groups are specified, the VPC's default security groups are automatically assigned to your endpoint. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * The ID of the VPC endpoint. This property can only be used when `endpoint_type` is set to `VPC_ENDPOINT`
     * 
     */
    @InputImport(name="vpcEndpointId")
      private final @Nullable Input<String> vpcEndpointId;

    public Input<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Input.empty() : this.vpcEndpointId;
    }

    /**
     * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpoint_type` is set to `VPC`.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public ServerEndpointDetailsArgs(
        @Nullable Input<List<String>> addressAllocationIds,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<String> vpcEndpointId,
        @Nullable Input<String> vpcId) {
        this.addressAllocationIds = addressAllocationIds;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcId = vpcId;
    }

    private ServerEndpointDetailsArgs() {
        this.addressAllocationIds = Input.empty();
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcEndpointId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addressAllocationIds;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<String> vpcEndpointId;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressAllocationIds = defaults.addressAllocationIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAddressAllocationIds(@Nullable Input<List<String>> addressAllocationIds) {
            this.addressAllocationIds = addressAllocationIds;
            return this;
        }

        public Builder setAddressAllocationIds(@Nullable List<String> addressAllocationIds) {
            this.addressAllocationIds = Input.ofNullable(addressAllocationIds);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setVpcEndpointId(@Nullable Input<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder setVpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Input.ofNullable(vpcEndpointId);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public ServerEndpointDetailsArgs build() {
            return new ServerEndpointDetailsArgs(addressAllocationIds, securityGroupIds, subnetIds, vpcEndpointId, vpcId);
        }
    }
}
