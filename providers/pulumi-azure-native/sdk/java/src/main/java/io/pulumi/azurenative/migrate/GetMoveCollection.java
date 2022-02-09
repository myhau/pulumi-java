// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.inputs.GetMoveCollectionArgs;
import io.pulumi.azurenative.migrate.outputs.GetMoveCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMoveCollection {
    public static CompletableFuture<GetMoveCollectionResult> invokeAsync(GetMoveCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getMoveCollection", TypeShape.of(GetMoveCollectionResult.class), args == null ? GetMoveCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}