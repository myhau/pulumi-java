// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs;
import io.pulumi.aws.cloudwatch.outputs.GetLogGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLogGroup {
/**
 * Use this data source to get information about an AWS Cloudwatch Log Group
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLogGroup.
 * 
 *
 * A collection of values returned by getLogGroup.
 * 
 */
    public static CompletableFuture<GetLogGroupResult> invokeAsync(GetLogGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudwatch/getLogGroup:getLogGroup", TypeShape.of(GetLogGroupResult.class), args == null ? GetLogGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
