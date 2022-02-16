// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datastore.DataStoreIndexArgs;
import io.pulumi.gcp.datastore.inputs.DataStoreIndexState;
import io.pulumi.gcp.datastore.outputs.DataStoreIndexProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:datastore/dataStoreIndex:DataStoreIndex")
public class DataStoreIndex extends io.pulumi.resources.CustomResource {
    @OutputExport(name="ancestor", type=String.class, parameters={})
    private Output</* @Nullable */ String> ancestor;

    public Output</* @Nullable */ String> getAncestor() {
        return this.ancestor;
    }
    @OutputExport(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    public Output<String> getIndexId() {
        return this.indexId;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="properties", type=List.class, parameters={DataStoreIndexProperty.class})
    private Output</* @Nullable */ List<DataStoreIndexProperty>> properties;

    public Output</* @Nullable */ List<DataStoreIndexProperty>> getProperties() {
        return this.properties;
    }

    public DataStoreIndex(String name, DataStoreIndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastore/dataStoreIndex:DataStoreIndex", name, args == null ? DataStoreIndexArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataStoreIndex(String name, Input<String> id, @Nullable DataStoreIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastore/dataStoreIndex:DataStoreIndex", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DataStoreIndex get(String name, Input<String> id, @Nullable DataStoreIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataStoreIndex(name, id, state, options);
    }
}