// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codeartifact.inputs.GetRepositoryEndpointArgs;
import io.pulumi.aws.codeartifact.outputs.GetRepositoryEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRepositoryEndpoint {
/**
 * The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getRepositoryEndpoint.
 * 
 *
 * A collection of values returned by getRepositoryEndpoint.
 * 
 */
    public static CompletableFuture<GetRepositoryEndpointResult> invokeAsync(GetRepositoryEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codeartifact/getRepositoryEndpoint:getRepositoryEndpoint", TypeShape.of(GetRepositoryEndpointResult.class), args == null ? GetRepositoryEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
