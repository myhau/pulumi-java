// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorAccountAggregationSource extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationAggregatorAccountAggregationSource Empty = new ConfigurationAggregatorAccountAggregationSource();

    @InputImport(name="accountIds", required=true)
    private final List<String> accountIds;

    public List<String> getAccountIds() {
        return this.accountIds;
    }

    @InputImport(name="allAwsRegions")
    private final @Nullable Boolean allAwsRegions;

    public Optional<Boolean> getAllAwsRegions() {
        return this.allAwsRegions == null ? Optional.empty() : Optional.ofNullable(this.allAwsRegions);
    }

    @InputImport(name="awsRegions")
    private final @Nullable List<String> awsRegions;

    public List<String> getAwsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }

    public ConfigurationAggregatorAccountAggregationSource(
        List<String> accountIds,
        @Nullable Boolean allAwsRegions,
        @Nullable List<String> awsRegions) {
        this.accountIds = Objects.requireNonNull(accountIds, "expected parameter 'accountIds' to be non-null");
        this.allAwsRegions = allAwsRegions;
        this.awsRegions = awsRegions;
    }

    private ConfigurationAggregatorAccountAggregationSource() {
        this.accountIds = List.of();
        this.allAwsRegions = null;
        this.awsRegions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accountIds;
        private @Nullable Boolean allAwsRegions;
        private @Nullable List<String> awsRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorAccountAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allAwsRegions = defaults.allAwsRegions;
    	      this.awsRegions = defaults.awsRegions;
        }

        public Builder setAccountIds(List<String> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }

        public Builder setAllAwsRegions(@Nullable Boolean allAwsRegions) {
            this.allAwsRegions = allAwsRegions;
            return this;
        }

        public Builder setAwsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }

        public ConfigurationAggregatorAccountAggregationSource build() {
            return new ConfigurationAggregatorAccountAggregationSource(accountIds, allAwsRegions, awsRegions);
        }
    }
}