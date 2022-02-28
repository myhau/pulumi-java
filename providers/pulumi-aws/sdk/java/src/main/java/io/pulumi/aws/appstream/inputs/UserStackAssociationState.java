// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserStackAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final UserStackAssociationState Empty = new UserStackAssociationState();

    /**
     * Authentication type for the user.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @InputImport(name="sendEmailNotification")
      private final @Nullable Input<Boolean> sendEmailNotification;

    public Input<Boolean> getSendEmailNotification() {
        return this.sendEmailNotification == null ? Input.empty() : this.sendEmailNotification;
    }

    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @InputImport(name="stackName")
      private final @Nullable Input<String> stackName;

    public Input<String> getStackName() {
        return this.stackName == null ? Input.empty() : this.stackName;
    }

    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserStackAssociationState(
        @Nullable Input<String> authenticationType,
        @Nullable Input<Boolean> sendEmailNotification,
        @Nullable Input<String> stackName,
        @Nullable Input<String> userName) {
        this.authenticationType = authenticationType;
        this.sendEmailNotification = sendEmailNotification;
        this.stackName = stackName;
        this.userName = userName;
    }

    private UserStackAssociationState() {
        this.authenticationType = Input.empty();
        this.sendEmailNotification = Input.empty();
        this.stackName = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserStackAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authenticationType;
        private @Nullable Input<Boolean> sendEmailNotification;
        private @Nullable Input<String> stackName;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserStackAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.stackName = defaults.stackName;
    	      this.userName = defaults.userName;
        }

        public Builder setAuthenticationType(@Nullable Input<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setSendEmailNotification(@Nullable Input<Boolean> sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }

        public Builder setSendEmailNotification(@Nullable Boolean sendEmailNotification) {
            this.sendEmailNotification = Input.ofNullable(sendEmailNotification);
            return this;
        }

        public Builder setStackName(@Nullable Input<String> stackName) {
            this.stackName = stackName;
            return this;
        }

        public Builder setStackName(@Nullable String stackName) {
            this.stackName = Input.ofNullable(stackName);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public UserStackAssociationState build() {
            return new UserStackAssociationState(authenticationType, sendEmailNotification, stackName, userName);
        }
    }
}
