// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.AccessPolicyArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AccessPolicy is a container for AccessLevels (which define the necessary
 * attributes to use GCP services) and ServicePerimeters (which define
 * regions of services able to freely pass data within a perimeter). An
 * access policy is globally visible within an organization, and the
 * restrictions it specifies apply to all projects within an organization.
 * 
 * To get more information about AccessPolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AccessPolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessPolicy:AccessPolicy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessPolicy:AccessPolicy")
public class AccessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Time the AccessPolicy was created in UTC.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the AccessPolicy was created in UTC.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Resource name of the AccessPolicy. Format: {policy_id}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the AccessPolicy. Format: {policy_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of this AccessPolicy in the Cloud Resource Hierarchy.
     * Format: organizations/{organization_id}
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of this AccessPolicy in the Cloud Resource Hierarchy.
     * Format: organizations/{organization_id}
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Human readable title. Does not affect behavior.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }
    /**
     * Time the AccessPolicy was updated in UTC.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the AccessPolicy was updated in UTC.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPolicy(String name, AccessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessPolicy:AccessPolicy", name, args == null ? AccessPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessPolicy(String name, Input<String> id, @Nullable AccessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessPolicy:AccessPolicy", name, state, makeResourceOptions(options, id));
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
    public static AccessPolicy get(String name, Input<String> id, @Nullable AccessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPolicy(name, id, state, options);
    }
}
