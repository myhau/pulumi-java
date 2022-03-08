// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDisasterRecoveryConfigResult {
    /**
     * Alternate name specified when alias and namespace names are same.
     * 
     */
    private final @Nullable String alternateName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    private final @Nullable String partnerNamespace;
    /**
     * Number of entities pending to be replicated.
     * 
     */
    private final Double pendingReplicationOperationsCount;
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    private final String provisioningState;
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    private final String role;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"alternateName","id","name","partnerNamespace","pendingReplicationOperationsCount","provisioningState","role","type"})
    private GetDisasterRecoveryConfigResult(
        @Nullable String alternateName,
        String id,
        String name,
        @Nullable String partnerNamespace,
        Double pendingReplicationOperationsCount,
        String provisioningState,
        String role,
        String type) {
        this.alternateName = alternateName;
        this.id = id;
        this.name = name;
        this.partnerNamespace = partnerNamespace;
        this.pendingReplicationOperationsCount = pendingReplicationOperationsCount;
        this.provisioningState = provisioningState;
        this.role = role;
        this.type = type;
    }

    /**
     * Alternate name specified when alias and namespace names are same.
     * 
    */
    public Optional<String> getAlternateName() {
        return Optional.ofNullable(this.alternateName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
    */
    public Optional<String> getPartnerNamespace() {
        return Optional.ofNullable(this.partnerNamespace);
    }
    /**
     * Number of entities pending to be replicated.
     * 
    */
    public Double getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateName;
        private String id;
        private String name;
        private @Nullable String partnerNamespace;
        private Double pendingReplicationOperationsCount;
        private String provisioningState;
        private String role;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateName = defaults.alternateName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.partnerNamespace = defaults.partnerNamespace;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
        }

        public Builder setAlternateName(@Nullable String alternateName) {
            this.alternateName = alternateName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerNamespace(@Nullable String partnerNamespace) {
            this.partnerNamespace = partnerNamespace;
            return this;
        }

        public Builder setPendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDisasterRecoveryConfigResult build() {
            return new GetDisasterRecoveryConfigResult(alternateName, id, name, partnerNamespace, pendingReplicationOperationsCount, provisioningState, role, type);
        }
    }
}
