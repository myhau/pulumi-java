// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs;
import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigState;
import io.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigContentTypeProfileConfig;
import io.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigQueryArgProfileConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudFront Field-level Encryption Config resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloudfront Field Level Encryption Config can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:cloudfront/fieldLevelEncryptionConfig:FieldLevelEncryptionConfig config E74FTE3AEXAMPLE
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/fieldLevelEncryptionConfig:FieldLevelEncryptionConfig")
public class FieldLevelEncryptionConfig extends io.pulumi.resources.CustomResource {
    /**
     * Internal value used by CloudFront to allow future updates to the Field Level Encryption Config.
     * 
     */
    @OutputExport(name="callerReference", type=String.class, parameters={})
    private Output<String> callerReference;

    /**
     * @return Internal value used by CloudFront to allow future updates to the Field Level Encryption Config.
     * 
     */
    public Output<String> getCallerReference() {
        return this.callerReference;
    }
    /**
     * An optional comment about the Field Level Encryption Config.
     * 
     */
    @OutputExport(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return An optional comment about the Field Level Encryption Config.
     * 
     */
    public Output</* @Nullable */ String> getComment() {
        return this.comment;
    }
    /**
     * Content Type Profile Config specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
     * 
     */
    @OutputExport(name="contentTypeProfileConfig", type=FieldLevelEncryptionConfigContentTypeProfileConfig.class, parameters={})
    private Output<FieldLevelEncryptionConfigContentTypeProfileConfig> contentTypeProfileConfig;

    /**
     * @return Content Type Profile Config specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
     * 
     */
    public Output<FieldLevelEncryptionConfigContentTypeProfileConfig> getContentTypeProfileConfig() {
        return this.contentTypeProfileConfig;
    }
    /**
     * The current version of the Field Level Encryption Config. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The current version of the Field Level Encryption Config. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Query Arg Profile Config that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
     * 
     */
    @OutputExport(name="queryArgProfileConfig", type=FieldLevelEncryptionConfigQueryArgProfileConfig.class, parameters={})
    private Output<FieldLevelEncryptionConfigQueryArgProfileConfig> queryArgProfileConfig;

    /**
     * @return Query Arg Profile Config that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
     * 
     */
    public Output<FieldLevelEncryptionConfigQueryArgProfileConfig> getQueryArgProfileConfig() {
        return this.queryArgProfileConfig;
    }

    public interface BuilderApplicator {
        public void apply(FieldLevelEncryptionConfigArgs.Builder a);
    }
    private static io.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FieldLevelEncryptionConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FieldLevelEncryptionConfig(String name) {
        this(name, FieldLevelEncryptionConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FieldLevelEncryptionConfig(String name, FieldLevelEncryptionConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FieldLevelEncryptionConfig(String name, FieldLevelEncryptionConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/fieldLevelEncryptionConfig:FieldLevelEncryptionConfig", name, args == null ? FieldLevelEncryptionConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FieldLevelEncryptionConfig(String name, Input<String> id, @Nullable FieldLevelEncryptionConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/fieldLevelEncryptionConfig:FieldLevelEncryptionConfig", name, state, makeResourceOptions(options, id));
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
    public static FieldLevelEncryptionConfig get(String name, Input<String> id, @Nullable FieldLevelEncryptionConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FieldLevelEncryptionConfig(name, id, state, options);
    }
}