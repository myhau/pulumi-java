// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.NotificationArgs;
import io.pulumi.aws.autoscaling.inputs.NotificationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AutoScaling Group with Notification support, via SNS Topics. Each of
 * the `notifications` map to a [Notification Configuration](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeNotificationConfigurations.html) inside Amazon Web
 * Services, and are applied to each AutoScaling Group you supply.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:autoscaling/notification:Notification")
public class Notification extends io.pulumi.resources.CustomResource {
    /**
     * A list of AutoScaling Group Names
     * 
     */
    @OutputExport(name="groupNames", type=List.class, parameters={String.class})
    private Output<List<String>> groupNames;

    /**
     * @return A list of AutoScaling Group Names
     * 
     */
    public Output<List<String>> getGroupNames() {
        return this.groupNames;
    }
    /**
     * A list of Notification Types that trigger
     * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
     * 
     */
    @OutputExport(name="notifications", type=List.class, parameters={String.class})
    private Output<List<String>> notifications;

    /**
     * @return A list of Notification Types that trigger
     * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
     * 
     */
    public Output<List<String>> getNotifications() {
        return this.notifications;
    }
    /**
     * The Topic ARN for notifications to be sent through
     * 
     */
    @OutputExport(name="topicArn", type=String.class, parameters={})
    private Output<String> topicArn;

    /**
     * @return The Topic ARN for notifications to be sent through
     * 
     */
    public Output<String> getTopicArn() {
        return this.topicArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notification(String name) {
        this(name, NotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notification(String name, NotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notification(String name, NotificationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/notification:Notification", name, args == null ? NotificationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Notification(String name, Input<String> id, @Nullable NotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/notification:Notification", name, state, makeResourceOptions(options, id));
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
    public static Notification get(String name, Input<String> id, @Nullable NotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Notification(name, id, state, options);
    }
}
