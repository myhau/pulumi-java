// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationPolicyIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationPolicyIamPolicyPlainArgs Empty = new GetAuthorizationPolicyIamPolicyPlainArgs();

    @Import(name="authorizationPolicyId", required=true)
    private String authorizationPolicyId;

    public String authorizationPolicyId() {
        return this.authorizationPolicyId;
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

    private GetAuthorizationPolicyIamPolicyPlainArgs() {}

    private GetAuthorizationPolicyIamPolicyPlainArgs(GetAuthorizationPolicyIamPolicyPlainArgs $) {
        this.authorizationPolicyId = $.authorizationPolicyId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationPolicyIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationPolicyIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetAuthorizationPolicyIamPolicyPlainArgs();
        }

        public Builder(GetAuthorizationPolicyIamPolicyPlainArgs defaults) {
            $ = new GetAuthorizationPolicyIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationPolicyId(String authorizationPolicyId) {
            $.authorizationPolicyId = authorizationPolicyId;
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

        public GetAuthorizationPolicyIamPolicyPlainArgs build() {
            $.authorizationPolicyId = Objects.requireNonNull($.authorizationPolicyId, "expected parameter 'authorizationPolicyId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
