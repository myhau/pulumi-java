// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetComputeCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetComputeCapacityArgs Empty = new FleetComputeCapacityArgs();

    /**
     * Number of currently available instances that can be used to stream sessions.
     * 
     */
    @InputImport(name="available")
      private final @Nullable Input<Integer> available;

    public Input<Integer> getAvailable() {
        return this.available == null ? Input.empty() : this.available;
    }

    /**
     * Desired number of streaming instances.
     * 
     */
    @InputImport(name="desiredInstances", required=true)
      private final Input<Integer> desiredInstances;

    public Input<Integer> getDesiredInstances() {
        return this.desiredInstances;
    }

    /**
     * Number of instances in use for streaming.
     * 
     */
    @InputImport(name="inUse")
      private final @Nullable Input<Integer> inUse;

    public Input<Integer> getInUse() {
        return this.inUse == null ? Input.empty() : this.inUse;
    }

    /**
     * Total number of simultaneous streaming instances that are running.
     * 
     */
    @InputImport(name="running")
      private final @Nullable Input<Integer> running;

    public Input<Integer> getRunning() {
        return this.running == null ? Input.empty() : this.running;
    }

    public FleetComputeCapacityArgs(
        @Nullable Input<Integer> available,
        Input<Integer> desiredInstances,
        @Nullable Input<Integer> inUse,
        @Nullable Input<Integer> running) {
        this.available = available;
        this.desiredInstances = Objects.requireNonNull(desiredInstances, "expected parameter 'desiredInstances' to be non-null");
        this.inUse = inUse;
        this.running = running;
    }

    private FleetComputeCapacityArgs() {
        this.available = Input.empty();
        this.desiredInstances = Input.empty();
        this.inUse = Input.empty();
        this.running = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetComputeCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> available;
        private Input<Integer> desiredInstances;
        private @Nullable Input<Integer> inUse;
        private @Nullable Input<Integer> running;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetComputeCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.desiredInstances = defaults.desiredInstances;
    	      this.inUse = defaults.inUse;
    	      this.running = defaults.running;
        }

        public Builder setAvailable(@Nullable Input<Integer> available) {
            this.available = available;
            return this;
        }

        public Builder setAvailable(@Nullable Integer available) {
            this.available = Input.ofNullable(available);
            return this;
        }

        public Builder setDesiredInstances(Input<Integer> desiredInstances) {
            this.desiredInstances = Objects.requireNonNull(desiredInstances);
            return this;
        }

        public Builder setDesiredInstances(Integer desiredInstances) {
            this.desiredInstances = Input.of(Objects.requireNonNull(desiredInstances));
            return this;
        }

        public Builder setInUse(@Nullable Input<Integer> inUse) {
            this.inUse = inUse;
            return this;
        }

        public Builder setInUse(@Nullable Integer inUse) {
            this.inUse = Input.ofNullable(inUse);
            return this;
        }

        public Builder setRunning(@Nullable Input<Integer> running) {
            this.running = running;
            return this;
        }

        public Builder setRunning(@Nullable Integer running) {
            this.running = Input.ofNullable(running);
            return this;
        }
        public FleetComputeCapacityArgs build() {
            return new FleetComputeCapacityArgs(available, desiredInstances, inUse, running);
        }
    }
}
