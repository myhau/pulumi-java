// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs();

    /**
     * Configuration block for the production traffic route (documented below).
     * 
     */
    @InputImport(name="prodTrafficRoute", required=true)
      private final Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> prodTrafficRoute;

    public Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> getProdTrafficRoute() {
        return this.prodTrafficRoute;
    }

    /**
     * Configuration blocks for a target group within a target group pair (documented below).
     * 
     */
    @InputImport(name="targetGroups", required=true)
      private final Input<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>> targetGroups;

    public Input<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    /**
     * Configuration block for the test traffic route (documented below).
     * 
     */
    @InputImport(name="testTrafficRoute")
      private final @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs> testTrafficRoute;

    public Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs> getTestTrafficRoute() {
        return this.testTrafficRoute == null ? Input.empty() : this.testTrafficRoute;
    }

    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs(
        Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> prodTrafficRoute,
        Input<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>> targetGroups,
        @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs> testTrafficRoute) {
        this.prodTrafficRoute = Objects.requireNonNull(prodTrafficRoute, "expected parameter 'prodTrafficRoute' to be non-null");
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
        this.testTrafficRoute = testTrafficRoute;
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs() {
        this.prodTrafficRoute = Input.empty();
        this.targetGroups = Input.empty();
        this.testTrafficRoute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> prodTrafficRoute;
        private Input<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>> targetGroups;
        private @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs> testTrafficRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prodTrafficRoute = defaults.prodTrafficRoute;
    	      this.targetGroups = defaults.targetGroups;
    	      this.testTrafficRoute = defaults.testTrafficRoute;
        }

        public Builder setProdTrafficRoute(Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> prodTrafficRoute) {
            this.prodTrafficRoute = Objects.requireNonNull(prodTrafficRoute);
            return this;
        }

        public Builder setProdTrafficRoute(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs prodTrafficRoute) {
            this.prodTrafficRoute = Input.of(Objects.requireNonNull(prodTrafficRoute));
            return this;
        }

        public Builder setTargetGroups(Input<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public Builder setTargetGroups(List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs> targetGroups) {
            this.targetGroups = Input.of(Objects.requireNonNull(targetGroups));
            return this;
        }

        public Builder setTestTrafficRoute(@Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs> testTrafficRoute) {
            this.testTrafficRoute = testTrafficRoute;
            return this;
        }

        public Builder setTestTrafficRoute(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs testTrafficRoute) {
            this.testTrafficRoute = Input.ofNullable(testTrafficRoute);
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs(prodTrafficRoute, targetGroups, testTrafficRoute);
        }
    }
}
