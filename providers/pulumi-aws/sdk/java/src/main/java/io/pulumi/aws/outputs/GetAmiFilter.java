// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAmiFilter {
    /**
     * The name of the AMI that was provided during image creation.
     * 
     */
    private final String name;
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GetAmiFilter(
        String name,
        List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * The name of the AMI that was provided during image creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiFilter defaults) {
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
        public GetAmiFilter build() {
            return new GetAmiFilter(name, values);
        }
    }
}
