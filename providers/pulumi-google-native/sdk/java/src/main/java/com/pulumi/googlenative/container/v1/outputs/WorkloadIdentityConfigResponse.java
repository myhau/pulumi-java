// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkloadIdentityConfigResponse {
    /**
     * @return The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    private final String workloadPool;

    @CustomType.Constructor
    private WorkloadIdentityConfigResponse(@CustomType.Parameter("workloadPool") String workloadPool) {
        this.workloadPool = workloadPool;
    }

    /**
     * @return The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    public String workloadPool() {
        return this.workloadPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder workloadPool(String workloadPool) {
            this.workloadPool = Objects.requireNonNull(workloadPool);
            return this;
        }        public WorkloadIdentityConfigResponse build() {
            return new WorkloadIdentityConfigResponse(workloadPool);
        }
    }
}
