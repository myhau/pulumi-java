// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTypeOfferingFilter {
    /**
     * Name of the filter. The `location` filter depends on the top-level `location_type` argument and if not specified, defaults to the current region.
     * 
     */
    private final String name;
    /**
     * List of one or more values for the filter.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GetInstanceTypeOfferingFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Name of the filter. The `location` filter depends on the top-level `location_type` argument and if not specified, defaults to the current region.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of one or more values for the filter.
     * 
     */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeOfferingFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeOfferingFilter defaults) {
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
        public GetInstanceTypeOfferingFilter build() {
            return new GetInstanceTypeOfferingFilter(name, values);
        }
    }
}
