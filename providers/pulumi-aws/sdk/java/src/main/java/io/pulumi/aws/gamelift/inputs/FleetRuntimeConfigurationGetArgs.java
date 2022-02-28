// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetRuntimeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetRuntimeConfigurationGetArgs Empty = new FleetRuntimeConfigurationGetArgs();

    /**
     * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
     * 
     */
    @InputImport(name="gameSessionActivationTimeoutSeconds")
      private final @Nullable Input<Integer> gameSessionActivationTimeoutSeconds;

    public Input<Integer> getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds == null ? Input.empty() : this.gameSessionActivationTimeoutSeconds;
    }

    /**
     * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
     * 
     */
    @InputImport(name="maxConcurrentGameSessionActivations")
      private final @Nullable Input<Integer> maxConcurrentGameSessionActivations;

    public Input<Integer> getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations == null ? Input.empty() : this.maxConcurrentGameSessionActivations;
    }

    /**
     * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * 
     */
    @InputImport(name="serverProcesses")
      private final @Nullable Input<List<FleetRuntimeConfigurationServerProcessGetArgs>> serverProcesses;

    public Input<List<FleetRuntimeConfigurationServerProcessGetArgs>> getServerProcesses() {
        return this.serverProcesses == null ? Input.empty() : this.serverProcesses;
    }

    public FleetRuntimeConfigurationGetArgs(
        @Nullable Input<Integer> gameSessionActivationTimeoutSeconds,
        @Nullable Input<Integer> maxConcurrentGameSessionActivations,
        @Nullable Input<List<FleetRuntimeConfigurationServerProcessGetArgs>> serverProcesses) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        this.serverProcesses = serverProcesses;
    }

    private FleetRuntimeConfigurationGetArgs() {
        this.gameSessionActivationTimeoutSeconds = Input.empty();
        this.maxConcurrentGameSessionActivations = Input.empty();
        this.serverProcesses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetRuntimeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> gameSessionActivationTimeoutSeconds;
        private @Nullable Input<Integer> maxConcurrentGameSessionActivations;
        private @Nullable Input<List<FleetRuntimeConfigurationServerProcessGetArgs>> serverProcesses;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetRuntimeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gameSessionActivationTimeoutSeconds = defaults.gameSessionActivationTimeoutSeconds;
    	      this.maxConcurrentGameSessionActivations = defaults.maxConcurrentGameSessionActivations;
    	      this.serverProcesses = defaults.serverProcesses;
        }

        public Builder setGameSessionActivationTimeoutSeconds(@Nullable Input<Integer> gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }

        public Builder setGameSessionActivationTimeoutSeconds(@Nullable Integer gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = Input.ofNullable(gameSessionActivationTimeoutSeconds);
            return this;
        }

        public Builder setMaxConcurrentGameSessionActivations(@Nullable Input<Integer> maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }

        public Builder setMaxConcurrentGameSessionActivations(@Nullable Integer maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = Input.ofNullable(maxConcurrentGameSessionActivations);
            return this;
        }

        public Builder setServerProcesses(@Nullable Input<List<FleetRuntimeConfigurationServerProcessGetArgs>> serverProcesses) {
            this.serverProcesses = serverProcesses;
            return this;
        }

        public Builder setServerProcesses(@Nullable List<FleetRuntimeConfigurationServerProcessGetArgs> serverProcesses) {
            this.serverProcesses = Input.ofNullable(serverProcesses);
            return this;
        }
        public FleetRuntimeConfigurationGetArgs build() {
            return new FleetRuntimeConfigurationGetArgs(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcesses);
        }
    }
}
