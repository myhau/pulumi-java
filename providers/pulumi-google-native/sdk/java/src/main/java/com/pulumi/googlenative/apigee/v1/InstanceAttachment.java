// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.InstanceAttachmentArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new attachment of an environment to an instance. **Note:** Not supported for Apigee hybrid.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:InstanceAttachment")
public class InstanceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Time the attachment was created in milliseconds since epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time the attachment was created in milliseconds since epoch.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * ID of the attached environment.
     * 
     */
    @Export(name="environment", type=String.class, parameters={})
    private Output<String> environment;

    /**
     * @return ID of the attached environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * ID of the attachment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return ID of the attachment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceAttachment(String name) {
        this(name, InstanceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceAttachment(String name, InstanceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceAttachment(String name, InstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:InstanceAttachment", name, args == null ? InstanceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceAttachment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:InstanceAttachment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceAttachment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceAttachment(name, id, options);
    }
}
