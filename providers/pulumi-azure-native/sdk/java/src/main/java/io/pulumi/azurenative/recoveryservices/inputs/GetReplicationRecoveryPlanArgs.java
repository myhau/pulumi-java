// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationRecoveryPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationRecoveryPlanArgs Empty = new GetReplicationRecoveryPlanArgs();

    /**
     * Name of the recovery plan.
     * 
     */
    @Import(name="recoveryPlanName", required=true)
      private final String recoveryPlanName;

    public String recoveryPlanName() {
        return this.recoveryPlanName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetReplicationRecoveryPlanArgs(
        String recoveryPlanName,
        String resourceGroupName,
        String resourceName) {
        this.recoveryPlanName = Objects.requireNonNull(recoveryPlanName, "expected parameter 'recoveryPlanName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetReplicationRecoveryPlanArgs() {
        this.recoveryPlanName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationRecoveryPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recoveryPlanName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationRecoveryPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryPlanName = defaults.recoveryPlanName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder recoveryPlanName(String recoveryPlanName) {
            this.recoveryPlanName = Objects.requireNonNull(recoveryPlanName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetReplicationRecoveryPlanArgs build() {
            return new GetReplicationRecoveryPlanArgs(recoveryPlanName, resourceGroupName, resourceName);
        }
    }
}
