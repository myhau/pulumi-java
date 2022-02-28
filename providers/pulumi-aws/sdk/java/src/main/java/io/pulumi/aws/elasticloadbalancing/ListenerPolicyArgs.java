// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerPolicyArgs Empty = new ListenerPolicyArgs();

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @InputImport(name="loadBalancerName", required=true)
      private final Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * The load balancer listener port to apply the policy to.
     * 
     */
    @InputImport(name="loadBalancerPort", required=true)
      private final Input<Integer> loadBalancerPort;

    public Input<Integer> getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @InputImport(name="policyNames")
      private final @Nullable Input<List<String>> policyNames;

    public Input<List<String>> getPolicyNames() {
        return this.policyNames == null ? Input.empty() : this.policyNames;
    }

    public ListenerPolicyArgs(
        Input<String> loadBalancerName,
        Input<Integer> loadBalancerPort,
        @Nullable Input<List<String>> policyNames) {
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
        this.loadBalancerPort = Objects.requireNonNull(loadBalancerPort, "expected parameter 'loadBalancerPort' to be non-null");
        this.policyNames = policyNames;
    }

    private ListenerPolicyArgs() {
        this.loadBalancerName = Input.empty();
        this.loadBalancerPort = Input.empty();
        this.policyNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> loadBalancerName;
        private Input<Integer> loadBalancerPort;
        private @Nullable Input<List<String>> policyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
    	      this.policyNames = defaults.policyNames;
        }

        public Builder setLoadBalancerName(Input<String> loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Input.of(Objects.requireNonNull(loadBalancerName));
            return this;
        }

        public Builder setLoadBalancerPort(Input<Integer> loadBalancerPort) {
            this.loadBalancerPort = Objects.requireNonNull(loadBalancerPort);
            return this;
        }

        public Builder setLoadBalancerPort(Integer loadBalancerPort) {
            this.loadBalancerPort = Input.of(Objects.requireNonNull(loadBalancerPort));
            return this;
        }

        public Builder setPolicyNames(@Nullable Input<List<String>> policyNames) {
            this.policyNames = policyNames;
            return this;
        }

        public Builder setPolicyNames(@Nullable List<String> policyNames) {
            this.policyNames = Input.ofNullable(policyNames);
            return this;
        }
        public ListenerPolicyArgs build() {
            return new ListenerPolicyArgs(loadBalancerName, loadBalancerPort, policyNames);
        }
    }
}
