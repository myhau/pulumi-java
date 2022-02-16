// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.ProjectArgs;
import io.pulumi.awsnative.evidently.outputs.ProjectDataDeliveryObject;
import io.pulumi.awsnative.evidently.outputs.ProjectTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:evidently:Project")
public class Project extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="dataDelivery", type=ProjectDataDeliveryObject.class, parameters={})
    private Output</* @Nullable */ ProjectDataDeliveryObject> dataDelivery;

    public Output</* @Nullable */ ProjectDataDeliveryObject> getDataDelivery() {
        return this.dataDelivery;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    public Output</* @Nullable */ List<ProjectTag>> getTags() {
        return this.tags;
    }

    public Project(String name, @Nullable ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Project(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Project", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Project get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}