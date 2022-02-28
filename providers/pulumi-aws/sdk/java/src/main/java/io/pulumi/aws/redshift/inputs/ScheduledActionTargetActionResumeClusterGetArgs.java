// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ScheduledActionTargetActionResumeClusterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionTargetActionResumeClusterGetArgs Empty = new ScheduledActionTargetActionResumeClusterGetArgs();

    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
      private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public ScheduledActionTargetActionResumeClusterGetArgs(Input<String> clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
    }

    private ScheduledActionTargetActionResumeClusterGetArgs() {
        this.clusterIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionResumeClusterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionResumeClusterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setClusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }
        public ScheduledActionTargetActionResumeClusterGetArgs build() {
            return new ScheduledActionTargetActionResumeClusterGetArgs(clusterIdentifier);
        }
    }
}
