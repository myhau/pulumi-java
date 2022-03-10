// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkHistoryServerConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PeripheralsConfigResponse {
    /**
     * Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
     * 
     */
    private final String metastoreService;
    /**
     * Optional. The Spark History Server configuration for the workload.
     * 
     */
    private final SparkHistoryServerConfigResponse sparkHistoryServerConfig;

    @OutputCustomType.Constructor
    private PeripheralsConfigResponse(
        @OutputCustomType.Parameter("metastoreService") String metastoreService,
        @OutputCustomType.Parameter("sparkHistoryServerConfig") SparkHistoryServerConfigResponse sparkHistoryServerConfig) {
        this.metastoreService = metastoreService;
        this.sparkHistoryServerConfig = sparkHistoryServerConfig;
    }

    /**
     * Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
     * 
    */
    public String getMetastoreService() {
        return this.metastoreService;
    }
    /**
     * Optional. The Spark History Server configuration for the workload.
     * 
    */
    public SparkHistoryServerConfigResponse getSparkHistoryServerConfig() {
        return this.sparkHistoryServerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeripheralsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metastoreService;
        private SparkHistoryServerConfigResponse sparkHistoryServerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PeripheralsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metastoreService = defaults.metastoreService;
    	      this.sparkHistoryServerConfig = defaults.sparkHistoryServerConfig;
        }

        public Builder setMetastoreService(String metastoreService) {
            this.metastoreService = Objects.requireNonNull(metastoreService);
            return this;
        }

        public Builder setSparkHistoryServerConfig(SparkHistoryServerConfigResponse sparkHistoryServerConfig) {
            this.sparkHistoryServerConfig = Objects.requireNonNull(sparkHistoryServerConfig);
            return this;
        }
        public PeripheralsConfigResponse build() {
            return new PeripheralsConfigResponse(metastoreService, sparkHistoryServerConfig);
        }
    }
}
