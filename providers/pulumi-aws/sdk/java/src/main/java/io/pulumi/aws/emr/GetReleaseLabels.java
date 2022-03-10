// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
import io.pulumi.aws.emr.outputs.GetReleaseLabelsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReleaseLabels {
    private GetReleaseLabels() {}
    public interface BuilderApplicator {
        public void apply(GetReleaseLabelsArgs.Builder a);
    }
    private static GetReleaseLabelsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetReleaseLabelsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieve information about EMR Release Labels.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getReleaseLabels.
 * 
     *
     * A collection of values returned by getReleaseLabels.
 * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getReleaseLabels.
     * 
     *
         * A collection of values returned by getReleaseLabels.
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> invokeAsync(@Nullable GetReleaseLabelsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:emr/getReleaseLabels:getReleaseLabels", TypeShape.of(GetReleaseLabelsResult.class), args == null ? GetReleaseLabelsArgs.Empty : args, Utilities.withVersion(options));
    }
}