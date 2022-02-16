// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceStatusConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    @InputImport(name="conditions")
    private final @Nullable Input<List<ServiceStatusConditionArgs>> conditions;

    public Input<List<ServiceStatusConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="latestCreatedRevisionName")
    private final @Nullable Input<String> latestCreatedRevisionName;

    public Input<String> getLatestCreatedRevisionName() {
        return this.latestCreatedRevisionName == null ? Input.empty() : this.latestCreatedRevisionName;
    }

    @InputImport(name="latestReadyRevisionName")
    private final @Nullable Input<String> latestReadyRevisionName;

    public Input<String> getLatestReadyRevisionName() {
        return this.latestReadyRevisionName == null ? Input.empty() : this.latestReadyRevisionName;
    }

    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public ServiceStatusArgs(
        @Nullable Input<List<ServiceStatusConditionArgs>> conditions,
        @Nullable Input<String> latestCreatedRevisionName,
        @Nullable Input<String> latestReadyRevisionName,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<String> url) {
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.url = url;
    }

    private ServiceStatusArgs() {
        this.conditions = Input.empty();
        this.latestCreatedRevisionName = Input.empty();
        this.latestReadyRevisionName = Input.empty();
        this.observedGeneration = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceStatusConditionArgs>> conditions;
        private @Nullable Input<String> latestCreatedRevisionName;
        private @Nullable Input<String> latestReadyRevisionName;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder setConditions(@Nullable Input<List<ServiceStatusConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ServiceStatusConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setLatestCreatedRevisionName(@Nullable Input<String> latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }

        public Builder setLatestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Input.ofNullable(latestCreatedRevisionName);
            return this;
        }

        public Builder setLatestReadyRevisionName(@Nullable Input<String> latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }

        public Builder setLatestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = Input.ofNullable(latestReadyRevisionName);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public ServiceStatusArgs build() {
            return new ServiceStatusArgs(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}