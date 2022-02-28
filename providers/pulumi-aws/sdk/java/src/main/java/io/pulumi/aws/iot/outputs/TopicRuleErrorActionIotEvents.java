// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleErrorActionIotEvents {
    /**
     * The name of the AWS IoT Events input.
     * 
     */
    private final String inputName;
    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     * 
     */
    private final @Nullable String messageId;
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"inputName","messageId","roleArn"})
    private TopicRuleErrorActionIotEvents(
        String inputName,
        @Nullable String messageId,
        String roleArn) {
        this.inputName = Objects.requireNonNull(inputName);
        this.messageId = messageId;
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * The name of the AWS IoT Events input.
     * 
     */
    public String getInputName() {
        return this.inputName;
    }
    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     * 
     */
    public Optional<String> getMessageId() {
        return Optional.ofNullable(this.messageId);
    }
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionIotEvents defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;
        private @Nullable String messageId;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionIotEvents defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.messageId = defaults.messageId;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleErrorActionIotEvents build() {
            return new TopicRuleErrorActionIotEvents(inputName, messageId, roleArn);
        }
    }
}
