// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.inputs.GetAccessPointArgs;
import io.pulumi.aws.efs.outputs.GetAccessPointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPoint {
/**
 * Provides information about an Elastic File System (EFS) Access Point.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getAccessPoint.
 * 
 *
 * A collection of values returned by getAccessPoint.
 * 
 */
    public static CompletableFuture<GetAccessPointResult> invokeAsync(GetAccessPointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getAccessPoint:getAccessPoint", TypeShape.of(GetAccessPointResult.class), args == null ? GetAccessPointArgs.Empty : args, Utilities.withVersion(options));
    }
}
