// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.GitRepositoryDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.KustomizationDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectStatusDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFluxConfigurationResult {
    /**
     * Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
     */
    private final String complianceState;
    /**
     * Key-value pairs of protected configuration settings for the configuration
     * 
     */
    private final @Nullable Map<String,String> configurationProtectedSettings;
    /**
     * Error message returned to the user in the case of provisioning failure.
     * 
     */
    private final String errorMessage;
    /**
     * Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    private final @Nullable GitRepositoryDefinitionResponse gitRepository;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    private final @Nullable Map<String,KustomizationDefinitionResponse> kustomizations;
    /**
     * Datetime the fluxConfiguration last synced its source on the cluster.
     * 
     */
    private final String lastSourceSyncedAt;
    /**
     * Branch and SHA of the last source commit synced with the cluster.
     * 
     */
    private final String lastSourceSyncedCommitId;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    private final @Nullable String namespace;
    /**
     * Status of the creation of the fluxConfiguration.
     * 
     */
    private final String provisioningState;
    /**
     * Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
     */
    private final String repositoryPublicKey;
    /**
     * Scope at which the operator will be installed.
     * 
     */
    private final @Nullable String scope;
    /**
     * Source Kind to pull the configuration data from.
     * 
     */
    private final @Nullable String sourceKind;
    /**
     * Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
     */
    private final List<ObjectStatusDefinitionResponse> statuses;
    /**
     * Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    private final @Nullable Boolean suspend;
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFluxConfigurationResult(
        @CustomType.Parameter("complianceState") String complianceState,
        @CustomType.Parameter("configurationProtectedSettings") @Nullable Map<String,String> configurationProtectedSettings,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("gitRepository") @Nullable GitRepositoryDefinitionResponse gitRepository,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kustomizations") @Nullable Map<String,KustomizationDefinitionResponse> kustomizations,
        @CustomType.Parameter("lastSourceSyncedAt") String lastSourceSyncedAt,
        @CustomType.Parameter("lastSourceSyncedCommitId") String lastSourceSyncedCommitId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("repositoryPublicKey") String repositoryPublicKey,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sourceKind") @Nullable String sourceKind,
        @CustomType.Parameter("statuses") List<ObjectStatusDefinitionResponse> statuses,
        @CustomType.Parameter("suspend") @Nullable Boolean suspend,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.complianceState = complianceState;
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.errorMessage = errorMessage;
        this.gitRepository = gitRepository;
        this.id = id;
        this.kustomizations = kustomizations;
        this.lastSourceSyncedAt = lastSourceSyncedAt;
        this.lastSourceSyncedCommitId = lastSourceSyncedCommitId;
        this.name = name;
        this.namespace = namespace;
        this.provisioningState = provisioningState;
        this.repositoryPublicKey = repositoryPublicKey;
        this.scope = scope;
        this.sourceKind = sourceKind;
        this.statuses = statuses;
        this.suspend = suspend;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
    */
    public String complianceState() {
        return this.complianceState;
    }
    /**
     * Key-value pairs of protected configuration settings for the configuration
     * 
    */
    public Map<String,String> configurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Map.of() : this.configurationProtectedSettings;
    }
    /**
     * Error message returned to the user in the case of provisioning failure.
     * 
    */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * Parameters to reconcile to the GitRepository source kind type.
     * 
    */
    public Optional<GitRepositoryDefinitionResponse> gitRepository() {
        return Optional.ofNullable(this.gitRepository);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
    */
    public Map<String,KustomizationDefinitionResponse> kustomizations() {
        return this.kustomizations == null ? Map.of() : this.kustomizations;
    }
    /**
     * Datetime the fluxConfiguration last synced its source on the cluster.
     * 
    */
    public String lastSourceSyncedAt() {
        return this.lastSourceSyncedAt;
    }
    /**
     * Branch and SHA of the last source commit synced with the cluster.
     * 
    */
    public String lastSourceSyncedCommitId() {
        return this.lastSourceSyncedCommitId;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
    */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * Status of the creation of the fluxConfiguration.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
    */
    public String repositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    /**
     * Scope at which the operator will be installed.
     * 
    */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Source Kind to pull the configuration data from.
     * 
    */
    public Optional<String> sourceKind() {
        return Optional.ofNullable(this.sourceKind);
    }
    /**
     * Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
    */
    public List<ObjectStatusDefinitionResponse> statuses() {
        return this.statuses;
    }
    /**
     * Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
    */
    public Optional<Boolean> suspend() {
        return Optional.ofNullable(this.suspend);
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluxConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceState;
        private @Nullable Map<String,String> configurationProtectedSettings;
        private String errorMessage;
        private @Nullable GitRepositoryDefinitionResponse gitRepository;
        private String id;
        private @Nullable Map<String,KustomizationDefinitionResponse> kustomizations;
        private String lastSourceSyncedAt;
        private String lastSourceSyncedCommitId;
        private String name;
        private @Nullable String namespace;
        private String provisioningState;
        private String repositoryPublicKey;
        private @Nullable String scope;
        private @Nullable String sourceKind;
        private List<ObjectStatusDefinitionResponse> statuses;
        private @Nullable Boolean suspend;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluxConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceState = defaults.complianceState;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.errorMessage = defaults.errorMessage;
    	      this.gitRepository = defaults.gitRepository;
    	      this.id = defaults.id;
    	      this.kustomizations = defaults.kustomizations;
    	      this.lastSourceSyncedAt = defaults.lastSourceSyncedAt;
    	      this.lastSourceSyncedCommitId = defaults.lastSourceSyncedCommitId;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.provisioningState = defaults.provisioningState;
    	      this.repositoryPublicKey = defaults.repositoryPublicKey;
    	      this.scope = defaults.scope;
    	      this.sourceKind = defaults.sourceKind;
    	      this.statuses = defaults.statuses;
    	      this.suspend = defaults.suspend;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder complianceState(String complianceState) {
            this.complianceState = Objects.requireNonNull(complianceState);
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder gitRepository(@Nullable GitRepositoryDefinitionResponse gitRepository) {
            this.gitRepository = gitRepository;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kustomizations(@Nullable Map<String,KustomizationDefinitionResponse> kustomizations) {
            this.kustomizations = kustomizations;
            return this;
        }
        public Builder lastSourceSyncedAt(String lastSourceSyncedAt) {
            this.lastSourceSyncedAt = Objects.requireNonNull(lastSourceSyncedAt);
            return this;
        }
        public Builder lastSourceSyncedCommitId(String lastSourceSyncedCommitId) {
            this.lastSourceSyncedCommitId = Objects.requireNonNull(lastSourceSyncedCommitId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder repositoryPublicKey(String repositoryPublicKey) {
            this.repositoryPublicKey = Objects.requireNonNull(repositoryPublicKey);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder sourceKind(@Nullable String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public Builder statuses(List<ObjectStatusDefinitionResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }
        public Builder statuses(ObjectStatusDefinitionResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder suspend(@Nullable Boolean suspend) {
            this.suspend = suspend;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFluxConfigurationResult build() {
            return new GetFluxConfigurationResult(complianceState, configurationProtectedSettings, errorMessage, gitRepository, id, kustomizations, lastSourceSyncedAt, lastSourceSyncedCommitId, name, namespace, provisioningState, repositoryPublicKey, scope, sourceKind, statuses, suspend, systemData, type);
        }
    }
}
