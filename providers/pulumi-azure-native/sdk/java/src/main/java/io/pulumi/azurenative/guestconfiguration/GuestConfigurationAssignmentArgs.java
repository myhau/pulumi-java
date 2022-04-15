// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration;

import io.pulumi.azurenative.guestconfiguration.inputs.GuestConfigurationAssignmentPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestConfigurationAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationAssignmentArgs Empty = new GuestConfigurationAssignmentArgs();

    /**
     * Name of the guest configuration assignment.
     * 
     */
    @Import(name="guestConfigurationAssignmentName")
      private final @Nullable Output<String> guestConfigurationAssignmentName;

    public Output<String> guestConfigurationAssignmentName() {
        return this.guestConfigurationAssignmentName == null ? Codegen.empty() : this.guestConfigurationAssignmentName;
    }

    /**
     * Region where the VM is located.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the guest configuration assignment.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Properties of the Guest configuration assignment.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<GuestConfigurationAssignmentPropertiesArgs> properties;

    public Output<GuestConfigurationAssignmentPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @Import(name="vmName", required=true)
      private final Output<String> vmName;

    public Output<String> vmName() {
        return this.vmName;
    }

    public GuestConfigurationAssignmentArgs(
        @Nullable Output<String> guestConfigurationAssignmentName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<GuestConfigurationAssignmentPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> vmName) {
        this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GuestConfigurationAssignmentArgs() {
        this.guestConfigurationAssignmentName = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.vmName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> guestConfigurationAssignmentName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<GuestConfigurationAssignmentPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestConfigurationAssignmentName = defaults.guestConfigurationAssignmentName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmName = defaults.vmName;
        }

        public Builder guestConfigurationAssignmentName(@Nullable Output<String> guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
            return this;
        }
        public Builder guestConfigurationAssignmentName(@Nullable String guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = Codegen.ofNullable(guestConfigurationAssignmentName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder properties(@Nullable Output<GuestConfigurationAssignmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable GuestConfigurationAssignmentPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
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
        public Builder vmName(Output<String> vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }
        public Builder vmName(String vmName) {
            this.vmName = Output.of(Objects.requireNonNull(vmName));
            return this;
        }        public GuestConfigurationAssignmentArgs build() {
            return new GuestConfigurationAssignmentArgs(guestConfigurationAssignmentName, location, name, properties, resourceGroupName, vmName);
        }
    }
}
