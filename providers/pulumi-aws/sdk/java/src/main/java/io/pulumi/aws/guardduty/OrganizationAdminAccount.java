// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.OrganizationAdminAccountArgs;
import io.pulumi.aws.guardduty.inputs.OrganizationAdminAccountState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a GuardDuty Organization Admin Account. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty Organization Admin Account can be imported using the AWS account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/organizationAdminAccount:OrganizationAdminAccount example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/organizationAdminAccount:OrganizationAdminAccount")
public class OrganizationAdminAccount extends io.pulumi.resources.CustomResource {
    /**
     * AWS account identifier to designate as a delegated administrator for GuardDuty.
     * 
     */
    @OutputExport(name="adminAccountId", type=String.class, parameters={})
    private Output<String> adminAccountId;

    /**
     * @return AWS account identifier to designate as a delegated administrator for GuardDuty.
     * 
     */
    public Output<String> getAdminAccountId() {
        return this.adminAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationAdminAccount(String name) {
        this(name, OrganizationAdminAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationAdminAccount(String name, OrganizationAdminAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationAdminAccount(String name, OrganizationAdminAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationAdminAccount:OrganizationAdminAccount", name, args == null ? OrganizationAdminAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OrganizationAdminAccount(String name, Input<String> id, @Nullable OrganizationAdminAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationAdminAccount:OrganizationAdminAccount", name, state, makeResourceOptions(options, id));
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
    public static OrganizationAdminAccount get(String name, Input<String> id, @Nullable OrganizationAdminAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationAdminAccount(name, id, state, options);
    }
}
