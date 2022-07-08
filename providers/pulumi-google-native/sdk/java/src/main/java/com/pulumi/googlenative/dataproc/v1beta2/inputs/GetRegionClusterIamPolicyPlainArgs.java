// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionClusterIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionClusterIamPolicyPlainArgs Empty = new GetRegionClusterIamPolicyPlainArgs();

    @Import(name="clusterId", required=true)
    private String clusterId;

    public String clusterId() {
        return this.clusterId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="regionId", required=true)
    private String regionId;

    public String regionId() {
        return this.regionId;
    }

    private GetRegionClusterIamPolicyPlainArgs() {}

    private GetRegionClusterIamPolicyPlainArgs(GetRegionClusterIamPolicyPlainArgs $) {
        this.clusterId = $.clusterId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.regionId = $.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionClusterIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionClusterIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetRegionClusterIamPolicyPlainArgs();
        }

        public Builder(GetRegionClusterIamPolicyPlainArgs defaults) {
            $ = new GetRegionClusterIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder regionId(String regionId) {
            $.regionId = regionId;
            return this;
        }

        public GetRegionClusterIamPolicyPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.regionId = Objects.requireNonNull($.regionId, "expected parameter 'regionId' to be non-null");
            return $;
        }
    }

}
