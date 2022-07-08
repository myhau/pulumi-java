// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.container.v1beta1.inputs.GetClusterArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.GetClusterPlainArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.GetNodePoolArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.GetNodePoolPlainArgs;
import com.pulumi.googlenative.container.v1beta1.outputs.GetClusterResult;
import com.pulumi.googlenative.container.v1beta1.outputs.GetNodePoolResult;
import java.util.concurrent.CompletableFuture;

public final class Container_v1beta1Functions {
    /**
     * Gets the details for a specific cluster.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details for a specific cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args) {
        return getClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details for a specific cluster.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:container/v1beta1:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details for a specific cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1beta1:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static Output<GetNodePoolResult> getNodePool(GetNodePoolArgs args) {
        return getNodePool(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static CompletableFuture<GetNodePoolResult> getNodePoolPlain(GetNodePoolPlainArgs args) {
        return getNodePoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static Output<GetNodePoolResult> getNodePool(GetNodePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:container/v1beta1:getNodePool", TypeShape.of(GetNodePoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static CompletableFuture<GetNodePoolResult> getNodePoolPlain(GetNodePoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1beta1:getNodePool", TypeShape.of(GetNodePoolResult.class), args, Utilities.withVersion(options));
    }
}
