// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MaterializedViewDefinitionResponse {
    /**
     * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
     * 
     */
    private final Boolean enableRefresh;
    /**
     * [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.
     * 
     */
    private final String lastRefreshTime;
    /**
     * [Required] A query whose result is persisted.
     * 
     */
    private final String query;
    /**
     * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
     * 
     */
    private final String refreshIntervalMs;

    @OutputCustomType.Constructor
    private MaterializedViewDefinitionResponse(
        @OutputCustomType.Parameter("enableRefresh") Boolean enableRefresh,
        @OutputCustomType.Parameter("lastRefreshTime") String lastRefreshTime,
        @OutputCustomType.Parameter("query") String query,
        @OutputCustomType.Parameter("refreshIntervalMs") String refreshIntervalMs) {
        this.enableRefresh = enableRefresh;
        this.lastRefreshTime = lastRefreshTime;
        this.query = query;
        this.refreshIntervalMs = refreshIntervalMs;
    }

    /**
     * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
     * 
    */
    public Boolean getEnableRefresh() {
        return this.enableRefresh;
    }
    /**
     * [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.
     * 
    */
    public String getLastRefreshTime() {
        return this.lastRefreshTime;
    }
    /**
     * [Required] A query whose result is persisted.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
     * 
    */
    public String getRefreshIntervalMs() {
        return this.refreshIntervalMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterializedViewDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableRefresh;
        private String lastRefreshTime;
        private String query;
        private String refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterializedViewDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.lastRefreshTime = defaults.lastRefreshTime;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder setEnableRefresh(Boolean enableRefresh) {
            this.enableRefresh = Objects.requireNonNull(enableRefresh);
            return this;
        }

        public Builder setLastRefreshTime(String lastRefreshTime) {
            this.lastRefreshTime = Objects.requireNonNull(lastRefreshTime);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setRefreshIntervalMs(String refreshIntervalMs) {
            this.refreshIntervalMs = Objects.requireNonNull(refreshIntervalMs);
            return this;
        }
        public MaterializedViewDefinitionResponse build() {
            return new MaterializedViewDefinitionResponse(enableRefresh, lastRefreshTime, query, refreshIntervalMs);
        }
    }
}
