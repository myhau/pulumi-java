// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetBackupArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetBackupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackup {
    public static CompletableFuture<GetBackupResult> invokeAsync(GetBackupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getBackup", TypeShape.of(GetBackupResult.class), args == null ? GetBackupArgs.Empty : args, Utilities.withVersion(options));
    }
}