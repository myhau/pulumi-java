// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs;
import io.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUserPoolSigningCertificate {
/**
 * Use this data source to get the signing certificate for a Cognito IdP user pool.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getUserPoolSigningCertificate.
 * 
 *
 * A collection of values returned by getUserPoolSigningCertificate.
 * 
 */
    public static CompletableFuture<GetUserPoolSigningCertificateResult> invokeAsync(GetUserPoolSigningCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPoolSigningCertificate:getUserPoolSigningCertificate", TypeShape.of(GetUserPoolSigningCertificateResult.class), args == null ? GetUserPoolSigningCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
