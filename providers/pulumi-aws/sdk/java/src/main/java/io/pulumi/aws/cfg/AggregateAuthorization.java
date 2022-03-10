// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cfg.AggregateAuthorizationArgs;
import io.pulumi.aws.cfg.inputs.AggregateAuthorizationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an AWS Config Aggregate Authorization
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Config aggregate authorizations can be imported using `account_id:region`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cfg/aggregateAuthorization:AggregateAuthorization example 123456789012:us-east-1
 * ```
 * 
 */
@ResourceType(type="aws:cfg/aggregateAuthorization:AggregateAuthorization")
public class AggregateAuthorization extends io.pulumi.resources.CustomResource {
    /**
     * Account ID
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Account ID
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The ARN of the authorization
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the authorization
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Region
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public void apply(AggregateAuthorizationArgs.Builder a);
    }
    private static io.pulumi.aws.cfg.AggregateAuthorizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cfg.AggregateAuthorizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AggregateAuthorization(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AggregateAuthorization(String name) {
        this(name, AggregateAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AggregateAuthorization(String name, AggregateAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AggregateAuthorization(String name, AggregateAuthorizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/aggregateAuthorization:AggregateAuthorization", name, args == null ? AggregateAuthorizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AggregateAuthorization(String name, Input<String> id, @Nullable AggregateAuthorizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/aggregateAuthorization:AggregateAuthorization", name, state, makeResourceOptions(options, id));
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
    public static AggregateAuthorization get(String name, Input<String> id, @Nullable AggregateAuthorizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AggregateAuthorization(name, id, state, options);
    }
}