// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastore.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datastore.v1.inputs.GetIndexArgs;
import com.pulumi.googlenative.datastore.v1.inputs.GetIndexPlainArgs;
import com.pulumi.googlenative.datastore.v1.outputs.GetIndexResult;
import java.util.concurrent.CompletableFuture;

public final class Datastore_v1Functions {
    /**
     * Gets an index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    /**
     * Gets an index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args) {
        return getIndexPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets an index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:datastore/v1:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datastore/v1:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
}
