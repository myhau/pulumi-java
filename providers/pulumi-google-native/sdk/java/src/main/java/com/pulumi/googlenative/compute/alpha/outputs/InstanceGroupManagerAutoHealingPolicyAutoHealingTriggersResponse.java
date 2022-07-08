// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse {
    /**
     * @return If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    private final String onHealthCheck;

    @CustomType.Constructor
    private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse(@CustomType.Parameter("onHealthCheck") String onHealthCheck) {
        this.onHealthCheck = onHealthCheck;
    }

    /**
     * @return If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    public String onHealthCheck() {
        return this.onHealthCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String onHealthCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onHealthCheck = defaults.onHealthCheck;
        }

        public Builder onHealthCheck(String onHealthCheck) {
            this.onHealthCheck = Objects.requireNonNull(onHealthCheck);
            return this;
        }        public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse(onHealthCheck);
        }
    }
}
