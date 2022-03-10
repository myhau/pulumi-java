// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
     */
    @InputImport(name="listenerArns", required=true)
      private final Input<List<String>> listenerArns;

    public Input<List<String>> getListenerArns() {
        return this.listenerArns;
    }

    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs(Input<List<String>> listenerArns) {
        this.listenerArns = Objects.requireNonNull(listenerArns, "expected parameter 'listenerArns' to be non-null");
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs() {
        this.listenerArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> listenerArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listenerArns = defaults.listenerArns;
        }

        public Builder setListenerArns(Input<List<String>> listenerArns) {
            this.listenerArns = Objects.requireNonNull(listenerArns);
            return this;
        }

        public Builder setListenerArns(List<String> listenerArns) {
            this.listenerArns = Input.of(Objects.requireNonNull(listenerArns));
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs(listenerArns);
        }
    }
}