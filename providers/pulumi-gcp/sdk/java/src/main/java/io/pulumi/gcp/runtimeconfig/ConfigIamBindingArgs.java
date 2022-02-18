// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigIamBindingArgs Empty = new ConfigIamBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<ConfigIamBindingConditionArgs> condition;

    public Input<ConfigIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="config", required=true)
    private final Input<String> config;

    public Input<String> getConfig() {
        return this.config;
    }

    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.runtimeconfig.ConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ConfigIamBindingArgs(
        @Nullable Input<ConfigIamBindingConditionArgs> condition,
        Input<String> config,
        Input<List<String>> members,
        @Nullable Input<String> project,
        Input<String> role) {
        this.condition = condition;
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ConfigIamBindingArgs() {
        this.condition = Input.empty();
        this.config = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigIamBindingConditionArgs> condition;
        private Input<String> config;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.config = defaults.config;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<ConfigIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ConfigIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setConfig(Input<String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(String config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public ConfigIamBindingArgs build() {
            return new ConfigIamBindingArgs(condition, config, members, project, role);
        }
    }
}
