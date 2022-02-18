// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitoredProjectState extends io.pulumi.resources.ResourceArgs {

    public static final MonitoredProjectState Empty = new MonitoredProjectState();

    /**
     * Output only. The time when this `MonitoredProject` was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Required. The resource name of the existing Metrics Scope that will monitor this project. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}
     * 
     */
    @InputImport(name="metricsScope")
    private final @Nullable Input<String> metricsScope;

    public Input<String> getMetricsScope() {
        return this.metricsScope == null ? Input.empty() : this.metricsScope;
    }

    /**
     * Immutable. The resource name of the `MonitoredProject`. On input, the resource name includes the scoping project ID and monitored project ID. On output, it contains the equivalent project numbers. Example: `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public MonitoredProjectState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> metricsScope,
        @Nullable Input<String> name) {
        this.createTime = createTime;
        this.metricsScope = metricsScope;
        this.name = name;
    }

    private MonitoredProjectState() {
        this.createTime = Input.empty();
        this.metricsScope = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> metricsScope;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.metricsScope = defaults.metricsScope;
    	      this.name = defaults.name;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setMetricsScope(@Nullable Input<String> metricsScope) {
            this.metricsScope = metricsScope;
            return this;
        }

        public Builder setMetricsScope(@Nullable String metricsScope) {
            this.metricsScope = Input.ofNullable(metricsScope);
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

        public MonitoredProjectState build() {
            return new MonitoredProjectState(createTime, metricsScope, name);
        }
    }
}
