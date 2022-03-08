// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDistributionConfigurationsFilter {
    /**
     * The name of the filter field. Valid values can be found in the [Image Builder ListDistributionConfigurations API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListDistributionConfigurations.html).
     * 
     */
    private final String name;
    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GetDistributionConfigurationsFilter(
        String name,
        List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * The name of the filter field. Valid values can be found in the [Image Builder ListDistributionConfigurations API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListDistributionConfigurations.html).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetDistributionConfigurationsFilter build() {
            return new GetDistributionConfigurationsFilter(name, values);
        }
    }
}
