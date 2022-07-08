// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager.v1.LienArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create a Lien which applies to the resource denoted by the `parent` field. Callers of this method will require permission on the `parent` resource. For example, applying to `projects/1234` requires permission `resourcemanager.projects.updateLiens`. NOTE: Some resources may limit the number of Liens which may be applied.
 * 
 */
@ResourceType(type="google-native:cloudresourcemanager/v1:Lien")
public class Lien extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of this Lien.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of this Lien.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    @Export(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    @Export(name="reason", type=String.class, parameters={})
    private Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    public Output<String> reason() {
        return this.reason;
    }
    /**
     * The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    @Export(name="restrictions", type=List.class, parameters={String.class})
    private Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public Output<List<String>> restrictions() {
        return this.restrictions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lien(String name) {
        this(name, LienArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lien(String name, @Nullable LienArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lien(String name, @Nullable LienArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v1:Lien", name, args == null ? LienArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lien(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v1:Lien", name, null, makeResourceOptions(options, id));
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
    public static Lien get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Lien(name, id, options);
    }
}
