// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHealthCheckArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckArgs Empty = new GetHealthCheckArgs();

    @Import(name="healthCheck", required=true)
    private Output<String> healthCheck;

    public Output<String> healthCheck() {
        return this.healthCheck;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHealthCheckArgs() {}

    private GetHealthCheckArgs(GetHealthCheckArgs $) {
        this.healthCheck = $.healthCheck;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHealthCheckArgs $;

        public Builder() {
            $ = new GetHealthCheckArgs();
        }

        public Builder(GetHealthCheckArgs defaults) {
            $ = new GetHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheck(Output<String> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(String healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetHealthCheckArgs build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            return $;
        }
    }

}
