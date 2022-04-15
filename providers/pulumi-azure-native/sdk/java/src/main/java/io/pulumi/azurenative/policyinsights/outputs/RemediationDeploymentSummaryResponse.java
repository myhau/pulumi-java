// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RemediationDeploymentSummaryResponse {
    /**
     * The number of deployments required by the remediation that have failed.
     * 
     */
    private final Integer failedDeployments;
    /**
     * The number of deployments required by the remediation that have succeeded.
     * 
     */
    private final Integer successfulDeployments;
    /**
     * The number of deployments required by the remediation.
     * 
     */
    private final Integer totalDeployments;

    @CustomType.Constructor
    private RemediationDeploymentSummaryResponse(
        @CustomType.Parameter("failedDeployments") Integer failedDeployments,
        @CustomType.Parameter("successfulDeployments") Integer successfulDeployments,
        @CustomType.Parameter("totalDeployments") Integer totalDeployments) {
        this.failedDeployments = failedDeployments;
        this.successfulDeployments = successfulDeployments;
        this.totalDeployments = totalDeployments;
    }

    /**
     * The number of deployments required by the remediation that have failed.
     * 
    */
    public Integer failedDeployments() {
        return this.failedDeployments;
    }
    /**
     * The number of deployments required by the remediation that have succeeded.
     * 
    */
    public Integer successfulDeployments() {
        return this.successfulDeployments;
    }
    /**
     * The number of deployments required by the remediation.
     * 
    */
    public Integer totalDeployments() {
        return this.totalDeployments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationDeploymentSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer failedDeployments;
        private Integer successfulDeployments;
        private Integer totalDeployments;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationDeploymentSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failedDeployments = defaults.failedDeployments;
    	      this.successfulDeployments = defaults.successfulDeployments;
    	      this.totalDeployments = defaults.totalDeployments;
        }

        public Builder failedDeployments(Integer failedDeployments) {
            this.failedDeployments = Objects.requireNonNull(failedDeployments);
            return this;
        }
        public Builder successfulDeployments(Integer successfulDeployments) {
            this.successfulDeployments = Objects.requireNonNull(successfulDeployments);
            return this;
        }
        public Builder totalDeployments(Integer totalDeployments) {
            this.totalDeployments = Objects.requireNonNull(totalDeployments);
            return this;
        }        public RemediationDeploymentSummaryResponse build() {
            return new RemediationDeploymentSummaryResponse(failedDeployments, successfulDeployments, totalDeployments);
        }
    }
}
