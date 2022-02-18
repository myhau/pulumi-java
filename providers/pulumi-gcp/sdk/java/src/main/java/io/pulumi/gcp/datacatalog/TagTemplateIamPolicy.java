// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy")
public class TagTemplateIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="tagTemplate", type=String.class, parameters={})
    private Output<String> tagTemplate;

    public Output<String> getTagTemplate() {
        return this.tagTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagTemplateIamPolicy(String name, TagTemplateIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, args == null ? TagTemplateIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TagTemplateIamPolicy(String name, Input<String> id, @Nullable TagTemplateIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagTemplateIamPolicy get(String name, Input<String> id, @Nullable TagTemplateIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagTemplateIamPolicy(name, id, state, options);
    }
}
