// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleErrorActionSqs {
    /**
     * The URL of the Amazon SQS queue.
     * 
     */
    private final String queueUrl;
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;
    /**
     * Specifies whether to use Base64 encoding.
     * 
     */
    private final Boolean useBase64;

    @OutputCustomType.Constructor({"queueUrl","roleArn","useBase64"})
    private TopicRuleErrorActionSqs(
        String queueUrl,
        String roleArn,
        Boolean useBase64) {
        this.queueUrl = Objects.requireNonNull(queueUrl);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.useBase64 = Objects.requireNonNull(useBase64);
    }

    /**
     * The URL of the Amazon SQS queue.
     * 
     */
    public String getQueueUrl() {
        return this.queueUrl;
    }
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * Specifies whether to use Base64 encoding.
     * 
     */
    public Boolean getUseBase64() {
        return this.useBase64;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionSqs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queueUrl;
        private String roleArn;
        private Boolean useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionSqs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder setQueueUrl(String queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setUseBase64(Boolean useBase64) {
            this.useBase64 = Objects.requireNonNull(useBase64);
            return this;
        }
        public TopicRuleErrorActionSqs build() {
            return new TopicRuleErrorActionSqs(queueUrl, roleArn, useBase64);
        }
    }
}
