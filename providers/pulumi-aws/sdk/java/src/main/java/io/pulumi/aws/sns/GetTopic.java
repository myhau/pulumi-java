// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sns.inputs.GetTopicArgs;
import io.pulumi.aws.sns.outputs.GetTopicResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopic {
/**
 * Use this data source to get the ARN of a topic in AWS Simple Notification
 * Service (SNS). By using this data source, you can reference SNS topics
 * without having to hard code the ARNs as input.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getTopic.
 * 
 *
 * A collection of values returned by getTopic.
 * 
 */
    public static CompletableFuture<GetTopicResult> invokeAsync(GetTopicArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sns/getTopic:getTopic", TypeShape.of(GetTopicResult.class), args == null ? GetTopicArgs.Empty : args, Utilities.withVersion(options));
    }
}
