// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.inputs.AssignmentReportResourceComplianceReasonResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The guest configuration assignment resource.
 * 
 */
public final class AssignmentReportResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentReportResourceResponse Empty = new AssignmentReportResourceResponse();

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @Import(name="complianceStatus", required=true)
      private final String complianceStatus;

    public String complianceStatus() {
        return this.complianceStatus;
    }

    /**
     * Properties of a guest configuration assignment resource.
     * 
     */
    @Import(name="properties", required=true)
      private final Object properties;

    public Object properties() {
        return this.properties;
    }

    /**
     * Compliance reason and reason code for a resource.
     * 
     */
    @Import(name="reasons")
      private final @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons;

    public List<AssignmentReportResourceComplianceReasonResponse> reasons() {
        return this.reasons == null ? List.of() : this.reasons;
    }

    /**
     * Name of the guest configuration assignment resource setting.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String resourceId() {
        return this.resourceId;
    }

    public AssignmentReportResourceResponse(
        String complianceStatus,
        Object properties,
        @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons,
        String resourceId) {
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.reasons = reasons;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private AssignmentReportResourceResponse() {
        this.complianceStatus = null;
        this.properties = null;
        this.reasons = List.of();
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceStatus;
        private Object properties;
        private @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.properties = defaults.properties;
    	      this.reasons = defaults.reasons;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder complianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }
        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder reasons(@Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons) {
            this.reasons = reasons;
            return this;
        }
        public Builder reasons(AssignmentReportResourceComplianceReasonResponse... reasons) {
            return reasons(List.of(reasons));
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public AssignmentReportResourceResponse build() {
            return new AssignmentReportResourceResponse(complianceStatus, properties, reasons, resourceId);
        }
    }
}
