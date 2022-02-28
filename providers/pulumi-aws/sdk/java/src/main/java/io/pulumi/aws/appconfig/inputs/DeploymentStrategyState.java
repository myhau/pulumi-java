// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentStrategyState extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentStrategyState Empty = new DeploymentStrategyState();

    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment Strategy.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     * 
     */
    @InputImport(name="deploymentDurationInMinutes")
      private final @Nullable Input<Integer> deploymentDurationInMinutes;

    public Input<Integer> getDeploymentDurationInMinutes() {
        return this.deploymentDurationInMinutes == null ? Input.empty() : this.deploymentDurationInMinutes;
    }

    /**
     * A description of the deployment strategy. Can be at most 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     * 
     */
    @InputImport(name="finalBakeTimeInMinutes")
      private final @Nullable Input<Integer> finalBakeTimeInMinutes;

    public Input<Integer> getFinalBakeTimeInMinutes() {
        return this.finalBakeTimeInMinutes == null ? Input.empty() : this.finalBakeTimeInMinutes;
    }

    /**
     * The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     * 
     */
    @InputImport(name="growthFactor")
      private final @Nullable Input<Double> growthFactor;

    public Input<Double> getGrowthFactor() {
        return this.growthFactor == null ? Input.empty() : this.growthFactor;
    }

    /**
     * The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     * 
     */
    @InputImport(name="growthType")
      private final @Nullable Input<String> growthType;

    public Input<String> getGrowthType() {
        return this.growthType == null ? Input.empty() : this.growthType;
    }

    /**
     * A name for the deployment strategy. Must be between 1 and 64 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     * 
     */
    @InputImport(name="replicateTo")
      private final @Nullable Input<String> replicateTo;

    public Input<String> getReplicateTo() {
        return this.replicateTo == null ? Input.empty() : this.replicateTo;
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

    public DeploymentStrategyState(
        @Nullable Input<String> arn,
        @Nullable Input<Integer> deploymentDurationInMinutes,
        @Nullable Input<String> description,
        @Nullable Input<Integer> finalBakeTimeInMinutes,
        @Nullable Input<Double> growthFactor,
        @Nullable Input<String> growthType,
        @Nullable Input<String> name,
        @Nullable Input<String> replicateTo,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
        this.description = description;
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
        this.growthFactor = growthFactor;
        this.growthType = growthType;
        this.name = name;
        this.replicateTo = replicateTo;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DeploymentStrategyState() {
        this.arn = Input.empty();
        this.deploymentDurationInMinutes = Input.empty();
        this.description = Input.empty();
        this.finalBakeTimeInMinutes = Input.empty();
        this.growthFactor = Input.empty();
        this.growthType = Input.empty();
        this.name = Input.empty();
        this.replicateTo = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Integer> deploymentDurationInMinutes;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> finalBakeTimeInMinutes;
        private @Nullable Input<Double> growthFactor;
        private @Nullable Input<String> growthType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> replicateTo;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStrategyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deploymentDurationInMinutes = defaults.deploymentDurationInMinutes;
    	      this.description = defaults.description;
    	      this.finalBakeTimeInMinutes = defaults.finalBakeTimeInMinutes;
    	      this.growthFactor = defaults.growthFactor;
    	      this.growthType = defaults.growthType;
    	      this.name = defaults.name;
    	      this.replicateTo = defaults.replicateTo;
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

        public Builder setDeploymentDurationInMinutes(@Nullable Input<Integer> deploymentDurationInMinutes) {
            this.deploymentDurationInMinutes = deploymentDurationInMinutes;
            return this;
        }

        public Builder setDeploymentDurationInMinutes(@Nullable Integer deploymentDurationInMinutes) {
            this.deploymentDurationInMinutes = Input.ofNullable(deploymentDurationInMinutes);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFinalBakeTimeInMinutes(@Nullable Input<Integer> finalBakeTimeInMinutes) {
            this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
            return this;
        }

        public Builder setFinalBakeTimeInMinutes(@Nullable Integer finalBakeTimeInMinutes) {
            this.finalBakeTimeInMinutes = Input.ofNullable(finalBakeTimeInMinutes);
            return this;
        }

        public Builder setGrowthFactor(@Nullable Input<Double> growthFactor) {
            this.growthFactor = growthFactor;
            return this;
        }

        public Builder setGrowthFactor(@Nullable Double growthFactor) {
            this.growthFactor = Input.ofNullable(growthFactor);
            return this;
        }

        public Builder setGrowthType(@Nullable Input<String> growthType) {
            this.growthType = growthType;
            return this;
        }

        public Builder setGrowthType(@Nullable String growthType) {
            this.growthType = Input.ofNullable(growthType);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setReplicateTo(@Nullable Input<String> replicateTo) {
            this.replicateTo = replicateTo;
            return this;
        }

        public Builder setReplicateTo(@Nullable String replicateTo) {
            this.replicateTo = Input.ofNullable(replicateTo);
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
        public DeploymentStrategyState build() {
            return new DeploymentStrategyState(arn, deploymentDurationInMinutes, description, finalBakeTimeInMinutes, growthFactor, growthType, name, replicateTo, tags, tagsAll);
        }
    }
}
