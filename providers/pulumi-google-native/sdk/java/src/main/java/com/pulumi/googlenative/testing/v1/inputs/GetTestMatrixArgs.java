// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestMatrixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTestMatrixArgs Empty = new GetTestMatrixArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="testMatrixId", required=true)
    private Output<String> testMatrixId;

    public Output<String> testMatrixId() {
        return this.testMatrixId;
    }

    private GetTestMatrixArgs() {}

    private GetTestMatrixArgs(GetTestMatrixArgs $) {
        this.project = $.project;
        this.testMatrixId = $.testMatrixId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTestMatrixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTestMatrixArgs $;

        public Builder() {
            $ = new GetTestMatrixArgs();
        }

        public Builder(GetTestMatrixArgs defaults) {
            $ = new GetTestMatrixArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder testMatrixId(Output<String> testMatrixId) {
            $.testMatrixId = testMatrixId;
            return this;
        }

        public Builder testMatrixId(String testMatrixId) {
            return testMatrixId(Output.of(testMatrixId));
        }

        public GetTestMatrixArgs build() {
            $.testMatrixId = Objects.requireNonNull($.testMatrixId, "expected parameter 'testMatrixId' to be non-null");
            return $;
        }
    }

}
