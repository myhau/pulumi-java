// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.KeyPairArgs;
import io.pulumi.aws.ec2.inputs.KeyPairState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an [EC2 key pair](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) resource. A key pair is used to control login access to EC2 instances.
 * 
 * Currently this resource requires an existing user-supplied key pair. This key pair's public key will be registered with AWS to allow logging-in to EC2 instances.
 * 
 * When importing an existing key pair the public key material may be in any format supported by AWS. Supported formats (per the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws)) are:
 * 
 * * OpenSSH public key format (the format in ~/.ssh/authorized_keys)
 * * Base64 encoded DER format
 * * SSH public key file format as specified in RFC4716
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Key Pairs can be imported using the `key_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/keyPair:KeyPair deployer deployer-key
 * ```
 * 
 */
@ResourceType(type="aws:ec2/keyPair:KeyPair")
public class KeyPair extends io.pulumi.resources.CustomResource {
    /**
     * The key pair ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The key pair ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The name for the key pair.
     * 
     */
    @OutputExport(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return The name for the key pair.
     * 
     */
    public Output<String> getKeyName() {
        return this.keyName;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
     * 
     */
    @OutputExport(name="keyNamePrefix", type=String.class, parameters={})
    private Output<String> keyNamePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
     * 
     */
    public Output<String> getKeyNamePrefix() {
        return this.keyNamePrefix;
    }
    /**
     * The key pair ID.
     * 
     */
    @OutputExport(name="keyPairId", type=String.class, parameters={})
    private Output<String> keyPairId;

    /**
     * @return The key pair ID.
     * 
     */
    public Output<String> getKeyPairId() {
        return this.keyPairId;
    }
    /**
     * The public key material.
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key material.
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyPair(String name) {
        this(name, KeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyPair(String name, KeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyPair(String name, KeyPairArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/keyPair:KeyPair", name, args == null ? KeyPairArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KeyPair(String name, Input<String> id, @Nullable KeyPairState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/keyPair:KeyPair", name, state, makeResourceOptions(options, id));
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
    public static KeyPair get(String name, Input<String> id, @Nullable KeyPairState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyPair(name, id, state, options);
    }
}
