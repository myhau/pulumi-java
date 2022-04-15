// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.serialconsole;

import io.pulumi.azurenative.serialconsole.enums.SerialPortState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SerialPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final SerialPortArgs Empty = new SerialPortArgs();

    /**
     * The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
     * 
     */
    @Import(name="parentResource", required=true)
      private final Output<String> parentResource;

    public Output<String> parentResource() {
        return this.parentResource;
    }

    /**
     * The resource type of the parent resource.  For example: 'virtualMachines' or 'virtualMachineScaleSets'
     * 
     */
    @Import(name="parentResourceType", required=true)
      private final Output<String> parentResourceType;

    public Output<String> parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @Import(name="resourceProviderNamespace", required=true)
      private final Output<String> resourceProviderNamespace;

    public Output<String> resourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The name of the serial port to create.
     * 
     */
    @Import(name="serialPort")
      private final @Nullable Output<String> serialPort;

    public Output<String> serialPort() {
        return this.serialPort == null ? Codegen.empty() : this.serialPort;
    }

    /**
     * Specifies whether the port is enabled for a serial console connection.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<SerialPortState> state;

    public Output<SerialPortState> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public SerialPortArgs(
        Output<String> parentResource,
        Output<String> parentResourceType,
        Output<String> resourceGroupName,
        Output<String> resourceProviderNamespace,
        @Nullable Output<String> serialPort,
        @Nullable Output<SerialPortState> state) {
        this.parentResource = Objects.requireNonNull(parentResource, "expected parameter 'parentResource' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
        this.serialPort = serialPort;
        this.state = state;
    }

    private SerialPortArgs() {
        this.parentResource = Codegen.empty();
        this.parentResourceType = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceProviderNamespace = Codegen.empty();
        this.serialPort = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parentResource;
        private Output<String> parentResourceType;
        private Output<String> resourceGroupName;
        private Output<String> resourceProviderNamespace;
        private @Nullable Output<String> serialPort;
        private @Nullable Output<SerialPortState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentResource = defaults.parentResource;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
    	      this.serialPort = defaults.serialPort;
    	      this.state = defaults.state;
        }

        public Builder parentResource(Output<String> parentResource) {
            this.parentResource = Objects.requireNonNull(parentResource);
            return this;
        }
        public Builder parentResource(String parentResource) {
            this.parentResource = Output.of(Objects.requireNonNull(parentResource));
            return this;
        }
        public Builder parentResourceType(Output<String> parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }
        public Builder parentResourceType(String parentResourceType) {
            this.parentResourceType = Output.of(Objects.requireNonNull(parentResourceType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceProviderNamespace(Output<String> resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }
        public Builder resourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Output.of(Objects.requireNonNull(resourceProviderNamespace));
            return this;
        }
        public Builder serialPort(@Nullable Output<String> serialPort) {
            this.serialPort = serialPort;
            return this;
        }
        public Builder serialPort(@Nullable String serialPort) {
            this.serialPort = Codegen.ofNullable(serialPort);
            return this;
        }
        public Builder state(@Nullable Output<SerialPortState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable SerialPortState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public SerialPortArgs build() {
            return new SerialPortArgs(parentResource, parentResourceType, resourceGroupName, resourceProviderNamespace, serialPort, state);
        }
    }
}
