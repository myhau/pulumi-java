// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.artifactregistry;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
import io.pulumi.gcp.artifactregistry.inputs.RepositoryIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
 * 
 * * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
 * * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
 * * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
 * 
 * > **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_artifact\_registry\_repository\_iam\_policy
 * 
 * ## google\_artifact\_registry\_repository\_iam\_binding
 * 
 * ## google\_artifact\_registry\_repository\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/repositories/{{repository}} * {{project}}/{{location}}/{{repository}} * {{location}}/{{repository}} * {{repository}} Any variables not passed in the import command will be taken from the provider configuration. Artifact Registry repository IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy editor "projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy editor "projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy editor projects/{{project}}/locations/{{location}}/repositories/{{repository}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy")
public class RepositoryIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the location this repository is located in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getRepository() {
        return this.repository;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryIamPolicy(String name, RepositoryIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy", name, args == null ? RepositoryIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RepositoryIamPolicy(String name, Input<String> id, @Nullable RepositoryIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static RepositoryIamPolicy get(String name, Input<String> id, @Nullable RepositoryIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryIamPolicy(name, id, state, options);
    }
}
