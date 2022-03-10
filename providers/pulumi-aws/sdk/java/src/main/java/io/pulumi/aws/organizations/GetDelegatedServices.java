// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
import io.pulumi.aws.organizations.outputs.GetDelegatedServicesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDelegatedServices {
    private GetDelegatedServices() {}
    public interface BuilderApplicator {
        public void apply(GetDelegatedServicesArgs.Builder a);
    }
    private static GetDelegatedServicesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDelegatedServicesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getDelegatedServices.
 * 
     *
     * A collection of values returned by getDelegatedServices.
 * 
     */
    public static CompletableFuture<GetDelegatedServicesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get a list the AWS services for which the specified account is a delegated administrator
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getDelegatedServices.
     * 
     *
         * A collection of values returned by getDelegatedServices.
     * 
     */
    public static CompletableFuture<GetDelegatedServicesResult> invokeAsync(GetDelegatedServicesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedServices:getDelegatedServices", TypeShape.of(GetDelegatedServicesResult.class), args == null ? GetDelegatedServicesArgs.Empty : args, Utilities.withVersion(options));
    }
}