// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dns.inputs.GetKeysArgs;
import io.pulumi.gcp.dns.outputs.GetKeysResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKeys {
/**
 * Get the DNSKEY and DS records of DNSSEC-signed managed zones. For more information see the
 * [official documentation](https://cloud.google.com/dns/docs/dnskeys/)
 * and [API](https://cloud.google.com/dns/docs/reference/v1/dnsKeys).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getKeys.
 * 
 *
 * A collection of values returned by getKeys.
 * 
 */
    public static CompletableFuture<GetKeysResult> invokeAsync(GetKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:dns/getKeys:getKeys", TypeShape.of(GetKeysResult.class), args == null ? GetKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
