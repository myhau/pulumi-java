// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServersProjectSummaryResponse {
    /**
     * Gets or sets the count of entities assessed.
     * 
     */
    private final @Nullable Integer assessedCount;
    /**
     * Gets or sets the count of entities discovered.
     * 
     */
    private final @Nullable Integer discoveredCount;
    /**
     * Gets or sets the extended summary.
     * 
     */
    private final @Nullable Map<String,String> extendedSummary;
    /**
     * Gets the Instance type.
     * Expected value is 'Servers'.
     * 
     */
    private final String instanceType;
    /**
     * Gets or sets the time when summary was last refreshed.
     * 
     */
    private final @Nullable String lastSummaryRefreshedTime;
    /**
     * Gets or sets the count of entities migrated.
     * 
     */
    private final @Nullable Integer migratedCount;
    /**
     * Gets or sets the state of refresh summary.
     * 
     */
    private final @Nullable String refreshSummaryState;
    /**
     * Gets or sets the count of entities being replicated.
     * 
     */
    private final @Nullable Integer replicatingCount;
    /**
     * Gets or sets the count of entities test migrated.
     * 
     */
    private final @Nullable Integer testMigratedCount;

    @CustomType.Constructor
    private ServersProjectSummaryResponse(
        @CustomType.Parameter("assessedCount") @Nullable Integer assessedCount,
        @CustomType.Parameter("discoveredCount") @Nullable Integer discoveredCount,
        @CustomType.Parameter("extendedSummary") @Nullable Map<String,String> extendedSummary,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastSummaryRefreshedTime") @Nullable String lastSummaryRefreshedTime,
        @CustomType.Parameter("migratedCount") @Nullable Integer migratedCount,
        @CustomType.Parameter("refreshSummaryState") @Nullable String refreshSummaryState,
        @CustomType.Parameter("replicatingCount") @Nullable Integer replicatingCount,
        @CustomType.Parameter("testMigratedCount") @Nullable Integer testMigratedCount) {
        this.assessedCount = assessedCount;
        this.discoveredCount = discoveredCount;
        this.extendedSummary = extendedSummary;
        this.instanceType = instanceType;
        this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
        this.migratedCount = migratedCount;
        this.refreshSummaryState = refreshSummaryState;
        this.replicatingCount = replicatingCount;
        this.testMigratedCount = testMigratedCount;
    }

    /**
     * Gets or sets the count of entities assessed.
     * 
    */
    public Optional<Integer> assessedCount() {
        return Optional.ofNullable(this.assessedCount);
    }
    /**
     * Gets or sets the count of entities discovered.
     * 
    */
    public Optional<Integer> discoveredCount() {
        return Optional.ofNullable(this.discoveredCount);
    }
    /**
     * Gets or sets the extended summary.
     * 
    */
    public Map<String,String> extendedSummary() {
        return this.extendedSummary == null ? Map.of() : this.extendedSummary;
    }
    /**
     * Gets the Instance type.
     * Expected value is 'Servers'.
     * 
    */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * Gets or sets the time when summary was last refreshed.
     * 
    */
    public Optional<String> lastSummaryRefreshedTime() {
        return Optional.ofNullable(this.lastSummaryRefreshedTime);
    }
    /**
     * Gets or sets the count of entities migrated.
     * 
    */
    public Optional<Integer> migratedCount() {
        return Optional.ofNullable(this.migratedCount);
    }
    /**
     * Gets or sets the state of refresh summary.
     * 
    */
    public Optional<String> refreshSummaryState() {
        return Optional.ofNullable(this.refreshSummaryState);
    }
    /**
     * Gets or sets the count of entities being replicated.
     * 
    */
    public Optional<Integer> replicatingCount() {
        return Optional.ofNullable(this.replicatingCount);
    }
    /**
     * Gets or sets the count of entities test migrated.
     * 
    */
    public Optional<Integer> testMigratedCount() {
        return Optional.ofNullable(this.testMigratedCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServersProjectSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assessedCount;
        private @Nullable Integer discoveredCount;
        private @Nullable Map<String,String> extendedSummary;
        private String instanceType;
        private @Nullable String lastSummaryRefreshedTime;
        private @Nullable Integer migratedCount;
        private @Nullable String refreshSummaryState;
        private @Nullable Integer replicatingCount;
        private @Nullable Integer testMigratedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServersProjectSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessedCount = defaults.assessedCount;
    	      this.discoveredCount = defaults.discoveredCount;
    	      this.extendedSummary = defaults.extendedSummary;
    	      this.instanceType = defaults.instanceType;
    	      this.lastSummaryRefreshedTime = defaults.lastSummaryRefreshedTime;
    	      this.migratedCount = defaults.migratedCount;
    	      this.refreshSummaryState = defaults.refreshSummaryState;
    	      this.replicatingCount = defaults.replicatingCount;
    	      this.testMigratedCount = defaults.testMigratedCount;
        }

        public Builder assessedCount(@Nullable Integer assessedCount) {
            this.assessedCount = assessedCount;
            return this;
        }
        public Builder discoveredCount(@Nullable Integer discoveredCount) {
            this.discoveredCount = discoveredCount;
            return this;
        }
        public Builder extendedSummary(@Nullable Map<String,String> extendedSummary) {
            this.extendedSummary = extendedSummary;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lastSummaryRefreshedTime(@Nullable String lastSummaryRefreshedTime) {
            this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
            return this;
        }
        public Builder migratedCount(@Nullable Integer migratedCount) {
            this.migratedCount = migratedCount;
            return this;
        }
        public Builder refreshSummaryState(@Nullable String refreshSummaryState) {
            this.refreshSummaryState = refreshSummaryState;
            return this;
        }
        public Builder replicatingCount(@Nullable Integer replicatingCount) {
            this.replicatingCount = replicatingCount;
            return this;
        }
        public Builder testMigratedCount(@Nullable Integer testMigratedCount) {
            this.testMigratedCount = testMigratedCount;
            return this;
        }        public ServersProjectSummaryResponse build() {
            return new ServersProjectSummaryResponse(assessedCount, discoveredCount, extendedSummary, instanceType, lastSummaryRefreshedTime, migratedCount, refreshSummaryState, replicatingCount, testMigratedCount);
        }
    }
}
