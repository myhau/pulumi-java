// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTypeInferenceAccelerator {
    private final Integer count;
    private final String manufacturer;
    private final String name;

    @OutputCustomType.Constructor({"count","manufacturer","name"})
    private GetInstanceTypeInferenceAccelerator(
        Integer count,
        String manufacturer,
        String name) {
        this.count = count;
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public Integer getCount() {
        return this.count;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String manufacturer;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.manufacturer = defaults.manufacturer;
    	      this.name = defaults.name;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = Objects.requireNonNull(manufacturer);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetInstanceTypeInferenceAccelerator build() {
            return new GetInstanceTypeInferenceAccelerator(count, manufacturer, name);
        }
    }
}
