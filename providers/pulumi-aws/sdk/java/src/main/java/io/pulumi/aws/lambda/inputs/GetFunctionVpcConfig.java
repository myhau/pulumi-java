// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetFunctionVpcConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionVpcConfig Empty = new GetFunctionVpcConfig();

    @InputImport(name="securityGroupIds", required=true)
      private final List<String> securityGroupIds;

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    @InputImport(name="subnetIds", required=true)
      private final List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    @InputImport(name="vpcId", required=true)
      private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetFunctionVpcConfig(
        List<String> securityGroupIds,
        List<String> subnetIds,
        String vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetFunctionVpcConfig() {
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
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
        public GetFunctionVpcConfig build() {
            return new GetFunctionVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
