// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.OperationErrorErrorsItemResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OperationErrorResponse {
    /**
     * The array of errors encountered while processing this operation.
     * 
     */
    private final List<OperationErrorErrorsItemResponse> errors;

    @OutputCustomType.Constructor({"errors"})
    private OperationErrorResponse(List<OperationErrorErrorsItemResponse> errors) {
        this.errors = errors;
    }

    /**
     * The array of errors encountered while processing this operation.
     * 
    */
    public List<OperationErrorErrorsItemResponse> getErrors() {
        return this.errors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OperationErrorErrorsItemResponse> errors;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
        }

        public Builder setErrors(List<OperationErrorErrorsItemResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public OperationErrorResponse build() {
            return new OperationErrorResponse(errors);
        }
    }
}
