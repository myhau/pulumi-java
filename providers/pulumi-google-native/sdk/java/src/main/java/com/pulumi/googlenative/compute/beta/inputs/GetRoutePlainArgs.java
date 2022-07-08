// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoutePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoutePlainArgs Empty = new GetRoutePlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="route", required=true)
    private String route;

    public String route() {
        return this.route;
    }

    private GetRoutePlainArgs() {}

    private GetRoutePlainArgs(GetRoutePlainArgs $) {
        this.project = $.project;
        this.route = $.route;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoutePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoutePlainArgs $;

        public Builder() {
            $ = new GetRoutePlainArgs();
        }

        public Builder(GetRoutePlainArgs defaults) {
            $ = new GetRoutePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder route(String route) {
            $.route = route;
            return this;
        }

        public GetRoutePlainArgs build() {
            $.route = Objects.requireNonNull($.route, "expected parameter 'route' to be non-null");
            return $;
        }
    }

}
