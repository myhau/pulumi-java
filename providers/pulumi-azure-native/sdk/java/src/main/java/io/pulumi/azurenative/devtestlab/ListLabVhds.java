// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.ListLabVhdsArgs;
import io.pulumi.azurenative.devtestlab.outputs.ListLabVhdsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListLabVhds {
    public static CompletableFuture<ListLabVhdsResult> invokeAsync(ListLabVhdsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listLabVhds", TypeShape.of(ListLabVhdsResult.class), args == null ? ListLabVhdsArgs.Empty : args, Utilities.withVersion(options));
    }
}