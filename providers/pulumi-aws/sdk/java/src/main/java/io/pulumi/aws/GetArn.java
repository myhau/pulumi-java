// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetArnArgs;
import io.pulumi.aws.outputs.GetArnResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetArn {
/**
 * Parses an Amazon Resource Name (ARN) into its constituent parts.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getArn.
 * 
 *
 * A collection of values returned by getArn.
 * 
 */
    public static CompletableFuture<GetArnResult> invokeAsync(GetArnArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getArn:getArn", TypeShape.of(GetArnResult.class), args == null ? GetArnArgs.Empty : args, Utilities.withVersion(options));
    }
}
