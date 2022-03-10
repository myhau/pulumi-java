// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ApprovalConfigResponse {
    /**
     * Whether or not approval is needed. If this is set on a build, it will become pending when created, and will need to be explicitly approved to start.
     * 
     */
    private final Boolean approvalRequired;

    @OutputCustomType.Constructor
    private ApprovalConfigResponse(@OutputCustomType.Parameter("approvalRequired") Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }

    /**
     * Whether or not approval is needed. If this is set on a build, it will become pending when created, and will need to be explicitly approved to start.
     * 
    */
    public Boolean getApprovalRequired() {
        return this.approvalRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean approvalRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRequired = defaults.approvalRequired;
        }

        public Builder setApprovalRequired(Boolean approvalRequired) {
            this.approvalRequired = Objects.requireNonNull(approvalRequired);
            return this;
        }
        public ApprovalConfigResponse build() {
            return new ApprovalConfigResponse(approvalRequired);
        }
    }
}
