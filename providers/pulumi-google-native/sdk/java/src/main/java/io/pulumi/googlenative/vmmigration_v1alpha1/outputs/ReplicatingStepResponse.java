// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicatingStepResponse {
    /**
     * The source disks replication rate for the last 30 minutes in bytes per second.
     * 
     */
    private final String lastThirtyMinutesAverageBytesPerSecond;
    /**
     * The source disks replication rate for the last 2 minutes in bytes per second.
     * 
     */
    private final String lastTwoMinutesAverageBytesPerSecond;
    /**
     * Replicated bytes in the step.
     * 
     */
    private final String replicatedBytes;
    /**
     * Total bytes to be handled in the step.
     * 
     */
    private final String totalBytes;

    @OutputCustomType.Constructor
    private ReplicatingStepResponse(
        @OutputCustomType.Parameter("lastThirtyMinutesAverageBytesPerSecond") String lastThirtyMinutesAverageBytesPerSecond,
        @OutputCustomType.Parameter("lastTwoMinutesAverageBytesPerSecond") String lastTwoMinutesAverageBytesPerSecond,
        @OutputCustomType.Parameter("replicatedBytes") String replicatedBytes,
        @OutputCustomType.Parameter("totalBytes") String totalBytes) {
        this.lastThirtyMinutesAverageBytesPerSecond = lastThirtyMinutesAverageBytesPerSecond;
        this.lastTwoMinutesAverageBytesPerSecond = lastTwoMinutesAverageBytesPerSecond;
        this.replicatedBytes = replicatedBytes;
        this.totalBytes = totalBytes;
    }

    /**
     * The source disks replication rate for the last 30 minutes in bytes per second.
     * 
    */
    public String getLastThirtyMinutesAverageBytesPerSecond() {
        return this.lastThirtyMinutesAverageBytesPerSecond;
    }
    /**
     * The source disks replication rate for the last 2 minutes in bytes per second.
     * 
    */
    public String getLastTwoMinutesAverageBytesPerSecond() {
        return this.lastTwoMinutesAverageBytesPerSecond;
    }
    /**
     * Replicated bytes in the step.
     * 
    */
    public String getReplicatedBytes() {
        return this.replicatedBytes;
    }
    /**
     * Total bytes to be handled in the step.
     * 
    */
    public String getTotalBytes() {
        return this.totalBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicatingStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastThirtyMinutesAverageBytesPerSecond;
        private String lastTwoMinutesAverageBytesPerSecond;
        private String replicatedBytes;
        private String totalBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicatingStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastThirtyMinutesAverageBytesPerSecond = defaults.lastThirtyMinutesAverageBytesPerSecond;
    	      this.lastTwoMinutesAverageBytesPerSecond = defaults.lastTwoMinutesAverageBytesPerSecond;
    	      this.replicatedBytes = defaults.replicatedBytes;
    	      this.totalBytes = defaults.totalBytes;
        }

        public Builder setLastThirtyMinutesAverageBytesPerSecond(String lastThirtyMinutesAverageBytesPerSecond) {
            this.lastThirtyMinutesAverageBytesPerSecond = Objects.requireNonNull(lastThirtyMinutesAverageBytesPerSecond);
            return this;
        }

        public Builder setLastTwoMinutesAverageBytesPerSecond(String lastTwoMinutesAverageBytesPerSecond) {
            this.lastTwoMinutesAverageBytesPerSecond = Objects.requireNonNull(lastTwoMinutesAverageBytesPerSecond);
            return this;
        }

        public Builder setReplicatedBytes(String replicatedBytes) {
            this.replicatedBytes = Objects.requireNonNull(replicatedBytes);
            return this;
        }

        public Builder setTotalBytes(String totalBytes) {
            this.totalBytes = Objects.requireNonNull(totalBytes);
            return this;
        }
        public ReplicatingStepResponse build() {
            return new ReplicatingStepResponse(lastThirtyMinutesAverageBytesPerSecond, lastTwoMinutesAverageBytesPerSecond, replicatedBytes, totalBytes);
        }
    }
}
