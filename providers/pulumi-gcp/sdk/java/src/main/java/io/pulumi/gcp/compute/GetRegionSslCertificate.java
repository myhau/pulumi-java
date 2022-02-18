// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetRegionSslCertificateArgs;
import io.pulumi.gcp.compute.outputs.GetRegionSslCertificateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionSslCertificate {
/**
 * Get info about a Region Google Compute SSL Certificate from its name.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getRegionSslCertificate.
 * 
 *
 * A collection of values returned by getRegionSslCertificate.
 * 
 */
    public static CompletableFuture<GetRegionSslCertificateResult> invokeAsync(GetRegionSslCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getRegionSslCertificate:getRegionSslCertificate", TypeShape.of(GetRegionSslCertificateResult.class), args == null ? GetRegionSslCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
