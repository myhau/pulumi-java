// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.inputs.GetBucketObjectContentArgs;
import io.pulumi.gcp.storage.outputs.GetBucketObjectContentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucketObjectContent {
    public static CompletableFuture<GetBucketObjectContentResult> invokeAsync(GetBucketObjectContentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:storage/getBucketObjectContent:getBucketObjectContent", TypeShape.of(GetBucketObjectContentResult.class), args == null ? GetBucketObjectContentArgs.Empty : args, Utilities.withVersion(options));
    }
}