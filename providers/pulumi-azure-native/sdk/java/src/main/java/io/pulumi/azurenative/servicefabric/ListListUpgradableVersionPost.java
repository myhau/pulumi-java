// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.inputs.ListListUpgradableVersionPostArgs;
import io.pulumi.azurenative.servicefabric.outputs.ListListUpgradableVersionPostResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListListUpgradableVersionPost {
    public static CompletableFuture<ListListUpgradableVersionPostResult> invokeAsync(ListListUpgradableVersionPostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:listListUpgradableVersionPost", TypeShape.of(ListListUpgradableVersionPostResult.class), args == null ? ListListUpgradableVersionPostArgs.Empty : args, Utilities.withVersion(options));
    }
}