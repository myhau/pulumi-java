// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.securityhub.inputs.InsightFiltersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightArgs Empty = new InsightArgs();

    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * 
     */
    @InputImport(name="filters", required=true)
      private final Input<InsightFiltersArgs> filters;

    public Input<InsightFiltersArgs> getFilters() {
        return this.filters;
    }

    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     * 
     */
    @InputImport(name="groupByAttribute", required=true)
      private final Input<String> groupByAttribute;

    public Input<String> getGroupByAttribute() {
        return this.groupByAttribute;
    }

    /**
     * The name of the custom insight.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public InsightArgs(
        Input<InsightFiltersArgs> filters,
        Input<String> groupByAttribute,
        @Nullable Input<String> name) {
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
        this.groupByAttribute = Objects.requireNonNull(groupByAttribute, "expected parameter 'groupByAttribute' to be non-null");
        this.name = name;
    }

    private InsightArgs() {
        this.filters = Input.empty();
        this.groupByAttribute = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<InsightFiltersArgs> filters;
        private Input<String> groupByAttribute;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.groupByAttribute = defaults.groupByAttribute;
    	      this.name = defaults.name;
        }

        public Builder setFilters(Input<InsightFiltersArgs> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setFilters(InsightFiltersArgs filters) {
            this.filters = Input.of(Objects.requireNonNull(filters));
            return this;
        }

        public Builder setGroupByAttribute(Input<String> groupByAttribute) {
            this.groupByAttribute = Objects.requireNonNull(groupByAttribute);
            return this;
        }

        public Builder setGroupByAttribute(String groupByAttribute) {
            this.groupByAttribute = Input.of(Objects.requireNonNull(groupByAttribute));
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
        public InsightArgs build() {
            return new InsightArgs(filters, groupByAttribute, name);
        }
    }
}
