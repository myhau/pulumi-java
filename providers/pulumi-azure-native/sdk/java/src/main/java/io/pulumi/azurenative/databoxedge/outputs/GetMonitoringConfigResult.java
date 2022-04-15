// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.MetricConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMonitoringConfigResult {
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The metrics configuration details
     * 
     */
    private final List<MetricConfigurationResponse> metricConfigurations;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMonitoringConfigResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metricConfigurations") List<MetricConfigurationResponse> metricConfigurations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.metricConfigurations = metricConfigurations;
        this.name = name;
        this.type = type;
    }

    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The metrics configuration details
     * 
    */
    public List<MetricConfigurationResponse> metricConfigurations() {
        return this.metricConfigurations;
    }
    /**
     * The object name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitoringConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<MetricConfigurationResponse> metricConfigurations;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitoringConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metricConfigurations = defaults.metricConfigurations;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metricConfigurations(List<MetricConfigurationResponse> metricConfigurations) {
            this.metricConfigurations = Objects.requireNonNull(metricConfigurations);
            return this;
        }
        public Builder metricConfigurations(MetricConfigurationResponse... metricConfigurations) {
            return metricConfigurations(List.of(metricConfigurations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetMonitoringConfigResult build() {
            return new GetMonitoringConfigResult(id, metricConfigurations, name, type);
        }
    }
}
