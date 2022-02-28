// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstancePublicPortsState extends io.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsState Empty = new InstancePublicPortsState();

    /**
     * Name of the Lightsail Instance.
     * 
     */
    @InputImport(name="instanceName")
      private final @Nullable Input<String> instanceName;

    public Input<String> getInstanceName() {
        return this.instanceName == null ? Input.empty() : this.instanceName;
    }

    /**
     * Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    @InputImport(name="portInfos")
      private final @Nullable Input<List<InstancePublicPortsPortInfoGetArgs>> portInfos;

    public Input<List<InstancePublicPortsPortInfoGetArgs>> getPortInfos() {
        return this.portInfos == null ? Input.empty() : this.portInfos;
    }

    public InstancePublicPortsState(
        @Nullable Input<String> instanceName,
        @Nullable Input<List<InstancePublicPortsPortInfoGetArgs>> portInfos) {
        this.instanceName = instanceName;
        this.portInfos = portInfos;
    }

    private InstancePublicPortsState() {
        this.instanceName = Input.empty();
        this.portInfos = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceName;
        private @Nullable Input<List<InstancePublicPortsPortInfoGetArgs>> portInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.portInfos = defaults.portInfos;
        }

        public Builder setInstanceName(@Nullable Input<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder setInstanceName(@Nullable String instanceName) {
            this.instanceName = Input.ofNullable(instanceName);
            return this;
        }

        public Builder setPortInfos(@Nullable Input<List<InstancePublicPortsPortInfoGetArgs>> portInfos) {
            this.portInfos = portInfos;
            return this;
        }

        public Builder setPortInfos(@Nullable List<InstancePublicPortsPortInfoGetArgs> portInfos) {
            this.portInfos = Input.ofNullable(portInfos);
            return this;
        }
        public InstancePublicPortsState build() {
            return new InstancePublicPortsState(instanceName, portInfos);
        }
    }
}
