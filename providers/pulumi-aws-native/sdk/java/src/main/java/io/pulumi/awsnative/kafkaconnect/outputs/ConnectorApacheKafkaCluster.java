// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorVpc;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorApacheKafkaCluster {
    private final String bootstrapServers;
    private final ConnectorVpc vpc;

    @OutputCustomType.Constructor({"bootstrapServers","vpc"})
    private ConnectorApacheKafkaCluster(
        String bootstrapServers,
        ConnectorVpc vpc) {
        this.bootstrapServers = Objects.requireNonNull(bootstrapServers);
        this.vpc = Objects.requireNonNull(vpc);
    }

    public String getBootstrapServers() {
        return this.bootstrapServers;
    }
    public ConnectorVpc getVpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorApacheKafkaCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootstrapServers;
        private ConnectorVpc vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorApacheKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapServers = defaults.bootstrapServers;
    	      this.vpc = defaults.vpc;
        }

        public Builder setBootstrapServers(String bootstrapServers) {
            this.bootstrapServers = Objects.requireNonNull(bootstrapServers);
            return this;
        }

        public Builder setVpc(ConnectorVpc vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }

        public ConnectorApacheKafkaCluster build() {
            return new ConnectorApacheKafkaCluster(bootstrapServers, vpc);
        }
    }
}