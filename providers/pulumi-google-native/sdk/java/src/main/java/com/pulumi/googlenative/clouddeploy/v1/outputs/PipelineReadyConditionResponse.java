// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PipelineReadyConditionResponse {
    /**
     * @return True if the Pipeline is in a valid state. Otherwise at least one condition in `PipelineCondition` is in an invalid state. Iterate over those conditions and see which condition(s) has status = false to find out what is wrong with the Pipeline.
     * 
     */
    private final Boolean status;
    /**
     * @return Last time the condition was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private PipelineReadyConditionResponse(
        @CustomType.Parameter("status") Boolean status,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.status = status;
        this.updateTime = updateTime;
    }

    /**
     * @return True if the Pipeline is in a valid state. Otherwise at least one condition in `PipelineCondition` is in an invalid state. Iterate over those conditions and see which condition(s) has status = false to find out what is wrong with the Pipeline.
     * 
     */
    public Boolean status() {
        return this.status;
    }
    /**
     * @return Last time the condition was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineReadyConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean status;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineReadyConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder status(Boolean status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public PipelineReadyConditionResponse build() {
            return new PipelineReadyConditionResponse(status, updateTime);
        }
    }
}
