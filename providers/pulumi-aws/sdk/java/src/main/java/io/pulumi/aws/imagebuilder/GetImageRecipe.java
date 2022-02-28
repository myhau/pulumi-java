// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.inputs.GetImageRecipeArgs;
import io.pulumi.aws.imagebuilder.outputs.GetImageRecipeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImageRecipe {
/**
 * Provides details about an Image Builder Image Recipe.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getImageRecipe.
 * 
 *
 * A collection of values returned by getImageRecipe.
 * 
 */
    public static CompletableFuture<GetImageRecipeResult> invokeAsync(GetImageRecipeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:imagebuilder/getImageRecipe:getImageRecipe", TypeShape.of(GetImageRecipeResult.class), args == null ? GetImageRecipeArgs.Empty : args, Utilities.withVersion(options));
    }
}
