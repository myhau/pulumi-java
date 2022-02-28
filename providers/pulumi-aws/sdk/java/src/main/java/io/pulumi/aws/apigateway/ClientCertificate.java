// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.ClientCertificateArgs;
import io.pulumi.aws.apigateway.inputs.ClientCertificateState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Client Certificate.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * API Gateway Client Certificates can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/clientCertificate:ClientCertificate demo ab1cqe
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/clientCertificate:ClientCertificate")
public class ClientCertificate extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The date when the client certificate was created.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date when the client certificate was created.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The description of the client certificate.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the client certificate.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The date when the client certificate will expire.
     * 
     */
    @OutputExport(name="expirationDate", type=String.class, parameters={})
    private Output<String> expirationDate;

    /**
     * @return The date when the client certificate will expire.
     * 
     */
    public Output<String> getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The PEM-encoded public key of the client certificate.
     * 
     */
    @OutputExport(name="pemEncodedCertificate", type=String.class, parameters={})
    private Output<String> pemEncodedCertificate;

    /**
     * @return The PEM-encoded public key of the client certificate.
     * 
     */
    public Output<String> getPemEncodedCertificate() {
        return this.pemEncodedCertificate;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientCertificate(String name) {
        this(name, ClientCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/clientCertificate:ClientCertificate", name, args == null ? ClientCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ClientCertificate(String name, Input<String> id, @Nullable ClientCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/clientCertificate:ClientCertificate", name, state, makeResourceOptions(options, id));
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
    public static ClientCertificate get(String name, Input<String> id, @Nullable ClientCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClientCertificate(name, id, state, options);
    }
}
