// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs Empty = new ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs();

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    @InputImport(name="sysctls", required=true)
    private final Input<Map<String,String>> sysctls;

    public Input<Map<String,String>> getSysctls() {
        return this.sysctls;
    }

    public ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs(Input<Map<String,String>> sysctls) {
        this.sysctls = Objects.requireNonNull(sysctls, "expected parameter 'sysctls' to be non-null");
    }

    private ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs() {
        this.sysctls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder setSysctls(Input<Map<String,String>> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }

        public Builder setSysctls(Map<String,String> sysctls) {
            this.sysctls = Input.of(Objects.requireNonNull(sysctls));
            return this;
        }

        public ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs build() {
            return new ClusterNodePoolNodeConfigLinuxNodeConfigGetArgs(sysctls);
        }
    }
}
