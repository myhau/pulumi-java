// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedPolicyAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPolicyAttachmentArgs Empty = new ManagedPolicyAttachmentArgs();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @InputImport(name="instanceArn", required=true)
      private final Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    @InputImport(name="managedPolicyArn", required=true)
      private final Input<String> managedPolicyArn;

    public Input<String> getManagedPolicyArn() {
        return this.managedPolicyArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @InputImport(name="permissionSetArn", required=true)
      private final Input<String> permissionSetArn;

    public Input<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }

    public ManagedPolicyAttachmentArgs(
        Input<String> instanceArn,
        Input<String> managedPolicyArn,
        Input<String> permissionSetArn) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.managedPolicyArn = Objects.requireNonNull(managedPolicyArn, "expected parameter 'managedPolicyArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
    }

    private ManagedPolicyAttachmentArgs() {
        this.instanceArn = Input.empty();
        this.managedPolicyArn = Input.empty();
        this.permissionSetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceArn;
        private Input<String> managedPolicyArn;
        private Input<String> permissionSetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPolicyAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.managedPolicyArn = defaults.managedPolicyArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
        }

        public Builder setInstanceArn(Input<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Input.of(Objects.requireNonNull(instanceArn));
            return this;
        }

        public Builder setManagedPolicyArn(Input<String> managedPolicyArn) {
            this.managedPolicyArn = Objects.requireNonNull(managedPolicyArn);
            return this;
        }

        public Builder setManagedPolicyArn(String managedPolicyArn) {
            this.managedPolicyArn = Input.of(Objects.requireNonNull(managedPolicyArn));
            return this;
        }

        public Builder setPermissionSetArn(Input<String> permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }

        public Builder setPermissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Input.of(Objects.requireNonNull(permissionSetArn));
            return this;
        }
        public ManagedPolicyAttachmentArgs build() {
            return new ManagedPolicyAttachmentArgs(instanceArn, managedPolicyArn, permissionSetArn);
        }
    }
}
