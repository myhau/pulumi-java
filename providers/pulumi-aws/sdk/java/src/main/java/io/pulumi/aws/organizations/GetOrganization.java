// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.outputs.GetOrganizationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganization {
/**
 * Get information about the organization that the user's account belongs to
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getOrganization.
 * 
 */
    public static CompletableFuture<GetOrganizationResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getOrganization:getOrganization", TypeShape.of(GetOrganizationResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
