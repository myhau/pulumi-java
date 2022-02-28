// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.aws.securityhub.inputs.InsightFiltersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightState extends io.pulumi.resources.ResourceArgs {

    public static final InsightState Empty = new InsightState();

    /**
     * ARN of the insight.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable Input<InsightFiltersGetArgs> filters;

    public Input<InsightFiltersGetArgs> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     * 
     */
    @InputImport(name="groupByAttribute")
      private final @Nullable Input<String> groupByAttribute;

    public Input<String> getGroupByAttribute() {
        return this.groupByAttribute == null ? Input.empty() : this.groupByAttribute;
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

    public InsightState(
        @Nullable Input<String> arn,
        @Nullable Input<InsightFiltersGetArgs> filters,
        @Nullable Input<String> groupByAttribute,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.filters = filters;
        this.groupByAttribute = groupByAttribute;
        this.name = name;
    }

    private InsightState() {
        this.arn = Input.empty();
        this.filters = Input.empty();
        this.groupByAttribute = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<InsightFiltersGetArgs> filters;
        private @Nullable Input<String> groupByAttribute;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.filters = defaults.filters;
    	      this.groupByAttribute = defaults.groupByAttribute;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setFilters(@Nullable Input<InsightFiltersGetArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable InsightFiltersGetArgs filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }

        public Builder setGroupByAttribute(@Nullable Input<String> groupByAttribute) {
            this.groupByAttribute = groupByAttribute;
            return this;
        }

        public Builder setGroupByAttribute(@Nullable String groupByAttribute) {
            this.groupByAttribute = Input.ofNullable(groupByAttribute);
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
        public InsightState build() {
            return new InsightState(arn, filters, groupByAttribute, name);
        }
    }
}
