// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudfunctions_v1.enums.FunctionIngressSettings;
import io.pulumi.googlenative.cloudfunctions_v1.enums.FunctionVpcConnectorEgressSettings;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.EventTriggerArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.HttpsTriggerArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SecretEnvVarArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SecretVolumeArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SourceRepositoryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    @InputImport(name="availableMemoryMb")
    private final @Nullable Input<Integer> availableMemoryMb;

    public Input<Integer> getAvailableMemoryMb() {
        return this.availableMemoryMb == null ? Input.empty() : this.availableMemoryMb;
    }

    @InputImport(name="buildEnvironmentVariables")
    private final @Nullable Input<Map<String,String>> buildEnvironmentVariables;

    public Input<Map<String,String>> getBuildEnvironmentVariables() {
        return this.buildEnvironmentVariables == null ? Input.empty() : this.buildEnvironmentVariables;
    }

    @InputImport(name="buildWorkerPool")
    private final @Nullable Input<String> buildWorkerPool;

    public Input<String> getBuildWorkerPool() {
        return this.buildWorkerPool == null ? Input.empty() : this.buildWorkerPool;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="dockerRepository")
    private final @Nullable Input<String> dockerRepository;

    public Input<String> getDockerRepository() {
        return this.dockerRepository == null ? Input.empty() : this.dockerRepository;
    }

    @InputImport(name="entryPoint")
    private final @Nullable Input<String> entryPoint;

    public Input<String> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    @InputImport(name="eventTrigger")
    private final @Nullable Input<EventTriggerArgs> eventTrigger;

    public Input<EventTriggerArgs> getEventTrigger() {
        return this.eventTrigger == null ? Input.empty() : this.eventTrigger;
    }

    @InputImport(name="httpsTrigger")
    private final @Nullable Input<HttpsTriggerArgs> httpsTrigger;

    public Input<HttpsTriggerArgs> getHttpsTrigger() {
        return this.httpsTrigger == null ? Input.empty() : this.httpsTrigger;
    }

    @InputImport(name="ingressSettings")
    private final @Nullable Input<FunctionIngressSettings> ingressSettings;

    public Input<FunctionIngressSettings> getIngressSettings() {
        return this.ingressSettings == null ? Input.empty() : this.ingressSettings;
    }

    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="maxInstances")
    private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    @InputImport(name="minInstances")
    private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="runtime")
    private final @Nullable Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    @InputImport(name="secretEnvironmentVariables")
    private final @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables;

    public Input<List<SecretEnvVarArgs>> getSecretEnvironmentVariables() {
        return this.secretEnvironmentVariables == null ? Input.empty() : this.secretEnvironmentVariables;
    }

    @InputImport(name="secretVolumes")
    private final @Nullable Input<List<SecretVolumeArgs>> secretVolumes;

    public Input<List<SecretVolumeArgs>> getSecretVolumes() {
        return this.secretVolumes == null ? Input.empty() : this.secretVolumes;
    }

    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    @InputImport(name="sourceArchiveUrl")
    private final @Nullable Input<String> sourceArchiveUrl;

    public Input<String> getSourceArchiveUrl() {
        return this.sourceArchiveUrl == null ? Input.empty() : this.sourceArchiveUrl;
    }

    @InputImport(name="sourceRepository")
    private final @Nullable Input<SourceRepositoryArgs> sourceRepository;

    public Input<SourceRepositoryArgs> getSourceRepository() {
        return this.sourceRepository == null ? Input.empty() : this.sourceRepository;
    }

    @InputImport(name="sourceToken")
    private final @Nullable Input<String> sourceToken;

    public Input<String> getSourceToken() {
        return this.sourceToken == null ? Input.empty() : this.sourceToken;
    }

    @InputImport(name="sourceUploadUrl")
    private final @Nullable Input<String> sourceUploadUrl;

    public Input<String> getSourceUploadUrl() {
        return this.sourceUploadUrl == null ? Input.empty() : this.sourceUploadUrl;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    @InputImport(name="vpcConnector")
    private final @Nullable Input<String> vpcConnector;

    public Input<String> getVpcConnector() {
        return this.vpcConnector == null ? Input.empty() : this.vpcConnector;
    }

    @InputImport(name="vpcConnectorEgressSettings")
    private final @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

    public Input<FunctionVpcConnectorEgressSettings> getVpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings == null ? Input.empty() : this.vpcConnectorEgressSettings;
    }

    public FunctionArgs(
        @Nullable Input<Integer> availableMemoryMb,
        @Nullable Input<Map<String,String>> buildEnvironmentVariables,
        @Nullable Input<String> buildWorkerPool,
        @Nullable Input<String> description,
        @Nullable Input<String> dockerRepository,
        @Nullable Input<String> entryPoint,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<EventTriggerArgs> eventTrigger,
        @Nullable Input<HttpsTriggerArgs> httpsTrigger,
        @Nullable Input<FunctionIngressSettings> ingressSettings,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> runtime,
        @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables,
        @Nullable Input<List<SecretVolumeArgs>> secretVolumes,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> sourceArchiveUrl,
        @Nullable Input<SourceRepositoryArgs> sourceRepository,
        @Nullable Input<String> sourceToken,
        @Nullable Input<String> sourceUploadUrl,
        @Nullable Input<String> timeout,
        @Nullable Input<String> vpcConnector,
        @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
        this.availableMemoryMb = availableMemoryMb;
        this.buildEnvironmentVariables = buildEnvironmentVariables;
        this.buildWorkerPool = buildWorkerPool;
        this.description = description;
        this.dockerRepository = dockerRepository;
        this.entryPoint = entryPoint;
        this.environmentVariables = environmentVariables;
        this.eventTrigger = eventTrigger;
        this.httpsTrigger = httpsTrigger;
        this.ingressSettings = ingressSettings;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.location = location;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.name = name;
        this.network = network;
        this.project = project;
        this.runtime = runtime;
        this.secretEnvironmentVariables = secretEnvironmentVariables;
        this.secretVolumes = secretVolumes;
        this.serviceAccountEmail = serviceAccountEmail;
        this.sourceArchiveUrl = sourceArchiveUrl;
        this.sourceRepository = sourceRepository;
        this.sourceToken = sourceToken;
        this.sourceUploadUrl = sourceUploadUrl;
        this.timeout = timeout;
        this.vpcConnector = vpcConnector;
        this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    }

    private FunctionArgs() {
        this.availableMemoryMb = Input.empty();
        this.buildEnvironmentVariables = Input.empty();
        this.buildWorkerPool = Input.empty();
        this.description = Input.empty();
        this.dockerRepository = Input.empty();
        this.entryPoint = Input.empty();
        this.environmentVariables = Input.empty();
        this.eventTrigger = Input.empty();
        this.httpsTrigger = Input.empty();
        this.ingressSettings = Input.empty();
        this.kmsKeyName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.runtime = Input.empty();
        this.secretEnvironmentVariables = Input.empty();
        this.secretVolumes = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.sourceArchiveUrl = Input.empty();
        this.sourceRepository = Input.empty();
        this.sourceToken = Input.empty();
        this.sourceUploadUrl = Input.empty();
        this.timeout = Input.empty();
        this.vpcConnector = Input.empty();
        this.vpcConnectorEgressSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availableMemoryMb;
        private @Nullable Input<Map<String,String>> buildEnvironmentVariables;
        private @Nullable Input<String> buildWorkerPool;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dockerRepository;
        private @Nullable Input<String> entryPoint;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<EventTriggerArgs> eventTrigger;
        private @Nullable Input<HttpsTriggerArgs> httpsTrigger;
        private @Nullable Input<FunctionIngressSettings> ingressSettings;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> runtime;
        private @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables;
        private @Nullable Input<List<SecretVolumeArgs>> secretVolumes;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> sourceArchiveUrl;
        private @Nullable Input<SourceRepositoryArgs> sourceRepository;
        private @Nullable Input<String> sourceToken;
        private @Nullable Input<String> sourceUploadUrl;
        private @Nullable Input<String> timeout;
        private @Nullable Input<String> vpcConnector;
        private @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryMb = defaults.availableMemoryMb;
    	      this.buildEnvironmentVariables = defaults.buildEnvironmentVariables;
    	      this.buildWorkerPool = defaults.buildWorkerPool;
    	      this.description = defaults.description;
    	      this.dockerRepository = defaults.dockerRepository;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventTrigger = defaults.eventTrigger;
    	      this.httpsTrigger = defaults.httpsTrigger;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.runtime = defaults.runtime;
    	      this.secretEnvironmentVariables = defaults.secretEnvironmentVariables;
    	      this.secretVolumes = defaults.secretVolumes;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.sourceArchiveUrl = defaults.sourceArchiveUrl;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.sourceToken = defaults.sourceToken;
    	      this.sourceUploadUrl = defaults.sourceUploadUrl;
    	      this.timeout = defaults.timeout;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpcConnectorEgressSettings = defaults.vpcConnectorEgressSettings;
        }

        public Builder setAvailableMemoryMb(@Nullable Input<Integer> availableMemoryMb) {
            this.availableMemoryMb = availableMemoryMb;
            return this;
        }

        public Builder setAvailableMemoryMb(@Nullable Integer availableMemoryMb) {
            this.availableMemoryMb = Input.ofNullable(availableMemoryMb);
            return this;
        }

        public Builder setBuildEnvironmentVariables(@Nullable Input<Map<String,String>> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }

        public Builder setBuildEnvironmentVariables(@Nullable Map<String,String> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = Input.ofNullable(buildEnvironmentVariables);
            return this;
        }

        public Builder setBuildWorkerPool(@Nullable Input<String> buildWorkerPool) {
            this.buildWorkerPool = buildWorkerPool;
            return this;
        }

        public Builder setBuildWorkerPool(@Nullable String buildWorkerPool) {
            this.buildWorkerPool = Input.ofNullable(buildWorkerPool);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDockerRepository(@Nullable Input<String> dockerRepository) {
            this.dockerRepository = dockerRepository;
            return this;
        }

        public Builder setDockerRepository(@Nullable String dockerRepository) {
            this.dockerRepository = Input.ofNullable(dockerRepository);
            return this;
        }

        public Builder setEntryPoint(@Nullable Input<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setEntryPoint(@Nullable String entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setEventTrigger(@Nullable Input<EventTriggerArgs> eventTrigger) {
            this.eventTrigger = eventTrigger;
            return this;
        }

        public Builder setEventTrigger(@Nullable EventTriggerArgs eventTrigger) {
            this.eventTrigger = Input.ofNullable(eventTrigger);
            return this;
        }

        public Builder setHttpsTrigger(@Nullable Input<HttpsTriggerArgs> httpsTrigger) {
            this.httpsTrigger = httpsTrigger;
            return this;
        }

        public Builder setHttpsTrigger(@Nullable HttpsTriggerArgs httpsTrigger) {
            this.httpsTrigger = Input.ofNullable(httpsTrigger);
            return this;
        }

        public Builder setIngressSettings(@Nullable Input<FunctionIngressSettings> ingressSettings) {
            this.ingressSettings = ingressSettings;
            return this;
        }

        public Builder setIngressSettings(@Nullable FunctionIngressSettings ingressSettings) {
            this.ingressSettings = Input.ofNullable(ingressSettings);
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder setMinInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRuntime(@Nullable Input<String> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setRuntime(@Nullable String runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder setSecretEnvironmentVariables(@Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }

        public Builder setSecretEnvironmentVariables(@Nullable List<SecretEnvVarArgs> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = Input.ofNullable(secretEnvironmentVariables);
            return this;
        }

        public Builder setSecretVolumes(@Nullable Input<List<SecretVolumeArgs>> secretVolumes) {
            this.secretVolumes = secretVolumes;
            return this;
        }

        public Builder setSecretVolumes(@Nullable List<SecretVolumeArgs> secretVolumes) {
            this.secretVolumes = Input.ofNullable(secretVolumes);
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

        public Builder setSourceArchiveUrl(@Nullable Input<String> sourceArchiveUrl) {
            this.sourceArchiveUrl = sourceArchiveUrl;
            return this;
        }

        public Builder setSourceArchiveUrl(@Nullable String sourceArchiveUrl) {
            this.sourceArchiveUrl = Input.ofNullable(sourceArchiveUrl);
            return this;
        }

        public Builder setSourceRepository(@Nullable Input<SourceRepositoryArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder setSourceRepository(@Nullable SourceRepositoryArgs sourceRepository) {
            this.sourceRepository = Input.ofNullable(sourceRepository);
            return this;
        }

        public Builder setSourceToken(@Nullable Input<String> sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        public Builder setSourceToken(@Nullable String sourceToken) {
            this.sourceToken = Input.ofNullable(sourceToken);
            return this;
        }

        public Builder setSourceUploadUrl(@Nullable Input<String> sourceUploadUrl) {
            this.sourceUploadUrl = sourceUploadUrl;
            return this;
        }

        public Builder setSourceUploadUrl(@Nullable String sourceUploadUrl) {
            this.sourceUploadUrl = Input.ofNullable(sourceUploadUrl);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setVpcConnector(@Nullable Input<String> vpcConnector) {
            this.vpcConnector = vpcConnector;
            return this;
        }

        public Builder setVpcConnector(@Nullable String vpcConnector) {
            this.vpcConnector = Input.ofNullable(vpcConnector);
            return this;
        }

        public Builder setVpcConnectorEgressSettings(@Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        public Builder setVpcConnectorEgressSettings(@Nullable FunctionVpcConnectorEgressSettings vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = Input.ofNullable(vpcConnectorEgressSettings);
            return this;
        }

        public FunctionArgs build() {
            return new FunctionArgs(availableMemoryMb, buildEnvironmentVariables, buildWorkerPool, description, dockerRepository, entryPoint, environmentVariables, eventTrigger, httpsTrigger, ingressSettings, kmsKeyName, labels, location, maxInstances, minInstances, name, network, project, runtime, secretEnvironmentVariables, secretVolumes, serviceAccountEmail, sourceArchiveUrl, sourceRepository, sourceToken, sourceUploadUrl, timeout, vpcConnector, vpcConnectorEgressSettings);
        }
    }
}