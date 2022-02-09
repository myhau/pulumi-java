// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MonitoringDestinationResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MonitoringResponse {
    private final List<MonitoringDestinationResponse> consumerDestinations;
    private final List<MonitoringDestinationResponse> producerDestinations;

    @OutputCustomType.Constructor({"consumerDestinations","producerDestinations"})
    private MonitoringResponse(
        List<MonitoringDestinationResponse> consumerDestinations,
        List<MonitoringDestinationResponse> producerDestinations) {
        this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
        this.producerDestinations = Objects.requireNonNull(producerDestinations);
    }

    public List<MonitoringDestinationResponse> getConsumerDestinations() {
        return this.consumerDestinations;
    }
    public List<MonitoringDestinationResponse> getProducerDestinations() {
        return this.producerDestinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MonitoringDestinationResponse> consumerDestinations;
        private List<MonitoringDestinationResponse> producerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
    	      this.producerDestinations = defaults.producerDestinations;
        }

        public Builder setConsumerDestinations(List<MonitoringDestinationResponse> consumerDestinations) {
            this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
            return this;
        }

        public Builder setProducerDestinations(List<MonitoringDestinationResponse> producerDestinations) {
            this.producerDestinations = Objects.requireNonNull(producerDestinations);
            return this;
        }

        public MonitoringResponse build() {
            return new MonitoringResponse(consumerDestinations, producerDestinations);
        }
    }
}