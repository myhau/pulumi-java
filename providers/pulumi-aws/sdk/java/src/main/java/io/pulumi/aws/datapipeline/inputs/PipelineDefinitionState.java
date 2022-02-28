// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectGetArgs;
import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueGetArgs;
import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionState extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionState Empty = new PipelineDefinitionState();

    /**
     * Configuration block for the parameter objects used in the pipeline definition. See below
     * 
     */
    @InputImport(name="parameterObjects")
      private final @Nullable Input<List<PipelineDefinitionParameterObjectGetArgs>> parameterObjects;

    public Input<List<PipelineDefinitionParameterObjectGetArgs>> getParameterObjects() {
        return this.parameterObjects == null ? Input.empty() : this.parameterObjects;
    }

    /**
     * Configuration block for the parameter values used in the pipeline definition. See below
     * 
     */
    @InputImport(name="parameterValues")
      private final @Nullable Input<List<PipelineDefinitionParameterValueGetArgs>> parameterValues;

    public Input<List<PipelineDefinitionParameterValueGetArgs>> getParameterValues() {
        return this.parameterValues == null ? Input.empty() : this.parameterValues;
    }

    /**
     * ID of the pipeline.
     * 
     */
    @InputImport(name="pipelineId")
      private final @Nullable Input<String> pipelineId;

    public Input<String> getPipelineId() {
        return this.pipelineId == null ? Input.empty() : this.pipelineId;
    }

    /**
     * Configuration block for the objects that define the pipeline. See below
     * 
     */
    @InputImport(name="pipelineObjects")
      private final @Nullable Input<List<PipelineDefinitionPipelineObjectGetArgs>> pipelineObjects;

    public Input<List<PipelineDefinitionPipelineObjectGetArgs>> getPipelineObjects() {
        return this.pipelineObjects == null ? Input.empty() : this.pipelineObjects;
    }

    public PipelineDefinitionState(
        @Nullable Input<List<PipelineDefinitionParameterObjectGetArgs>> parameterObjects,
        @Nullable Input<List<PipelineDefinitionParameterValueGetArgs>> parameterValues,
        @Nullable Input<String> pipelineId,
        @Nullable Input<List<PipelineDefinitionPipelineObjectGetArgs>> pipelineObjects) {
        this.parameterObjects = parameterObjects;
        this.parameterValues = parameterValues;
        this.pipelineId = pipelineId;
        this.pipelineObjects = pipelineObjects;
    }

    private PipelineDefinitionState() {
        this.parameterObjects = Input.empty();
        this.parameterValues = Input.empty();
        this.pipelineId = Input.empty();
        this.pipelineObjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PipelineDefinitionParameterObjectGetArgs>> parameterObjects;
        private @Nullable Input<List<PipelineDefinitionParameterValueGetArgs>> parameterValues;
        private @Nullable Input<String> pipelineId;
        private @Nullable Input<List<PipelineDefinitionPipelineObjectGetArgs>> pipelineObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterObjects = defaults.parameterObjects;
    	      this.parameterValues = defaults.parameterValues;
    	      this.pipelineId = defaults.pipelineId;
    	      this.pipelineObjects = defaults.pipelineObjects;
        }

        public Builder setParameterObjects(@Nullable Input<List<PipelineDefinitionParameterObjectGetArgs>> parameterObjects) {
            this.parameterObjects = parameterObjects;
            return this;
        }

        public Builder setParameterObjects(@Nullable List<PipelineDefinitionParameterObjectGetArgs> parameterObjects) {
            this.parameterObjects = Input.ofNullable(parameterObjects);
            return this;
        }

        public Builder setParameterValues(@Nullable Input<List<PipelineDefinitionParameterValueGetArgs>> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }

        public Builder setParameterValues(@Nullable List<PipelineDefinitionParameterValueGetArgs> parameterValues) {
            this.parameterValues = Input.ofNullable(parameterValues);
            return this;
        }

        public Builder setPipelineId(@Nullable Input<String> pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        public Builder setPipelineId(@Nullable String pipelineId) {
            this.pipelineId = Input.ofNullable(pipelineId);
            return this;
        }

        public Builder setPipelineObjects(@Nullable Input<List<PipelineDefinitionPipelineObjectGetArgs>> pipelineObjects) {
            this.pipelineObjects = pipelineObjects;
            return this;
        }

        public Builder setPipelineObjects(@Nullable List<PipelineDefinitionPipelineObjectGetArgs> pipelineObjects) {
            this.pipelineObjects = Input.ofNullable(pipelineObjects);
            return this;
        }
        public PipelineDefinitionState build() {
            return new PipelineDefinitionState(parameterObjects, parameterValues, pipelineId, pipelineObjects);
        }
    }
}
