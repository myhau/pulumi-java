// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.inputs.GetInstanceArgs;
import io.pulumi.aws.rds.outputs.GetInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstance {
/**
 * Use this data source to get information about an RDS instance
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getInstance.
 * 
 *
 * A collection of values returned by getInstance.
 * 
 */
    public static CompletableFuture<GetInstanceResult> invokeAsync(GetInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:rds/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args == null ? GetInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
