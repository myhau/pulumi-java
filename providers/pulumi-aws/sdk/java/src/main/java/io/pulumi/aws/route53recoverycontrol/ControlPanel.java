// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53recoverycontrol.ControlPanelArgs;
import io.pulumi.aws.route53recoverycontrol.inputs.ControlPanelState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Control Config Control Panel.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Recovery Control Config Control Panel can be imported via the control panel arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/controlPanel:ControlPanel mypanel arn:aws:route53-recovery-control::313517334327:controlpanel/1bfba17df8684f5dab0467b71424f7e8
 * ```
 * 
 */
@ResourceType(type="aws:route53recoverycontrol/controlPanel:ControlPanel")
public class ControlPanel extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the control panel.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the control panel.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ARN of the cluster in which this control panel will reside.
     * 
     */
    @OutputExport(name="clusterArn", type=String.class, parameters={})
    private Output<String> clusterArn;

    /**
     * @return ARN of the cluster in which this control panel will reside.
     * 
     */
    public Output<String> getClusterArn() {
        return this.clusterArn;
    }
    /**
     * Whether a control panel is default.
     * 
     */
    @OutputExport(name="defaultControlPanel", type=Boolean.class, parameters={})
    private Output<Boolean> defaultControlPanel;

    /**
     * @return Whether a control panel is default.
     * 
     */
    public Output<Boolean> getDefaultControlPanel() {
        return this.defaultControlPanel;
    }
    /**
     * Name describing the control panel.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name describing the control panel.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Number routing controls in a control panel.
     * 
     */
    @OutputExport(name="routingControlCount", type=Integer.class, parameters={})
    private Output<Integer> routingControlCount;

    /**
     * @return Number routing controls in a control panel.
     * 
     */
    public Output<Integer> getRoutingControlCount() {
        return this.routingControlCount;
    }
    /**
     * Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControlPanel(String name) {
        this(name, ControlPanelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControlPanel(String name, ControlPanelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControlPanel(String name, ControlPanelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/controlPanel:ControlPanel", name, args == null ? ControlPanelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ControlPanel(String name, Input<String> id, @Nullable ControlPanelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/controlPanel:ControlPanel", name, state, makeResourceOptions(options, id));
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
    public static ControlPanel get(String name, Input<String> id, @Nullable ControlPanelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ControlPanel(name, id, state, options);
    }
}
