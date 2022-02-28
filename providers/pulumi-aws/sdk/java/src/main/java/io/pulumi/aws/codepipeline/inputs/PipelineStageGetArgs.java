// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.aws.codepipeline.inputs.PipelineStageActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PipelineStageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineStageGetArgs Empty = new PipelineStageGetArgs();

    /**
     * The action(s) to include in the stage. Defined as an `action` block below
     * 
     */
    @InputImport(name="actions", required=true)
      private final Input<List<PipelineStageActionGetArgs>> actions;

    public Input<List<PipelineStageActionGetArgs>> getActions() {
        return this.actions;
    }

    /**
     * The name of the stage.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PipelineStageGetArgs(
        Input<List<PipelineStageActionGetArgs>> actions,
        Input<String> name) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineStageGetArgs() {
        this.actions = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineStageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PipelineStageActionGetArgs>> actions;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineStageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.name = defaults.name;
        }

        public Builder setActions(Input<List<PipelineStageActionGetArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<PipelineStageActionGetArgs> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PipelineStageGetArgs build() {
            return new PipelineStageGetArgs(actions, name);
        }
    }
}
