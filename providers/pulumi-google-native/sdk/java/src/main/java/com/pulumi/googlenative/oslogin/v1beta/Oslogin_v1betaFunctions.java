// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.oslogin.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.oslogin.v1beta.inputs.GetSshPublicKeyArgs;
import com.pulumi.googlenative.oslogin.v1beta.inputs.GetSshPublicKeyPlainArgs;
import com.pulumi.googlenative.oslogin.v1beta.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;

public final class Oslogin_v1betaFunctions {
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static Output<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args) {
        return getSshPublicKey(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKeyPlain(GetSshPublicKeyPlainArgs args) {
        return getSshPublicKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static Output<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:oslogin/v1beta:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKeyPlain(GetSshPublicKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1beta:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args, Utilities.withVersion(options));
    }
}
