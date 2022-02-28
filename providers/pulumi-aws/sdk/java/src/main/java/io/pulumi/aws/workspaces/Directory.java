// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.workspaces.DirectoryArgs;
import io.pulumi.aws.workspaces.inputs.DirectoryState;
import io.pulumi.aws.workspaces.outputs.DirectorySelfServicePermissions;
import io.pulumi.aws.workspaces.outputs.DirectoryWorkspaceAccessProperties;
import io.pulumi.aws.workspaces.outputs.DirectoryWorkspaceCreationProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a WorkSpaces directory in AWS WorkSpaces Service.
 * 
 * > **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Workspaces directory can be imported using the directory ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:workspaces/directory:Directory main d-4444444444
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/directory:Directory")
public class Directory extends io.pulumi.resources.CustomResource {
    /**
     * The directory alias.
     * 
     */
    @OutputExport(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The directory alias.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * The user name for the service account.
     * 
     */
    @OutputExport(name="customerUserName", type=String.class, parameters={})
    private Output<String> customerUserName;

    /**
     * @return The user name for the service account.
     * 
     */
    public Output<String> getCustomerUserName() {
        return this.customerUserName;
    }
    /**
     * The directory identifier for registration in WorkSpaces service.
     * 
     */
    @OutputExport(name="directoryId", type=String.class, parameters={})
    private Output<String> directoryId;

    /**
     * @return The directory identifier for registration in WorkSpaces service.
     * 
     */
    public Output<String> getDirectoryId() {
        return this.directoryId;
    }
    /**
     * The name of the directory.
     * 
     */
    @OutputExport(name="directoryName", type=String.class, parameters={})
    private Output<String> directoryName;

    /**
     * @return The name of the directory.
     * 
     */
    public Output<String> getDirectoryName() {
        return this.directoryName;
    }
    /**
     * The directory type.
     * 
     */
    @OutputExport(name="directoryType", type=String.class, parameters={})
    private Output<String> directoryType;

    /**
     * @return The directory type.
     * 
     */
    public Output<String> getDirectoryType() {
        return this.directoryType;
    }
    /**
     * The IP addresses of the DNS servers for the directory.
     * 
     */
    @OutputExport(name="dnsIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return The IP addresses of the DNS servers for the directory.
     * 
     */
    public Output<List<String>> getDnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    @OutputExport(name="iamRoleId", type=String.class, parameters={})
    private Output<String> iamRoleId;

    /**
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    public Output<String> getIamRoleId() {
        return this.iamRoleId;
    }
    /**
     * The identifiers of the IP access control groups associated with the directory.
     * 
     */
    @OutputExport(name="ipGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> ipGroupIds;

    /**
     * @return The identifiers of the IP access control groups associated with the directory.
     * 
     */
    public Output<List<String>> getIpGroupIds() {
        return this.ipGroupIds;
    }
    /**
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    @OutputExport(name="registrationCode", type=String.class, parameters={})
    private Output<String> registrationCode;

    /**
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    public Output<String> getRegistrationCode() {
        return this.registrationCode;
    }
    /**
     * Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    @OutputExport(name="selfServicePermissions", type=DirectorySelfServicePermissions.class, parameters={})
    private Output<DirectorySelfServicePermissions> selfServicePermissions;

    /**
     * @return Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    public Output<DirectorySelfServicePermissions> getSelfServicePermissions() {
        return this.selfServicePermissions;
    }
    /**
     * The identifiers of the subnets where the directory resides.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The identifiers of the subnets where the directory resides.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    @OutputExport(name="workspaceAccessProperties", type=DirectoryWorkspaceAccessProperties.class, parameters={})
    private Output<DirectoryWorkspaceAccessProperties> workspaceAccessProperties;

    /**
     * @return Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceAccessProperties> getWorkspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }
    /**
     * Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    @OutputExport(name="workspaceCreationProperties", type=DirectoryWorkspaceCreationProperties.class, parameters={})
    private Output<DirectoryWorkspaceCreationProperties> workspaceCreationProperties;

    /**
     * @return Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceCreationProperties> getWorkspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }
    /**
     * The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    @OutputExport(name="workspaceSecurityGroupId", type=String.class, parameters={})
    private Output<String> workspaceSecurityGroupId;

    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    public Output<String> getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Directory(String name, Input<String> id, @Nullable DirectoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, state, makeResourceOptions(options, id));
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
    public static Directory get(String name, Input<String> id, @Nullable DirectoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
