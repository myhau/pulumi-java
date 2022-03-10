// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DynamicGroupStatusResponse {
    /**
     * Status of the dynamic group.
     * 
     */
    private final String status;
    /**
     * The latest time at which the dynamic group is guaranteed to be in the given status. If status is `UP_TO_DATE`, the latest time at which the dynamic group was confirmed to be up-to-date. If status is `UPDATING_MEMBERSHIPS`, the time at which dynamic group was created.
     * 
     */
    private final String statusTime;

    @OutputCustomType.Constructor
    private DynamicGroupStatusResponse(
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("statusTime") String statusTime) {
        this.status = status;
        this.statusTime = statusTime;
    }

    /**
     * Status of the dynamic group.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The latest time at which the dynamic group is guaranteed to be in the given status. If status is `UP_TO_DATE`, the latest time at which the dynamic group was confirmed to be up-to-date. If status is `UPDATING_MEMBERSHIPS`, the time at which dynamic group was created.
     * 
    */
    public String getStatusTime() {
        return this.statusTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private String statusTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.statusTime = defaults.statusTime;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusTime(String statusTime) {
            this.statusTime = Objects.requireNonNull(statusTime);
            return this;
        }
        public DynamicGroupStatusResponse build() {
            return new DynamicGroupStatusResponse(status, statusTime);
        }
    }
}
