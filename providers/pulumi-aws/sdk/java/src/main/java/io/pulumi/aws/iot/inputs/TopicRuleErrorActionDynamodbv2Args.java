// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2PutItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionDynamodbv2Args extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionDynamodbv2Args Empty = new TopicRuleErrorActionDynamodbv2Args();

    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    @InputImport(name="putItem")
      private final @Nullable Input<TopicRuleErrorActionDynamodbv2PutItemArgs> putItem;

    public Input<TopicRuleErrorActionDynamodbv2PutItemArgs> getPutItem() {
        return this.putItem == null ? Input.empty() : this.putItem;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleErrorActionDynamodbv2Args(
        @Nullable Input<TopicRuleErrorActionDynamodbv2PutItemArgs> putItem,
        Input<String> roleArn) {
        this.putItem = putItem;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleErrorActionDynamodbv2Args() {
        this.putItem = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionDynamodbv2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRuleErrorActionDynamodbv2PutItemArgs> putItem;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionDynamodbv2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setPutItem(@Nullable Input<TopicRuleErrorActionDynamodbv2PutItemArgs> putItem) {
            this.putItem = putItem;
            return this;
        }

        public Builder setPutItem(@Nullable TopicRuleErrorActionDynamodbv2PutItemArgs putItem) {
            this.putItem = Input.ofNullable(putItem);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public TopicRuleErrorActionDynamodbv2Args build() {
            return new TopicRuleErrorActionDynamodbv2Args(putItem, roleArn);
        }
    }
}
