// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticloadbalancing.inputs.GetServiceAccountArgs;
import io.pulumi.aws.elasticloadbalancing.outputs.GetServiceAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.elasticloadbalancing.getServiceAccount has been deprecated in favor of aws.elb.getServiceAccount */
public class GetServiceAccount {
/**
 * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
 * in a given region for the purpose of permitting in S3 bucket policy.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getServiceAccount.
 * 
 *
 * A collection of values returned by getServiceAccount.
 * 
 * @deprecated
 * aws.elasticloadbalancing.getServiceAccount has been deprecated in favor of aws.elb.getServiceAccount
 * 
 */
    @Deprecated /* aws.elasticloadbalancing.getServiceAccount has been deprecated in favor of aws.elb.getServiceAccount */
    public static CompletableFuture<GetServiceAccountResult> invokeAsync(@Nullable GetServiceAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticloadbalancing/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args == null ? GetServiceAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
