// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.inputs.GetWebAclArgs;
import io.pulumi.aws.waf.outputs.GetWebAclResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAcl {
/**
 * `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource Id.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getWebAcl.
 * 
 *
 * A collection of values returned by getWebAcl.
 * 
 */
    public static CompletableFuture<GetWebAclResult> invokeAsync(GetWebAclArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:waf/getWebAcl:getWebAcl", TypeShape.of(GetWebAclResult.class), args == null ? GetWebAclArgs.Empty : args, Utilities.withVersion(options));
    }
}
