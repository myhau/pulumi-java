// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The properties that define a step.
 * 
 */
public final class PrePostStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrePostStepResponse Empty = new PrePostStepResponse();

    /**
     * The resource Id of the step to be run.
     * 
     */
    @Import(name="stepId", required=true)
      private final String stepId;

    public String stepId() {
        return this.stepId;
    }

    public PrePostStepResponse(String stepId) {
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private PrePostStepResponse() {
        this.stepId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrePostStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrePostStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stepId = defaults.stepId;
        }

        public Builder stepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }        public PrePostStepResponse build() {
            return new PrePostStepResponse(stepId);
        }
    }
}
