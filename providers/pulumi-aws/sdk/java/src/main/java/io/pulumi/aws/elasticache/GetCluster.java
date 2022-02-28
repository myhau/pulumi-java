// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticache.inputs.GetClusterArgs;
import io.pulumi.aws.elasticache.outputs.GetClusterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCluster {
/**
 * Use this data source to get information about an Elasticache Cluster
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCluster.
 * 
 *
 * A collection of values returned by getCluster.
 * 
 */
    public static CompletableFuture<GetClusterResult> invokeAsync(GetClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticache/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args == null ? GetClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
