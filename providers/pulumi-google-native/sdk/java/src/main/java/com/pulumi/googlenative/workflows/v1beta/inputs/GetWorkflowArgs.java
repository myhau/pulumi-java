// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkflowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowArgs Empty = new GetWorkflowArgs();

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

    @Import(name="workflowId", required=true)
    private Output<String> workflowId;

    public Output<String> workflowId() {
        return this.workflowId;
    }

    private GetWorkflowArgs() {}

    private GetWorkflowArgs(GetWorkflowArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkflowArgs $;

        public Builder() {
            $ = new GetWorkflowArgs();
        }

        public Builder(GetWorkflowArgs defaults) {
            $ = new GetWorkflowArgs(Objects.requireNonNull(defaults));
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

        public Builder workflowId(Output<String> workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        public Builder workflowId(String workflowId) {
            return workflowId(Output.of(workflowId));
        }

        public GetWorkflowArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.workflowId = Objects.requireNonNull($.workflowId, "expected parameter 'workflowId' to be non-null");
            return $;
        }
    }

}
