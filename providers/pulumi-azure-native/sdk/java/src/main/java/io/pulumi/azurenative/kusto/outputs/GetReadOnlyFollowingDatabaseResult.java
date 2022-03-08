// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.azurenative.kusto.outputs.DatabaseStatisticsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReadOnlyFollowingDatabaseResult {
    /**
     * The name of the attached database configuration cluster
     * 
     */
    private final String attachedDatabaseConfigurationName;
    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    private final @Nullable String hotCachePeriod;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Kind of the database
     * Expected value is 'ReadOnlyFollowing'.
     * 
     */
    private final String kind;
    /**
     * The name of the leader cluster
     * 
     */
    private final String leaderClusterResourceId;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The principals modification kind of the database
     * 
     */
    private final String principalsModificationKind;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    private final String softDeletePeriod;
    /**
     * The statistics of the database.
     * 
     */
    private final DatabaseStatisticsResponse statistics;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"attachedDatabaseConfigurationName","hotCachePeriod","id","kind","leaderClusterResourceId","location","name","principalsModificationKind","provisioningState","softDeletePeriod","statistics","type"})
    private GetReadOnlyFollowingDatabaseResult(
        String attachedDatabaseConfigurationName,
        @Nullable String hotCachePeriod,
        String id,
        String kind,
        String leaderClusterResourceId,
        @Nullable String location,
        String name,
        String principalsModificationKind,
        String provisioningState,
        String softDeletePeriod,
        DatabaseStatisticsResponse statistics,
        String type) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        this.hotCachePeriod = hotCachePeriod;
        this.id = id;
        this.kind = kind;
        this.leaderClusterResourceId = leaderClusterResourceId;
        this.location = location;
        this.name = name;
        this.principalsModificationKind = principalsModificationKind;
        this.provisioningState = provisioningState;
        this.softDeletePeriod = softDeletePeriod;
        this.statistics = statistics;
        this.type = type;
    }

    /**
     * The name of the attached database configuration cluster
     * 
    */
    public String getAttachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }
    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
    */
    public Optional<String> getHotCachePeriod() {
        return Optional.ofNullable(this.hotCachePeriod);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of the database
     * Expected value is 'ReadOnlyFollowing'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the leader cluster
     * 
    */
    public String getLeaderClusterResourceId() {
        return this.leaderClusterResourceId;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The principals modification kind of the database
     * 
    */
    public String getPrincipalsModificationKind() {
        return this.principalsModificationKind;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
    */
    public String getSoftDeletePeriod() {
        return this.softDeletePeriod;
    }
    /**
     * The statistics of the database.
     * 
    */
    public DatabaseStatisticsResponse getStatistics() {
        return this.statistics;
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

    public static Builder builder(GetReadOnlyFollowingDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedDatabaseConfigurationName;
        private @Nullable String hotCachePeriod;
        private String id;
        private String kind;
        private String leaderClusterResourceId;
        private @Nullable String location;
        private String name;
        private String principalsModificationKind;
        private String provisioningState;
        private String softDeletePeriod;
        private DatabaseStatisticsResponse statistics;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReadOnlyFollowingDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.hotCachePeriod = defaults.hotCachePeriod;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.leaderClusterResourceId = defaults.leaderClusterResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.principalsModificationKind = defaults.principalsModificationKind;
    	      this.provisioningState = defaults.provisioningState;
    	      this.softDeletePeriod = defaults.softDeletePeriod;
    	      this.statistics = defaults.statistics;
    	      this.type = defaults.type;
        }

        public Builder setAttachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
            return this;
        }

        public Builder setHotCachePeriod(@Nullable String hotCachePeriod) {
            this.hotCachePeriod = hotCachePeriod;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLeaderClusterResourceId(String leaderClusterResourceId) {
            this.leaderClusterResourceId = Objects.requireNonNull(leaderClusterResourceId);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalsModificationKind(String principalsModificationKind) {
            this.principalsModificationKind = Objects.requireNonNull(principalsModificationKind);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSoftDeletePeriod(String softDeletePeriod) {
            this.softDeletePeriod = Objects.requireNonNull(softDeletePeriod);
            return this;
        }

        public Builder setStatistics(DatabaseStatisticsResponse statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetReadOnlyFollowingDatabaseResult build() {
            return new GetReadOnlyFollowingDatabaseResult(attachedDatabaseConfigurationName, hotCachePeriod, id, kind, leaderClusterResourceId, location, name, principalsModificationKind, provisioningState, softDeletePeriod, statistics, type);
        }
    }
}
