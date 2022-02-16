// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicedirectory.NamespaceArgs;
import io.pulumi.gcp.servicedirectory.inputs.NamespaceState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:servicedirectory/namespace:Namespace")
public class Namespace extends io.pulumi.resources.CustomResource {
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    public Output<String> getNamespaceId() {
        return this.namespaceId;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public Namespace(String name, NamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Namespace(String name, Input<String> id, @Nullable NamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/namespace:Namespace", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Namespace get(String name, Input<String> id, @Nullable NamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}