// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTypeFpga {
    private final Integer count;
    private final String manufacturer;
    /**
     * Size of the instance memory, in MiB.
     * 
     */
    private final Integer memorySize;
    private final String name;

    @OutputCustomType.Constructor({"count","manufacturer","memorySize","name"})
    private GetInstanceTypeFpga(
        Integer count,
        String manufacturer,
        Integer memorySize,
        String name) {
        this.count = Objects.requireNonNull(count);
        this.manufacturer = Objects.requireNonNull(manufacturer);
        this.memorySize = Objects.requireNonNull(memorySize);
        this.name = Objects.requireNonNull(name);
    }

    public Integer getCount() {
        return this.count;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Size of the instance memory, in MiB.
     * 
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeFpga defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String manufacturer;
        private Integer memorySize;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeFpga defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.manufacturer = defaults.manufacturer;
    	      this.memorySize = defaults.memorySize;
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

        public Builder setMemorySize(Integer memorySize) {
            this.memorySize = Objects.requireNonNull(memorySize);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetInstanceTypeFpga build() {
            return new GetInstanceTypeFpga(count, manufacturer, memorySize, name);
        }
    }
}
