// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.FrequencyUnit;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupSchedule extends io.pulumi.resources.InvokeArgs {

    public static final BackupSchedule Empty = new BackupSchedule();

    @InputImport(name="frequencyInterval", required=true)
    private final Integer frequencyInterval;

    public Integer getFrequencyInterval() {
        return this.frequencyInterval;
    }

    @InputImport(name="frequencyUnit", required=true)
    private final FrequencyUnit frequencyUnit;

    public FrequencyUnit getFrequencyUnit() {
        return this.frequencyUnit;
    }

    @InputImport(name="keepAtLeastOneBackup", required=true)
    private final Boolean keepAtLeastOneBackup;

    public Boolean getKeepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    @InputImport(name="retentionPeriodInDays", required=true)
    private final Integer retentionPeriodInDays;

    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public BackupSchedule(
        Integer frequencyInterval,
        FrequencyUnit frequencyUnit,
        Boolean keepAtLeastOneBackup,
        Integer retentionPeriodInDays,
        @Nullable String startTime) {
        this.frequencyInterval = frequencyInterval == null ? 7 : Objects.requireNonNull(frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
        this.frequencyUnit = frequencyUnit == null ? io.pulumi.azurenative.web.enums.FrequencyUnit.Day : Objects.requireNonNull(frequencyUnit, "expected parameter 'frequencyUnit' to be non-null");
        this.keepAtLeastOneBackup = keepAtLeastOneBackup == null ? true : Objects.requireNonNull(keepAtLeastOneBackup, "expected parameter 'keepAtLeastOneBackup' to be non-null");
        this.retentionPeriodInDays = retentionPeriodInDays == null ? 30 : Objects.requireNonNull(retentionPeriodInDays, "expected parameter 'retentionPeriodInDays' to be non-null");
        this.startTime = startTime;
    }

    private BackupSchedule() {
        this.frequencyInterval = null;
        this.frequencyUnit = null;
        this.keepAtLeastOneBackup = null;
        this.retentionPeriodInDays = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInterval;
        private FrequencyUnit frequencyUnit;
        private Boolean keepAtLeastOneBackup;
        private Integer retentionPeriodInDays;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.retentionPeriodInDays = defaults.retentionPeriodInDays;
    	      this.startTime = defaults.startTime;
        }

        public Builder setFrequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }

        public Builder setFrequencyUnit(FrequencyUnit frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }

        public Builder setKeepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }

        public Builder setRetentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = Objects.requireNonNull(retentionPeriodInDays);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public BackupSchedule build() {
            return new BackupSchedule(frequencyInterval, frequencyUnit, keepAtLeastOneBackup, retentionPeriodInDays, startTime);
        }
    }
}