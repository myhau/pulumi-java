// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hourly Schedule properties
 * 
 */
public final class HourlyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HourlyScheduleArgs Empty = new HourlyScheduleArgs();

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @Import(name="minute")
      private final @Nullable Output<Integer> minute;

    public Output<Integer> minute() {
        return this.minute == null ? Codegen.empty() : this.minute;
    }

    /**
     * Hourly snapshot count to keep
     * 
     */
    @Import(name="snapshotsToKeep")
      private final @Nullable Output<Integer> snapshotsToKeep;

    public Output<Integer> snapshotsToKeep() {
        return this.snapshotsToKeep == null ? Codegen.empty() : this.snapshotsToKeep;
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @Import(name="usedBytes")
      private final @Nullable Output<Double> usedBytes;

    public Output<Double> usedBytes() {
        return this.usedBytes == null ? Codegen.empty() : this.usedBytes;
    }

    public HourlyScheduleArgs(
        @Nullable Output<Integer> minute,
        @Nullable Output<Integer> snapshotsToKeep,
        @Nullable Output<Double> usedBytes) {
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    private HourlyScheduleArgs() {
        this.minute = Codegen.empty();
        this.snapshotsToKeep = Codegen.empty();
        this.usedBytes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourlyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minute;
        private @Nullable Output<Integer> snapshotsToKeep;
        private @Nullable Output<Double> usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(HourlyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder minute(@Nullable Output<Integer> minute) {
            this.minute = minute;
            return this;
        }
        public Builder minute(@Nullable Integer minute) {
            this.minute = Codegen.ofNullable(minute);
            return this;
        }
        public Builder snapshotsToKeep(@Nullable Output<Integer> snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }
        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = Codegen.ofNullable(snapshotsToKeep);
            return this;
        }
        public Builder usedBytes(@Nullable Output<Double> usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }
        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = Codegen.ofNullable(usedBytes);
            return this;
        }        public HourlyScheduleArgs build() {
            return new HourlyScheduleArgs(minute, snapshotsToKeep, usedBytes);
        }
    }
}
