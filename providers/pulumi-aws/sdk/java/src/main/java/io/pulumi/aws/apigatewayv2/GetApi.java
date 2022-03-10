// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.inputs.GetApiArgs;
import io.pulumi.aws.apigatewayv2.outputs.GetApiResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApi {
    private GetApi() {}
    public interface BuilderApplicator {
        public void apply(GetApiArgs.Builder a);
    }
    private static GetApiArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetApiArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about a specific Amazon API Gateway Version 2 API.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getApi.
 * 
     *
     * A collection of values returned by getApi.
 * 
     */
    public static CompletableFuture<GetApiResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about a specific Amazon API Gateway Version 2 API.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getApi.
     * 
     *
         * A collection of values returned by getApi.
     * 
     */
    public static CompletableFuture<GetApiResult> invokeAsync(GetApiArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:apigatewayv2/getApi:getApi", TypeShape.of(GetApiResult.class), args == null ? GetApiArgs.Empty : args, Utilities.withVersion(options));
    }
}