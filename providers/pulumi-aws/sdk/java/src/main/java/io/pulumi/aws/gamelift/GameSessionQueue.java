// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.gamelift.GameSessionQueueArgs;
import io.pulumi.aws.gamelift.inputs.GameSessionQueueState;
import io.pulumi.aws.gamelift.outputs.GameSessionQueuePlayerLatencyPolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Gamelift Game Session Queue resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Gamelift Game Session Queues can be imported by their `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:gamelift/gameSessionQueue:GameSessionQueue example example
 * ```
 * 
 */
@ResourceType(type="aws:gamelift/gameSessionQueue:GameSessionQueue")
public class GameSessionQueue extends io.pulumi.resources.CustomResource {
    /**
     * Game Session Queue ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Game Session Queue ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     * 
     */
    @OutputExport(name="destinations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> destinations;

    /**
     * @return List of fleet/alias ARNs used by session queue for placing game sessions.
     * 
     */
    public Output</* @Nullable */ List<String>> getDestinations() {
        return this.destinations;
    }
    /**
     * Name of the session queue.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the session queue.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * One or more policies used to choose fleet based on player latency. See below.
     * 
     */
    @OutputExport(name="playerLatencyPolicies", type=List.class, parameters={GameSessionQueuePlayerLatencyPolicy.class})
    private Output</* @Nullable */ List<GameSessionQueuePlayerLatencyPolicy>> playerLatencyPolicies;

    /**
     * @return One or more policies used to choose fleet based on player latency. See below.
     * 
     */
    public Output</* @Nullable */ List<GameSessionQueuePlayerLatencyPolicy>> getPlayerLatencyPolicies() {
        return this.playerLatencyPolicies;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Maximum time a game session request can remain in the queue.
     * 
     */
    @OutputExport(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInSeconds;

    /**
     * @return Maximum time a game session request can remain in the queue.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameSessionQueue(String name) {
        this(name, GameSessionQueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameSessionQueue(String name, @Nullable GameSessionQueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameSessionQueue(String name, @Nullable GameSessionQueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/gameSessionQueue:GameSessionQueue", name, args == null ? GameSessionQueueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GameSessionQueue(String name, Input<String> id, @Nullable GameSessionQueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/gameSessionQueue:GameSessionQueue", name, state, makeResourceOptions(options, id));
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
    public static GameSessionQueue get(String name, Input<String> id, @Nullable GameSessionQueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameSessionQueue(name, id, state, options);
    }
}
