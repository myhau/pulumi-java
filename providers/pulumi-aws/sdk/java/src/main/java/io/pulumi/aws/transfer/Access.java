// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.transfer.AccessArgs;
import io.pulumi.aws.transfer.inputs.AccessState;
import io.pulumi.aws.transfer.outputs.AccessHomeDirectoryMapping;
import io.pulumi.aws.transfer.outputs.AccessPosixProfile;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a AWS Transfer Access resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Transfer Accesses can be imported using the `server_id` and `external_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:transfer/access:Access example s-12345678/S-1-1-12-1234567890-123456789-1234567890-1234
 * ```
 * 
 */
@ResourceType(type="aws:transfer/access:Access")
public class Access extends io.pulumi.resources.CustomResource {
    /**
     * The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @OutputExport(name="homeDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectory;

    /**
     * @return The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    public Output</* @Nullable */ String> getHomeDirectory() {
        return this.homeDirectory;
    }
    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @OutputExport(name="homeDirectoryMappings", type=List.class, parameters={AccessHomeDirectoryMapping.class})
    private Output</* @Nullable */ List<AccessHomeDirectoryMapping>> homeDirectoryMappings;

    /**
     * @return Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    public Output</* @Nullable */ List<AccessHomeDirectoryMapping>> getHomeDirectoryMappings() {
        return this.homeDirectoryMappings;
    }
    /**
     * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @OutputExport(name="homeDirectoryType", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectoryType;

    /**
     * @return The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    public Output</* @Nullable */ String> getHomeDirectoryType() {
        return this.homeDirectoryType;
    }
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output</* @Nullable */ String> policy;

    public Output</* @Nullable */ String> getPolicy() {
        return this.policy;
    }
    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @OutputExport(name="posixProfile", type=AccessPosixProfile.class, parameters={})
    private Output</* @Nullable */ AccessPosixProfile> posixProfile;

    /**
     * @return Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    public Output</* @Nullable */ AccessPosixProfile> getPosixProfile() {
        return this.posixProfile;
    }
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Access(String name) {
        this(name, AccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Access(String name, AccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Access(String name, AccessArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/access:Access", name, args == null ? AccessArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Access(String name, Input<String> id, @Nullable AccessState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/access:Access", name, state, makeResourceOptions(options, id));
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
    public static Access get(String name, Input<String> id, @Nullable AccessState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Access(name, id, state, options);
    }
}
