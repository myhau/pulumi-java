// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetCoipPoolArgs;
import io.pulumi.aws.ec2.outputs.GetCoipPoolResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCoipPool {
/**
 * Provides details about a specific EC2 Customer-Owned IP Pool.
 * 
 * This data source can prove useful when a module accepts a coip pool id as
 * an input variable and needs to, for example, determine the CIDR block of that
 * COIP Pool.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCoipPool.
 * 
 *
 * A collection of values returned by getCoipPool.
 * 
 */
    public static CompletableFuture<GetCoipPoolResult> invokeAsync(@Nullable GetCoipPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getCoipPool:getCoipPool", TypeShape.of(GetCoipPoolResult.class), args == null ? GetCoipPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
