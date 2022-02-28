// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleBounceActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleBounceActionArgs Empty = new ReceiptRuleBounceActionArgs();

    /**
     * The message to send
     * 
     */
    @InputImport(name="message", required=true)
      private final Input<String> message;

    public Input<String> getMessage() {
        return this.message;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @InputImport(name="position", required=true)
      private final Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position;
    }

    /**
     * The email address of the sender
     * 
     */
    @InputImport(name="sender", required=true)
      private final Input<String> sender;

    public Input<String> getSender() {
        return this.sender;
    }

    /**
     * The RFC 5321 SMTP reply code
     * 
     */
    @InputImport(name="smtpReplyCode", required=true)
      private final Input<String> smtpReplyCode;

    public Input<String> getSmtpReplyCode() {
        return this.smtpReplyCode;
    }

    /**
     * The RFC 3463 SMTP enhanced status code
     * 
     */
    @InputImport(name="statusCode")
      private final @Nullable Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode == null ? Input.empty() : this.statusCode;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @InputImport(name="topicArn")
      private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public ReceiptRuleBounceActionArgs(
        Input<String> message,
        Input<Integer> position,
        Input<String> sender,
        Input<String> smtpReplyCode,
        @Nullable Input<String> statusCode,
        @Nullable Input<String> topicArn) {
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.sender = Objects.requireNonNull(sender, "expected parameter 'sender' to be non-null");
        this.smtpReplyCode = Objects.requireNonNull(smtpReplyCode, "expected parameter 'smtpReplyCode' to be non-null");
        this.statusCode = statusCode;
        this.topicArn = topicArn;
    }

    private ReceiptRuleBounceActionArgs() {
        this.message = Input.empty();
        this.position = Input.empty();
        this.sender = Input.empty();
        this.smtpReplyCode = Input.empty();
        this.statusCode = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleBounceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> message;
        private Input<Integer> position;
        private Input<String> sender;
        private Input<String> smtpReplyCode;
        private @Nullable Input<String> statusCode;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleBounceActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.position = defaults.position;
    	      this.sender = defaults.sender;
    	      this.smtpReplyCode = defaults.smtpReplyCode;
    	      this.statusCode = defaults.statusCode;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setMessage(Input<String> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Input.of(Objects.requireNonNull(message));
            return this;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }

        public Builder setSender(Input<String> sender) {
            this.sender = Objects.requireNonNull(sender);
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = Input.of(Objects.requireNonNull(sender));
            return this;
        }

        public Builder setSmtpReplyCode(Input<String> smtpReplyCode) {
            this.smtpReplyCode = Objects.requireNonNull(smtpReplyCode);
            return this;
        }

        public Builder setSmtpReplyCode(String smtpReplyCode) {
            this.smtpReplyCode = Input.of(Objects.requireNonNull(smtpReplyCode));
            return this;
        }

        public Builder setStatusCode(@Nullable Input<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = Input.ofNullable(statusCode);
            return this;
        }

        public Builder setTopicArn(@Nullable Input<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = Input.ofNullable(topicArn);
            return this;
        }
        public ReceiptRuleBounceActionArgs build() {
            return new ReceiptRuleBounceActionArgs(message, position, sender, smtpReplyCode, statusCode, topicArn);
        }
    }
}
