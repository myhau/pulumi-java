// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetricsSourceTagRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMetricsSourceTagRuleArgs Empty = new GetMetricsSourceTagRuleArgs();

    /**
     * Metrics Account resource name
     * 
     */
    @Import(name="metricsSourceName", required=true)
      private final String metricsSourceName;

    public String metricsSourceName() {
        return this.metricsSourceName;
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
      private final String monitorName;

    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="ruleSetName", required=true)
      private final String ruleSetName;

    public String ruleSetName() {
        return this.ruleSetName;
    }

    public GetMetricsSourceTagRuleArgs(
        String metricsSourceName,
        String monitorName,
        String resourceGroupName,
        String ruleSetName) {
        this.metricsSourceName = Objects.requireNonNull(metricsSourceName, "expected parameter 'metricsSourceName' to be non-null");
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
    }

    private GetMetricsSourceTagRuleArgs() {
        this.metricsSourceName = null;
        this.monitorName = null;
        this.resourceGroupName = null;
        this.ruleSetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricsSourceTagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricsSourceName;
        private String monitorName;
        private String resourceGroupName;
        private String ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricsSourceTagRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricsSourceName = defaults.metricsSourceName;
    	      this.monitorName = defaults.monitorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder metricsSourceName(String metricsSourceName) {
            this.metricsSourceName = Objects.requireNonNull(metricsSourceName);
            return this;
        }
        public Builder monitorName(String monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }        public GetMetricsSourceTagRuleArgs build() {
            return new GetMetricsSourceTagRuleArgs(metricsSourceName, monitorName, resourceGroupName, ruleSetName);
        }
    }
}
