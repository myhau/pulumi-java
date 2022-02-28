// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionIamActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionIamActionDefinitionArgs Empty = new BudgetActionDefinitionIamActionDefinitionArgs();

    /**
     * A list of groups to be attached. There must be at least one group.
     * 
     */
    @InputImport(name="groups")
      private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    /**
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * 
     */
    @InputImport(name="policyArn", required=true)
      private final Input<String> policyArn;

    public Input<String> getPolicyArn() {
        return this.policyArn;
    }

    /**
     * A list of roles to be attached. There must be at least one role.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<String>> roles;

    public Input<List<String>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    /**
     * A list of users to be attached. There must be at least one user.
     * 
     */
    @InputImport(name="users")
      private final @Nullable Input<List<String>> users;

    public Input<List<String>> getUsers() {
        return this.users == null ? Input.empty() : this.users;
    }

    public BudgetActionDefinitionIamActionDefinitionArgs(
        @Nullable Input<List<String>> groups,
        Input<String> policyArn,
        @Nullable Input<List<String>> roles,
        @Nullable Input<List<String>> users) {
        this.groups = groups;
        this.policyArn = Objects.requireNonNull(policyArn, "expected parameter 'policyArn' to be non-null");
        this.roles = roles;
        this.users = users;
    }

    private BudgetActionDefinitionIamActionDefinitionArgs() {
        this.groups = Input.empty();
        this.policyArn = Input.empty();
        this.roles = Input.empty();
        this.users = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionIamActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groups;
        private Input<String> policyArn;
        private @Nullable Input<List<String>> roles;
        private @Nullable Input<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionIamActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.policyArn = defaults.policyArn;
    	      this.roles = defaults.roles;
    	      this.users = defaults.users;
        }

        public Builder setGroups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
        }

        public Builder setPolicyArn(Input<String> policyArn) {
            this.policyArn = Objects.requireNonNull(policyArn);
            return this;
        }

        public Builder setPolicyArn(String policyArn) {
            this.policyArn = Input.of(Objects.requireNonNull(policyArn));
            return this;
        }

        public Builder setRoles(@Nullable Input<List<String>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setRoles(@Nullable List<String> roles) {
            this.roles = Input.ofNullable(roles);
            return this;
        }

        public Builder setUsers(@Nullable Input<List<String>> users) {
            this.users = users;
            return this;
        }

        public Builder setUsers(@Nullable List<String> users) {
            this.users = Input.ofNullable(users);
            return this;
        }
        public BudgetActionDefinitionIamActionDefinitionArgs build() {
            return new BudgetActionDefinitionIamActionDefinitionArgs(groups, policyArn, roles, users);
        }
    }
}
