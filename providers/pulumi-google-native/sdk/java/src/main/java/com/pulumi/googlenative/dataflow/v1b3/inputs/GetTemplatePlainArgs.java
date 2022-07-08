// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplatePlainArgs Empty = new GetTemplatePlainArgs();

    @Import(name="gcsPath", required=true)
    private String gcsPath;

    public String gcsPath() {
        return this.gcsPath;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetTemplatePlainArgs() {}

    private GetTemplatePlainArgs(GetTemplatePlainArgs $) {
        this.gcsPath = $.gcsPath;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplatePlainArgs $;

        public Builder() {
            $ = new GetTemplatePlainArgs();
        }

        public Builder(GetTemplatePlainArgs defaults) {
            $ = new GetTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder gcsPath(String gcsPath) {
            $.gcsPath = gcsPath;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetTemplatePlainArgs build() {
            $.gcsPath = Objects.requireNonNull($.gcsPath, "expected parameter 'gcsPath' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
