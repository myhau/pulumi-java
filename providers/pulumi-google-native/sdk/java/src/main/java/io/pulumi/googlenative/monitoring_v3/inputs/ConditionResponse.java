// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.LogMatchResponse;
import io.pulumi.googlenative.monitoring_v3.inputs.MetricAbsenceResponse;
import io.pulumi.googlenative.monitoring_v3.inputs.MetricThresholdResponse;
import io.pulumi.googlenative.monitoring_v3.inputs.MonitoringQueryLanguageConditionResponse;
import java.lang.String;
import java.util.Objects;


public final class ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConditionResponse Empty = new ConditionResponse();

    @InputImport(name="conditionAbsent", required=true)
    private final MetricAbsenceResponse conditionAbsent;

    public MetricAbsenceResponse getConditionAbsent() {
        return this.conditionAbsent;
    }

    @InputImport(name="conditionMatchedLog", required=true)
    private final LogMatchResponse conditionMatchedLog;

    public LogMatchResponse getConditionMatchedLog() {
        return this.conditionMatchedLog;
    }

    @InputImport(name="conditionMonitoringQueryLanguage", required=true)
    private final MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;

    public MonitoringQueryLanguageConditionResponse getConditionMonitoringQueryLanguage() {
        return this.conditionMonitoringQueryLanguage;
    }

    @InputImport(name="conditionThreshold", required=true)
    private final MetricThresholdResponse conditionThreshold;

    public MetricThresholdResponse getConditionThreshold() {
        return this.conditionThreshold;
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public ConditionResponse(
        MetricAbsenceResponse conditionAbsent,
        LogMatchResponse conditionMatchedLog,
        MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage,
        MetricThresholdResponse conditionThreshold,
        String displayName,
        String name) {
        this.conditionAbsent = Objects.requireNonNull(conditionAbsent, "expected parameter 'conditionAbsent' to be non-null");
        this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog, "expected parameter 'conditionMatchedLog' to be non-null");
        this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage, "expected parameter 'conditionMonitoringQueryLanguage' to be non-null");
        this.conditionThreshold = Objects.requireNonNull(conditionThreshold, "expected parameter 'conditionThreshold' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ConditionResponse() {
        this.conditionAbsent = null;
        this.conditionMatchedLog = null;
        this.conditionMonitoringQueryLanguage = null;
        this.conditionThreshold = null;
        this.displayName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAbsenceResponse conditionAbsent;
        private LogMatchResponse conditionMatchedLog;
        private MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage;
        private MetricThresholdResponse conditionThreshold;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionAbsent = defaults.conditionAbsent;
    	      this.conditionMatchedLog = defaults.conditionMatchedLog;
    	      this.conditionMonitoringQueryLanguage = defaults.conditionMonitoringQueryLanguage;
    	      this.conditionThreshold = defaults.conditionThreshold;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setConditionAbsent(MetricAbsenceResponse conditionAbsent) {
            this.conditionAbsent = Objects.requireNonNull(conditionAbsent);
            return this;
        }

        public Builder setConditionMatchedLog(LogMatchResponse conditionMatchedLog) {
            this.conditionMatchedLog = Objects.requireNonNull(conditionMatchedLog);
            return this;
        }

        public Builder setConditionMonitoringQueryLanguage(MonitoringQueryLanguageConditionResponse conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = Objects.requireNonNull(conditionMonitoringQueryLanguage);
            return this;
        }

        public Builder setConditionThreshold(MetricThresholdResponse conditionThreshold) {
            this.conditionThreshold = Objects.requireNonNull(conditionThreshold);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ConditionResponse build() {
            return new ConditionResponse(conditionAbsent, conditionMatchedLog, conditionMonitoringQueryLanguage, conditionThreshold, displayName, name);
        }
    }
}