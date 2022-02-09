// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestack.inputs.GetCustomerSubscriptionArgs;
import io.pulumi.azurenative.azurestack.outputs.GetCustomerSubscriptionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomerSubscription {
    public static CompletableFuture<GetCustomerSubscriptionResult> invokeAsync(GetCustomerSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getCustomerSubscription", TypeShape.of(GetCustomerSubscriptionResult.class), args == null ? GetCustomerSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}