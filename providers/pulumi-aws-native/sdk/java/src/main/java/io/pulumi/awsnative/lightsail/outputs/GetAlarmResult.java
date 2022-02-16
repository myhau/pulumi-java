// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAlarmResult {
    private final @Nullable String alarmArn;
    private final @Nullable String comparisonOperator;
    private final @Nullable List<String> contactProtocols;
    private final @Nullable Integer datapointsToAlarm;
    private final @Nullable Integer evaluationPeriods;
    private final @Nullable Boolean notificationEnabled;
    private final @Nullable List<String> notificationTriggers;
    private final @Nullable String state;
    private final @Nullable Double threshold;
    private final @Nullable String treatMissingData;

    @OutputCustomType.Constructor({"alarmArn","comparisonOperator","contactProtocols","datapointsToAlarm","evaluationPeriods","notificationEnabled","notificationTriggers","state","threshold","treatMissingData"})
    private GetAlarmResult(
        @Nullable String alarmArn,
        @Nullable String comparisonOperator,
        @Nullable List<String> contactProtocols,
        @Nullable Integer datapointsToAlarm,
        @Nullable Integer evaluationPeriods,
        @Nullable Boolean notificationEnabled,
        @Nullable List<String> notificationTriggers,
        @Nullable String state,
        @Nullable Double threshold,
        @Nullable String treatMissingData) {
        this.alarmArn = alarmArn;
        this.comparisonOperator = comparisonOperator;
        this.contactProtocols = contactProtocols;
        this.datapointsToAlarm = datapointsToAlarm;
        this.evaluationPeriods = evaluationPeriods;
        this.notificationEnabled = notificationEnabled;
        this.notificationTriggers = notificationTriggers;
        this.state = state;
        this.threshold = threshold;
        this.treatMissingData = treatMissingData;
    }

    public Optional<String> getAlarmArn() {
        return Optional.ofNullable(this.alarmArn);
    }
    public Optional<String> getComparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    public List<String> getContactProtocols() {
        return this.contactProtocols == null ? List.of() : this.contactProtocols;
    }
    public Optional<Integer> getDatapointsToAlarm() {
        return Optional.ofNullable(this.datapointsToAlarm);
    }
    public Optional<Integer> getEvaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    public Optional<Boolean> getNotificationEnabled() {
        return Optional.ofNullable(this.notificationEnabled);
    }
    public List<String> getNotificationTriggers() {
        return this.notificationTriggers == null ? List.of() : this.notificationTriggers;
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<Double> getThreshold() {
        return Optional.ofNullable(this.threshold);
    }
    public Optional<String> getTreatMissingData() {
        return Optional.ofNullable(this.treatMissingData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alarmArn;
        private @Nullable String comparisonOperator;
        private @Nullable List<String> contactProtocols;
        private @Nullable Integer datapointsToAlarm;
        private @Nullable Integer evaluationPeriods;
        private @Nullable Boolean notificationEnabled;
        private @Nullable List<String> notificationTriggers;
        private @Nullable String state;
        private @Nullable Double threshold;
        private @Nullable String treatMissingData;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.contactProtocols = defaults.contactProtocols;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.notificationEnabled = defaults.notificationEnabled;
    	      this.notificationTriggers = defaults.notificationTriggers;
    	      this.state = defaults.state;
    	      this.threshold = defaults.threshold;
    	      this.treatMissingData = defaults.treatMissingData;
        }

        public Builder setAlarmArn(@Nullable String alarmArn) {
            this.alarmArn = alarmArn;
            return this;
        }

        public Builder setComparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder setContactProtocols(@Nullable List<String> contactProtocols) {
            this.contactProtocols = contactProtocols;
            return this;
        }

        public Builder setDatapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        public Builder setEvaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder setNotificationEnabled(@Nullable Boolean notificationEnabled) {
            this.notificationEnabled = notificationEnabled;
            return this;
        }

        public Builder setNotificationTriggers(@Nullable List<String> notificationTriggers) {
            this.notificationTriggers = notificationTriggers;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setTreatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        public GetAlarmResult build() {
            return new GetAlarmResult(alarmArn, comparisonOperator, contactProtocols, datapointsToAlarm, evaluationPeriods, notificationEnabled, notificationTriggers, state, threshold, treatMissingData);
        }
    }
}