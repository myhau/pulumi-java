// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventPermissionArgs;
import io.pulumi.aws.cloudwatch.inputs.EventPermissionState;
import io.pulumi.aws.cloudwatch.outputs.EventPermissionCondition;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge permission to support cross-account events in the current account default event bus.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * > **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge permissions can be imported using the `event_bus_name/statement_id` (if you omit `event_bus_name`, the `default` event bus will be used), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventPermission:EventPermission DevAccountAccess example-event-bus/DevAccountAccess
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventPermission:EventPermission")
public class EventPermission extends io.pulumi.resources.CustomResource {
    /**
     * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    @OutputExport(name="action", type=String.class, parameters={})
    private Output</* @Nullable */ String> action;

    /**
     * @return The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    public Output</* @Nullable */ String> getAction() {
        return this.action;
    }
    /**
     * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    @OutputExport(name="condition", type=EventPermissionCondition.class, parameters={})
    private Output</* @Nullable */ EventPermissionCondition> condition;

    /**
     * @return Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    public Output</* @Nullable */ EventPermissionCondition> getCondition() {
        return this.condition;
    }
    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @OutputExport(name="eventBusName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Output</* @Nullable */ String> getEventBusName() {
        return this.eventBusName;
    }
    /**
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    @OutputExport(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    public Output<String> getPrincipal() {
        return this.principal;
    }
    /**
     * An identifier string for the external account that you are granting permissions to.
     * 
     */
    @OutputExport(name="statementId", type=String.class, parameters={})
    private Output<String> statementId;

    /**
     * @return An identifier string for the external account that you are granting permissions to.
     * 
     */
    public Output<String> getStatementId() {
        return this.statementId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventPermission(String name) {
        this(name, EventPermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventPermission(String name, EventPermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventPermission(String name, EventPermissionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventPermission:EventPermission", name, args == null ? EventPermissionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventPermission(String name, Input<String> id, @Nullable EventPermissionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventPermission:EventPermission", name, state, makeResourceOptions(options, id));
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
    public static EventPermission get(String name, Input<String> id, @Nullable EventPermissionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventPermission(name, id, state, options);
    }
}
