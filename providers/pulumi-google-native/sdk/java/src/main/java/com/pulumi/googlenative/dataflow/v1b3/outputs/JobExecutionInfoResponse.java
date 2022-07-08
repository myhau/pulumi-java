// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class JobExecutionInfoResponse {
    /**
     * @return A mapping from each stage to the information about that stage.
     * 
     */
    private final Map<String,String> stages;

    @CustomType.Constructor
    private JobExecutionInfoResponse(@CustomType.Parameter("stages") Map<String,String> stages) {
        this.stages = stages;
    }

    /**
     * @return A mapping from each stage to the information about that stage.
     * 
     */
    public Map<String,String> stages() {
        return this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExecutionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExecutionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder stages(Map<String,String> stages) {
            this.stages = Objects.requireNonNull(stages);
            return this;
        }        public JobExecutionInfoResponse build() {
            return new JobExecutionInfoResponse(stages);
        }
    }
}
