// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.transfer.SshKeyArgs;
import io.pulumi.aws.transfer.inputs.SshKeyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a AWS Transfer User SSH Key resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Transfer SSH Public Key can be imported using the `server_id` and `user_name` and `ssh_public_key_id` separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:transfer/sshKey:SshKey bar s-12345678/test-username/key-12345
 * ```
 * 
 */
@ResourceType(type="aws:transfer/sshKey:SshKey")
public class SshKey extends io.pulumi.resources.CustomResource {
    /**
     * The public key portion of an SSH key pair.
     * 
     */
    @OutputExport(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return The public key portion of an SSH key pair.
     * 
     */
    public Output<String> getBody() {
        return this.body;
    }
    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @OutputExport(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    public Output<String> getServerId() {
        return this.serverId;
    }
    /**
     * The name of the user account that is assigned to one or more servers.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The name of the user account that is assigned to one or more servers.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(String name, SshKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/sshKey:SshKey", name, args == null ? SshKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SshKey(String name, Input<String> id, @Nullable SshKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/sshKey:SshKey", name, state, makeResourceOptions(options, id));
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
    public static SshKey get(String name, Input<String> id, @Nullable SshKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
