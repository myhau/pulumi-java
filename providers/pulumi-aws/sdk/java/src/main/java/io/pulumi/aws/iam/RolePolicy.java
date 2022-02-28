// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.RolePolicyArgs;
import io.pulumi.aws.iam.inputs.RolePolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IAM role inline policy.
 * 
 * > **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `inline_policy` argument. When using that argument and this resource, both will attempt to manage the role's inline policies and the provider will show a permanent difference.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Role Policies can be imported using the `role_name:role_policy_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/rolePolicy:RolePolicy mypolicy role_of_mypolicy_name:mypolicy_name
 * ```
 * 
 */
@ResourceType(type="aws:iam/rolePolicy:RolePolicy")
public class RolePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The name of the role policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The IAM role to attach to the policy.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The IAM role to attach to the policy.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RolePolicy(String name) {
        this(name, RolePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RolePolicy(String name, RolePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RolePolicy(String name, RolePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/rolePolicy:RolePolicy", name, args == null ? RolePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RolePolicy(String name, Input<String> id, @Nullable RolePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/rolePolicy:RolePolicy", name, state, makeResourceOptions(options, id));
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
    public static RolePolicy get(String name, Input<String> id, @Nullable RolePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RolePolicy(name, id, state, options);
    }
}
