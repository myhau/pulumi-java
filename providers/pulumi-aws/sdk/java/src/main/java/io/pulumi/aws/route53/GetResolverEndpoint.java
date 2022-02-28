// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.inputs.GetResolverEndpointArgs;
import io.pulumi.aws.route53.outputs.GetResolverEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverEndpoint {
/**
 * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
 * 
 * This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getResolverEndpoint.
 * 
 *
 * A collection of values returned by getResolverEndpoint.
 * 
 */
    public static CompletableFuture<GetResolverEndpointResult> invokeAsync(@Nullable GetResolverEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:route53/getResolverEndpoint:getResolverEndpoint", TypeShape.of(GetResolverEndpointResult.class), args == null ? GetResolverEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
