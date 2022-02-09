// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.WatcherArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:automation:Watcher")
public class Watcher extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="executionFrequencyInSeconds", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> executionFrequencyInSeconds;

    public Output</* @Nullable */ Double> getExecutionFrequencyInSeconds() {
        return this.executionFrequencyInSeconds;
    }
    @OutputExport(name="lastModifiedBy", type=String.class, parameters={})
    private Output<String> lastModifiedBy;

    public Output<String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="scriptName", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptName;

    public Output</* @Nullable */ String> getScriptName() {
        return this.scriptName;
    }
    @OutputExport(name="scriptParameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> scriptParameters;

    public Output</* @Nullable */ Map<String,String>> getScriptParameters() {
        return this.scriptParameters;
    }
    @OutputExport(name="scriptRunOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptRunOn;

    public Output</* @Nullable */ String> getScriptRunOn() {
        return this.scriptRunOn;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Watcher(String name, WatcherArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Watcher", name, args == null ? WatcherArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Watcher(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Watcher", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:Watcher").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:Watcher").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:Watcher").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Watcher get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Watcher(name, id, options);
    }
}