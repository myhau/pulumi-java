// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceResponseProperties;
import io.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning compute instance.
 * 
 */
public final class ComputeInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceResponse Empty = new ComputeInstanceResponse();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
      private final @Nullable String computeLocation;

    public Optional<String> computeLocation() {
        return this.computeLocation == null ? Optional.empty() : Optional.ofNullable(this.computeLocation);
    }

    /**
     * The type of compute
     * Expected value is 'ComputeInstance'.
     * 
     */
    @Import(name="computeType", required=true)
      private final String computeType;

    public String computeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    @Import(name="isAttachedCompute", required=true)
      private final Boolean isAttachedCompute;

    public Boolean isAttachedCompute() {
        return this.isAttachedCompute;
    }

    /**
     * Compute Instance properties
     * 
     */
    @Import(name="properties")
      private final @Nullable ComputeInstanceResponseProperties properties;

    public Optional<ComputeInstanceResponseProperties> properties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * Errors during provisioning
     * 
     */
    @Import(name="provisioningErrors", required=true)
      private final List<MachineLearningServiceErrorResponse> provisioningErrors;

    public List<MachineLearningServiceErrorResponse> provisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public ComputeInstanceResponse(
        @Nullable String computeLocation,
        String computeType,
        @Nullable String description,
        Boolean isAttachedCompute,
        @Nullable ComputeInstanceResponseProperties properties,
        List<MachineLearningServiceErrorResponse> provisioningErrors,
        String provisioningState,
        @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute, "expected parameter 'isAttachedCompute' to be non-null");
        this.properties = properties;
        this.provisioningErrors = Objects.requireNonNull(provisioningErrors, "expected parameter 'provisioningErrors' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceId = resourceId;
    }

    private ComputeInstanceResponse() {
        this.computeLocation = null;
        this.computeType = null;
        this.description = null;
        this.isAttachedCompute = null;
        this.properties = null;
        this.provisioningErrors = List.of();
        this.provisioningState = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable ComputeInstanceResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.isAttachedCompute = defaults.isAttachedCompute;
    	      this.properties = defaults.properties;
    	      this.provisioningErrors = defaults.provisioningErrors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isAttachedCompute(Boolean isAttachedCompute) {
            this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
            return this;
        }
        public Builder properties(@Nullable ComputeInstanceResponseProperties properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
            return this;
        }
        public Builder provisioningErrors(MachineLearningServiceErrorResponse... provisioningErrors) {
            return provisioningErrors(List.of(provisioningErrors));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ComputeInstanceResponse build() {
            return new ComputeInstanceResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
