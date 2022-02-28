// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.BucketNotificationArgs;
import io.pulumi.aws.s3.inputs.BucketNotificationState;
import io.pulumi.aws.s3.outputs.BucketNotificationLambdaFunction;
import io.pulumi.aws.s3.outputs.BucketNotificationQueue;
import io.pulumi.aws.s3.outputs.BucketNotificationTopic;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
 * 
 * > **NOTE:** S3 Buckets only support a single notification configuration. Declaring multiple `aws.s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. See the example "Trigger multiple Lambda functions" for an option.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 bucket notification can be imported using the `bucket`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketNotification:BucketNotification bucket_notification bucket-name
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketNotification:BucketNotification")
public class BucketNotification extends io.pulumi.resources.CustomResource {
    /**
     * Name of the bucket for notification configuration.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Name of the bucket for notification configuration.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Whether to enable Amazon EventBridge notifications.
     * 
     */
    @OutputExport(name="eventbridge", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventbridge;

    /**
     * @return Whether to enable Amazon EventBridge notifications.
     * 
     */
    public Output</* @Nullable */ Boolean> getEventbridge() {
        return this.eventbridge;
    }
    /**
     * Used to configure notifications to a Lambda Function. See below.
     * 
     */
    @OutputExport(name="lambdaFunctions", type=List.class, parameters={BucketNotificationLambdaFunction.class})
    private Output</* @Nullable */ List<BucketNotificationLambdaFunction>> lambdaFunctions;

    /**
     * @return Used to configure notifications to a Lambda Function. See below.
     * 
     */
    public Output</* @Nullable */ List<BucketNotificationLambdaFunction>> getLambdaFunctions() {
        return this.lambdaFunctions;
    }
    /**
     * Notification configuration to SQS Queue. See below.
     * 
     */
    @OutputExport(name="queues", type=List.class, parameters={BucketNotificationQueue.class})
    private Output</* @Nullable */ List<BucketNotificationQueue>> queues;

    /**
     * @return Notification configuration to SQS Queue. See below.
     * 
     */
    public Output</* @Nullable */ List<BucketNotificationQueue>> getQueues() {
        return this.queues;
    }
    /**
     * Notification configuration to SNS Topic. See below.
     * 
     */
    @OutputExport(name="topics", type=List.class, parameters={BucketNotificationTopic.class})
    private Output</* @Nullable */ List<BucketNotificationTopic>> topics;

    /**
     * @return Notification configuration to SNS Topic. See below.
     * 
     */
    public Output</* @Nullable */ List<BucketNotificationTopic>> getTopics() {
        return this.topics;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketNotification(String name) {
        this(name, BucketNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketNotification(String name, BucketNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketNotification(String name, BucketNotificationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketNotification:BucketNotification", name, args == null ? BucketNotificationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BucketNotification(String name, Input<String> id, @Nullable BucketNotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketNotification:BucketNotification", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketNotification get(String name, Input<String> id, @Nullable BucketNotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketNotification(name, id, state, options);
    }
}
