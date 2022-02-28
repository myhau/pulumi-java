// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lex.BotAliasArgs;
import io.pulumi.aws.lex.inputs.BotAliasState;
import io.pulumi.aws.lex.outputs.BotAliasConversationLogs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Lex Bot Alias resource. For more information see
 * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Bot aliases can be imported using an ID with the format `bot_name:bot_alias_name`.
 * 
 * ```sh
 *  $ pulumi import aws:lex/botAlias:BotAlias order_flowers_prod OrderFlowers:OrderFlowersProd
 * ```
 * 
 */
@ResourceType(type="aws:lex/botAlias:BotAlias")
public class BotAlias extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the bot alias.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the bot alias.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the bot.
     * 
     */
    @OutputExport(name="botName", type=String.class, parameters={})
    private Output<String> botName;

    /**
     * @return The name of the bot.
     * 
     */
    public Output<String> getBotName() {
        return this.botName;
    }
    /**
     * The name of the bot.
     * 
     */
    @OutputExport(name="botVersion", type=String.class, parameters={})
    private Output<String> botVersion;

    /**
     * @return The name of the bot.
     * 
     */
    public Output<String> getBotVersion() {
        return this.botVersion;
    }
    /**
     * Checksum of the bot alias.
     * 
     */
    @OutputExport(name="checksum", type=String.class, parameters={})
    private Output<String> checksum;

    /**
     * @return Checksum of the bot alias.
     * 
     */
    public Output<String> getChecksum() {
        return this.checksum;
    }
    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    @OutputExport(name="conversationLogs", type=BotAliasConversationLogs.class, parameters={})
    private Output</* @Nullable */ BotAliasConversationLogs> conversationLogs;

    /**
     * @return The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    public Output</* @Nullable */ BotAliasConversationLogs> getConversationLogs() {
        return this.conversationLogs;
    }
    /**
     * The date that the bot alias was created.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date that the bot alias was created.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    @OutputExport(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotAlias(String name) {
        this(name, BotAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotAlias(String name, BotAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotAlias(String name, BotAliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/botAlias:BotAlias", name, args == null ? BotAliasArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BotAlias(String name, Input<String> id, @Nullable BotAliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/botAlias:BotAlias", name, state, makeResourceOptions(options, id));
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
    public static BotAlias get(String name, Input<String> id, @Nullable BotAliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BotAlias(name, id, state, options);
    }
}
