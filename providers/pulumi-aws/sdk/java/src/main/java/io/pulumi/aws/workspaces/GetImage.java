// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.workspaces.inputs.GetImageArgs;
import io.pulumi.aws.workspaces.outputs.GetImageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImage {
/**
 * Use this data source to get information about a Workspaces image.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getImage.
 * 
 *
 * A collection of values returned by getImage.
 * 
 */
    public static CompletableFuture<GetImageResult> invokeAsync(GetImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getImage:getImage", TypeShape.of(GetImageResult.class), args == null ? GetImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
