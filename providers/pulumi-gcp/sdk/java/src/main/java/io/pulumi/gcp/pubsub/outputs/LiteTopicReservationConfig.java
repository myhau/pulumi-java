// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiteTopicReservationConfig {
    /**
     * The Reservation to use for this topic's throughput capacity.
     * 
     */
    private final @Nullable String throughputReservation;

    @OutputCustomType.Constructor({"throughputReservation"})
    private LiteTopicReservationConfig(@Nullable String throughputReservation) {
        this.throughputReservation = throughputReservation;
    }

    /**
     * The Reservation to use for this topic's throughput capacity.
     * 
     */
    public Optional<String> getThroughputReservation() {
        return Optional.ofNullable(this.throughputReservation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicReservationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String throughputReservation;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicReservationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputReservation = defaults.throughputReservation;
        }

        public Builder setThroughputReservation(@Nullable String throughputReservation) {
            this.throughputReservation = throughputReservation;
            return this;
        }

        public LiteTopicReservationConfig build() {
            return new LiteTopicReservationConfig(throughputReservation);
        }
    }
}
