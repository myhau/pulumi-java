// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.TemplateArgs;
import io.pulumi.aws.ses.inputs.TemplateState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a SES template.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES templates can be imported using the template name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/template:Template MyTemplate MyTemplate
 * ```
 * 
 */
@ResourceType(type="aws:ses/template:Template")
public class Template extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the SES template
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the SES template
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @OutputExport(name="html", type=String.class, parameters={})
    private Output</* @Nullable */ String> html;

    /**
     * @return The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    public Output</* @Nullable */ String> getHtml() {
        return this.html;
    }
    /**
     * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The subject line of the email.
     * 
     */
    @OutputExport(name="subject", type=String.class, parameters={})
    private Output</* @Nullable */ String> subject;

    /**
     * @return The subject line of the email.
     * 
     */
    public Output</* @Nullable */ String> getSubject() {
        return this.subject;
    }
    /**
     * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @OutputExport(name="text", type=String.class, parameters={})
    private Output</* @Nullable */ String> text;

    /**
     * @return The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    public Output</* @Nullable */ String> getText() {
        return this.text;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, @Nullable TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, @Nullable TemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/template:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Template(String name, Input<String> id, @Nullable TemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/template:Template", name, state, makeResourceOptions(options, id));
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
    public static Template get(String name, Input<String> id, @Nullable TemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, state, options);
    }
}
