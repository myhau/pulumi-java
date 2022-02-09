// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionNetworkEndpointGroupArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionNetworkEndpointGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionNetworkEndpointGroup {
    public static CompletableFuture<GetRegionNetworkEndpointGroupResult> invokeAsync(GetRegionNetworkEndpointGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionNetworkEndpointGroup", TypeShape.of(GetRegionNetworkEndpointGroupResult.class), args == null ? GetRegionNetworkEndpointGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}