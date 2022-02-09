// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.oslogin_v1alpha.inputs.GetSshPublicKeyArgs;
import io.pulumi.googlenative.oslogin_v1alpha.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSshPublicKey {
    public static CompletableFuture<GetSshPublicKeyResult> invokeAsync(GetSshPublicKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1alpha:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args == null ? GetSshPublicKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}