// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
import io.pulumi.gcp.bigtable.inputs.InstanceIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
 * 
 * * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
 * * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
 * * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
 * 
 * > **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
 * 
 * > **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigtable\_instance\_iam\_policy
 * 
 * ## google\_bigtable\_instance\_iam\_binding
 * 
 * ## google\_bigtable\_instance\_iam\_member
 * 
 * ## Import
 * 
 * Instance IAM resources can be imported using the project, instance name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamPolicy:InstanceIamPolicy editor "projects/{project}/instances/{instance}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamPolicy:InstanceIamPolicy editor "projects/{project}/instances/{instance} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamPolicy:InstanceIamPolicy editor "projects/{project}/instances/{instance} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigtable/instanceIamPolicy:InstanceIamPolicy")
public class InstanceIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the instances's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the instances's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIamPolicy(String name, InstanceIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamPolicy:InstanceIamPolicy", name, args == null ? InstanceIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceIamPolicy(String name, Input<String> id, @Nullable InstanceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamPolicy:InstanceIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static InstanceIamPolicy get(String name, Input<String> id, @Nullable InstanceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIamPolicy(name, id, state, options);
    }
}
