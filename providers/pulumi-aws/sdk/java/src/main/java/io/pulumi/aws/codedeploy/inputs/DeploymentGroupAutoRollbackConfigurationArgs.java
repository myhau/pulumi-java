// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupAutoRollbackConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupAutoRollbackConfigurationArgs Empty = new DeploymentGroupAutoRollbackConfigurationArgs();

    /**
     * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
     * 
     */
    @InputImport(name="events")
      private final @Nullable Input<List<String>> events;

    public Input<List<String>> getEvents() {
        return this.events == null ? Input.empty() : this.events;
    }

    public DeploymentGroupAutoRollbackConfigurationArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<String>> events) {
        this.enabled = enabled;
        this.events = events;
    }

    private DeploymentGroupAutoRollbackConfigurationArgs() {
        this.enabled = Input.empty();
        this.events = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupAutoRollbackConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<String>> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupAutoRollbackConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.events = defaults.events;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEvents(@Nullable Input<List<String>> events) {
            this.events = events;
            return this;
        }

        public Builder setEvents(@Nullable List<String> events) {
            this.events = Input.ofNullable(events);
            return this;
        }
        public DeploymentGroupAutoRollbackConfigurationArgs build() {
            return new DeploymentGroupAutoRollbackConfigurationArgs(enabled, events);
        }
    }
}
