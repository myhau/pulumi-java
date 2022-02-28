// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mq.ConfigurationArgs;
import io.pulumi.aws.mq.inputs.ConfigurationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an MQ Configuration Resource.
 * 
 * For more information on Amazon MQ, see [Amazon MQ documentation](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/welcome.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MQ Configurations can be imported using the configuration ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mq/configuration:Configuration example c-0187d1eb-88c8-475a-9b79-16ef5a10c94f
 * ```
 * 
 */
@ResourceType(type="aws:mq/configuration:Configuration")
public class Configuration extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Authentication strategy associated with the configuration. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    @OutputExport(name="authenticationStrategy", type=String.class, parameters={})
    private Output<String> authenticationStrategy;

    /**
     * @return Authentication strategy associated with the configuration. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    public Output<String> getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }
    /**
     * Broker configuration in XML format. See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html) for supported parameters and format of the XML.
     * 
     */
    @OutputExport(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return Broker configuration in XML format. See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html) for supported parameters and format of the XML.
     * 
     */
    public Output<String> getData() {
        return this.data;
    }
    /**
     * Description of the configuration.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    @OutputExport(name="engineType", type=String.class, parameters={})
    private Output<String> engineType;

    /**
     * @return Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    public Output<String> getEngineType() {
        return this.engineType;
    }
    /**
     * Version of the broker engine.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Version of the broker engine.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Latest revision of the configuration.
     * 
     */
    @OutputExport(name="latestRevision", type=Integer.class, parameters={})
    private Output<Integer> latestRevision;

    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Output<Integer> getLatestRevision() {
        return this.latestRevision;
    }
    /**
     * Name of the configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Configuration(String name, Input<String> id, @Nullable ConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Input<String> id, @Nullable ConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
