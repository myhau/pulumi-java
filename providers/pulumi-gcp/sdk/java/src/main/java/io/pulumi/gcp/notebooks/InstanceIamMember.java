// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.InstanceIamMemberArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceIamMemberState;
import io.pulumi.gcp.notebooks.outputs.InstanceIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:notebooks/instanceIamMember:InstanceIamMember")
public class InstanceIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=InstanceIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ InstanceIamMemberCondition> condition;

    public Output</* @Nullable */ InstanceIamMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public InstanceIamMember(String name, InstanceIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instanceIamMember:InstanceIamMember", name, args == null ? InstanceIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceIamMember(String name, Input<String> id, @Nullable InstanceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instanceIamMember:InstanceIamMember", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static InstanceIamMember get(String name, Input<String> id, @Nullable InstanceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIamMember(name, id, state, options);
    }
}