// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentGroupLoadBalancerInfoElbInfo {
    /**
     * The name of the load balancer that will be used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"name"})
    private DeploymentGroupLoadBalancerInfoElbInfo(@Nullable String name) {
        this.name = name;
    }

    /**
     * The name of the load balancer that will be used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoElbInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoElbInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DeploymentGroupLoadBalancerInfoElbInfo build() {
            return new DeploymentGroupLoadBalancerInfoElbInfo(name);
        }
    }
}
