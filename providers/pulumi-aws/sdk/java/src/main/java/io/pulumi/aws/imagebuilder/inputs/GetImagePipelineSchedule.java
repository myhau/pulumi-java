// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetImagePipelineSchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetImagePipelineSchedule Empty = new GetImagePipelineSchedule();

    /**
     * Condition when the pipeline should trigger a new image build.
     * 
     */
    @InputImport(name="pipelineExecutionStartCondition", required=true)
      private final String pipelineExecutionStartCondition;

    public String getPipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition;
    }

    /**
     * Cron expression of how often the pipeline start condition is evaluated.
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
      private final String scheduleExpression;

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public GetImagePipelineSchedule(
        String pipelineExecutionStartCondition,
        String scheduleExpression) {
        this.pipelineExecutionStartCondition = Objects.requireNonNull(pipelineExecutionStartCondition, "expected parameter 'pipelineExecutionStartCondition' to be non-null");
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private GetImagePipelineSchedule() {
        this.pipelineExecutionStartCondition = null;
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineExecutionStartCondition;
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = Objects.requireNonNull(pipelineExecutionStartCondition);
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public GetImagePipelineSchedule build() {
            return new GetImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}
