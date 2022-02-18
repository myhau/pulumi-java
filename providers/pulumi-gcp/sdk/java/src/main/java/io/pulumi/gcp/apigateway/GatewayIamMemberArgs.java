// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayIamMemberArgs Empty = new GatewayIamMemberArgs();

    @InputImport(name="condition")
    private final @Nullable Input<GatewayIamMemberConditionArgs> condition;

    public Input<GatewayIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="gateway", required=true)
    private final Input<String> gateway;

    public Input<String> getGateway() {
        return this.gateway;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
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
     * The region of the gateway for the API.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigateway.GatewayIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public GatewayIamMemberArgs(
        @Nullable Input<GatewayIamMemberConditionArgs> condition,
        Input<String> gateway,
        Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role) {
        this.condition = condition;
        this.gateway = Objects.requireNonNull(gateway, "expected parameter 'gateway' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private GatewayIamMemberArgs() {
        this.condition = Input.empty();
        this.gateway = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GatewayIamMemberConditionArgs> condition;
        private Input<String> gateway;
        private Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.gateway = defaults.gateway;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<GatewayIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable GatewayIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setGateway(Input<String> gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }

        public Builder setGateway(String gateway) {
            this.gateway = Input.of(Objects.requireNonNull(gateway));
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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

        public GatewayIamMemberArgs build() {
            return new GatewayIamMemberArgs(condition, gateway, member, project, region, role);
        }
    }
}
