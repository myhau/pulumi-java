// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs();

    /**
     * The repository filter details.
     * 
     */
    @InputImport(name="filter", required=true)
      private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    @InputImport(name="filterType", required=true)
      private final Input<String> filterType;

    public Input<String> getFilterType() {
        return this.filterType;
    }

    public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs(
        Input<String> filter,
        Input<String> filterType) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterType = Objects.requireNonNull(filterType, "expected parameter 'filterType' to be non-null");
    }

    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs() {
        this.filter = Input.empty();
        this.filterType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filter;
        private Input<String> filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setFilterType(Input<String> filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }

        public Builder setFilterType(String filterType) {
            this.filterType = Input.of(Objects.requireNonNull(filterType));
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterGetArgs(filter, filterType);
        }
    }
}
