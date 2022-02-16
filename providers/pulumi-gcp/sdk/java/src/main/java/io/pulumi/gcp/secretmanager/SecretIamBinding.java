// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.secretmanager.SecretIamBindingArgs;
import io.pulumi.gcp.secretmanager.inputs.SecretIamBindingState;
import io.pulumi.gcp.secretmanager.outputs.SecretIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:secretmanager/secretIamBinding:SecretIamBinding")
public class SecretIamBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=SecretIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ SecretIamBindingCondition> condition;

    public Output</* @Nullable */ SecretIamBindingCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
    @OutputExport(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId;
    }

    public SecretIamBinding(String name, SecretIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamBinding:SecretIamBinding", name, args == null ? SecretIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecretIamBinding(String name, Input<String> id, @Nullable SecretIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamBinding:SecretIamBinding", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SecretIamBinding get(String name, Input<String> id, @Nullable SecretIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretIamBinding(name, id, state, options);
    }
}