// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.inputs.GetAccessPointsArgs;
import io.pulumi.aws.efs.outputs.GetAccessPointsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPoints {
/**
 * Provides information about multiple Elastic File System (EFS) Access Points.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getAccessPoints.
 * 
 *
 * A collection of values returned by getAccessPoints.
 * 
 */
    public static CompletableFuture<GetAccessPointsResult> invokeAsync(GetAccessPointsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getAccessPoints:getAccessPoints", TypeShape.of(GetAccessPointsResult.class), args == null ? GetAccessPointsArgs.Empty : args, Utilities.withVersion(options));
    }
}
