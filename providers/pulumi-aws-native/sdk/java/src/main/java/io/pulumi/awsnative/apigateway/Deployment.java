// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.DeploymentArgs;
import io.pulumi.awsnative.apigateway.outputs.DeploymentCanarySettings;
import io.pulumi.awsnative.apigateway.outputs.DeploymentStageDescription;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:apigateway:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="deploymentCanarySettings", type=DeploymentCanarySettings.class, parameters={})
    private Output</* @Nullable */ DeploymentCanarySettings> deploymentCanarySettings;

    public Output</* @Nullable */ DeploymentCanarySettings> getDeploymentCanarySettings() {
        return this.deploymentCanarySettings;
    }
    @OutputExport(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    @OutputExport(name="stageDescription", type=DeploymentStageDescription.class, parameters={})
    private Output</* @Nullable */ DeploymentStageDescription> stageDescription;

    public Output</* @Nullable */ DeploymentStageDescription> getStageDescription() {
        return this.stageDescription;
    }
    @OutputExport(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    public Output</* @Nullable */ String> getStageName() {
        return this.stageName;
    }

    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Deployment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Deployment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}