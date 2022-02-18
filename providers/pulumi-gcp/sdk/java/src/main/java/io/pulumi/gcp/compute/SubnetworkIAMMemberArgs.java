// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkIAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkIAMMemberArgs Empty = new SubnetworkIAMMemberArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<SubnetworkIAMMemberConditionArgs> condition;

    public Input<SubnetworkIAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
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
     * The GCP region for this subnetwork.
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
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="subnetwork", required=true)
    private final Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork;
    }

    public SubnetworkIAMMemberArgs(
        @Nullable Input<SubnetworkIAMMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role,
        Input<String> subnetwork) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private SubnetworkIAMMemberArgs() {
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkIAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubnetworkIAMMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;
        private Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkIAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setCondition(@Nullable Input<SubnetworkIAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable SubnetworkIAMMemberConditionArgs condition) {
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

        public Builder setSubnetwork(Input<String> subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Input.of(Objects.requireNonNull(subnetwork));
            return this;
        }

        public SubnetworkIAMMemberArgs build() {
            return new SubnetworkIAMMemberArgs(condition, member, project, region, role, subnetwork);
        }
    }
}
