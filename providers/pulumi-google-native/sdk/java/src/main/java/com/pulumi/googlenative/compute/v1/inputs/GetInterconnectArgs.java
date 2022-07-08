// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterconnectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInterconnectArgs Empty = new GetInterconnectArgs();

    @Import(name="interconnect", required=true)
    private Output<String> interconnect;

    public Output<String> interconnect() {
        return this.interconnect;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInterconnectArgs() {}

    private GetInterconnectArgs(GetInterconnectArgs $) {
        this.interconnect = $.interconnect;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInterconnectArgs $;

        public Builder() {
            $ = new GetInterconnectArgs();
        }

        public Builder(GetInterconnectArgs defaults) {
            $ = new GetInterconnectArgs(Objects.requireNonNull(defaults));
        }

        public Builder interconnect(Output<String> interconnect) {
            $.interconnect = interconnect;
            return this;
        }

        public Builder interconnect(String interconnect) {
            return interconnect(Output.of(interconnect));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetInterconnectArgs build() {
            $.interconnect = Objects.requireNonNull($.interconnect, "expected parameter 'interconnect' to be non-null");
            return $;
        }
    }

}
