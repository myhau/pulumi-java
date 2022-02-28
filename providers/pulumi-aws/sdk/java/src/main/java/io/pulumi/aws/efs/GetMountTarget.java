// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.inputs.GetMountTargetArgs;
import io.pulumi.aws.efs.outputs.GetMountTargetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMountTarget {
/**
 * Provides information about an Elastic File System Mount Target (EFS).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getMountTarget.
 * 
 *
 * A collection of values returned by getMountTarget.
 * 
 */
    public static CompletableFuture<GetMountTargetResult> invokeAsync(@Nullable GetMountTargetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getMountTarget:getMountTarget", TypeShape.of(GetMountTargetResult.class), args == null ? GetMountTargetArgs.Empty : args, Utilities.withVersion(options));
    }
}
