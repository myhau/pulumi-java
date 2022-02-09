// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetTargetHttpProxyArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetTargetHttpProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetHttpProxy {
    public static CompletableFuture<GetTargetHttpProxyResult> invokeAsync(GetTargetHttpProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getTargetHttpProxy", TypeShape.of(GetTargetHttpProxyResult.class), args == null ? GetTargetHttpProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}