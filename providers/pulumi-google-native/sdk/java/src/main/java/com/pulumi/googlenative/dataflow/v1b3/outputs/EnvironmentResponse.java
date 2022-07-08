// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataflow.v1b3.outputs.DebugOptionsResponse;
import com.pulumi.googlenative.dataflow.v1b3.outputs.WorkerPoolResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class EnvironmentResponse {
    /**
     * @return The type of cluster manager API to use. If unknown or unspecified, the service will attempt to choose a reasonable default. This should be in the form of the API service name, e.g. &#34;compute.googleapis.com&#34;.
     * 
     */
    private final String clusterManagerApiService;
    /**
     * @return The dataset for the current project where various workflow related tables are stored. The supported resource type is: Google BigQuery: bigquery.googleapis.com/{dataset}
     * 
     */
    private final String dataset;
    /**
     * @return Any debugging options to be supplied to the job.
     * 
     */
    private final DebugOptionsResponse debugOptions;
    /**
     * @return The list of experiments to enable. This field should be used for SDK related experiments and not for service related experiments. The proper field for service related experiments is service_options.
     * 
     */
    private final List<String> experiments;
    /**
     * @return Which Flexible Resource Scheduling mode to run in.
     * 
     */
    private final String flexResourceSchedulingGoal;
    /**
     * @return Experimental settings.
     * 
     */
    private final Map<String,String> internalExperiments;
    /**
     * @return The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through the service and are used to recreate the SDK pipeline options on the worker in a language agnostic and platform independent way.
     * 
     */
    private final Map<String,String> sdkPipelineOptions;
    /**
     * @return Identity to run virtual machines as. Defaults to the default account.
     * 
     */
    private final String serviceAccountEmail;
    /**
     * @return If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer Managed Encryption Key (CMEK). Format: projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
     * 
     */
    private final String serviceKmsKeyName;
    /**
     * @return The list of service options to enable. This field should be used for service related experiments only. These experiments, when graduating to GA, should be replaced by dedicated fields or become default (i.e. always on).
     * 
     */
    private final List<String> serviceOptions;
    /**
     * @return The shuffle mode used for the job.
     * 
     */
    private final String shuffleMode;
    /**
     * @return The prefix of the resources the system should use for temporary storage. The system will append the suffix &#34;/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of the job_name field. The resulting bucket and object prefix is used as the prefix of the resources used to store temporary data needed during the job execution. NOTE: This will override the value in taskrunner_settings. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    private final String tempStoragePrefix;
    /**
     * @return A description of the process that generated the request.
     * 
     */
    private final Map<String,String> userAgent;
    /**
     * @return A structure describing which components and their versions of the service are required in order to run the job.
     * 
     */
    private final Map<String,String> version;
    /**
     * @return The worker pools. At least one &#34;harness&#34; worker pool must be specified in order for the job to have workers.
     * 
     */
    private final List<WorkerPoolResponse> workerPools;
    /**
     * @return The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane&#39;s region.
     * 
     */
    private final String workerRegion;
    /**
     * @return The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane&#39;s region is chosen based on available capacity.
     * 
     */
    private final String workerZone;

    @CustomType.Constructor
    private EnvironmentResponse(
        @CustomType.Parameter("clusterManagerApiService") String clusterManagerApiService,
        @CustomType.Parameter("dataset") String dataset,
        @CustomType.Parameter("debugOptions") DebugOptionsResponse debugOptions,
        @CustomType.Parameter("experiments") List<String> experiments,
        @CustomType.Parameter("flexResourceSchedulingGoal") String flexResourceSchedulingGoal,
        @CustomType.Parameter("internalExperiments") Map<String,String> internalExperiments,
        @CustomType.Parameter("sdkPipelineOptions") Map<String,String> sdkPipelineOptions,
        @CustomType.Parameter("serviceAccountEmail") String serviceAccountEmail,
        @CustomType.Parameter("serviceKmsKeyName") String serviceKmsKeyName,
        @CustomType.Parameter("serviceOptions") List<String> serviceOptions,
        @CustomType.Parameter("shuffleMode") String shuffleMode,
        @CustomType.Parameter("tempStoragePrefix") String tempStoragePrefix,
        @CustomType.Parameter("userAgent") Map<String,String> userAgent,
        @CustomType.Parameter("version") Map<String,String> version,
        @CustomType.Parameter("workerPools") List<WorkerPoolResponse> workerPools,
        @CustomType.Parameter("workerRegion") String workerRegion,
        @CustomType.Parameter("workerZone") String workerZone) {
        this.clusterManagerApiService = clusterManagerApiService;
        this.dataset = dataset;
        this.debugOptions = debugOptions;
        this.experiments = experiments;
        this.flexResourceSchedulingGoal = flexResourceSchedulingGoal;
        this.internalExperiments = internalExperiments;
        this.sdkPipelineOptions = sdkPipelineOptions;
        this.serviceAccountEmail = serviceAccountEmail;
        this.serviceKmsKeyName = serviceKmsKeyName;
        this.serviceOptions = serviceOptions;
        this.shuffleMode = shuffleMode;
        this.tempStoragePrefix = tempStoragePrefix;
        this.userAgent = userAgent;
        this.version = version;
        this.workerPools = workerPools;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
    }

    /**
     * @return The type of cluster manager API to use. If unknown or unspecified, the service will attempt to choose a reasonable default. This should be in the form of the API service name, e.g. &#34;compute.googleapis.com&#34;.
     * 
     */
    public String clusterManagerApiService() {
        return this.clusterManagerApiService;
    }
    /**
     * @return The dataset for the current project where various workflow related tables are stored. The supported resource type is: Google BigQuery: bigquery.googleapis.com/{dataset}
     * 
     */
    public String dataset() {
        return this.dataset;
    }
    /**
     * @return Any debugging options to be supplied to the job.
     * 
     */
    public DebugOptionsResponse debugOptions() {
        return this.debugOptions;
    }
    /**
     * @return The list of experiments to enable. This field should be used for SDK related experiments and not for service related experiments. The proper field for service related experiments is service_options.
     * 
     */
    public List<String> experiments() {
        return this.experiments;
    }
    /**
     * @return Which Flexible Resource Scheduling mode to run in.
     * 
     */
    public String flexResourceSchedulingGoal() {
        return this.flexResourceSchedulingGoal;
    }
    /**
     * @return Experimental settings.
     * 
     */
    public Map<String,String> internalExperiments() {
        return this.internalExperiments;
    }
    /**
     * @return The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through the service and are used to recreate the SDK pipeline options on the worker in a language agnostic and platform independent way.
     * 
     */
    public Map<String,String> sdkPipelineOptions() {
        return this.sdkPipelineOptions;
    }
    /**
     * @return Identity to run virtual machines as. Defaults to the default account.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * @return If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer Managed Encryption Key (CMEK). Format: projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
     * 
     */
    public String serviceKmsKeyName() {
        return this.serviceKmsKeyName;
    }
    /**
     * @return The list of service options to enable. This field should be used for service related experiments only. These experiments, when graduating to GA, should be replaced by dedicated fields or become default (i.e. always on).
     * 
     */
    public List<String> serviceOptions() {
        return this.serviceOptions;
    }
    /**
     * @return The shuffle mode used for the job.
     * 
     */
    public String shuffleMode() {
        return this.shuffleMode;
    }
    /**
     * @return The prefix of the resources the system should use for temporary storage. The system will append the suffix &#34;/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of the job_name field. The resulting bucket and object prefix is used as the prefix of the resources used to store temporary data needed during the job execution. NOTE: This will override the value in taskrunner_settings. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    public String tempStoragePrefix() {
        return this.tempStoragePrefix;
    }
    /**
     * @return A description of the process that generated the request.
     * 
     */
    public Map<String,String> userAgent() {
        return this.userAgent;
    }
    /**
     * @return A structure describing which components and their versions of the service are required in order to run the job.
     * 
     */
    public Map<String,String> version() {
        return this.version;
    }
    /**
     * @return The worker pools. At least one &#34;harness&#34; worker pool must be specified in order for the job to have workers.
     * 
     */
    public List<WorkerPoolResponse> workerPools() {
        return this.workerPools;
    }
    /**
     * @return The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane&#39;s region.
     * 
     */
    public String workerRegion() {
        return this.workerRegion;
    }
    /**
     * @return The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane&#39;s region is chosen based on available capacity.
     * 
     */
    public String workerZone() {
        return this.workerZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterManagerApiService;
        private String dataset;
        private DebugOptionsResponse debugOptions;
        private List<String> experiments;
        private String flexResourceSchedulingGoal;
        private Map<String,String> internalExperiments;
        private Map<String,String> sdkPipelineOptions;
        private String serviceAccountEmail;
        private String serviceKmsKeyName;
        private List<String> serviceOptions;
        private String shuffleMode;
        private String tempStoragePrefix;
        private Map<String,String> userAgent;
        private Map<String,String> version;
        private List<WorkerPoolResponse> workerPools;
        private String workerRegion;
        private String workerZone;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterManagerApiService = defaults.clusterManagerApiService;
    	      this.dataset = defaults.dataset;
    	      this.debugOptions = defaults.debugOptions;
    	      this.experiments = defaults.experiments;
    	      this.flexResourceSchedulingGoal = defaults.flexResourceSchedulingGoal;
    	      this.internalExperiments = defaults.internalExperiments;
    	      this.sdkPipelineOptions = defaults.sdkPipelineOptions;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.serviceKmsKeyName = defaults.serviceKmsKeyName;
    	      this.serviceOptions = defaults.serviceOptions;
    	      this.shuffleMode = defaults.shuffleMode;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.userAgent = defaults.userAgent;
    	      this.version = defaults.version;
    	      this.workerPools = defaults.workerPools;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
        }

        public Builder clusterManagerApiService(String clusterManagerApiService) {
            this.clusterManagerApiService = Objects.requireNonNull(clusterManagerApiService);
            return this;
        }
        public Builder dataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder debugOptions(DebugOptionsResponse debugOptions) {
            this.debugOptions = Objects.requireNonNull(debugOptions);
            return this;
        }
        public Builder experiments(List<String> experiments) {
            this.experiments = Objects.requireNonNull(experiments);
            return this;
        }
        public Builder experiments(String... experiments) {
            return experiments(List.of(experiments));
        }
        public Builder flexResourceSchedulingGoal(String flexResourceSchedulingGoal) {
            this.flexResourceSchedulingGoal = Objects.requireNonNull(flexResourceSchedulingGoal);
            return this;
        }
        public Builder internalExperiments(Map<String,String> internalExperiments) {
            this.internalExperiments = Objects.requireNonNull(internalExperiments);
            return this;
        }
        public Builder sdkPipelineOptions(Map<String,String> sdkPipelineOptions) {
            this.sdkPipelineOptions = Objects.requireNonNull(sdkPipelineOptions);
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public Builder serviceKmsKeyName(String serviceKmsKeyName) {
            this.serviceKmsKeyName = Objects.requireNonNull(serviceKmsKeyName);
            return this;
        }
        public Builder serviceOptions(List<String> serviceOptions) {
            this.serviceOptions = Objects.requireNonNull(serviceOptions);
            return this;
        }
        public Builder serviceOptions(String... serviceOptions) {
            return serviceOptions(List.of(serviceOptions));
        }
        public Builder shuffleMode(String shuffleMode) {
            this.shuffleMode = Objects.requireNonNull(shuffleMode);
            return this;
        }
        public Builder tempStoragePrefix(String tempStoragePrefix) {
            this.tempStoragePrefix = Objects.requireNonNull(tempStoragePrefix);
            return this;
        }
        public Builder userAgent(Map<String,String> userAgent) {
            this.userAgent = Objects.requireNonNull(userAgent);
            return this;
        }
        public Builder version(Map<String,String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder workerPools(List<WorkerPoolResponse> workerPools) {
            this.workerPools = Objects.requireNonNull(workerPools);
            return this;
        }
        public Builder workerPools(WorkerPoolResponse... workerPools) {
            return workerPools(List.of(workerPools));
        }
        public Builder workerRegion(String workerRegion) {
            this.workerRegion = Objects.requireNonNull(workerRegion);
            return this;
        }
        public Builder workerZone(String workerZone) {
            this.workerZone = Objects.requireNonNull(workerZone);
            return this;
        }        public EnvironmentResponse build() {
            return new EnvironmentResponse(clusterManagerApiService, dataset, debugOptions, experiments, flexResourceSchedulingGoal, internalExperiments, sdkPipelineOptions, serviceAccountEmail, serviceKmsKeyName, serviceOptions, shuffleMode, tempStoragePrefix, userAgent, version, workerPools, workerRegion, workerZone);
        }
    }
}
