// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.mypkg.Utilities;
import io.pulumi.mypkg.inputs.GetAmiIdsArgs;
import io.pulumi.mypkg.outputs.GetAmiIdsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
public class GetAmiIds {
/**
 * Taken from pulumi-AWS to regress an issue
 * 
 *
 * A collection of arguments for invoking getAmiIds.
 * 
 *
 * A collection of values returned by getAmiIds.
 * 
 * @deprecated
 * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
 * 
 */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> invokeAsync(GetAmiIdsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("mypkg::getAmiIds", TypeShape.of(GetAmiIdsResult.class), args == null ? GetAmiIdsArgs.Empty : args, Utilities.withVersion(options));
    }
}
