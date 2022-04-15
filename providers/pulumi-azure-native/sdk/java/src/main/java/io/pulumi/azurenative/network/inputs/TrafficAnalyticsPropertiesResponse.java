// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.TrafficAnalyticsConfigurationPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters that define the configuration of traffic analytics.
 * 
 */
public final class TrafficAnalyticsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficAnalyticsPropertiesResponse Empty = new TrafficAnalyticsPropertiesResponse();

    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    @Import(name="networkWatcherFlowAnalyticsConfiguration")
      private final @Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration;

    public Optional<TrafficAnalyticsConfigurationPropertiesResponse> networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.networkWatcherFlowAnalyticsConfiguration);
    }

    public TrafficAnalyticsPropertiesResponse(@Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
    }

    private TrafficAnalyticsPropertiesResponse() {
        this.networkWatcherFlowAnalyticsConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficAnalyticsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficAnalyticsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkWatcherFlowAnalyticsConfiguration = defaults.networkWatcherFlowAnalyticsConfiguration;
        }

        public Builder networkWatcherFlowAnalyticsConfiguration(@Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration) {
            this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
            return this;
        }        public TrafficAnalyticsPropertiesResponse build() {
            return new TrafficAnalyticsPropertiesResponse(networkWatcherFlowAnalyticsConfiguration);
        }
    }
}
