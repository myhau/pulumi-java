// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lambda.inputs.GetLayerVersionArgs;
import io.pulumi.aws.lambda.outputs.GetLayerVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLayerVersion {
/**
 * Provides information about a Lambda Layer Version.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLayerVersion.
 * 
 *
 * A collection of values returned by getLayerVersion.
 * 
 */
    public static CompletableFuture<GetLayerVersionResult> invokeAsync(GetLayerVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lambda/getLayerVersion:getLayerVersion", TypeShape.of(GetLayerVersionResult.class), args == null ? GetLayerVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
