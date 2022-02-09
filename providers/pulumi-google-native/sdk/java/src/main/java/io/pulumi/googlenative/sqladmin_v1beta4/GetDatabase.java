// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.GetDatabaseArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.GetDatabaseResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabase {
    public static CompletableFuture<GetDatabaseResult> invokeAsync(GetDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:sqladmin/v1beta4:getDatabase", TypeShape.of(GetDatabaseResult.class), args == null ? GetDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}