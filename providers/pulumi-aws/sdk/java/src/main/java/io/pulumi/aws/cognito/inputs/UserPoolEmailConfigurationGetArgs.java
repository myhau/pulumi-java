// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolEmailConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolEmailConfigurationGetArgs Empty = new UserPoolEmailConfigurationGetArgs();

    /**
     * Email configuration set name from SES.
     * 
     */
    @InputImport(name="configurationSet")
      private final @Nullable Input<String> configurationSet;

    public Input<String> getConfigurationSet() {
        return this.configurationSet == null ? Input.empty() : this.configurationSet;
    }

    /**
     * Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    @InputImport(name="emailSendingAccount")
      private final @Nullable Input<String> emailSendingAccount;

    public Input<String> getEmailSendingAccount() {
        return this.emailSendingAccount == null ? Input.empty() : this.emailSendingAccount;
    }

    /**
     * Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    @InputImport(name="fromEmailAddress")
      private final @Nullable Input<String> fromEmailAddress;

    public Input<String> getFromEmailAddress() {
        return this.fromEmailAddress == null ? Input.empty() : this.fromEmailAddress;
    }

    /**
     * REPLY-TO email address.
     * 
     */
    @InputImport(name="replyToEmailAddress")
      private final @Nullable Input<String> replyToEmailAddress;

    public Input<String> getReplyToEmailAddress() {
        return this.replyToEmailAddress == null ? Input.empty() : this.replyToEmailAddress;
    }

    /**
     * ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    @InputImport(name="sourceArn")
      private final @Nullable Input<String> sourceArn;

    public Input<String> getSourceArn() {
        return this.sourceArn == null ? Input.empty() : this.sourceArn;
    }

    public UserPoolEmailConfigurationGetArgs(
        @Nullable Input<String> configurationSet,
        @Nullable Input<String> emailSendingAccount,
        @Nullable Input<String> fromEmailAddress,
        @Nullable Input<String> replyToEmailAddress,
        @Nullable Input<String> sourceArn) {
        this.configurationSet = configurationSet;
        this.emailSendingAccount = emailSendingAccount;
        this.fromEmailAddress = fromEmailAddress;
        this.replyToEmailAddress = replyToEmailAddress;
        this.sourceArn = sourceArn;
    }

    private UserPoolEmailConfigurationGetArgs() {
        this.configurationSet = Input.empty();
        this.emailSendingAccount = Input.empty();
        this.fromEmailAddress = Input.empty();
        this.replyToEmailAddress = Input.empty();
        this.sourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolEmailConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationSet;
        private @Nullable Input<String> emailSendingAccount;
        private @Nullable Input<String> fromEmailAddress;
        private @Nullable Input<String> replyToEmailAddress;
        private @Nullable Input<String> sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolEmailConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationSet = defaults.configurationSet;
    	      this.emailSendingAccount = defaults.emailSendingAccount;
    	      this.fromEmailAddress = defaults.fromEmailAddress;
    	      this.replyToEmailAddress = defaults.replyToEmailAddress;
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setConfigurationSet(@Nullable Input<String> configurationSet) {
            this.configurationSet = configurationSet;
            return this;
        }

        public Builder setConfigurationSet(@Nullable String configurationSet) {
            this.configurationSet = Input.ofNullable(configurationSet);
            return this;
        }

        public Builder setEmailSendingAccount(@Nullable Input<String> emailSendingAccount) {
            this.emailSendingAccount = emailSendingAccount;
            return this;
        }

        public Builder setEmailSendingAccount(@Nullable String emailSendingAccount) {
            this.emailSendingAccount = Input.ofNullable(emailSendingAccount);
            return this;
        }

        public Builder setFromEmailAddress(@Nullable Input<String> fromEmailAddress) {
            this.fromEmailAddress = fromEmailAddress;
            return this;
        }

        public Builder setFromEmailAddress(@Nullable String fromEmailAddress) {
            this.fromEmailAddress = Input.ofNullable(fromEmailAddress);
            return this;
        }

        public Builder setReplyToEmailAddress(@Nullable Input<String> replyToEmailAddress) {
            this.replyToEmailAddress = replyToEmailAddress;
            return this;
        }

        public Builder setReplyToEmailAddress(@Nullable String replyToEmailAddress) {
            this.replyToEmailAddress = Input.ofNullable(replyToEmailAddress);
            return this;
        }

        public Builder setSourceArn(@Nullable Input<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = Input.ofNullable(sourceArn);
            return this;
        }
        public UserPoolEmailConfigurationGetArgs build() {
            return new UserPoolEmailConfigurationGetArgs(configurationSet, emailSendingAccount, fromEmailAddress, replyToEmailAddress, sourceArn);
        }
    }
}
