// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.DomainNameArgs;
import io.pulumi.aws.apigatewayv2.inputs.DomainNameState;
import io.pulumi.aws.apigatewayv2.outputs.DomainNameDomainNameConfiguration;
import io.pulumi.aws.apigatewayv2.outputs.DomainNameMutualTlsAuthentication;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 domain name.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
 * 
 * > **Note:** This resource establishes ownership of and the TLS settings for
 * a particular domain name. An API stage can be associated with the domain name using the `aws.apigatewayv2.ApiMapping` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_domain_name` can be imported by using the domain name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/domainName:DomainName example ws-api.example.com
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/domainName:DomainName")
public class DomainName extends io.pulumi.resources.CustomResource {
    /**
     * The [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
     * 
     */
    @OutputExport(name="apiMappingSelectionExpression", type=String.class, parameters={})
    private Output<String> apiMappingSelectionExpression;

    /**
     * @return The [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
     * 
     */
    public Output<String> getApiMappingSelectionExpression() {
        return this.apiMappingSelectionExpression;
    }
    /**
     * The ARN of the domain name.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the domain name.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The domain name. Must be between 1 and 512 characters in length.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name. Must be between 1 and 512 characters in length.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The domain name configuration.
     * 
     */
    @OutputExport(name="domainNameConfiguration", type=DomainNameDomainNameConfiguration.class, parameters={})
    private Output<DomainNameDomainNameConfiguration> domainNameConfiguration;

    /**
     * @return The domain name configuration.
     * 
     */
    public Output<DomainNameDomainNameConfiguration> getDomainNameConfiguration() {
        return this.domainNameConfiguration;
    }
    /**
     * The mutual TLS authentication configuration for the domain name.
     * 
     */
    @OutputExport(name="mutualTlsAuthentication", type=DomainNameMutualTlsAuthentication.class, parameters={})
    private Output</* @Nullable */ DomainNameMutualTlsAuthentication> mutualTlsAuthentication;

    /**
     * @return The mutual TLS authentication configuration for the domain name.
     * 
     */
    public Output</* @Nullable */ DomainNameMutualTlsAuthentication> getMutualTlsAuthentication() {
        return this.mutualTlsAuthentication;
    }
    /**
     * A map of tags to assign to the domain name. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the domain name. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public interface BuilderApplicator {
        public void apply(DomainNameArgs.Builder a);
    }
    private static io.pulumi.aws.apigatewayv2.DomainNameArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigatewayv2.DomainNameArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DomainName(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainName(String name) {
        this(name, DomainNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainName(String name, DomainNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainName(String name, DomainNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/domainName:DomainName", name, args == null ? DomainNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainName(String name, Input<String> id, @Nullable DomainNameState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/domainName:DomainName", name, state, makeResourceOptions(options, id));
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
    public static DomainName get(String name, Input<String> id, @Nullable DomainNameState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainName(name, id, state, options);
    }
}