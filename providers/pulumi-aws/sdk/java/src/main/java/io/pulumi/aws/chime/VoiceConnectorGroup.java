// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.chime.VoiceConnectorGroupArgs;
import io.pulumi.aws.chime.inputs.VoiceConnectorGroupState;
import io.pulumi.aws.chime.outputs.VoiceConnectorGroupConnector;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request.
 * 
 * You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Configuration Recorder can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorGroup:VoiceConnectorGroup default example
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnectorGroup:VoiceConnectorGroup")
public class VoiceConnectorGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * 
     */
    @OutputExport(name="connectors", type=List.class, parameters={VoiceConnectorGroupConnector.class})
    private Output</* @Nullable */ List<VoiceConnectorGroupConnector>> connectors;

    /**
     * @return The Amazon Chime Voice Connectors to route inbound calls to.
     * 
     */
    public Output</* @Nullable */ List<VoiceConnectorGroupConnector>> getConnectors() {
        return this.connectors;
    }
    /**
     * The name of the Amazon Chime Voice Connector group.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Amazon Chime Voice Connector group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnectorGroup(String name) {
        this(name, VoiceConnectorGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnectorGroup(String name, @Nullable VoiceConnectorGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnectorGroup(String name, @Nullable VoiceConnectorGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorGroup:VoiceConnectorGroup", name, args == null ? VoiceConnectorGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VoiceConnectorGroup(String name, Input<String> id, @Nullable VoiceConnectorGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorGroup:VoiceConnectorGroup", name, state, makeResourceOptions(options, id));
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
    public static VoiceConnectorGroup get(String name, Input<String> id, @Nullable VoiceConnectorGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnectorGroup(name, id, state, options);
    }
}
