// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetLaunchSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetLaunchSpecificationsArgs Empty = new ClusterMasterInstanceFleetLaunchSpecificationsArgs();

    /**
     * Configuration block for on demand instances launch specifications.
     * 
     */
    @InputImport(name="onDemandSpecifications")
      private final @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;

    public Input<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? Input.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications.
     * 
     */
    @InputImport(name="spotSpecifications")
      private final @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

    public Input<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> getSpotSpecifications() {
        return this.spotSpecifications == null ? Input.empty() : this.spotSpecifications;
    }

    public ClusterMasterInstanceFleetLaunchSpecificationsArgs(
        @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications,
        @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private ClusterMasterInstanceFleetLaunchSpecificationsArgs() {
        this.onDemandSpecifications = Input.empty();
        this.spotSpecifications = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetLaunchSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;
        private @Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetLaunchSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder setOnDemandSpecifications(@Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder setOnDemandSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Input.ofNullable(onDemandSpecifications);
            return this;
        }

        public Builder setSpotSpecifications(@Nullable Input<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }

        public Builder setSpotSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs> spotSpecifications) {
            this.spotSpecifications = Input.ofNullable(spotSpecifications);
            return this;
        }
        public ClusterMasterInstanceFleetLaunchSpecificationsArgs build() {
            return new ClusterMasterInstanceFleetLaunchSpecificationsArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
