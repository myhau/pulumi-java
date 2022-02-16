// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetAgentArgs;
import io.pulumi.awsnative.datasync.outputs.GetAgentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAgent {
    public static CompletableFuture<GetAgentResult> invokeAsync(GetAgentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getAgent", TypeShape.of(GetAgentResult.class), args == null ? GetAgentArgs.Empty : args, Utilities.withVersion(options));
    }
}