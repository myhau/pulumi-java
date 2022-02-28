// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.swf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The domain description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the domain. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
     * 
     */
    @InputImport(name="workflowExecutionRetentionPeriodInDays")
      private final @Nullable Input<String> workflowExecutionRetentionPeriodInDays;

    public Input<String> getWorkflowExecutionRetentionPeriodInDays() {
        return this.workflowExecutionRetentionPeriodInDays == null ? Input.empty() : this.workflowExecutionRetentionPeriodInDays;
    }

    public DomainState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> workflowExecutionRetentionPeriodInDays) {
        this.arn = arn;
        this.description = description;
        this.name = name;
        this.namePrefix = namePrefix;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
    }

    private DomainState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.workflowExecutionRetentionPeriodInDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> workflowExecutionRetentionPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.workflowExecutionRetentionPeriodInDays = defaults.workflowExecutionRetentionPeriodInDays;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
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

        public Builder setWorkflowExecutionRetentionPeriodInDays(@Nullable Input<String> workflowExecutionRetentionPeriodInDays) {
            this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
            return this;
        }

        public Builder setWorkflowExecutionRetentionPeriodInDays(@Nullable String workflowExecutionRetentionPeriodInDays) {
            this.workflowExecutionRetentionPeriodInDays = Input.ofNullable(workflowExecutionRetentionPeriodInDays);
            return this;
        }
        public DomainState build() {
            return new DomainState(arn, description, name, namePrefix, tags, tagsAll, workflowExecutionRetentionPeriodInDays);
        }
    }
}
