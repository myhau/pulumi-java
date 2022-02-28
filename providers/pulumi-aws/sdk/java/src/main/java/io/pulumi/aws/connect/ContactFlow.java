// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.ContactFlowArgs;
import io.pulumi.aws.connect.inputs.ContactFlowState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Contact Flow resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * This resource embeds or references Contact Flows specified in Amazon Connect Contact Flow Language. For more information see
 * [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
 * 
 * !> **WARN:** Contact Flows exported from the Console [Contact Flow import/export](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/connect/describe-contact-flow.html).
 * See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Amazon Connect Contact Flows can be imported using the `instance_id` and `contact_flow_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/contactFlow:ContactFlow example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/contactFlow:ContactFlow")
public class ContactFlow extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Contact Flow.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Contact Flow.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The identifier of the Contact Flow.
     * 
     */
    @OutputExport(name="contactFlowId", type=String.class, parameters={})
    private Output<String> contactFlowId;

    /**
     * @return The identifier of the Contact Flow.
     * 
     */
    public Output<String> getContactFlowId() {
        return this.contactFlowId;
    }
    /**
     * Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    @OutputExport(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    public Output<String> getContent() {
        return this.content;
    }
    @OutputExport(name="contentHash", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentHash;

    public Output</* @Nullable */ String> getContentHash() {
        return this.contentHash;
    }
    /**
     * Specifies the description of the Contact Flow.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Contact Flow.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
     * 
     */
    @OutputExport(name="filename", type=String.class, parameters={})
    private Output</* @Nullable */ String> filename;

    /**
     * @return The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
     * 
     */
    public Output</* @Nullable */ String> getFilename() {
        return this.filename;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @OutputExport(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Contact Flow.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Contact Flow.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactFlow(String name) {
        this(name, ContactFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactFlow(String name, ContactFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactFlow(String name, ContactFlowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/contactFlow:ContactFlow", name, args == null ? ContactFlowArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContactFlow(String name, Input<String> id, @Nullable ContactFlowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/contactFlow:ContactFlow", name, state, makeResourceOptions(options, id));
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
    public static ContactFlow get(String name, Input<String> id, @Nullable ContactFlowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContactFlow(name, id, state, options);
    }
}
