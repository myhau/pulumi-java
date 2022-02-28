// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterState extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterState Empty = new FindingsFilterState();

    /**
     * The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don't perform any action on the findings.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The Amazon Resource Name (ARN) of the Findings Filter.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The criteria to use to filter findings.
     * 
     */
    @InputImport(name="findingCriteria")
      private final @Nullable Input<FindingsFilterFindingCriteriaGetArgs> findingCriteria;

    public Input<FindingsFilterFindingCriteriaGetArgs> getFindingCriteria() {
        return this.findingCriteria == null ? Input.empty() : this.findingCriteria;
    }

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
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    @InputImport(name="position")
      private final @Nullable Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position == null ? Input.empty() : this.position;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public FindingsFilterState(
        @Nullable Input<String> action,
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<FindingsFilterFindingCriteriaGetArgs> findingCriteria,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<Integer> position,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.action = action;
        this.arn = arn;
        this.description = description;
        this.findingCriteria = findingCriteria;
        this.name = name;
        this.namePrefix = namePrefix;
        this.position = position;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private FindingsFilterState() {
        this.action = Input.empty();
        this.arn = Input.empty();
        this.description = Input.empty();
        this.findingCriteria = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.position = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<FindingsFilterFindingCriteriaGetArgs> findingCriteria;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<Integer> position;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.position = defaults.position;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
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

        public Builder setFindingCriteria(@Nullable Input<FindingsFilterFindingCriteriaGetArgs> findingCriteria) {
            this.findingCriteria = findingCriteria;
            return this;
        }

        public Builder setFindingCriteria(@Nullable FindingsFilterFindingCriteriaGetArgs findingCriteria) {
            this.findingCriteria = Input.ofNullable(findingCriteria);
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

        public Builder setPosition(@Nullable Input<Integer> position) {
            this.position = position;
            return this;
        }

        public Builder setPosition(@Nullable Integer position) {
            this.position = Input.ofNullable(position);
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
        public FindingsFilterState build() {
            return new FindingsFilterState(action, arn, description, findingCriteria, name, namePrefix, position, tags, tagsAll);
        }
    }
}
