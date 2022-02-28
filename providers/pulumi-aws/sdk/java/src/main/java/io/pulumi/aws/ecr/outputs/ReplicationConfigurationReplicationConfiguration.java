// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.aws.ecr.outputs.ReplicationConfigurationReplicationConfigurationRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ReplicationConfigurationReplicationConfiguration {
    /**
     * The replication rules for a replication configuration. A maximum of 10 are allowed per `replication_configuration`. See Rule
     * 
     */
    private final ReplicationConfigurationReplicationConfigurationRule rule;

    @OutputCustomType.Constructor({"rule"})
    private ReplicationConfigurationReplicationConfiguration(ReplicationConfigurationReplicationConfigurationRule rule) {
        this.rule = Objects.requireNonNull(rule);
    }

    /**
     * The replication rules for a replication configuration. A maximum of 10 are allowed per `replication_configuration`. See Rule
     * 
     */
    public ReplicationConfigurationReplicationConfigurationRule getRule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationReplicationConfigurationRule rule;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder setRule(ReplicationConfigurationReplicationConfigurationRule rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public ReplicationConfigurationReplicationConfiguration build() {
            return new ReplicationConfigurationReplicationConfiguration(rule);
        }
    }
}
