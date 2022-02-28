// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberArgs Empty = new MemberArgs();

    /**
     * AWS account ID for member account.
     * 
     */
    @InputImport(name="accountId", required=true)
      private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    @InputImport(name="detectorId", required=true)
      private final Input<String> detectorId;

    public Input<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    @InputImport(name="disableEmailNotification")
      private final @Nullable Input<Boolean> disableEmailNotification;

    public Input<Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification == null ? Input.empty() : this.disableEmailNotification;
    }

    /**
     * Email address for member account.
     * 
     */
    @InputImport(name="email", required=true)
      private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * Message for invitation.
     * 
     */
    @InputImport(name="invitationMessage")
      private final @Nullable Input<String> invitationMessage;

    public Input<String> getInvitationMessage() {
        return this.invitationMessage == null ? Input.empty() : this.invitationMessage;
    }

    /**
     * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    @InputImport(name="invite")
      private final @Nullable Input<Boolean> invite;

    public Input<Boolean> getInvite() {
        return this.invite == null ? Input.empty() : this.invite;
    }

    public MemberArgs(
        Input<String> accountId,
        Input<String> detectorId,
        @Nullable Input<Boolean> disableEmailNotification,
        Input<String> email,
        @Nullable Input<String> invitationMessage,
        @Nullable Input<Boolean> invite) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.disableEmailNotification = disableEmailNotification;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.invitationMessage = invitationMessage;
        this.invite = invite;
    }

    private MemberArgs() {
        this.accountId = Input.empty();
        this.detectorId = Input.empty();
        this.disableEmailNotification = Input.empty();
        this.email = Input.empty();
        this.invitationMessage = Input.empty();
        this.invite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<String> detectorId;
        private @Nullable Input<Boolean> disableEmailNotification;
        private Input<String> email;
        private @Nullable Input<String> invitationMessage;
        private @Nullable Input<Boolean> invite;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.detectorId = defaults.detectorId;
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.email = defaults.email;
    	      this.invitationMessage = defaults.invitationMessage;
    	      this.invite = defaults.invite;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setDetectorId(Input<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder setDetectorId(String detectorId) {
            this.detectorId = Input.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder setDisableEmailNotification(@Nullable Input<Boolean> disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }

        public Builder setDisableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = Input.ofNullable(disableEmailNotification);
            return this;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setInvitationMessage(@Nullable Input<String> invitationMessage) {
            this.invitationMessage = invitationMessage;
            return this;
        }

        public Builder setInvitationMessage(@Nullable String invitationMessage) {
            this.invitationMessage = Input.ofNullable(invitationMessage);
            return this;
        }

        public Builder setInvite(@Nullable Input<Boolean> invite) {
            this.invite = invite;
            return this;
        }

        public Builder setInvite(@Nullable Boolean invite) {
            this.invite = Input.ofNullable(invite);
            return this;
        }
        public MemberArgs build() {
            return new MemberArgs(accountId, detectorId, disableEmailNotification, email, invitationMessage, invite);
        }
    }
}
