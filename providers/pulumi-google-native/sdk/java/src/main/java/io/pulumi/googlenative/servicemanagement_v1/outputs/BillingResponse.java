// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.BillingDestinationResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BillingResponse {
    /**
     * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
     * 
     */
    private final List<BillingDestinationResponse> consumerDestinations;

    @OutputCustomType.Constructor
    private BillingResponse(@OutputCustomType.Parameter("consumerDestinations") List<BillingDestinationResponse> consumerDestinations) {
        this.consumerDestinations = consumerDestinations;
    }

    /**
     * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
     * 
    */
    public List<BillingDestinationResponse> getConsumerDestinations() {
        return this.consumerDestinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BillingDestinationResponse> consumerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
        }

        public Builder setConsumerDestinations(List<BillingDestinationResponse> consumerDestinations) {
            this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
            return this;
        }
        public BillingResponse build() {
            return new BillingResponse(consumerDestinations);
        }
    }
}
