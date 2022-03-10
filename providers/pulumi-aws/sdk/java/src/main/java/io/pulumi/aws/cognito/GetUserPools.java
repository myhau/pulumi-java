// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.inputs.GetUserPoolsArgs;
import io.pulumi.aws.cognito.outputs.GetUserPoolsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUserPools {
    private GetUserPools() {}
    public interface BuilderApplicator {
        public void apply(GetUserPoolsArgs.Builder a);
    }
    private static GetUserPoolsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetUserPoolsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get a list of cognito user pools.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getUserPools.
 * 
     *
     * A collection of values returned by getUserPools.
 * 
     */
    public static CompletableFuture<GetUserPoolsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get a list of cognito user pools.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getUserPools.
     * 
     *
         * A collection of values returned by getUserPools.
     * 
     */
    public static CompletableFuture<GetUserPoolsResult> invokeAsync(GetUserPoolsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPools:getUserPools", TypeShape.of(GetUserPoolsResult.class), args == null ? GetUserPoolsArgs.Empty : args, Utilities.withVersion(options));
    }
}