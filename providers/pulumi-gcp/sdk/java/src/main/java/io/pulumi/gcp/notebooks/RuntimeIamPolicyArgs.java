// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeIamPolicyArgs Empty = new RuntimeIamPolicyArgs();

    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
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
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="runtimeName", required=true)
    private final Input<String> runtimeName;

    public Input<String> getRuntimeName() {
        return this.runtimeName;
    }

    public RuntimeIamPolicyArgs(
        @Nullable Input<String> location,
        Input<String> policyData,
        @Nullable Input<String> project,
        Input<String> runtimeName) {
        this.location = location;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.runtimeName = Objects.requireNonNull(runtimeName, "expected parameter 'runtimeName' to be non-null");
    }

    private RuntimeIamPolicyArgs() {
        this.location = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.runtimeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private Input<String> runtimeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.runtimeName = defaults.runtimeName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
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

        public Builder setRuntimeName(Input<String> runtimeName) {
            this.runtimeName = Objects.requireNonNull(runtimeName);
            return this;
        }

        public Builder setRuntimeName(String runtimeName) {
            this.runtimeName = Input.of(Objects.requireNonNull(runtimeName));
            return this;
        }

        public RuntimeIamPolicyArgs build() {
            return new RuntimeIamPolicyArgs(location, policyData, project, runtimeName);
        }
    }
}
