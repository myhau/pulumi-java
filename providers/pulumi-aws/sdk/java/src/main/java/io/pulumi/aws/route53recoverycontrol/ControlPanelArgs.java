// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlPanelArgs Empty = new ControlPanelArgs();

    /**
     * ARN of the cluster in which this control panel will reside.
     * 
     */
    @InputImport(name="clusterArn", required=true)
      private final Input<String> clusterArn;

    public Input<String> getClusterArn() {
        return this.clusterArn;
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

    public ControlPanelArgs(
        Input<String> clusterArn,
        @Nullable Input<String> name) {
        this.clusterArn = Objects.requireNonNull(clusterArn, "expected parameter 'clusterArn' to be non-null");
        this.name = name;
    }

    private ControlPanelArgs() {
        this.clusterArn = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterArn;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.name = defaults.name;
        }

        public Builder setClusterArn(Input<String> clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }

        public Builder setClusterArn(String clusterArn) {
            this.clusterArn = Input.of(Objects.requireNonNull(clusterArn));
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
        public ControlPanelArgs build() {
            return new ControlPanelArgs(clusterArn, name);
        }
    }
}
