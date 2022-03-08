// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AutoScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ContainerSpecResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ExplanationConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ManualScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RequestLoggingConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RouteMapResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__VersionResponse {
    /**
     * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    private final GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
    /**
     * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    private final GoogleCloudMlV1__AutoScalingResponse autoScaling;
    /**
     * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    private final GoogleCloudMlV1__ContainerSpecResponse container;
    /**
     * The time the version was created.
     * 
     */
    private final String createTime;
    /**
     * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    private final String deploymentUri;
    /**
     * Optional. The description specified for the version when it was created.
     * 
     */
    private final String description;
    /**
     * The details of a failure or a cancellation.
     * 
     */
    private final String errorMessage;
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    private final String etag;
    /**
     * Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    private final GoogleCloudMlV1__ExplanationConfigResponse explanationConfig;
    /**
     * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    private final String framework;
    /**
     * If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    private final Boolean isDefault;
    /**
     * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    private final String lastMigrationModelId;
    /**
     * The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    private final String lastMigrationTime;
    /**
     * The time the version was last used for prediction.
     * 
     */
    private final String lastUseTime;
    /**
     * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    private final String machineType;
    /**
     * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    private final GoogleCloudMlV1__ManualScalingResponse manualScaling;
    /**
     * The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    private final String name;
    /**
     * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    private final List<String> packageUris;
    /**
     * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    private final String predictionClass;
    /**
     * The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    private final String pythonVersion;
    /**
     * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    private final GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig;
    /**
     * Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { "predict": "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" }  ``` See RouteMap for more details about these default values.
     * 
     */
    private final GoogleCloudMlV1__RouteMapResponse routes;
    /**
     * The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    private final String runtimeVersion;
    /**
     * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    private final String serviceAccount;
    /**
     * The state of a version.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"acceleratorConfig","autoScaling","container","createTime","deploymentUri","description","errorMessage","etag","explanationConfig","framework","isDefault","labels","lastMigrationModelId","lastMigrationTime","lastUseTime","machineType","manualScaling","name","packageUris","predictionClass","pythonVersion","requestLoggingConfig","routes","runtimeVersion","serviceAccount","state"})
    private GoogleCloudMlV1__VersionResponse(
        GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig,
        GoogleCloudMlV1__AutoScalingResponse autoScaling,
        GoogleCloudMlV1__ContainerSpecResponse container,
        String createTime,
        String deploymentUri,
        String description,
        String errorMessage,
        String etag,
        GoogleCloudMlV1__ExplanationConfigResponse explanationConfig,
        String framework,
        Boolean isDefault,
        Map<String,String> labels,
        String lastMigrationModelId,
        String lastMigrationTime,
        String lastUseTime,
        String machineType,
        GoogleCloudMlV1__ManualScalingResponse manualScaling,
        String name,
        List<String> packageUris,
        String predictionClass,
        String pythonVersion,
        GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig,
        GoogleCloudMlV1__RouteMapResponse routes,
        String runtimeVersion,
        String serviceAccount,
        String state) {
        this.acceleratorConfig = acceleratorConfig;
        this.autoScaling = autoScaling;
        this.container = container;
        this.createTime = createTime;
        this.deploymentUri = deploymentUri;
        this.description = description;
        this.errorMessage = errorMessage;
        this.etag = etag;
        this.explanationConfig = explanationConfig;
        this.framework = framework;
        this.isDefault = isDefault;
        this.labels = labels;
        this.lastMigrationModelId = lastMigrationModelId;
        this.lastMigrationTime = lastMigrationTime;
        this.lastUseTime = lastUseTime;
        this.machineType = machineType;
        this.manualScaling = manualScaling;
        this.name = name;
        this.packageUris = packageUris;
        this.predictionClass = predictionClass;
        this.pythonVersion = pythonVersion;
        this.requestLoggingConfig = requestLoggingConfig;
        this.routes = routes;
        this.runtimeVersion = runtimeVersion;
        this.serviceAccount = serviceAccount;
        this.state = state;
    }

    /**
     * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
    */
    public GoogleCloudMlV1__AcceleratorConfigResponse getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
    */
    public GoogleCloudMlV1__AutoScalingResponse getAutoScaling() {
        return this.autoScaling;
    }
    /**
     * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
    */
    public GoogleCloudMlV1__ContainerSpecResponse getContainer() {
        return this.container;
    }
    /**
     * The time the version was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
    */
    public String getDeploymentUri() {
        return this.deploymentUri;
    }
    /**
     * Optional. The description specified for the version when it was created.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The details of a failure or a cancellation.
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
    */
    public GoogleCloudMlV1__ExplanationConfigResponse getExplanationConfig() {
        return this.explanationConfig;
    }
    /**
     * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
    */
    public String getFramework() {
        return this.framework;
    }
    /**
     * If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
    */
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
    */
    public String getLastMigrationModelId() {
        return this.lastMigrationModelId;
    }
    /**
     * The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
    */
    public String getLastMigrationTime() {
        return this.lastMigrationTime;
    }
    /**
     * The time the version was last used for prediction.
     * 
    */
    public String getLastUseTime() {
        return this.lastUseTime;
    }
    /**
     * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
    */
    public GoogleCloudMlV1__ManualScalingResponse getManualScaling() {
        return this.manualScaling;
    }
    /**
     * The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
    */
    public List<String> getPackageUris() {
        return this.packageUris;
    }
    /**
     * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
    */
    public String getPredictionClass() {
        return this.predictionClass;
    }
    /**
     * The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
    */
    public String getPythonVersion() {
        return this.pythonVersion;
    }
    /**
     * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
    */
    public GoogleCloudMlV1__RequestLoggingConfigResponse getRequestLoggingConfig() {
        return this.requestLoggingConfig;
    }
    /**
     * Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { "predict": "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" }  ``` See RouteMap for more details about these default values.
     * 
    */
    public GoogleCloudMlV1__RouteMapResponse getRoutes() {
        return this.routes;
    }
    /**
     * The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
    */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The state of a version.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
        private GoogleCloudMlV1__AutoScalingResponse autoScaling;
        private GoogleCloudMlV1__ContainerSpecResponse container;
        private String createTime;
        private String deploymentUri;
        private String description;
        private String errorMessage;
        private String etag;
        private GoogleCloudMlV1__ExplanationConfigResponse explanationConfig;
        private String framework;
        private Boolean isDefault;
        private Map<String,String> labels;
        private String lastMigrationModelId;
        private String lastMigrationTime;
        private String lastUseTime;
        private String machineType;
        private GoogleCloudMlV1__ManualScalingResponse manualScaling;
        private String name;
        private List<String> packageUris;
        private String predictionClass;
        private String pythonVersion;
        private GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig;
        private GoogleCloudMlV1__RouteMapResponse routes;
        private String runtimeVersion;
        private String serviceAccount;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.autoScaling = defaults.autoScaling;
    	      this.container = defaults.container;
    	      this.createTime = defaults.createTime;
    	      this.deploymentUri = defaults.deploymentUri;
    	      this.description = defaults.description;
    	      this.errorMessage = defaults.errorMessage;
    	      this.etag = defaults.etag;
    	      this.explanationConfig = defaults.explanationConfig;
    	      this.framework = defaults.framework;
    	      this.isDefault = defaults.isDefault;
    	      this.labels = defaults.labels;
    	      this.lastMigrationModelId = defaults.lastMigrationModelId;
    	      this.lastMigrationTime = defaults.lastMigrationTime;
    	      this.lastUseTime = defaults.lastUseTime;
    	      this.machineType = defaults.machineType;
    	      this.manualScaling = defaults.manualScaling;
    	      this.name = defaults.name;
    	      this.packageUris = defaults.packageUris;
    	      this.predictionClass = defaults.predictionClass;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.requestLoggingConfig = defaults.requestLoggingConfig;
    	      this.routes = defaults.routes;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
        }

        public Builder setAcceleratorConfig(GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }

        public Builder setAutoScaling(GoogleCloudMlV1__AutoScalingResponse autoScaling) {
            this.autoScaling = Objects.requireNonNull(autoScaling);
            return this;
        }

        public Builder setContainer(GoogleCloudMlV1__ContainerSpecResponse container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeploymentUri(String deploymentUri) {
            this.deploymentUri = Objects.requireNonNull(deploymentUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExplanationConfig(GoogleCloudMlV1__ExplanationConfigResponse explanationConfig) {
            this.explanationConfig = Objects.requireNonNull(explanationConfig);
            return this;
        }

        public Builder setFramework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }

        public Builder setIsDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLastMigrationModelId(String lastMigrationModelId) {
            this.lastMigrationModelId = Objects.requireNonNull(lastMigrationModelId);
            return this;
        }

        public Builder setLastMigrationTime(String lastMigrationTime) {
            this.lastMigrationTime = Objects.requireNonNull(lastMigrationTime);
            return this;
        }

        public Builder setLastUseTime(String lastUseTime) {
            this.lastUseTime = Objects.requireNonNull(lastUseTime);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setManualScaling(GoogleCloudMlV1__ManualScalingResponse manualScaling) {
            this.manualScaling = Objects.requireNonNull(manualScaling);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageUris(List<String> packageUris) {
            this.packageUris = Objects.requireNonNull(packageUris);
            return this;
        }

        public Builder setPredictionClass(String predictionClass) {
            this.predictionClass = Objects.requireNonNull(predictionClass);
            return this;
        }

        public Builder setPythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }

        public Builder setRequestLoggingConfig(GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig) {
            this.requestLoggingConfig = Objects.requireNonNull(requestLoggingConfig);
            return this;
        }

        public Builder setRoutes(GoogleCloudMlV1__RouteMapResponse routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GoogleCloudMlV1__VersionResponse build() {
            return new GoogleCloudMlV1__VersionResponse(acceleratorConfig, autoScaling, container, createTime, deploymentUri, description, errorMessage, etag, explanationConfig, framework, isDefault, labels, lastMigrationModelId, lastMigrationTime, lastUseTime, machineType, manualScaling, name, packageUris, predictionClass, pythonVersion, requestLoggingConfig, routes, runtimeVersion, serviceAccount, state);
        }
    }
}
