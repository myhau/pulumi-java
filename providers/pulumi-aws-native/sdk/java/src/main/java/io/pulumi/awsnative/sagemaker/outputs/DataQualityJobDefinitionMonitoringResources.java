// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionClusterConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class DataQualityJobDefinitionMonitoringResources {
    private final DataQualityJobDefinitionClusterConfig clusterConfig;

    @OutputCustomType.Constructor({"clusterConfig"})
    private DataQualityJobDefinitionMonitoringResources(DataQualityJobDefinitionClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public DataQualityJobDefinitionClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionClusterConfig clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder setClusterConfig(DataQualityJobDefinitionClusterConfig clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public DataQualityJobDefinitionMonitoringResources build() {
            return new DataQualityJobDefinitionMonitoringResources(clusterConfig);
        }
    }
}
