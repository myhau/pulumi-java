// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FunctionVpcConfig {
    /**
     * List of security group IDs associated with the Lambda function.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * List of subnet IDs associated with the Lambda function.
     * 
     */
    private final List<String> subnetIds;
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor({"securityGroupIds","subnetIds","vpcId"})
    private FunctionVpcConfig(
        List<String> securityGroupIds,
        List<String> subnetIds,
        @Nullable String vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
        this.subnetIds = Objects.requireNonNull(subnetIds);
        this.vpcId = vpcId;
    }

    /**
     * List of security group IDs associated with the Lambda function.
     * 
     */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * List of subnet IDs associated with the Lambda function.
     * 
     */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionVpcConfig defaults) {
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

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public FunctionVpcConfig build() {
            return new FunctionVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
