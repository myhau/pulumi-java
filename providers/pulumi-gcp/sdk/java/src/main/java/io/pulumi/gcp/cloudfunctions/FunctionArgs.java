// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
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
    private final @Nullable Input<Map<String,Object>> buildEnvironmentVariables;

    public Input<Map<String,Object>> getBuildEnvironmentVariables() {
        return this.buildEnvironmentVariables == null ? Input.empty() : this.buildEnvironmentVariables;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="entryPoint")
    private final @Nullable Input<String> entryPoint;

    public Input<String> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,Object>> environmentVariables;

    public Input<Map<String,Object>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    @InputImport(name="eventTrigger")
    private final @Nullable Input<FunctionEventTriggerArgs> eventTrigger;

    public Input<FunctionEventTriggerArgs> getEventTrigger() {
        return this.eventTrigger == null ? Input.empty() : this.eventTrigger;
    }

    @InputImport(name="httpsTriggerUrl")
    private final @Nullable Input<String> httpsTriggerUrl;

    public Input<String> getHttpsTriggerUrl() {
        return this.httpsTriggerUrl == null ? Input.empty() : this.httpsTriggerUrl;
    }

    @InputImport(name="ingressSettings")
    private final @Nullable Input<String> ingressSettings;

    public Input<String> getIngressSettings() {
        return this.ingressSettings == null ? Input.empty() : this.ingressSettings;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,Object>> labels;

    public Input<Map<String,Object>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
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

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="runtime", required=true)
    private final Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime;
    }

    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    @InputImport(name="sourceArchiveBucket")
    private final @Nullable Input<String> sourceArchiveBucket;

    public Input<String> getSourceArchiveBucket() {
        return this.sourceArchiveBucket == null ? Input.empty() : this.sourceArchiveBucket;
    }

    @InputImport(name="sourceArchiveObject")
    private final @Nullable Input<String> sourceArchiveObject;

    public Input<String> getSourceArchiveObject() {
        return this.sourceArchiveObject == null ? Input.empty() : this.sourceArchiveObject;
    }

    @InputImport(name="sourceRepository")
    private final @Nullable Input<FunctionSourceRepositoryArgs> sourceRepository;

    public Input<FunctionSourceRepositoryArgs> getSourceRepository() {
        return this.sourceRepository == null ? Input.empty() : this.sourceRepository;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    @InputImport(name="triggerHttp")
    private final @Nullable Input<Boolean> triggerHttp;

    public Input<Boolean> getTriggerHttp() {
        return this.triggerHttp == null ? Input.empty() : this.triggerHttp;
    }

    @InputImport(name="vpcConnector")
    private final @Nullable Input<String> vpcConnector;

    public Input<String> getVpcConnector() {
        return this.vpcConnector == null ? Input.empty() : this.vpcConnector;
    }

    @InputImport(name="vpcConnectorEgressSettings")
    private final @Nullable Input<String> vpcConnectorEgressSettings;

    public Input<String> getVpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings == null ? Input.empty() : this.vpcConnectorEgressSettings;
    }

    public FunctionArgs(
        @Nullable Input<Integer> availableMemoryMb,
        @Nullable Input<Map<String,Object>> buildEnvironmentVariables,
        @Nullable Input<String> description,
        @Nullable Input<String> entryPoint,
        @Nullable Input<Map<String,Object>> environmentVariables,
        @Nullable Input<FunctionEventTriggerArgs> eventTrigger,
        @Nullable Input<String> httpsTriggerUrl,
        @Nullable Input<String> ingressSettings,
        @Nullable Input<Map<String,Object>> labels,
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> runtime,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> sourceArchiveBucket,
        @Nullable Input<String> sourceArchiveObject,
        @Nullable Input<FunctionSourceRepositoryArgs> sourceRepository,
        @Nullable Input<Integer> timeout,
        @Nullable Input<Boolean> triggerHttp,
        @Nullable Input<String> vpcConnector,
        @Nullable Input<String> vpcConnectorEgressSettings) {
        this.availableMemoryMb = availableMemoryMb;
        this.buildEnvironmentVariables = buildEnvironmentVariables;
        this.description = description;
        this.entryPoint = entryPoint;
        this.environmentVariables = environmentVariables;
        this.eventTrigger = eventTrigger;
        this.httpsTriggerUrl = httpsTriggerUrl;
        this.ingressSettings = ingressSettings;
        this.labels = labels;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.name = name;
        this.project = project;
        this.region = region;
        this.runtime = Objects.requireNonNull(runtime, "expected parameter 'runtime' to be non-null");
        this.serviceAccountEmail = serviceAccountEmail;
        this.sourceArchiveBucket = sourceArchiveBucket;
        this.sourceArchiveObject = sourceArchiveObject;
        this.sourceRepository = sourceRepository;
        this.timeout = timeout;
        this.triggerHttp = triggerHttp;
        this.vpcConnector = vpcConnector;
        this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    }

    private FunctionArgs() {
        this.availableMemoryMb = Input.empty();
        this.buildEnvironmentVariables = Input.empty();
        this.description = Input.empty();
        this.entryPoint = Input.empty();
        this.environmentVariables = Input.empty();
        this.eventTrigger = Input.empty();
        this.httpsTriggerUrl = Input.empty();
        this.ingressSettings = Input.empty();
        this.labels = Input.empty();
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.runtime = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.sourceArchiveBucket = Input.empty();
        this.sourceArchiveObject = Input.empty();
        this.sourceRepository = Input.empty();
        this.timeout = Input.empty();
        this.triggerHttp = Input.empty();
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
        private @Nullable Input<Map<String,Object>> buildEnvironmentVariables;
        private @Nullable Input<String> description;
        private @Nullable Input<String> entryPoint;
        private @Nullable Input<Map<String,Object>> environmentVariables;
        private @Nullable Input<FunctionEventTriggerArgs> eventTrigger;
        private @Nullable Input<String> httpsTriggerUrl;
        private @Nullable Input<String> ingressSettings;
        private @Nullable Input<Map<String,Object>> labels;
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> runtime;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> sourceArchiveBucket;
        private @Nullable Input<String> sourceArchiveObject;
        private @Nullable Input<FunctionSourceRepositoryArgs> sourceRepository;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<Boolean> triggerHttp;
        private @Nullable Input<String> vpcConnector;
        private @Nullable Input<String> vpcConnectorEgressSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryMb = defaults.availableMemoryMb;
    	      this.buildEnvironmentVariables = defaults.buildEnvironmentVariables;
    	      this.description = defaults.description;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventTrigger = defaults.eventTrigger;
    	      this.httpsTriggerUrl = defaults.httpsTriggerUrl;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.labels = defaults.labels;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.runtime = defaults.runtime;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.sourceArchiveBucket = defaults.sourceArchiveBucket;
    	      this.sourceArchiveObject = defaults.sourceArchiveObject;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.timeout = defaults.timeout;
    	      this.triggerHttp = defaults.triggerHttp;
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

        public Builder setBuildEnvironmentVariables(@Nullable Input<Map<String,Object>> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }

        public Builder setBuildEnvironmentVariables(@Nullable Map<String,Object> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = Input.ofNullable(buildEnvironmentVariables);
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

        public Builder setEntryPoint(@Nullable Input<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setEntryPoint(@Nullable String entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,Object>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,Object> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setEventTrigger(@Nullable Input<FunctionEventTriggerArgs> eventTrigger) {
            this.eventTrigger = eventTrigger;
            return this;
        }

        public Builder setEventTrigger(@Nullable FunctionEventTriggerArgs eventTrigger) {
            this.eventTrigger = Input.ofNullable(eventTrigger);
            return this;
        }

        public Builder setHttpsTriggerUrl(@Nullable Input<String> httpsTriggerUrl) {
            this.httpsTriggerUrl = httpsTriggerUrl;
            return this;
        }

        public Builder setHttpsTriggerUrl(@Nullable String httpsTriggerUrl) {
            this.httpsTriggerUrl = Input.ofNullable(httpsTriggerUrl);
            return this;
        }

        public Builder setIngressSettings(@Nullable Input<String> ingressSettings) {
            this.ingressSettings = ingressSettings;
            return this;
        }

        public Builder setIngressSettings(@Nullable String ingressSettings) {
            this.ingressSettings = Input.ofNullable(ingressSettings);
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

        public Builder setRuntime(Input<String> runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Input.of(Objects.requireNonNull(runtime));
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

        public Builder setSourceArchiveBucket(@Nullable Input<String> sourceArchiveBucket) {
            this.sourceArchiveBucket = sourceArchiveBucket;
            return this;
        }

        public Builder setSourceArchiveBucket(@Nullable String sourceArchiveBucket) {
            this.sourceArchiveBucket = Input.ofNullable(sourceArchiveBucket);
            return this;
        }

        public Builder setSourceArchiveObject(@Nullable Input<String> sourceArchiveObject) {
            this.sourceArchiveObject = sourceArchiveObject;
            return this;
        }

        public Builder setSourceArchiveObject(@Nullable String sourceArchiveObject) {
            this.sourceArchiveObject = Input.ofNullable(sourceArchiveObject);
            return this;
        }

        public Builder setSourceRepository(@Nullable Input<FunctionSourceRepositoryArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder setSourceRepository(@Nullable FunctionSourceRepositoryArgs sourceRepository) {
            this.sourceRepository = Input.ofNullable(sourceRepository);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTriggerHttp(@Nullable Input<Boolean> triggerHttp) {
            this.triggerHttp = triggerHttp;
            return this;
        }

        public Builder setTriggerHttp(@Nullable Boolean triggerHttp) {
            this.triggerHttp = Input.ofNullable(triggerHttp);
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

        public Builder setVpcConnectorEgressSettings(@Nullable Input<String> vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        public Builder setVpcConnectorEgressSettings(@Nullable String vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = Input.ofNullable(vpcConnectorEgressSettings);
            return this;
        }

        public FunctionArgs build() {
            return new FunctionArgs(availableMemoryMb, buildEnvironmentVariables, description, entryPoint, environmentVariables, eventTrigger, httpsTriggerUrl, ingressSettings, labels, maxInstances, minInstances, name, project, region, runtime, serviceAccountEmail, sourceArchiveBucket, sourceArchiveObject, sourceRepository, timeout, triggerHttp, vpcConnector, vpcConnectorEgressSettings);
        }
    }
}