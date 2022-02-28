// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetLaunchSpecificationsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetLaunchSpecificationsGetArgs Empty = new ClusterCoreInstanceFleetLaunchSpecificationsGetArgs();

    /**
     * Configuration block for on demand instances launch specifications.
     * 
     */
    @InputImport(name="onDemandSpecifications")
      private final @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications;

    public Input<List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? Input.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications.
     * 
     */
    @InputImport(name="spotSpecifications")
      private final @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications;

    public Input<List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> getSpotSpecifications() {
        return this.spotSpecifications == null ? Input.empty() : this.spotSpecifications;
    }

    public ClusterCoreInstanceFleetLaunchSpecificationsGetArgs(
        @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications,
        @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private ClusterCoreInstanceFleetLaunchSpecificationsGetArgs() {
        this.onDemandSpecifications = Input.empty();
        this.spotSpecifications = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetLaunchSpecificationsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications;
        private @Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetLaunchSpecificationsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder setOnDemandSpecifications(@Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder setOnDemandSpecifications(@Nullable List<ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Input.ofNullable(onDemandSpecifications);
            return this;
        }

        public Builder setSpotSpecifications(@Nullable Input<List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }

        public Builder setSpotSpecifications(@Nullable List<ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationGetArgs> spotSpecifications) {
            this.spotSpecifications = Input.ofNullable(spotSpecifications);
            return this;
        }
        public ClusterCoreInstanceFleetLaunchSpecificationsGetArgs build() {
            return new ClusterCoreInstanceFleetLaunchSpecificationsGetArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
