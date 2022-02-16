// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretIamMemberArgs Empty = new SecretIamMemberArgs();

    @InputImport(name="condition")
    private final @Nullable Input<SecretIamMemberConditionArgs> condition;

    public Input<SecretIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    @InputImport(name="secretId", required=true)
    private final Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId;
    }

    public SecretIamMemberArgs(
        @Nullable Input<SecretIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role,
        Input<String> secretId) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private SecretIamMemberArgs() {
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.secretId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecretIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;
        private Input<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.secretId = defaults.secretId;
        }

        public Builder setCondition(@Nullable Input<SecretIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable SecretIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
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

        public Builder setSecretId(Input<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Input.of(Objects.requireNonNull(secretId));
            return this;
        }

        public SecretIamMemberArgs build() {
            return new SecretIamMemberArgs(condition, member, project, role, secretId);
        }
    }
}