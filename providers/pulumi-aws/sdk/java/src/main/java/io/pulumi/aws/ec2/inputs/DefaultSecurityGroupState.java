// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressGetArgs;
import io.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupState Empty = new DefaultSecurityGroupState();

    /**
     * ARN of the security group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Description of this rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="egress")
      private final @Nullable Input<List<DefaultSecurityGroupEgressGetArgs>> egress;

    public Input<List<DefaultSecurityGroupEgressGetArgs>> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<List<DefaultSecurityGroupIngressGetArgs>> ingress;

    public Input<List<DefaultSecurityGroupIngressGetArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * Name of the security group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Owner ID.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    @InputImport(name="revokeRulesOnDelete")
      private final @Nullable Input<Boolean> revokeRulesOnDelete;

    public Input<Boolean> getRevokeRulesOnDelete() {
        return this.revokeRulesOnDelete == null ? Input.empty() : this.revokeRulesOnDelete;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public DefaultSecurityGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<List<DefaultSecurityGroupEgressGetArgs>> egress,
        @Nullable Input<List<DefaultSecurityGroupIngressGetArgs>> ingress,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerId,
        @Nullable Input<Boolean> revokeRulesOnDelete,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> vpcId) {
        this.arn = arn;
        this.description = description;
        this.egress = egress;
        this.ingress = ingress;
        this.name = name;
        this.ownerId = ownerId;
        this.revokeRulesOnDelete = revokeRulesOnDelete;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private DefaultSecurityGroupState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.egress = Input.empty();
        this.ingress = Input.empty();
        this.name = Input.empty();
        this.ownerId = Input.empty();
        this.revokeRulesOnDelete = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<List<DefaultSecurityGroupEgressGetArgs>> egress;
        private @Nullable Input<List<DefaultSecurityGroupIngressGetArgs>> ingress;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Boolean> revokeRulesOnDelete;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.revokeRulesOnDelete = defaults.revokeRulesOnDelete;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEgress(@Nullable Input<List<DefaultSecurityGroupEgressGetArgs>> egress) {
            this.egress = egress;
            return this;
        }

        public Builder setEgress(@Nullable List<DefaultSecurityGroupEgressGetArgs> egress) {
            this.egress = Input.ofNullable(egress);
            return this;
        }

        public Builder setIngress(@Nullable Input<List<DefaultSecurityGroupIngressGetArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable List<DefaultSecurityGroupIngressGetArgs> ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setRevokeRulesOnDelete(@Nullable Input<Boolean> revokeRulesOnDelete) {
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }

        public Builder setRevokeRulesOnDelete(@Nullable Boolean revokeRulesOnDelete) {
            this.revokeRulesOnDelete = Input.ofNullable(revokeRulesOnDelete);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
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
        public DefaultSecurityGroupState build() {
            return new DefaultSecurityGroupState(arn, description, egress, ingress, name, ownerId, revokeRulesOnDelete, tags, tagsAll, vpcId);
        }
    }
}