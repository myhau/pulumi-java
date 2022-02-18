// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.inputs.GetNotificationChannelArgs;
import io.pulumi.gcp.monitoring.outputs.GetNotificationChannelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotificationChannel {
/**
 * A NotificationChannel is a medium through which an alert is delivered
 * when a policy violation is detected. Examples of channels include email, SMS,
 * and third-party messaging applications. Fields containing sensitive information
 * like authentication tokens or contact info are only partially populated on retrieval.
 * 
 * To get more information about NotificationChannel, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
 * * How-to Guides
 *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getNotificationChannel.
 * 
 *
 * A collection of values returned by getNotificationChannel.
 * 
 */
    public static CompletableFuture<GetNotificationChannelResult> invokeAsync(@Nullable GetNotificationChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getNotificationChannel:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args == null ? GetNotificationChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
