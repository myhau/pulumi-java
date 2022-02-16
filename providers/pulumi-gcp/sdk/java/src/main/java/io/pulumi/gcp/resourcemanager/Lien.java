// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.resourcemanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.resourcemanager.LienArgs;
import io.pulumi.gcp.resourcemanager.inputs.LienState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:resourcemanager/lien:Lien")
public class Lien extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    public Output<String> getOrigin() {
        return this.origin;
    }
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }
    @OutputExport(name="reason", type=String.class, parameters={})
    private Output<String> reason;

    public Output<String> getReason() {
        return this.reason;
    }
    @OutputExport(name="restrictions", type=List.class, parameters={String.class})
    private Output<List<String>> restrictions;

    public Output<List<String>> getRestrictions() {
        return this.restrictions;
    }

    public Lien(String name, LienArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, args == null ? LienArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Lien(String name, Input<String> id, @Nullable LienState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Lien get(String name, Input<String> id, @Nullable LienState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Lien(name, id, state, options);
    }
}