// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.chime.VoiceConnectorOrganizationArgs;
import io.pulumi.aws.chime.inputs.VoiceConnectorOrganizationState;
import io.pulumi.aws.chime.outputs.VoiceConnectorOrganizationRoute;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Enable origination settings to control inbound calling to your SIP infrastructure.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Chime Voice Connector Origination can be imported using the `voice_connector_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization default abcdef1ghij2klmno3pqr4
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization")
public class VoiceConnectorOrganization extends io.pulumi.resources.CustomResource {
    /**
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * 
     */
    @OutputExport(name="routes", type=List.class, parameters={VoiceConnectorOrganizationRoute.class})
    private Output<List<VoiceConnectorOrganizationRoute>> routes;

    /**
     * @return Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * 
     */
    public Output<List<VoiceConnectorOrganizationRoute>> getRoutes() {
        return this.routes;
    }
    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @OutputExport(name="voiceConnectorId", type=String.class, parameters={})
    private Output<String> voiceConnectorId;

    /**
     * @return The Amazon Chime Voice Connector ID.
     * 
     */
    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public interface BuilderApplicator {
        public void apply(VoiceConnectorOrganizationArgs.Builder a);
    }
    private static io.pulumi.aws.chime.VoiceConnectorOrganizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.chime.VoiceConnectorOrganizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VoiceConnectorOrganization(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnectorOrganization(String name) {
        this(name, VoiceConnectorOrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnectorOrganization(String name, VoiceConnectorOrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnectorOrganization(String name, VoiceConnectorOrganizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization", name, args == null ? VoiceConnectorOrganizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VoiceConnectorOrganization(String name, Input<String> id, @Nullable VoiceConnectorOrganizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization", name, state, makeResourceOptions(options, id));
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
    public static VoiceConnectorOrganization get(String name, Input<String> id, @Nullable VoiceConnectorOrganizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnectorOrganization(name, id, state, options);
    }
}