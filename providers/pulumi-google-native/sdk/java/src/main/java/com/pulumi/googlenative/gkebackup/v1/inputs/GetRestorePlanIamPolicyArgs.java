// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestorePlanIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestorePlanIamPolicyArgs Empty = new GetRestorePlanIamPolicyArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="restorePlanId", required=true)
    private Output<String> restorePlanId;

    public Output<String> restorePlanId() {
        return this.restorePlanId;
    }

    private GetRestorePlanIamPolicyArgs() {}

    private GetRestorePlanIamPolicyArgs(GetRestorePlanIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.restorePlanId = $.restorePlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestorePlanIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestorePlanIamPolicyArgs $;

        public Builder() {
            $ = new GetRestorePlanIamPolicyArgs();
        }

        public Builder(GetRestorePlanIamPolicyArgs defaults) {
            $ = new GetRestorePlanIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder restorePlanId(Output<String> restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public Builder restorePlanId(String restorePlanId) {
            return restorePlanId(Output.of(restorePlanId));
        }

        public GetRestorePlanIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            return $;
        }
    }

}
