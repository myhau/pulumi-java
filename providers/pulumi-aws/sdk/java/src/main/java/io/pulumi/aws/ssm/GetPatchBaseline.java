// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.inputs.GetPatchBaselineArgs;
import io.pulumi.aws.ssm.outputs.GetPatchBaselineResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPatchBaseline {
/**
 * Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getPatchBaseline.
 * 
 *
 * A collection of values returned by getPatchBaseline.
 * 
 */
    public static CompletableFuture<GetPatchBaselineResult> invokeAsync(GetPatchBaselineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getPatchBaseline:getPatchBaseline", TypeShape.of(GetPatchBaselineResult.class), args == null ? GetPatchBaselineArgs.Empty : args, Utilities.withVersion(options));
    }
}
