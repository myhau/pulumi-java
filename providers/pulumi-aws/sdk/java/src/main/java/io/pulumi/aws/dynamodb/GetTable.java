// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dynamodb.inputs.GetTableArgs;
import io.pulumi.aws.dynamodb.outputs.GetTableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTable {
/**
 * Provides information about a DynamoDB table.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getTable.
 * 
 *
 * A collection of values returned by getTable.
 * 
 */
    public static CompletableFuture<GetTableResult> invokeAsync(GetTableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:dynamodb/getTable:getTable", TypeShape.of(GetTableResult.class), args == null ? GetTableArgs.Empty : args, Utilities.withVersion(options));
    }
}
