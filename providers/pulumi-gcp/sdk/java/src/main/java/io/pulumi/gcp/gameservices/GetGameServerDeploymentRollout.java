// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.inputs.GetGameServerDeploymentRolloutArgs;
import io.pulumi.gcp.gameservices.outputs.GetGameServerDeploymentRolloutResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGameServerDeploymentRollout {
    public static CompletableFuture<GetGameServerDeploymentRolloutResult> invokeAsync(GetGameServerDeploymentRolloutArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:gameservices/getGameServerDeploymentRollout:getGameServerDeploymentRollout", TypeShape.of(GetGameServerDeploymentRolloutResult.class), args == null ? GetGameServerDeploymentRolloutArgs.Empty : args, Utilities.withVersion(options));
    }
}