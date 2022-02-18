// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetInstanceGroupArgs;
import io.pulumi.gcp.compute.outputs.GetInstanceGroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceGroup {
/**
 * Get a Compute Instance Group within GCE.
 * For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/#unmanaged_instance_groups)
 * and [API](https://cloud.google.com/compute/docs/reference/latest/instanceGroups)
 * 
 *
 * A collection of arguments for invoking getInstanceGroup.
 * 
 *
 * A collection of values returned by getInstanceGroup.
 * 
 */
    public static CompletableFuture<GetInstanceGroupResult> invokeAsync(@Nullable GetInstanceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getInstanceGroup:getInstanceGroup", TypeShape.of(GetInstanceGroupResult.class), args == null ? GetInstanceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
