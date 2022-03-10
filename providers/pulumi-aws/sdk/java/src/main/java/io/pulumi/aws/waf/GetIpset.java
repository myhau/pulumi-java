// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.inputs.GetIpsetArgs;
import io.pulumi.aws.waf.outputs.GetIpsetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIpset {
    private GetIpset() {}
    public interface BuilderApplicator {
        public void apply(GetIpsetArgs.Builder a);
    }
    private static GetIpsetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIpsetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getIpset.
 * 
     *
     * A collection of values returned by getIpset.
 * 
     */
    public static CompletableFuture<GetIpsetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * `aws.waf.IpSet` Retrieves a WAF IP Set Resource Id.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getIpset.
     * 
     *
         * A collection of values returned by getIpset.
     * 
     */
    public static CompletableFuture<GetIpsetResult> invokeAsync(GetIpsetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getIpset:getIpset", TypeShape.of(GetIpsetResult.class), args == null ? GetIpsetArgs.Empty : args, Utilities.withVersion(options));
    }
}