// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.aws.lambda.outputs.EventSourceMappingFilterCriteriaFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingFilterCriteria {
    /**
     * A set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. Detailed below.
     * 
     */
    private final @Nullable List<EventSourceMappingFilterCriteriaFilter> filters;

    @OutputCustomType.Constructor({"filters"})
    private EventSourceMappingFilterCriteria(@Nullable List<EventSourceMappingFilterCriteriaFilter> filters) {
        this.filters = filters;
    }

    /**
     * A set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. Detailed below.
     * 
     */
    public List<EventSourceMappingFilterCriteriaFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventSourceMappingFilterCriteriaFilter> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(@Nullable List<EventSourceMappingFilterCriteriaFilter> filters) {
            this.filters = filters;
            return this;
        }
        public EventSourceMappingFilterCriteria build() {
            return new EventSourceMappingFilterCriteria(filters);
        }
    }
}
