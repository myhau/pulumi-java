// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.inputs.GetGroupArgs;
import io.pulumi.aws.autoscaling.outputs.GetGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGroup {
/**
 * Use this data source to get information on an existing autoscaling group.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getGroup.
 * 
 *
 * A collection of values returned by getGroup.
 * 
 */
    public static CompletableFuture<GetGroupResult> invokeAsync(GetGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args == null ? GetGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
