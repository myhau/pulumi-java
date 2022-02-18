// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigAutoscalingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigAutoscalingConfigArgs Empty = new ClusterClusterConfigAutoscalingConfigArgs();

    /**
     * The autoscaling policy used by the cluster.
     * 
     */
    @InputImport(name="policyUri", required=true)
    private final Input<String> policyUri;

    public Input<String> getPolicyUri() {
        return this.policyUri;
    }

    public ClusterClusterConfigAutoscalingConfigArgs(Input<String> policyUri) {
        this.policyUri = Objects.requireNonNull(policyUri, "expected parameter 'policyUri' to be non-null");
    }

    private ClusterClusterConfigAutoscalingConfigArgs() {
        this.policyUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigAutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigAutoscalingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyUri = defaults.policyUri;
        }

        public Builder setPolicyUri(Input<String> policyUri) {
            this.policyUri = Objects.requireNonNull(policyUri);
            return this;
        }

        public Builder setPolicyUri(String policyUri) {
            this.policyUri = Input.of(Objects.requireNonNull(policyUri));
            return this;
        }

        public ClusterClusterConfigAutoscalingConfigArgs build() {
            return new ClusterClusterConfigAutoscalingConfigArgs(policyUri);
        }
    }
}
