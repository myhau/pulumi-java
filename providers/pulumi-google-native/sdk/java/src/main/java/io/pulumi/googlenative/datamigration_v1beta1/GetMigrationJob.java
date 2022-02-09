// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.GetMigrationJobArgs;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.GetMigrationJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMigrationJob {
    public static CompletableFuture<GetMigrationJobResult> invokeAsync(GetMigrationJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getMigrationJob", TypeShape.of(GetMigrationJobResult.class), args == null ? GetMigrationJobArgs.Empty : args, Utilities.withVersion(options));
    }
}