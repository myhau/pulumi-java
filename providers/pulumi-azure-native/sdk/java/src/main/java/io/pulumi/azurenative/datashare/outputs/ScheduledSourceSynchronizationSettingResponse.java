// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduledSourceSynchronizationSettingResponse {
    /**
     * Kind of synchronization setting on share.
     * Expected value is 'ScheduleBased'.
     * 
     */
    private final String kind;
    /**
     * Recurrence Interval
     * 
     */
    private final @Nullable String recurrenceInterval;
    /**
     * Synchronization time
     * 
     */
    private final @Nullable String synchronizationTime;

    @OutputCustomType.Constructor({"kind","recurrenceInterval","synchronizationTime"})
    private ScheduledSourceSynchronizationSettingResponse(
        String kind,
        @Nullable String recurrenceInterval,
        @Nullable String synchronizationTime) {
        this.kind = kind;
        this.recurrenceInterval = recurrenceInterval;
        this.synchronizationTime = synchronizationTime;
    }

    /**
     * Kind of synchronization setting on share.
     * Expected value is 'ScheduleBased'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Recurrence Interval
     * 
    */
    public Optional<String> getRecurrenceInterval() {
        return Optional.ofNullable(this.recurrenceInterval);
    }
    /**
     * Synchronization time
     * 
    */
    public Optional<String> getSynchronizationTime() {
        return Optional.ofNullable(this.synchronizationTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledSourceSynchronizationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private @Nullable String recurrenceInterval;
        private @Nullable String synchronizationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledSourceSynchronizationSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.recurrenceInterval = defaults.recurrenceInterval;
    	      this.synchronizationTime = defaults.synchronizationTime;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setRecurrenceInterval(@Nullable String recurrenceInterval) {
            this.recurrenceInterval = recurrenceInterval;
            return this;
        }

        public Builder setSynchronizationTime(@Nullable String synchronizationTime) {
            this.synchronizationTime = synchronizationTime;
            return this;
        }
        public ScheduledSourceSynchronizationSettingResponse build() {
            return new ScheduledSourceSynchronizationSettingResponse(kind, recurrenceInterval, synchronizationTime);
        }
    }
}
