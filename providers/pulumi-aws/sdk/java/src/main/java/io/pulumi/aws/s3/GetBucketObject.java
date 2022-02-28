// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.inputs.GetBucketObjectArgs;
import io.pulumi.aws.s3.outputs.GetBucketObjectResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucketObject {
/**
 * The S3 object data source allows access to the metadata and
 * _optionally_ (see below) content of an object stored inside S3 bucket.
 * 
 * > **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type` (`text/*` and `application/json`). This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favour of metadata.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getBucketObject.
 * 
 *
 * A collection of values returned by getBucketObject.
 * 
 */
    public static CompletableFuture<GetBucketObjectResult> invokeAsync(GetBucketObjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:s3/getBucketObject:getBucketObject", TypeShape.of(GetBucketObjectResult.class), args == null ? GetBucketObjectArgs.Empty : args, Utilities.withVersion(options));
    }
}
