// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecr.inputs.GetImageArgs;
import io.pulumi.aws.ecr.outputs.GetImageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImage {
/**
 * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
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
        return Deployment.getInstance().invokeAsync("aws:ecr/getImage:getImage", TypeShape.of(GetImageResult.class), args == null ? GetImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
