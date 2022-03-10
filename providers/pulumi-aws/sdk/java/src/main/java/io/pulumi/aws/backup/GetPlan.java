// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.inputs.GetPlanArgs;
import io.pulumi.aws.backup.outputs.GetPlanResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPlan {
    private GetPlan() {}
    public interface BuilderApplicator {
        public void apply(GetPlanArgs.Builder a);
    }
    private static GetPlanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPlanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get information on an existing backup plan.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getPlan.
 * 
     *
     * A collection of values returned by getPlan.
 * 
     */
    public static CompletableFuture<GetPlanResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get information on an existing backup plan.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getPlan.
     * 
     *
         * A collection of values returned by getPlan.
     * 
     */
    public static CompletableFuture<GetPlanResult> invokeAsync(GetPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getPlan:getPlan", TypeShape.of(GetPlanResult.class), args == null ? GetPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}