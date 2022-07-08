// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.EntryArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates key value entries in a key value map scoped to an organization, environment, or API proxy.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Entry")
public class Entry extends com.pulumi.resources.CustomResource {
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }
    @Export(name="keyvaluemapId", type=String.class, parameters={})
    private Output<String> keyvaluemapId;

    public Output<String> keyvaluemapId() {
        return this.keyvaluemapId;
    }
    /**
     * Resource URI that can be used to identify the scope of the key value map entries.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource URI that can be used to identify the scope of the key value map entries.
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
     * Data or payload that is being retrieved and associated with the unique key.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Data or payload that is being retrieved and associated with the unique key.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entry(String name) {
        this(name, EntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entry(String name, EntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entry(String name, EntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Entry", name, args == null ? EntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Entry(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Entry", name, null, makeResourceOptions(options, id));
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
    public static Entry get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Entry(name, id, options);
    }
}
