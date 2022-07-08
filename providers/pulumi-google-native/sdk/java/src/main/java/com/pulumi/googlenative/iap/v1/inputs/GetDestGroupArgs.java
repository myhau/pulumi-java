// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iap.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDestGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDestGroupArgs Empty = new GetDestGroupArgs();

    @Import(name="destGroupId", required=true)
    private Output<String> destGroupId;

    public Output<String> destGroupId() {
        return this.destGroupId;
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

    private GetDestGroupArgs() {}

    private GetDestGroupArgs(GetDestGroupArgs $) {
        this.destGroupId = $.destGroupId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDestGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDestGroupArgs $;

        public Builder() {
            $ = new GetDestGroupArgs();
        }

        public Builder(GetDestGroupArgs defaults) {
            $ = new GetDestGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder destGroupId(Output<String> destGroupId) {
            $.destGroupId = destGroupId;
            return this;
        }

        public Builder destGroupId(String destGroupId) {
            return destGroupId(Output.of(destGroupId));
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

        public GetDestGroupArgs build() {
            $.destGroupId = Objects.requireNonNull($.destGroupId, "expected parameter 'destGroupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
