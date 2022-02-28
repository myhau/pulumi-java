// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
import io.pulumi.aws.kinesis.outputs.GetStreamConsumerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStreamConsumer {
/**
 * Provides details about a Kinesis Stream Consumer.
 * 
 * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getStreamConsumer.
 * 
 *
 * A collection of values returned by getStreamConsumer.
 * 
 */
    public static CompletableFuture<GetStreamConsumerResult> invokeAsync(GetStreamConsumerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getStreamConsumer:getStreamConsumer", TypeShape.of(GetStreamConsumerResult.class), args == null ? GetStreamConsumerArgs.Empty : args, Utilities.withVersion(options));
    }
}
