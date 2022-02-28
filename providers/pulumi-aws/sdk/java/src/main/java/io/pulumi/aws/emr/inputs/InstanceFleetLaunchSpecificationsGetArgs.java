// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsGetArgs Empty = new InstanceFleetLaunchSpecificationsGetArgs();

    /**
     * Configuration block for on demand instances launch specifications
     * 
     */
    @InputImport(name="onDemandSpecifications")
      private final @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications;

    public Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? Input.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications
     * 
     */
    @InputImport(name="spotSpecifications")
      private final @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications;

    public Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> getSpotSpecifications() {
        return this.spotSpecifications == null ? Input.empty() : this.spotSpecifications;
    }

    public InstanceFleetLaunchSpecificationsGetArgs(
        @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications,
        @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private InstanceFleetLaunchSpecificationsGetArgs() {
        this.onDemandSpecifications = Input.empty();
        this.spotSpecifications = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications;
        private @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecificationsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder setOnDemandSpecifications(@Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder setOnDemandSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Input.ofNullable(onDemandSpecifications);
            return this;
        }

        public Builder setSpotSpecifications(@Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }

        public Builder setSpotSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs> spotSpecifications) {
            this.spotSpecifications = Input.ofNullable(spotSpecifications);
            return this;
        }
        public InstanceFleetLaunchSpecificationsGetArgs build() {
            return new InstanceFleetLaunchSpecificationsGetArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
