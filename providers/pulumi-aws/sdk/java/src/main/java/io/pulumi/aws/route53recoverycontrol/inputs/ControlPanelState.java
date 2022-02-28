// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelState extends io.pulumi.resources.ResourceArgs {

    public static final ControlPanelState Empty = new ControlPanelState();

    /**
     * ARN of the control panel.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * ARN of the cluster in which this control panel will reside.
     * 
     */
    @InputImport(name="clusterArn")
      private final @Nullable Input<String> clusterArn;

    public Input<String> getClusterArn() {
        return this.clusterArn == null ? Input.empty() : this.clusterArn;
    }

    /**
     * Whether a control panel is default.
     * 
     */
    @InputImport(name="defaultControlPanel")
      private final @Nullable Input<Boolean> defaultControlPanel;

    public Input<Boolean> getDefaultControlPanel() {
        return this.defaultControlPanel == null ? Input.empty() : this.defaultControlPanel;
    }

    /**
     * Name describing the control panel.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Number routing controls in a control panel.
     * 
     */
    @InputImport(name="routingControlCount")
      private final @Nullable Input<Integer> routingControlCount;

    public Input<Integer> getRoutingControlCount() {
        return this.routingControlCount == null ? Input.empty() : this.routingControlCount;
    }

    /**
     * Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ControlPanelState(
        @Nullable Input<String> arn,
        @Nullable Input<String> clusterArn,
        @Nullable Input<Boolean> defaultControlPanel,
        @Nullable Input<String> name,
        @Nullable Input<Integer> routingControlCount,
        @Nullable Input<String> status) {
        this.arn = arn;
        this.clusterArn = clusterArn;
        this.defaultControlPanel = defaultControlPanel;
        this.name = name;
        this.routingControlCount = routingControlCount;
        this.status = status;
    }

    private ControlPanelState() {
        this.arn = Input.empty();
        this.clusterArn = Input.empty();
        this.defaultControlPanel = Input.empty();
        this.name = Input.empty();
        this.routingControlCount = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> clusterArn;
        private @Nullable Input<Boolean> defaultControlPanel;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> routingControlCount;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterArn = defaults.clusterArn;
    	      this.defaultControlPanel = defaults.defaultControlPanel;
    	      this.name = defaults.name;
    	      this.routingControlCount = defaults.routingControlCount;
    	      this.status = defaults.status;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setClusterArn(@Nullable Input<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }

        public Builder setClusterArn(@Nullable String clusterArn) {
            this.clusterArn = Input.ofNullable(clusterArn);
            return this;
        }

        public Builder setDefaultControlPanel(@Nullable Input<Boolean> defaultControlPanel) {
            this.defaultControlPanel = defaultControlPanel;
            return this;
        }

        public Builder setDefaultControlPanel(@Nullable Boolean defaultControlPanel) {
            this.defaultControlPanel = Input.ofNullable(defaultControlPanel);
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

        public Builder setRoutingControlCount(@Nullable Input<Integer> routingControlCount) {
            this.routingControlCount = routingControlCount;
            return this;
        }

        public Builder setRoutingControlCount(@Nullable Integer routingControlCount) {
            this.routingControlCount = Input.ofNullable(routingControlCount);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ControlPanelState build() {
            return new ControlPanelState(arn, clusterArn, defaultControlPanel, name, routingControlCount, status);
        }
    }
}
