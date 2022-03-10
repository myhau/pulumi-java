// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.inputs.GetComponentsArgs;
import io.pulumi.aws.imagebuilder.outputs.GetComponentsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetComponents {
    private GetComponents() {}
    public interface BuilderApplicator {
        public void apply(GetComponentsArgs.Builder a);
    }
    private static GetComponentsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetComponentsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getComponents.
 * 
     *
     * A collection of values returned by getComponents.
 * 
     */
    public static CompletableFuture<GetComponentsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the ARNs and names of Image Builder Components matching the specified criteria.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getComponents.
     * 
     *
         * A collection of values returned by getComponents.
     * 
     */
    public static CompletableFuture<GetComponentsResult> invokeAsync(@Nullable GetComponentsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:imagebuilder/getComponents:getComponents", TypeShape.of(GetComponentsResult.class), args == null ? GetComponentsArgs.Empty : args, Utilities.withVersion(options));
    }
}