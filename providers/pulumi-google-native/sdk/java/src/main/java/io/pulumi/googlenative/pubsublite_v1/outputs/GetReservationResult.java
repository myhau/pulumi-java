// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetReservationResult {
    /**
     * The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    private final String name;
    /**
     * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
     */
    private final String throughputCapacity;

    @OutputCustomType.Constructor({"name","throughputCapacity"})
    private GetReservationResult(
        String name,
        String throughputCapacity) {
        this.name = name;
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
    */
    public String getThroughputCapacity() {
        return this.throughputCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String throughputCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.throughputCapacity = defaults.throughputCapacity;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setThroughputCapacity(String throughputCapacity) {
            this.throughputCapacity = Objects.requireNonNull(throughputCapacity);
            return this;
        }
        public GetReservationResult build() {
            return new GetReservationResult(name, throughputCapacity);
        }
    }
}
