// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentArgs Empty = new GetDeploymentArgs();

    @Import(name="deployment", required=true)
    private Output<String> deployment;

    public Output<String> deployment() {
        return this.deployment;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDeploymentArgs() {}

    private GetDeploymentArgs(GetDeploymentArgs $) {
        this.deployment = $.deployment;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentArgs $;

        public Builder() {
            $ = new GetDeploymentArgs();
        }

        public Builder(GetDeploymentArgs defaults) {
            $ = new GetDeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder deployment(Output<String> deployment) {
            $.deployment = deployment;
            return this;
        }

        public Builder deployment(String deployment) {
            return deployment(Output.of(deployment));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetDeploymentArgs build() {
            $.deployment = Objects.requireNonNull($.deployment, "expected parameter 'deployment' to be non-null");
            return $;
        }
    }

}
