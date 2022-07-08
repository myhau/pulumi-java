// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientGatewayIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientGatewayIamPolicyPlainArgs Empty = new GetClientGatewayIamPolicyPlainArgs();

    @Import(name="clientGatewayId", required=true)
    private String clientGatewayId;

    public String clientGatewayId() {
        return this.clientGatewayId;
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

    private GetClientGatewayIamPolicyPlainArgs() {}

    private GetClientGatewayIamPolicyPlainArgs(GetClientGatewayIamPolicyPlainArgs $) {
        this.clientGatewayId = $.clientGatewayId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientGatewayIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientGatewayIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetClientGatewayIamPolicyPlainArgs();
        }

        public Builder(GetClientGatewayIamPolicyPlainArgs defaults) {
            $ = new GetClientGatewayIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientGatewayId(String clientGatewayId) {
            $.clientGatewayId = clientGatewayId;
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

        public GetClientGatewayIamPolicyPlainArgs build() {
            $.clientGatewayId = Objects.requireNonNull($.clientGatewayId, "expected parameter 'clientGatewayId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
