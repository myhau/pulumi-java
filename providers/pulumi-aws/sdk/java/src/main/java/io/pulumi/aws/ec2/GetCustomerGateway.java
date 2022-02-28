// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs;
import io.pulumi.aws.ec2.outputs.GetCustomerGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomerGateway {
/**
 * Get an existing AWS Customer Gateway.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCustomerGateway.
 * 
 *
 * A collection of values returned by getCustomerGateway.
 * 
 */
    public static CompletableFuture<GetCustomerGatewayResult> invokeAsync(@Nullable GetCustomerGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getCustomerGateway:getCustomerGateway", TypeShape.of(GetCustomerGatewayResult.class), args == null ? GetCustomerGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
