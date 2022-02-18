// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataflow;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
     * 
     */
    @InputImport(name="additionalExperiments")
    private final @Nullable Input<List<String>> additionalExperiments;

    public Input<List<String>> getAdditionalExperiments() {
        return this.additionalExperiments == null ? Input.empty() : this.additionalExperiments;
    }

    /**
     * Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    @InputImport(name="enableStreamingEngine")
    private final @Nullable Input<Boolean> enableStreamingEngine;

    public Input<Boolean> getEnableStreamingEngine() {
        return this.enableStreamingEngine == null ? Input.empty() : this.enableStreamingEngine;
    }

    /**
     * The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
     * 
     */
    @InputImport(name="ipConfiguration")
    private final @Nullable Input<String> ipConfiguration;

    public Input<String> getIpConfiguration() {
        return this.ipConfiguration == null ? Input.empty() : this.ipConfiguration;
    }

    /**
     * The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * <<<<<<< HEAD
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,Object>> labels;

    public Input<Map<String,Object>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The machine type to use for the job.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    @InputImport(name="maxWorkers")
    private final @Nullable Input<Integer> maxWorkers;

    public Input<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Input.empty() : this.maxWorkers;
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network to which VMs will be assigned. If it is not provided, "default" will be used.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    @InputImport(name="onDelete")
    private final @Nullable Input<String> onDelete;

    public Input<String> getOnDelete() {
        return this.onDelete == null ? Input.empty() : this.onDelete;
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,Object>> parameters;

    public Input<Map<String,Object>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The Service Account email used to create the job.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
     * 
     */
    @InputImport(name="subnetwork")
    private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    /**
     * A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    @InputImport(name="tempGcsLocation", required=true)
    private final Input<String> tempGcsLocation;

    public Input<String> getTempGcsLocation() {
        return this.tempGcsLocation;
    }

    /**
     * The GCS path to the Dataflow job template.
     * 
     */
    @InputImport(name="templateGcsPath", required=true)
    private final Input<String> templateGcsPath;

    public Input<String> getTemplateGcsPath() {
        return this.templateGcsPath;
    }

    /**
     * Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * > > > > > > > v4.1.0
     * 
     */
    @InputImport(name="transformNameMapping")
    private final @Nullable Input<Map<String,Object>> transformNameMapping;

    public Input<Map<String,Object>> getTransformNameMapping() {
        return this.transformNameMapping == null ? Input.empty() : this.transformNameMapping;
    }

    /**
     * The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public JobArgs(
        @Nullable Input<List<String>> additionalExperiments,
        @Nullable Input<Boolean> enableStreamingEngine,
        @Nullable Input<String> ipConfiguration,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,Object>> labels,
        @Nullable Input<String> machineType,
        @Nullable Input<Integer> maxWorkers,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> onDelete,
        @Nullable Input<Map<String,Object>> parameters,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> subnetwork,
        Input<String> tempGcsLocation,
        Input<String> templateGcsPath,
        @Nullable Input<Map<String,Object>> transformNameMapping,
        @Nullable Input<String> zone) {
        this.additionalExperiments = additionalExperiments;
        this.enableStreamingEngine = enableStreamingEngine;
        this.ipConfiguration = ipConfiguration;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.machineType = machineType;
        this.maxWorkers = maxWorkers;
        this.name = name;
        this.network = network;
        this.onDelete = onDelete;
        this.parameters = parameters;
        this.project = project;
        this.region = region;
        this.serviceAccountEmail = serviceAccountEmail;
        this.subnetwork = subnetwork;
        this.tempGcsLocation = Objects.requireNonNull(tempGcsLocation, "expected parameter 'tempGcsLocation' to be non-null");
        this.templateGcsPath = Objects.requireNonNull(templateGcsPath, "expected parameter 'templateGcsPath' to be non-null");
        this.transformNameMapping = transformNameMapping;
        this.zone = zone;
    }

    private JobArgs() {
        this.additionalExperiments = Input.empty();
        this.enableStreamingEngine = Input.empty();
        this.ipConfiguration = Input.empty();
        this.kmsKeyName = Input.empty();
        this.labels = Input.empty();
        this.machineType = Input.empty();
        this.maxWorkers = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.onDelete = Input.empty();
        this.parameters = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.subnetwork = Input.empty();
        this.tempGcsLocation = Input.empty();
        this.templateGcsPath = Input.empty();
        this.transformNameMapping = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> additionalExperiments;
        private @Nullable Input<Boolean> enableStreamingEngine;
        private @Nullable Input<String> ipConfiguration;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,Object>> labels;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Integer> maxWorkers;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> onDelete;
        private @Nullable Input<Map<String,Object>> parameters;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> subnetwork;
        private Input<String> tempGcsLocation;
        private Input<String> templateGcsPath;
        private @Nullable Input<Map<String,Object>> transformNameMapping;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.onDelete = defaults.onDelete;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempGcsLocation = defaults.tempGcsLocation;
    	      this.templateGcsPath = defaults.templateGcsPath;
    	      this.transformNameMapping = defaults.transformNameMapping;
    	      this.zone = defaults.zone;
        }

        public Builder setAdditionalExperiments(@Nullable Input<List<String>> additionalExperiments) {
            this.additionalExperiments = additionalExperiments;
            return this;
        }

        public Builder setAdditionalExperiments(@Nullable List<String> additionalExperiments) {
            this.additionalExperiments = Input.ofNullable(additionalExperiments);
            return this;
        }

        public Builder setEnableStreamingEngine(@Nullable Input<Boolean> enableStreamingEngine) {
            this.enableStreamingEngine = enableStreamingEngine;
            return this;
        }

        public Builder setEnableStreamingEngine(@Nullable Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Input.ofNullable(enableStreamingEngine);
            return this;
        }

        public Builder setIpConfiguration(@Nullable Input<String> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder setIpConfiguration(@Nullable String ipConfiguration) {
            this.ipConfiguration = Input.ofNullable(ipConfiguration);
            return this;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,Object> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMaxWorkers(@Nullable Input<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder setMaxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Input.ofNullable(maxWorkers);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setOnDelete(@Nullable Input<String> onDelete) {
            this.onDelete = onDelete;
            return this;
        }

        public Builder setOnDelete(@Nullable String onDelete) {
            this.onDelete = Input.ofNullable(onDelete);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Input.ofNullable(parameters);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public Builder setTempGcsLocation(Input<String> tempGcsLocation) {
            this.tempGcsLocation = Objects.requireNonNull(tempGcsLocation);
            return this;
        }

        public Builder setTempGcsLocation(String tempGcsLocation) {
            this.tempGcsLocation = Input.of(Objects.requireNonNull(tempGcsLocation));
            return this;
        }

        public Builder setTemplateGcsPath(Input<String> templateGcsPath) {
            this.templateGcsPath = Objects.requireNonNull(templateGcsPath);
            return this;
        }

        public Builder setTemplateGcsPath(String templateGcsPath) {
            this.templateGcsPath = Input.of(Objects.requireNonNull(templateGcsPath));
            return this;
        }

        public Builder setTransformNameMapping(@Nullable Input<Map<String,Object>> transformNameMapping) {
            this.transformNameMapping = transformNameMapping;
            return this;
        }

        public Builder setTransformNameMapping(@Nullable Map<String,Object> transformNameMapping) {
            this.transformNameMapping = Input.ofNullable(transformNameMapping);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public JobArgs build() {
            return new JobArgs(additionalExperiments, enableStreamingEngine, ipConfiguration, kmsKeyName, labels, machineType, maxWorkers, name, network, onDelete, parameters, project, region, serviceAccountEmail, subnetwork, tempGcsLocation, templateGcsPath, transformNameMapping, zone);
        }
    }
}
