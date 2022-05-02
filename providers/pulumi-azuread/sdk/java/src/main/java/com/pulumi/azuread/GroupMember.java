// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.GroupMemberArgs;
import com.pulumi.azuread.Utilities;
import com.pulumi.azuread.inputs.GroupMemberState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a single group membership within Azure Active Directory.
 * 
 * &gt; **Warning** Do not use this resource at the same time as the `members` property of the `azuread.Group` resource for the same group. Doing so will cause a conflict and group members will be removed.
 * 
 * ## API Permissions
 * 
 * The following API permissions are required in order to use this resource.
 * 
 * When authenticated with a service principal, this resource requires one of the following application roles: `Group.ReadWrite.All` or `Directory.ReadWrite.All`
 * 
 * When authenticated with a user principal, this resource requires one of the following directory roles: `Groups Administrator`, `User Administrator` or `Global Administrator`
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Group members can be imported using the object ID of the group and the object ID of the member, e.g.
 * 
 * ```sh
 *  $ pulumi import azuread:index/groupMember:GroupMember test 00000000-0000-0000-0000-000000000000/member/11111111-1111-1111-1111-111111111111
 * ```
 * 
 *  -&gt; This ID format is unique to Terraform and is composed of the Azure AD Group Object ID and the target Member Object ID in the format `{GroupObjectID}/member/{MemberObjectID}`.
 * 
 */
@ResourceType(type="azuread:index/groupMember:GroupMember")
public class GroupMember extends com.pulumi.resources.CustomResource {
    /**
     * The object ID of the group you want to add the member to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="groupObjectId", type=String.class, parameters={})
    private Output<String> groupObjectId;

    /**
     * @return The object ID of the group you want to add the member to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> groupObjectId() {
        return this.groupObjectId;
    }
    /**
     * The object ID of the principal you want to add as a member to the group. Supported object types are Users, Groups or Service Principals. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="memberObjectId", type=String.class, parameters={})
    private Output<String> memberObjectId;

    /**
     * @return The object ID of the principal you want to add as a member to the group. Supported object types are Users, Groups or Service Principals. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> memberObjectId() {
        return this.memberObjectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupMember(String name) {
        this(name, GroupMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupMember(String name, GroupMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMember(String name, GroupMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/groupMember:GroupMember", name, args == null ? GroupMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupMember(String name, Output<String> id, @Nullable GroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/groupMember:GroupMember", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GroupMember get(String name, Output<String> id, @Nullable GroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupMember(name, id, state, options);
    }
}
