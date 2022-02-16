// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
import io.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState;
import io.pulumi.gcp.healthcare.outputs.DicomStoreIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember")
public class DicomStoreIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=DicomStoreIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ DicomStoreIamMemberCondition> condition;

    public Output</* @Nullable */ DicomStoreIamMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="dicomStoreId", type=String.class, parameters={})
    private Output<String> dicomStoreId;

    public Output<String> getDicomStoreId() {
        return this.dicomStoreId;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public DicomStoreIamMember(String name, DicomStoreIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, args == null ? DicomStoreIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DicomStoreIamMember(String name, Input<String> id, @Nullable DicomStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DicomStoreIamMember get(String name, Input<String> id, @Nullable DicomStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DicomStoreIamMember(name, id, state, options);
    }
}