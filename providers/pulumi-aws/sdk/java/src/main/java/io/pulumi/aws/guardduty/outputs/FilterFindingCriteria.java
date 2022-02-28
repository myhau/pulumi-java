// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.outputs;

import io.pulumi.aws.guardduty.outputs.FilterFindingCriteriaCriterion;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FilterFindingCriteria {
    private final List<FilterFindingCriteriaCriterion> criterions;

    @OutputCustomType.Constructor({"criterions"})
    private FilterFindingCriteria(List<FilterFindingCriteriaCriterion> criterions) {
        this.criterions = Objects.requireNonNull(criterions);
    }

    public List<FilterFindingCriteriaCriterion> getCriterions() {
        return this.criterions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilterFindingCriteriaCriterion> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder setCriterions(List<FilterFindingCriteriaCriterion> criterions) {
            this.criterions = Objects.requireNonNull(criterions);
            return this;
        }
        public FilterFindingCriteria build() {
            return new FilterFindingCriteria(criterions);
        }
    }
}
