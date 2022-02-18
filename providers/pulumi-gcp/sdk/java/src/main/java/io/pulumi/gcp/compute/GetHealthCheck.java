// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetHealthCheckArgs;
import io.pulumi.gcp.compute.outputs.GetHealthCheckResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHealthCheck {
/**
 * Get information about a HealthCheck.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getHealthCheck.
 * 
 *
 * A collection of values returned by getHealthCheck.
 * 
 */
    public static CompletableFuture<GetHealthCheckResult> invokeAsync(GetHealthCheckArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getHealthCheck:getHealthCheck", TypeShape.of(GetHealthCheckResult.class), args == null ? GetHealthCheckArgs.Empty : args, Utilities.withVersion(options));
    }
}
