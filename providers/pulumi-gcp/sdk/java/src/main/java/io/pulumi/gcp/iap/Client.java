// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.ClientArgs;
import io.pulumi.gcp.iap.inputs.ClientState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Contains the data that describes an Identity Aware Proxy owned client.
 * 
 * > **Note:** Only internal org clients can be created via declarative tools. External clients must be
 * manually created via the GCP console. This restriction is due to the existing APIs and not lack of support
 * in this tool.
 * 
 * To get more information about Client, see:
 * 
 * * [API documentation](https://cloud.google.com/iap/docs/reference/rest/v1/projects.brands.identityAwareProxyClients)
 * * How-to Guides
 *     * [Setting up IAP Client](https://cloud.google.com/iap/docs/authentication-howto)
 * 
 * > **Warning:** All arguments including `secret` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Client can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:iap/client:Client default {{brand}}/identityAwareProxyClients/{{client_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iap/client:Client default {{brand}}/{{client_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iap/client:Client")
public class Client extends io.pulumi.resources.CustomResource {
    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    @OutputExport(name="brand", type=String.class, parameters={})
    private Output<String> brand;

    /**
     * @return Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    public Output<String> getBrand() {
        return this.brand;
    }
    /**
     * Output only. Unique identifier of the OAuth client.
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return Output only. Unique identifier of the OAuth client.
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Output only. Client secret of the OAuth client.
     * 
     */
    @OutputExport(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return Output only. Client secret of the OAuth client.
     * 
     */
    public Output<String> getSecret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Client(String name, ClientArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/client:Client", name, args == null ? ClientArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Client(String name, Input<String> id, @Nullable ClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/client:Client", name, state, makeResourceOptions(options, id));
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
    public static Client get(String name, Input<String> id, @Nullable ClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Client(name, id, state, options);
    }
}
