// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container state.
 * 
 */
public final class ContainerStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerStateResponse Empty = new ContainerStateResponse();

    /**
     * Human-readable status of this state.
     * 
     */
    @Import(name="detailStatus")
      private final @Nullable String detailStatus;

    public Optional<String> detailStatus() {
        return this.detailStatus == null ? Optional.empty() : Optional.ofNullable(this.detailStatus);
    }

    /**
     * The container exit code.
     * 
     */
    @Import(name="exitCode")
      private final @Nullable String exitCode;

    public Optional<String> exitCode() {
        return this.exitCode == null ? Optional.empty() : Optional.ofNullable(this.exitCode);
    }

    /**
     * Date/time when the container state finished.
     * 
     */
    @Import(name="finishTime")
      private final @Nullable String finishTime;

    public Optional<String> finishTime() {
        return this.finishTime == null ? Optional.empty() : Optional.ofNullable(this.finishTime);
    }

    /**
     * Date/time when the container state started.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * The state of this container
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public ContainerStateResponse(
        @Nullable String detailStatus,
        @Nullable String exitCode,
        @Nullable String finishTime,
        @Nullable String startTime,
        @Nullable String state) {
        this.detailStatus = detailStatus;
        this.exitCode = exitCode;
        this.finishTime = finishTime;
        this.startTime = startTime;
        this.state = state;
    }

    private ContainerStateResponse() {
        this.detailStatus = null;
        this.exitCode = null;
        this.finishTime = null;
        this.startTime = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String detailStatus;
        private @Nullable String exitCode;
        private @Nullable String finishTime;
        private @Nullable String startTime;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailStatus = defaults.detailStatus;
    	      this.exitCode = defaults.exitCode;
    	      this.finishTime = defaults.finishTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder detailStatus(@Nullable String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public Builder exitCode(@Nullable String exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Builder finishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public ContainerStateResponse build() {
            return new ContainerStateResponse(detailStatus, exitCode, finishTime, startTime, state);
        }
    }
}
