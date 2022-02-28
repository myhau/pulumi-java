// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionState extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionState Empty = new FlowDefinitionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of your flow definition.
     * 
     */
    @InputImport(name="flowDefinitionName")
      private final @Nullable Input<String> flowDefinitionName;

    public Input<String> getFlowDefinitionName() {
        return this.flowDefinitionName == null ? Input.empty() : this.flowDefinitionName;
    }

    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @InputImport(name="humanLoopActivationConfig")
      private final @Nullable Input<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig;

    public Input<FlowDefinitionHumanLoopActivationConfigGetArgs> getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig == null ? Input.empty() : this.humanLoopActivationConfig;
    }

    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @InputImport(name="humanLoopConfig")
      private final @Nullable Input<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig;

    public Input<FlowDefinitionHumanLoopConfigGetArgs> getHumanLoopConfig() {
        return this.humanLoopConfig == null ? Input.empty() : this.humanLoopConfig;
    }

    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @InputImport(name="humanLoopRequestSource")
      private final @Nullable Input<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource;

    public Input<FlowDefinitionHumanLoopRequestSourceGetArgs> getHumanLoopRequestSource() {
        return this.humanLoopRequestSource == null ? Input.empty() : this.humanLoopRequestSource;
    }

    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @InputImport(name="outputConfig")
      private final @Nullable Input<FlowDefinitionOutputConfigGetArgs> outputConfig;

    public Input<FlowDefinitionOutputConfigGetArgs> getOutputConfig() {
        return this.outputConfig == null ? Input.empty() : this.outputConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public FlowDefinitionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> flowDefinitionName,
        @Nullable Input<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig,
        @Nullable Input<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig,
        @Nullable Input<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource,
        @Nullable Input<FlowDefinitionOutputConfigGetArgs> outputConfig,
        @Nullable Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.flowDefinitionName = flowDefinitionName;
        this.humanLoopActivationConfig = humanLoopActivationConfig;
        this.humanLoopConfig = humanLoopConfig;
        this.humanLoopRequestSource = humanLoopRequestSource;
        this.outputConfig = outputConfig;
        this.roleArn = roleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private FlowDefinitionState() {
        this.arn = Input.empty();
        this.flowDefinitionName = Input.empty();
        this.humanLoopActivationConfig = Input.empty();
        this.humanLoopConfig = Input.empty();
        this.humanLoopRequestSource = Input.empty();
        this.outputConfig = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> flowDefinitionName;
        private @Nullable Input<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig;
        private @Nullable Input<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig;
        private @Nullable Input<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource;
        private @Nullable Input<FlowDefinitionOutputConfigGetArgs> outputConfig;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.flowDefinitionName = defaults.flowDefinitionName;
    	      this.humanLoopActivationConfig = defaults.humanLoopActivationConfig;
    	      this.humanLoopConfig = defaults.humanLoopConfig;
    	      this.humanLoopRequestSource = defaults.humanLoopRequestSource;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setFlowDefinitionName(@Nullable Input<String> flowDefinitionName) {
            this.flowDefinitionName = flowDefinitionName;
            return this;
        }

        public Builder setFlowDefinitionName(@Nullable String flowDefinitionName) {
            this.flowDefinitionName = Input.ofNullable(flowDefinitionName);
            return this;
        }

        public Builder setHumanLoopActivationConfig(@Nullable Input<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig) {
            this.humanLoopActivationConfig = humanLoopActivationConfig;
            return this;
        }

        public Builder setHumanLoopActivationConfig(@Nullable FlowDefinitionHumanLoopActivationConfigGetArgs humanLoopActivationConfig) {
            this.humanLoopActivationConfig = Input.ofNullable(humanLoopActivationConfig);
            return this;
        }

        public Builder setHumanLoopConfig(@Nullable Input<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig) {
            this.humanLoopConfig = humanLoopConfig;
            return this;
        }

        public Builder setHumanLoopConfig(@Nullable FlowDefinitionHumanLoopConfigGetArgs humanLoopConfig) {
            this.humanLoopConfig = Input.ofNullable(humanLoopConfig);
            return this;
        }

        public Builder setHumanLoopRequestSource(@Nullable Input<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource) {
            this.humanLoopRequestSource = humanLoopRequestSource;
            return this;
        }

        public Builder setHumanLoopRequestSource(@Nullable FlowDefinitionHumanLoopRequestSourceGetArgs humanLoopRequestSource) {
            this.humanLoopRequestSource = Input.ofNullable(humanLoopRequestSource);
            return this;
        }

        public Builder setOutputConfig(@Nullable Input<FlowDefinitionOutputConfigGetArgs> outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }

        public Builder setOutputConfig(@Nullable FlowDefinitionOutputConfigGetArgs outputConfig) {
            this.outputConfig = Input.ofNullable(outputConfig);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public FlowDefinitionState build() {
            return new FlowDefinitionState(arn, flowDefinitionName, humanLoopActivationConfig, humanLoopConfig, humanLoopRequestSource, outputConfig, roleArn, tags, tagsAll);
        }
    }
}
