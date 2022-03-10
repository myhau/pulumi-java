// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FleetStackAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetStackAssociationArgs Empty = new FleetStackAssociationArgs();

    /**
     * Name of the fleet.
     * 
     */
    @InputImport(name="fleetName", required=true)
      private final Input<String> fleetName;

    public Input<String> getFleetName() {
        return this.fleetName;
    }

    /**
     * Name of the stack.
     * 
     */
    @InputImport(name="stackName", required=true)
      private final Input<String> stackName;

    public Input<String> getStackName() {
        return this.stackName;
    }

    public FleetStackAssociationArgs(
        Input<String> fleetName,
        Input<String> stackName) {
        this.fleetName = Objects.requireNonNull(fleetName, "expected parameter 'fleetName' to be non-null");
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
    }

    private FleetStackAssociationArgs() {
        this.fleetName = Input.empty();
        this.stackName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetStackAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fleetName;
        private Input<String> stackName;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetStackAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetName = defaults.fleetName;
    	      this.stackName = defaults.stackName;
        }

        public Builder setFleetName(Input<String> fleetName) {
            this.fleetName = Objects.requireNonNull(fleetName);
            return this;
        }

        public Builder setFleetName(String fleetName) {
            this.fleetName = Input.of(Objects.requireNonNull(fleetName));
            return this;
        }

        public Builder setStackName(Input<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }

        public Builder setStackName(String stackName) {
            this.stackName = Input.of(Objects.requireNonNull(stackName));
            return this;
        }
        public FleetStackAssociationArgs build() {
            return new FleetStackAssociationArgs(fleetName, stackName);
        }
    }
}