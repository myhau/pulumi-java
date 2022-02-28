// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * Description of the filter.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ID of a GuardDuty detector, attached to your account.
     * 
     */
    @InputImport(name="detectorId", required=true)
      private final Input<String> detectorId;

    public Input<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * 
     */
    @InputImport(name="findingCriteria", required=true)
      private final Input<FilterFindingCriteriaArgs> findingCriteria;

    public Input<FilterFindingCriteriaArgs> getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * The name of your filter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
     * 
     */
    @InputImport(name="rank", required=true)
      private final Input<Integer> rank;

    public Input<Integer> getRank() {
        return this.rank;
    }

    /**
     * The tags that you want to add to the Filter resource. A tag consists of a key and a value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FilterArgs(
        Input<String> action,
        @Nullable Input<String> description,
        Input<String> detectorId,
        Input<FilterFindingCriteriaArgs> findingCriteria,
        @Nullable Input<String> name,
        Input<Integer> rank,
        @Nullable Input<Map<String,String>> tags) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = description;
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.findingCriteria = Objects.requireNonNull(findingCriteria, "expected parameter 'findingCriteria' to be non-null");
        this.name = name;
        this.rank = Objects.requireNonNull(rank, "expected parameter 'rank' to be non-null");
        this.tags = tags;
    }

    private FilterArgs() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.detectorId = Input.empty();
        this.findingCriteria = Input.empty();
        this.name = Input.empty();
        this.rank = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private @Nullable Input<String> description;
        private Input<String> detectorId;
        private Input<FilterFindingCriteriaArgs> findingCriteria;
        private @Nullable Input<String> name;
        private Input<Integer> rank;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.tags = defaults.tags;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
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

        public Builder setDetectorId(Input<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder setDetectorId(String detectorId) {
            this.detectorId = Input.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder setFindingCriteria(Input<FilterFindingCriteriaArgs> findingCriteria) {
            this.findingCriteria = Objects.requireNonNull(findingCriteria);
            return this;
        }

        public Builder setFindingCriteria(FilterFindingCriteriaArgs findingCriteria) {
            this.findingCriteria = Input.of(Objects.requireNonNull(findingCriteria));
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

        public Builder setRank(Input<Integer> rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }

        public Builder setRank(Integer rank) {
            this.rank = Input.of(Objects.requireNonNull(rank));
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
        public FilterArgs build() {
            return new FilterArgs(action, description, detectorId, findingCriteria, name, rank, tags);
        }
    }
}
