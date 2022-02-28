// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarnotifications;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codestarnotifications.NotificationRuleArgs;
import io.pulumi.aws.codestarnotifications.inputs.NotificationRuleState;
import io.pulumi.aws.codestarnotifications.outputs.NotificationRuleTarget;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodeStar Notifications Rule.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeStar notification rule can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codestarnotifications/notificationRule:NotificationRule foo arn:aws:codestar-notifications:us-west-1:0123456789:notificationrule/2cdc68a3-8f7c-4893-b6a5-45b362bd4f2b
 * ```
 * 
 */
@ResourceType(type="aws:codestarnotifications/notificationRule:NotificationRule")
public class NotificationRule extends io.pulumi.resources.CustomResource {
    /**
     * The codestar notification rule ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The codestar notification rule ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     * 
     */
    @OutputExport(name="detailType", type=String.class, parameters={})
    private Output<String> detailType;

    /**
     * @return The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     * 
     */
    public Output<String> getDetailType() {
        return this.detailType;
    }
    /**
     * A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     * 
     */
    @OutputExport(name="eventTypeIds", type=List.class, parameters={String.class})
    private Output<List<String>> eventTypeIds;

    /**
     * @return A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     * 
     */
    public Output<List<String>> getEventTypeIds() {
        return this.eventTypeIds;
    }
    /**
     * The name of notification rule.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of notification rule.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ARN of the resource to associate with the notification rule.
     * 
     */
    @OutputExport(name="resource", type=String.class, parameters={})
    private Output<String> resource;

    /**
     * @return The ARN of the resource to associate with the notification rule.
     * 
     */
    public Output<String> getResource() {
        return this.resource;
    }
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * 
     */
    @OutputExport(name="targets", type=List.class, parameters={NotificationRuleTarget.class})
    private Output</* @Nullable */ List<NotificationRuleTarget>> targets;

    /**
     * @return Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * 
     */
    public Output</* @Nullable */ List<NotificationRuleTarget>> getTargets() {
        return this.targets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRule(String name) {
        this(name, NotificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRule(String name, NotificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRule(String name, NotificationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarnotifications/notificationRule:NotificationRule", name, args == null ? NotificationRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NotificationRule(String name, Input<String> id, @Nullable NotificationRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarnotifications/notificationRule:NotificationRule", name, state, makeResourceOptions(options, id));
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
    public static NotificationRule get(String name, Input<String> id, @Nullable NotificationRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRule(name, id, state, options);
    }
}
