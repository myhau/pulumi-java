// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamMemberArgs Empty = new EnvironmentIamMemberArgs();

    @InputImport(name="condition")
    private final @Nullable Input<EnvironmentIamMemberConditionArgs> condition;

    public Input<EnvironmentIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="envId", required=true)
    private final Input<String> envId;

    public Input<String> getEnvId() {
        return this.envId;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public EnvironmentIamMemberArgs(
        @Nullable Input<EnvironmentIamMemberConditionArgs> condition,
        Input<String> envId,
        Input<String> member,
        Input<String> orgId,
        Input<String> role) {
        this.condition = condition;
        this.envId = Objects.requireNonNull(envId, "expected parameter 'envId' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private EnvironmentIamMemberArgs() {
        this.condition = Input.empty();
        this.envId = Input.empty();
        this.member = Input.empty();
        this.orgId = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentIamMemberConditionArgs> condition;
        private Input<String> envId;
        private Input<String> member;
        private Input<String> orgId;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.envId = defaults.envId;
    	      this.member = defaults.member;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<EnvironmentIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable EnvironmentIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEnvId(Input<String> envId) {
            this.envId = Objects.requireNonNull(envId);
            return this;
        }

        public Builder setEnvId(String envId) {
            this.envId = Input.of(Objects.requireNonNull(envId));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setOrgId(Input<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder setOrgId(String orgId) {
            this.orgId = Input.of(Objects.requireNonNull(orgId));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public EnvironmentIamMemberArgs build() {
            return new EnvironmentIamMemberArgs(condition, envId, member, orgId, role);
        }
    }
}
