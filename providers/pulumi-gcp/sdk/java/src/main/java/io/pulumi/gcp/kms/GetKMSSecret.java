// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.inputs.GetKMSSecretArgs;
import io.pulumi.gcp.kms.outputs.GetKMSSecretResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKMSSecret {
    public static CompletableFuture<GetKMSSecretResult> invokeAsync(GetKMSSecretArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:kms/getKMSSecret:getKMSSecret", TypeShape.of(GetKMSSecretResult.class), args == null ? GetKMSSecretArgs.Empty : args, Utilities.withVersion(options));
    }
}