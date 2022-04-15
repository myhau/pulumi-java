// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSitePushSettingsArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Push settings for the App.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSitePushSettings myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/pushsettings 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSitePushSettings")
public class WebAppSitePushSettings extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @Export(name="dynamicTagsJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> dynamicTagsJson;

    /**
     * @return Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    public Output</* @Nullable */ String> dynamicTagsJson() {
        return this.dynamicTagsJson;
    }
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @Export(name="isPushEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPushEnabled;

    /**
     * @return Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    public Output<Boolean> isPushEnabled() {
        return this.isPushEnabled;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @Export(name="tagWhitelistJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagWhitelistJson;

    /**
     * @return Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    public Output</* @Nullable */ String> tagWhitelistJson() {
        return this.tagWhitelistJson;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    @Export(name="tagsRequiringAuth", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagsRequiringAuth;

    /**
     * @return Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    public Output</* @Nullable */ String> tagsRequiringAuth() {
        return this.tagsRequiringAuth;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSitePushSettings(String name) {
        this(name, WebAppSitePushSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSitePushSettings(String name, WebAppSitePushSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSitePushSettings(String name, WebAppSitePushSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettings", name, args == null ? WebAppSitePushSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSitePushSettings(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettings", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSitePushSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSitePushSettings").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WebAppSitePushSettings get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSitePushSettings(name, id, options);
    }
}
