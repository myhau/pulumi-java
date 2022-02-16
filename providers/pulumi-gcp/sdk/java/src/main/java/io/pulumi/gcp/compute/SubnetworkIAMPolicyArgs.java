// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkIAMPolicyArgs Empty = new SubnetworkIAMPolicyArgs();

    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="subnetwork", required=true)
    private final Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork;
    }

    public SubnetworkIAMPolicyArgs(
        Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> subnetwork) {
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private SubnetworkIAMPolicyArgs() {
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.subnetwork = defaults.subnetwork;
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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

        public SubnetworkIAMPolicyArgs build() {
            return new SubnetworkIAMPolicyArgs(policyData, project, region, subnetwork);
        }
    }
}