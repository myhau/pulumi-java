// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.WorkspaceArgs;
import io.pulumi.azurenative.synapse.outputs.DataLakeStorageAccountDetailsResponse;
import io.pulumi.azurenative.synapse.outputs.EncryptionDetailsResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedVirtualNetworkSettingsResponse;
import io.pulumi.azurenative.synapse.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.synapse.outputs.PurviewConfigurationResponse;
import io.pulumi.azurenative.synapse.outputs.VirtualNetworkProfileResponse;
import io.pulumi.azurenative.synapse.outputs.WorkspaceRepositoryConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    @OutputExport(name="adlaResourceId", type=String.class, parameters={})
    private Output<String> adlaResourceId;

    public Output<String> getAdlaResourceId() {
        return this.adlaResourceId;
    }
    @OutputExport(name="connectivityEndpoints", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> connectivityEndpoints;

    public Output</* @Nullable */ Map<String,String>> getConnectivityEndpoints() {
        return this.connectivityEndpoints;
    }
    @OutputExport(name="defaultDataLakeStorage", type=DataLakeStorageAccountDetailsResponse.class, parameters={})
    private Output</* @Nullable */ DataLakeStorageAccountDetailsResponse> defaultDataLakeStorage;

    public Output</* @Nullable */ DataLakeStorageAccountDetailsResponse> getDefaultDataLakeStorage() {
        return this.defaultDataLakeStorage;
    }
    @OutputExport(name="encryption", type=EncryptionDetailsResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionDetailsResponse> encryption;

    public Output</* @Nullable */ EncryptionDetailsResponse> getEncryption() {
        return this.encryption;
    }
    @OutputExport(name="extraProperties", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> extraProperties;

    public Output<Map<String,Object>> getExtraProperties() {
        return this.extraProperties;
    }
    @OutputExport(name="identity", type=ManagedIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedIdentityResponse> identity;

    public Output</* @Nullable */ ManagedIdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedResourceGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedResourceGroupName;

    public Output</* @Nullable */ String> getManagedResourceGroupName() {
        return this.managedResourceGroupName;
    }
    @OutputExport(name="managedVirtualNetwork", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedVirtualNetwork;

    public Output</* @Nullable */ String> getManagedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }
    @OutputExport(name="managedVirtualNetworkSettings", type=ManagedVirtualNetworkSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ManagedVirtualNetworkSettingsResponse> managedVirtualNetworkSettings;

    public Output</* @Nullable */ ManagedVirtualNetworkSettingsResponse> getManagedVirtualNetworkSettings() {
        return this.managedVirtualNetworkSettings;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    public Output</* @Nullable */ List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    @OutputExport(name="purviewConfiguration", type=PurviewConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ PurviewConfigurationResponse> purviewConfiguration;

    public Output</* @Nullable */ PurviewConfigurationResponse> getPurviewConfiguration() {
        return this.purviewConfiguration;
    }
    @OutputExport(name="sqlAdministratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlAdministratorLogin;

    public Output</* @Nullable */ String> getSqlAdministratorLogin() {
        return this.sqlAdministratorLogin;
    }
    @OutputExport(name="sqlAdministratorLoginPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlAdministratorLoginPassword;

    public Output</* @Nullable */ String> getSqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualNetworkProfile", type=VirtualNetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkProfileResponse> virtualNetworkProfile;

    public Output</* @Nullable */ VirtualNetworkProfileResponse> getVirtualNetworkProfile() {
        return this.virtualNetworkProfile;
    }
    @OutputExport(name="workspaceRepositoryConfiguration", type=WorkspaceRepositoryConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ WorkspaceRepositoryConfigurationResponse> workspaceRepositoryConfiguration;

    public Output</* @Nullable */ WorkspaceRepositoryConfigurationResponse> getWorkspaceRepositoryConfiguration() {
        return this.workspaceRepositoryConfiguration;
    }
    @OutputExport(name="workspaceUID", type=String.class, parameters={})
    private Output<String> workspaceUID;

    public Output<String> getWorkspaceUID() {
        return this.workspaceUID;
    }

    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:Workspace").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:Workspace").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Workspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}