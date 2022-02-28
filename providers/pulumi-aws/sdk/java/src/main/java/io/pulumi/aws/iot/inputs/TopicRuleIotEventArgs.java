// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleIotEventArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleIotEventArgs Empty = new TopicRuleIotEventArgs();

    /**
     * The name of the AWS IoT Events input.
     * 
     */
    @InputImport(name="inputName", required=true)
      private final Input<String> inputName;

    public Input<String> getInputName() {
        return this.inputName;
    }

    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId == null ? Input.empty() : this.messageId;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleIotEventArgs(
        Input<String> inputName,
        @Nullable Input<String> messageId,
        Input<String> roleArn) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.messageId = messageId;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleIotEventArgs() {
        this.inputName = Input.empty();
        this.messageId = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> inputName;
        private @Nullable Input<String> messageId;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.messageId = defaults.messageId;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setInputName(Input<String> inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Input.of(Objects.requireNonNull(inputName));
            return this;
        }

        public Builder setMessageId(@Nullable Input<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = Input.ofNullable(messageId);
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
        public TopicRuleIotEventArgs build() {
            return new TopicRuleIotEventArgs(inputName, messageId, roleArn);
        }
    }
}
