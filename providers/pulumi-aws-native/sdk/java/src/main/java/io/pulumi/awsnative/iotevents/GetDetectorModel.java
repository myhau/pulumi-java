// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotevents.inputs.GetDetectorModelArgs;
import io.pulumi.awsnative.iotevents.outputs.GetDetectorModelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDetectorModel {
    public static CompletableFuture<GetDetectorModelResult> invokeAsync(GetDetectorModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotevents:getDetectorModel", TypeShape.of(GetDetectorModelResult.class), args == null ? GetDetectorModelArgs.Empty : args, Utilities.withVersion(options));
    }
}