// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.osconfig.v1beta.GuestPolicyArgs;
import com.pulumi.googlenative.osconfig.v1beta.outputs.AssignmentResponse;
import com.pulumi.googlenative.osconfig.v1beta.outputs.PackageRepositoryResponse;
import com.pulumi.googlenative.osconfig.v1beta.outputs.PackageResponse;
import com.pulumi.googlenative.osconfig.v1beta.outputs.SoftwareRecipeResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create an OS Config guest policy.
 * 
 */
@ResourceType(type="google-native:osconfig/v1beta:GuestPolicy")
public class GuestPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    @Export(name="assignment", type=AssignmentResponse.class, parameters={})
    private Output<AssignmentResponse> assignment;

    /**
     * @return Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    public Output<AssignmentResponse> assignment() {
        return this.assignment;
    }
    /**
     * Time this guest policy was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time this guest policy was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    @Export(name="guestPolicyId", type=String.class, parameters={})
    private Output<String> guestPolicyId;

    /**
     * @return Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    public Output<String> guestPolicyId() {
        return this.guestPolicyId;
    }
    /**
     * Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    @Export(name="packageRepositories", type=List.class, parameters={PackageRepositoryResponse.class})
    private Output<List<PackageRepositoryResponse>> packageRepositories;

    /**
     * @return A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    public Output<List<PackageRepositoryResponse>> packageRepositories() {
        return this.packageRepositories;
    }
    /**
     * The software packages to be managed by this policy.
     * 
     */
    @Export(name="packages", type=List.class, parameters={PackageResponse.class})
    private Output<List<PackageResponse>> packages;

    /**
     * @return The software packages to be managed by this policy.
     * 
     */
    public Output<List<PackageResponse>> packages() {
        return this.packages;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * A list of Recipes to install on the VM instance.
     * 
     */
    @Export(name="recipes", type=List.class, parameters={SoftwareRecipeResponse.class})
    private Output<List<SoftwareRecipeResponse>> recipes;

    /**
     * @return A list of Recipes to install on the VM instance.
     * 
     */
    public Output<List<SoftwareRecipeResponse>> recipes() {
        return this.recipes;
    }
    /**
     * Last time this guest policy was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last time this guest policy was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestPolicy(String name) {
        this(name, GuestPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestPolicy(String name, GuestPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestPolicy(String name, GuestPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:osconfig/v1beta:GuestPolicy", name, args == null ? GuestPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:osconfig/v1beta:GuestPolicy", name, null, makeResourceOptions(options, id));
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
    public static GuestPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GuestPolicy(name, id, options);
    }
}
