// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipState Empty = new GroupMembershipState();

    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @InputImport(name="awsAccountId")
      private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    /**
     * The name of the group in which the member will be added.
     * 
     */
    @InputImport(name="groupName")
      private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    /**
     * The name of the member to add to the group.
     * 
     */
    @InputImport(name="memberName")
      private final @Nullable Input<String> memberName;

    public Input<String> getMemberName() {
        return this.memberName == null ? Input.empty() : this.memberName;
    }

    /**
     * The namespace. Defaults to `default`. Currently only `default` is supported.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public GroupMembershipState(
        @Nullable Input<String> arn,
        @Nullable Input<String> awsAccountId,
        @Nullable Input<String> groupName,
        @Nullable Input<String> memberName,
        @Nullable Input<String> namespace) {
        this.arn = arn;
        this.awsAccountId = awsAccountId;
        this.groupName = groupName;
        this.memberName = memberName;
        this.namespace = namespace;
    }

    private GroupMembershipState() {
        this.arn = Input.empty();
        this.awsAccountId = Input.empty();
        this.groupName = Input.empty();
        this.memberName = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> awsAccountId;
        private @Nullable Input<String> groupName;
        private @Nullable Input<String> memberName;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.groupName = defaults.groupName;
    	      this.memberName = defaults.memberName;
    	      this.namespace = defaults.namespace;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAwsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setAwsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder setGroupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }

        public Builder setMemberName(@Nullable Input<String> memberName) {
            this.memberName = memberName;
            return this;
        }

        public Builder setMemberName(@Nullable String memberName) {
            this.memberName = Input.ofNullable(memberName);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }
        public GroupMembershipState build() {
            return new GroupMembershipState(arn, awsAccountId, groupName, memberName, namespace);
        }
    }
}
