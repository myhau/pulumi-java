// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GetAuthorizationPolicyIamPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GetAuthorizationPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAuthorizationPolicyIamPolicy {
    public static CompletableFuture<GetAuthorizationPolicyIamPolicyResult> invokeAsync(GetAuthorizationPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getAuthorizationPolicyIamPolicy", TypeShape.of(GetAuthorizationPolicyIamPolicyResult.class), args == null ? GetAuthorizationPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}