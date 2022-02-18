// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs;
import io.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorArgs Empty = new MetricDescriptorArgs();

    /**
     * A human-readable description for the label.
     * 
     */
    @InputImport(name="description", required=true)
    private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count".
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<List<MetricDescriptorLabelArgs>> labels;

    public Input<List<MetricDescriptorLabelArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    @InputImport(name="launchStage")
    private final @Nullable Input<String> launchStage;

    public Input<String> getLaunchStage() {
        return this.launchStage == null ? Input.empty() : this.launchStage;
    }

    /**
     * Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<MetricDescriptorMetadataArgs> metadata;

    public Input<MetricDescriptorMetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    @InputImport(name="metricKind", required=true)
    private final Input<String> metricKind;

    public Input<String> getMetricKind() {
        return this.metricKind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, '/' and underscores '_' are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    @InputImport(name="unit")
    private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @InputImport(name="valueType", required=true)
    private final Input<String> valueType;

    public Input<String> getValueType() {
        return this.valueType;
    }

    public MetricDescriptorArgs(
        Input<String> description,
        Input<String> displayName,
        @Nullable Input<List<MetricDescriptorLabelArgs>> labels,
        @Nullable Input<String> launchStage,
        @Nullable Input<MetricDescriptorMetadataArgs> metadata,
        Input<String> metricKind,
        @Nullable Input<String> project,
        Input<String> type,
        @Nullable Input<String> unit,
        Input<String> valueType) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = labels;
        this.launchStage = launchStage;
        this.metadata = metadata;
        this.metricKind = Objects.requireNonNull(metricKind, "expected parameter 'metricKind' to be non-null");
        this.project = project;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.unit = unit;
        this.valueType = Objects.requireNonNull(valueType, "expected parameter 'valueType' to be non-null");
    }

    private MetricDescriptorArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.launchStage = Input.empty();
        this.metadata = Input.empty();
        this.metricKind = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
        this.unit = Input.empty();
        this.valueType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<List<MetricDescriptorLabelArgs>> labels;
        private @Nullable Input<String> launchStage;
        private @Nullable Input<MetricDescriptorMetadataArgs> metadata;
        private Input<String> metricKind;
        private @Nullable Input<String> project;
        private Input<String> type;
        private @Nullable Input<String> unit;
        private Input<String> valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.metadata = defaults.metadata;
    	      this.metricKind = defaults.metricKind;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
    	      this.valueType = defaults.valueType;
        }

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setLabels(@Nullable Input<List<MetricDescriptorLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<MetricDescriptorLabelArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLaunchStage(@Nullable Input<String> launchStage) {
            this.launchStage = launchStage;
            return this;
        }

        public Builder setLaunchStage(@Nullable String launchStage) {
            this.launchStage = Input.ofNullable(launchStage);
            return this;
        }

        public Builder setMetadata(@Nullable Input<MetricDescriptorMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable MetricDescriptorMetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMetricKind(Input<String> metricKind) {
            this.metricKind = Objects.requireNonNull(metricKind);
            return this;
        }

        public Builder setMetricKind(String metricKind) {
            this.metricKind = Input.of(Objects.requireNonNull(metricKind));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public Builder setValueType(Input<String> valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = Input.of(Objects.requireNonNull(valueType));
            return this;
        }

        public MetricDescriptorArgs build() {
            return new MetricDescriptorArgs(description, displayName, labels, launchStage, metadata, metricKind, project, type, unit, valueType);
        }
    }
}
