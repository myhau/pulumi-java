// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DailyScheduleResponse {
    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    private final @Nullable Integer hour;
    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    private final @Nullable Integer minute;
    /**
     * Daily snapshot count to keep
     * 
     */
    private final @Nullable Integer snapshotsToKeep;
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    private final @Nullable Double usedBytes;

    @CustomType.Constructor
    private DailyScheduleResponse(
        @CustomType.Parameter("hour") @Nullable Integer hour,
        @CustomType.Parameter("minute") @Nullable Integer minute,
        @CustomType.Parameter("snapshotsToKeep") @Nullable Integer snapshotsToKeep,
        @CustomType.Parameter("usedBytes") @Nullable Double usedBytes) {
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
    */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * Indicates which minute snapshot should be taken
     * 
    */
    public Optional<Integer> minute() {
        return Optional.ofNullable(this.minute);
    }
    /**
     * Daily snapshot count to keep
     * 
    */
    public Optional<Integer> snapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
    */
    public Optional<Double> usedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hour;
        private @Nullable Integer minute;
        private @Nullable Integer snapshotsToKeep;
        private @Nullable Double usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }
        public Builder minute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }
        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }
        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }        public DailyScheduleResponse build() {
            return new DailyScheduleResponse(hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
