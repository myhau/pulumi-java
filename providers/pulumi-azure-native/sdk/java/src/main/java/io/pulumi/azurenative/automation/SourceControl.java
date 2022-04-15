// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.SourceControlArgs;
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
 * Definition of the source control.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:SourceControl sampleSourceControl /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/sampleAccount9/sourcecontrols/sampleSourceControl 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:SourceControl")
public class SourceControl extends io.pulumi.resources.CustomResource {
    /**
     * The auto sync of the source control. Default is false.
     * 
     */
    @Export(name="autoSync", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoSync;

    /**
     * @return The auto sync of the source control. Default is false.
     * 
     */
    public Output</* @Nullable */ Boolean> autoSync() {
        return this.autoSync;
    }
    /**
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    @Export(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    /**
     * @return The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    public Output</* @Nullable */ String> branch() {
        return this.branch;
    }
    /**
     * The creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return The creation time.
     * 
     */
    public Output</* @Nullable */ String> creationTime() {
        return this.creationTime;
    }
    /**
     * The description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The folder path of the source control.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderPath;

    /**
     * @return The folder path of the source control.
     * 
     */
    public Output</* @Nullable */ String> folderPath() {
        return this.folderPath;
    }
    /**
     * The last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return The last modified time.
     * 
     */
    public Output</* @Nullable */ String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The auto publish of the source control. Default is true.
     * 
     */
    @Export(name="publishRunbook", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publishRunbook;

    /**
     * @return The auto publish of the source control. Default is true.
     * 
     */
    public Output</* @Nullable */ Boolean> publishRunbook() {
        return this.publishRunbook;
    }
    /**
     * The repo url of the source control.
     * 
     */
    @Export(name="repoUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repoUrl;

    /**
     * @return The repo url of the source control.
     * 
     */
    public Output</* @Nullable */ String> repoUrl() {
        return this.repoUrl;
    }
    /**
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     * 
     */
    public Output</* @Nullable */ String> sourceType() {
        return this.sourceType;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceControl(String name) {
        this(name, SourceControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceControl(String name, SourceControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceControl(String name, SourceControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, args == null ? SourceControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceControl(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20170515preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:SourceControl").build())
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
    public static SourceControl get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SourceControl(name, id, options);
    }
}
