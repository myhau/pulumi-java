// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs;
import io.pulumi.aws.mskconnect.outputs.GetCustomPluginResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomPlugin {
/**
 * Get information on an Amazon MSK Connect custom plugin.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCustomPlugin.
 * 
 *
 * A collection of values returned by getCustomPlugin.
 * 
 */
    public static CompletableFuture<GetCustomPluginResult> invokeAsync(GetCustomPluginArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:mskconnect/getCustomPlugin:getCustomPlugin", TypeShape.of(GetCustomPluginResult.class), args == null ? GetCustomPluginArgs.Empty : args, Utilities.withVersion(options));
    }
}
