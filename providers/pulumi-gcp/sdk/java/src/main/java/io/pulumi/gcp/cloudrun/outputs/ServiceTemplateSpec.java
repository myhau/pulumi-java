// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainer;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecVolume;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTemplateSpec {
    private final @Nullable Integer containerConcurrency;
    private final @Nullable List<ServiceTemplateSpecContainer> containers;
    private final @Nullable String serviceAccountName;
    private final @Nullable String servingState;
    private final @Nullable Integer timeoutSeconds;
    private final @Nullable List<ServiceTemplateSpecVolume> volumes;

    @OutputCustomType.Constructor({"containerConcurrency","containers","serviceAccountName","servingState","timeoutSeconds","volumes"})
    private ServiceTemplateSpec(
        @Nullable Integer containerConcurrency,
        @Nullable List<ServiceTemplateSpecContainer> containers,
        @Nullable String serviceAccountName,
        @Nullable String servingState,
        @Nullable Integer timeoutSeconds,
        @Nullable List<ServiceTemplateSpecVolume> volumes) {
        this.containerConcurrency = containerConcurrency;
        this.containers = containers;
        this.serviceAccountName = serviceAccountName;
        this.servingState = servingState;
        this.timeoutSeconds = timeoutSeconds;
        this.volumes = volumes;
    }

    public Optional<Integer> getContainerConcurrency() {
        return Optional.ofNullable(this.containerConcurrency);
    }
    public List<ServiceTemplateSpecContainer> getContainers() {
        return this.containers == null ? List.of() : this.containers;
    }
    public Optional<String> getServiceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }
    public Optional<String> getServingState() {
        return Optional.ofNullable(this.servingState);
    }
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    public List<ServiceTemplateSpecVolume> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer containerConcurrency;
        private @Nullable List<ServiceTemplateSpecContainer> containers;
        private @Nullable String serviceAccountName;
        private @Nullable String servingState;
        private @Nullable Integer timeoutSeconds;
        private @Nullable List<ServiceTemplateSpecVolume> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.servingState = defaults.servingState;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.volumes = defaults.volumes;
        }

        public Builder setContainerConcurrency(@Nullable Integer containerConcurrency) {
            this.containerConcurrency = containerConcurrency;
            return this;
        }

        public Builder setContainers(@Nullable List<ServiceTemplateSpecContainer> containers) {
            this.containers = containers;
            return this;
        }

        public Builder setServiceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder setServingState(@Nullable String servingState) {
            this.servingState = servingState;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder setVolumes(@Nullable List<ServiceTemplateSpecVolume> volumes) {
            this.volumes = volumes;
            return this;
        }

        public ServiceTemplateSpec build() {
            return new ServiceTemplateSpec(containerConcurrency, containers, serviceAccountName, servingState, timeoutSeconds, volumes);
        }
    }
}