// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointPolicyIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointPolicyIamPolicyPlainArgs Empty = new GetEndpointPolicyIamPolicyPlainArgs();

    @Import(name="endpointPolicyId", required=true)
    private String endpointPolicyId;

    public String endpointPolicyId() {
        return this.endpointPolicyId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
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

    private GetEndpointPolicyIamPolicyPlainArgs() {}

    private GetEndpointPolicyIamPolicyPlainArgs(GetEndpointPolicyIamPolicyPlainArgs $) {
        this.endpointPolicyId = $.endpointPolicyId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointPolicyIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointPolicyIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetEndpointPolicyIamPolicyPlainArgs();
        }

        public Builder(GetEndpointPolicyIamPolicyPlainArgs defaults) {
            $ = new GetEndpointPolicyIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointPolicyId(String endpointPolicyId) {
            $.endpointPolicyId = endpointPolicyId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
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

        public GetEndpointPolicyIamPolicyPlainArgs build() {
            $.endpointPolicyId = Objects.requireNonNull($.endpointPolicyId, "expected parameter 'endpointPolicyId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
