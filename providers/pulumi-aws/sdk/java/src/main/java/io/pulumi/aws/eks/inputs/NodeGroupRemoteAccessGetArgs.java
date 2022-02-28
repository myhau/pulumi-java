// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupRemoteAccessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupRemoteAccessGetArgs Empty = new NodeGroupRemoteAccessGetArgs();

    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `source_security_group_ids` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    @InputImport(name="ec2SshKey")
      private final @Nullable Input<String> ec2SshKey;

    public Input<String> getEc2SshKey() {
        return this.ec2SshKey == null ? Input.empty() : this.ec2SshKey;
    }

    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2_ssh_key`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    @InputImport(name="sourceSecurityGroupIds")
      private final @Nullable Input<List<String>> sourceSecurityGroupIds;

    public Input<List<String>> getSourceSecurityGroupIds() {
        return this.sourceSecurityGroupIds == null ? Input.empty() : this.sourceSecurityGroupIds;
    }

    public NodeGroupRemoteAccessGetArgs(
        @Nullable Input<String> ec2SshKey,
        @Nullable Input<List<String>> sourceSecurityGroupIds) {
        this.ec2SshKey = ec2SshKey;
        this.sourceSecurityGroupIds = sourceSecurityGroupIds;
    }

    private NodeGroupRemoteAccessGetArgs() {
        this.ec2SshKey = Input.empty();
        this.sourceSecurityGroupIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupRemoteAccessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ec2SshKey;
        private @Nullable Input<List<String>> sourceSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupRemoteAccessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2SshKey = defaults.ec2SshKey;
    	      this.sourceSecurityGroupIds = defaults.sourceSecurityGroupIds;
        }

        public Builder setEc2SshKey(@Nullable Input<String> ec2SshKey) {
            this.ec2SshKey = ec2SshKey;
            return this;
        }

        public Builder setEc2SshKey(@Nullable String ec2SshKey) {
            this.ec2SshKey = Input.ofNullable(ec2SshKey);
            return this;
        }

        public Builder setSourceSecurityGroupIds(@Nullable Input<List<String>> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = sourceSecurityGroupIds;
            return this;
        }

        public Builder setSourceSecurityGroupIds(@Nullable List<String> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = Input.ofNullable(sourceSecurityGroupIds);
            return this;
        }
        public NodeGroupRemoteAccessGetArgs build() {
            return new NodeGroupRemoteAccessGetArgs(ec2SshKey, sourceSecurityGroupIds);
        }
    }
}
