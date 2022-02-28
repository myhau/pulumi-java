// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationAggregatorOrganizationAggregationSource {
    /**
     * If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    private final @Nullable Boolean allRegions;
    /**
     * List of source regions being aggregated.
     * 
     */
    private final @Nullable List<String> regions;
    /**
     * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"allRegions","regions","roleArn"})
    private ConfigurationAggregatorOrganizationAggregationSource(
        @Nullable Boolean allRegions,
        @Nullable List<String> regions,
        String roleArn) {
        this.allRegions = allRegions;
        this.regions = regions;
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    public Optional<Boolean> getAllRegions() {
        return Optional.ofNullable(this.allRegions);
    }
    /**
     * List of source regions being aggregated.
     * 
     */
    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }
    /**
     * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allRegions;
        private @Nullable List<String> regions;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorOrganizationAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAllRegions(@Nullable Boolean allRegions) {
            this.allRegions = allRegions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public ConfigurationAggregatorOrganizationAggregationSource build() {
            return new ConfigurationAggregatorOrganizationAggregationSource(allRegions, regions, roleArn);
        }
    }
}
