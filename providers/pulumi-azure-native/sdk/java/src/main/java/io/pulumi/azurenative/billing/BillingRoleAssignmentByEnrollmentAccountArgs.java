// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingRoleAssignmentByEnrollmentAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingRoleAssignmentByEnrollmentAccountArgs Empty = new BillingRoleAssignmentByEnrollmentAccountArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @Import(name="billingAccountName", required=true)
      private final Output<String> billingAccountName;

    public Output<String> billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @Import(name="billingRoleAssignmentName")
      private final @Nullable Output<String> billingRoleAssignmentName;

    public Output<String> billingRoleAssignmentName() {
        return this.billingRoleAssignmentName == null ? Codegen.empty() : this.billingRoleAssignmentName;
    }

    /**
     * The ID that uniquely identifies an enrollment account.
     * 
     */
    @Import(name="enrollmentAccountName", required=true)
      private final Output<String> enrollmentAccountName;

    public Output<String> enrollmentAccountName() {
        return this.enrollmentAccountName;
    }

    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @Import(name="principalTenantId")
      private final @Nullable Output<String> principalTenantId;

    public Output<String> principalTenantId() {
        return this.principalTenantId == null ? Codegen.empty() : this.principalTenantId;
    }

    /**
     * The ID of the role definition.
     * 
     */
    @Import(name="roleDefinitionId")
      private final @Nullable Output<String> roleDefinitionId;

    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId == null ? Codegen.empty() : this.roleDefinitionId;
    }

    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Import(name="userAuthenticationType")
      private final @Nullable Output<String> userAuthenticationType;

    public Output<String> userAuthenticationType() {
        return this.userAuthenticationType == null ? Codegen.empty() : this.userAuthenticationType;
    }

    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Import(name="userEmailAddress")
      private final @Nullable Output<String> userEmailAddress;

    public Output<String> userEmailAddress() {
        return this.userEmailAddress == null ? Codegen.empty() : this.userEmailAddress;
    }

    public BillingRoleAssignmentByEnrollmentAccountArgs(
        Output<String> billingAccountName,
        @Nullable Output<String> billingRoleAssignmentName,
        Output<String> enrollmentAccountName,
        @Nullable Output<String> principalId,
        @Nullable Output<String> principalTenantId,
        @Nullable Output<String> roleDefinitionId,
        @Nullable Output<String> userAuthenticationType,
        @Nullable Output<String> userEmailAddress) {
        this.billingAccountName = Objects.requireNonNull(billingAccountName, "expected parameter 'billingAccountName' to be non-null");
        this.billingRoleAssignmentName = billingRoleAssignmentName;
        this.enrollmentAccountName = Objects.requireNonNull(enrollmentAccountName, "expected parameter 'enrollmentAccountName' to be non-null");
        this.principalId = principalId;
        this.principalTenantId = principalTenantId;
        this.roleDefinitionId = roleDefinitionId;
        this.userAuthenticationType = userAuthenticationType;
        this.userEmailAddress = userEmailAddress;
    }

    private BillingRoleAssignmentByEnrollmentAccountArgs() {
        this.billingAccountName = Codegen.empty();
        this.billingRoleAssignmentName = Codegen.empty();
        this.enrollmentAccountName = Codegen.empty();
        this.principalId = Codegen.empty();
        this.principalTenantId = Codegen.empty();
        this.roleDefinitionId = Codegen.empty();
        this.userAuthenticationType = Codegen.empty();
        this.userEmailAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingRoleAssignmentByEnrollmentAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccountName;
        private @Nullable Output<String> billingRoleAssignmentName;
        private Output<String> enrollmentAccountName;
        private @Nullable Output<String> principalId;
        private @Nullable Output<String> principalTenantId;
        private @Nullable Output<String> roleDefinitionId;
        private @Nullable Output<String> userAuthenticationType;
        private @Nullable Output<String> userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingRoleAssignmentByEnrollmentAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountName = defaults.billingAccountName;
    	      this.billingRoleAssignmentName = defaults.billingRoleAssignmentName;
    	      this.enrollmentAccountName = defaults.enrollmentAccountName;
    	      this.principalId = defaults.principalId;
    	      this.principalTenantId = defaults.principalTenantId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.userAuthenticationType = defaults.userAuthenticationType;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder billingAccountName(Output<String> billingAccountName) {
            this.billingAccountName = Objects.requireNonNull(billingAccountName);
            return this;
        }
        public Builder billingAccountName(String billingAccountName) {
            this.billingAccountName = Output.of(Objects.requireNonNull(billingAccountName));
            return this;
        }
        public Builder billingRoleAssignmentName(@Nullable Output<String> billingRoleAssignmentName) {
            this.billingRoleAssignmentName = billingRoleAssignmentName;
            return this;
        }
        public Builder billingRoleAssignmentName(@Nullable String billingRoleAssignmentName) {
            this.billingRoleAssignmentName = Codegen.ofNullable(billingRoleAssignmentName);
            return this;
        }
        public Builder enrollmentAccountName(Output<String> enrollmentAccountName) {
            this.enrollmentAccountName = Objects.requireNonNull(enrollmentAccountName);
            return this;
        }
        public Builder enrollmentAccountName(String enrollmentAccountName) {
            this.enrollmentAccountName = Output.of(Objects.requireNonNull(enrollmentAccountName));
            return this;
        }
        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }
        public Builder principalTenantId(@Nullable Output<String> principalTenantId) {
            this.principalTenantId = principalTenantId;
            return this;
        }
        public Builder principalTenantId(@Nullable String principalTenantId) {
            this.principalTenantId = Codegen.ofNullable(principalTenantId);
            return this;
        }
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }
        public Builder roleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = Codegen.ofNullable(roleDefinitionId);
            return this;
        }
        public Builder userAuthenticationType(@Nullable Output<String> userAuthenticationType) {
            this.userAuthenticationType = userAuthenticationType;
            return this;
        }
        public Builder userAuthenticationType(@Nullable String userAuthenticationType) {
            this.userAuthenticationType = Codegen.ofNullable(userAuthenticationType);
            return this;
        }
        public Builder userEmailAddress(@Nullable Output<String> userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }
        public Builder userEmailAddress(@Nullable String userEmailAddress) {
            this.userEmailAddress = Codegen.ofNullable(userEmailAddress);
            return this;
        }        public BillingRoleAssignmentByEnrollmentAccountArgs build() {
            return new BillingRoleAssignmentByEnrollmentAccountArgs(billingAccountName, billingRoleAssignmentName, enrollmentAccountName, principalId, principalTenantId, roleDefinitionId, userAuthenticationType, userEmailAddress);
        }
    }
}
