// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFederationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederationArgs Empty = new GetFederationArgs();

    @Import(name="federationId", required=true)
    private Output<String> federationId;

    public Output<String> federationId() {
        return this.federationId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFederationArgs() {}

    private GetFederationArgs(GetFederationArgs $) {
        this.federationId = $.federationId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederationArgs $;

        public Builder() {
            $ = new GetFederationArgs();
        }

        public Builder(GetFederationArgs defaults) {
            $ = new GetFederationArgs(Objects.requireNonNull(defaults));
        }

        public Builder federationId(Output<String> federationId) {
            $.federationId = federationId;
            return this;
        }

        public Builder federationId(String federationId) {
            return federationId(Output.of(federationId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetFederationArgs build() {
            $.federationId = Objects.requireNonNull($.federationId, "expected parameter 'federationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
