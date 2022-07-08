// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpecArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpecArgs Empty = new GetSpecArgs();

    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
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

    @Import(name="specId", required=true)
    private Output<String> specId;

    public Output<String> specId() {
        return this.specId;
    }

    @Import(name="versionId", required=true)
    private Output<String> versionId;

    public Output<String> versionId() {
        return this.versionId;
    }

    private GetSpecArgs() {}

    private GetSpecArgs(GetSpecArgs $) {
        this.apiId = $.apiId;
        this.location = $.location;
        this.project = $.project;
        this.specId = $.specId;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpecArgs $;

        public Builder() {
            $ = new GetSpecArgs();
        }

        public Builder(GetSpecArgs defaults) {
            $ = new GetSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
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

        public Builder specId(Output<String> specId) {
            $.specId = specId;
            return this;
        }

        public Builder specId(String specId) {
            return specId(Output.of(specId));
        }

        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public GetSpecArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.specId = Objects.requireNonNull($.specId, "expected parameter 'specId' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
